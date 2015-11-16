// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import g;
import h;
import hst;
import hsx;
import hsz;
import htc;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import l;

// Referenced classes of package com.google.api.client.http:
//            HttpHeaders, BackOffPolicy, HttpResponse, HttpExecuteInterceptor, 
//            GenericUrl, HttpTransport, HttpContent, LowLevelHttpRequest, 
//            HttpUnsuccessfulResponseHandler, HttpEncoding, HttpEncodingStreamingContent, LowLevelHttpResponse, 
//            HttpIOExceptionHandler, HttpResponseInterceptor, HttpResponseException, HttpStatusCodes, 
//            HttpMediaType

public final class HttpRequest
{

    public static final String USER_AGENT_SUFFIX = "Google-HTTP-Java-Client/1.21.0-SNAPSHOT (gzip)";
    public static final String VERSION = "1.21.0-SNAPSHOT";
    private BackOffPolicy backOffPolicy;
    private int connectTimeout;
    private HttpContent content;
    private int contentLoggingLimit;
    private boolean curlLoggingEnabled;
    private HttpEncoding encoding;
    private HttpExecuteInterceptor executeInterceptor;
    private boolean followRedirects;
    private HttpHeaders headers;
    private HttpIOExceptionHandler ioExceptionHandler;
    private boolean loggingEnabled;
    private int numRetries;
    private hsx objectParser;
    private int readTimeout;
    private String requestMethod;
    private HttpHeaders responseHeaders;
    private HttpResponseInterceptor responseInterceptor;
    private boolean retryOnExecuteIOException;
    private hsz sleeper;
    private boolean suppressUserAgentSuffix;
    private boolean throwExceptionOnExecuteError;
    private final HttpTransport transport;
    private HttpUnsuccessfulResponseHandler unsuccessfulResponseHandler;
    private GenericUrl url;

    HttpRequest(HttpTransport httptransport, String s)
    {
        headers = new HttpHeaders();
        responseHeaders = new HttpHeaders();
        numRetries = 10;
        contentLoggingLimit = 16384;
        loggingEnabled = true;
        curlLoggingEnabled = true;
        connectTimeout = 20000;
        readTimeout = 20000;
        followRedirects = true;
        throwExceptionOnExecuteError = true;
        retryOnExecuteIOException = false;
        sleeper = hsz.a;
        transport = httptransport;
        setRequestMethod(s);
    }

    public HttpResponse execute()
    {
        Object obj;
        Object obj1;
        Object obj2;
        Logger logger;
        int i;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        StringBuilder stringbuilder;
        String s;
        String s2;
        LowLevelHttpRequest lowlevelhttprequest;
        String s3;
        if (numRetries >= 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        l.a(flag2);
        i = numRetries;
        if (backOffPolicy != null)
        {
            backOffPolicy.reset();
        }
        obj = null;
        h.a(requestMethod);
        h.a(url);
_L11:
        if (obj != null)
        {
            ((HttpResponse) (obj)).ignore();
        }
        if (executeInterceptor != null)
        {
            executeInterceptor.intercept(this);
        }
        s2 = url.build();
        lowlevelhttprequest = transport.buildRequest(requestMethod, s2);
        logger = HttpTransport.LOGGER;
        if (loggingEnabled && logger.isLoggable(Level.CONFIG))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        stringbuilder = null;
        obj = null;
        obj1 = obj;
        if (flag)
        {
            obj2 = new StringBuilder();
            ((StringBuilder) (obj2)).append("-------------- REQUEST  --------------").append(htc.a);
            ((StringBuilder) (obj2)).append(requestMethod).append(' ').append(s2).append(htc.a);
            obj1 = obj;
            stringbuilder = ((StringBuilder) (obj2));
            if (curlLoggingEnabled)
            {
                obj = new StringBuilder("curl -v --compressed");
                obj1 = obj;
                stringbuilder = ((StringBuilder) (obj2));
                if (!requestMethod.equals("GET"))
                {
                    ((StringBuilder) (obj)).append(" -X ").append(requestMethod);
                    stringbuilder = ((StringBuilder) (obj2));
                    obj1 = obj;
                }
            }
        }
        obj = headers.getUserAgent();
        if (!suppressUserAgentSuffix)
        {
            if (obj == null)
            {
                headers.setUserAgent("Google-HTTP-Java-Client/1.21.0-SNAPSHOT (gzip)");
            } else
            {
                obj2 = headers;
                s1 = String.valueOf("Google-HTTP-Java-Client/1.21.0-SNAPSHOT (gzip)");
                ((HttpHeaders) (obj2)).setUserAgent((new StringBuilder(String.valueOf(obj).length() + 1 + String.valueOf(s1).length())).append(((String) (obj))).append(" ").append(s1).toString());
            }
        }
        HttpHeaders.serializeHeaders(headers, stringbuilder, ((StringBuilder) (obj1)), logger, lowlevelhttprequest);
        if (!suppressUserAgentSuffix)
        {
            headers.setUserAgent(((String) (obj)));
        }
        obj = content;
        if (obj == null || content.retrySupported())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj2 = obj;
        if (obj != null)
        {
            s3 = content.getType();
            if (flag)
            {
                obj = new hst(((htb) (obj)), HttpTransport.LOGGER, Level.CONFIG, contentLoggingLimit);
            }
            long l1;
            if (encoding == null)
            {
                l1 = content.getLength();
                obj2 = null;
            } else
            {
                obj2 = encoding.getName();
                obj = new HttpEncodingStreamingContent(((htb) (obj)), encoding);
                if (flag1)
                {
                    l1 = g.a(((htb) (obj)));
                } else
                {
                    l1 = -1L;
                }
            }
            if (flag)
            {
                String s1;
                if (s3 != null)
                {
                    s = String.valueOf(s3);
                    if (s.length() != 0)
                    {
                        s1 = "Content-Type: ".concat(s);
                    } else
                    {
                        s1 = new String("Content-Type: ");
                    }
                    stringbuilder.append(s1).append(htc.a);
                    if (obj1 != null)
                    {
                        ((StringBuilder) (obj1)).append((new StringBuilder(String.valueOf(s1).length() + 6)).append(" -H '").append(s1).append("'").toString());
                    }
                }
                if (obj2 != null)
                {
                    s1 = String.valueOf(obj2);
                    if (s1.length() != 0)
                    {
                        s1 = "Content-Encoding: ".concat(s1);
                    } else
                    {
                        s1 = new String("Content-Encoding: ");
                    }
                    stringbuilder.append(s1).append(htc.a);
                    if (obj1 != null)
                    {
                        ((StringBuilder) (obj1)).append((new StringBuilder(String.valueOf(s1).length() + 6)).append(" -H '").append(s1).append("'").toString());
                    }
                }
                if (l1 >= 0L)
                {
                    stringbuilder.append((new StringBuilder(36)).append("Content-Length: ").append(l1).toString()).append(htc.a);
                }
            }
            if (obj1 != null)
            {
                ((StringBuilder) (obj1)).append(" -d '@-'");
            }
            lowlevelhttprequest.setContentType(s3);
            lowlevelhttprequest.setContentEncoding(((String) (obj2)));
            lowlevelhttprequest.setContentLength(l1);
            lowlevelhttprequest.setStreamingContent(((htb) (obj)));
            obj2 = obj;
        }
        if (flag)
        {
            logger.config(stringbuilder.toString());
            if (obj1 != null)
            {
                ((StringBuilder) (obj1)).append(" -- '");
                ((StringBuilder) (obj1)).append(s2.replaceAll("'", "'\"'\"'"));
                ((StringBuilder) (obj1)).append("'");
                if (obj2 != null)
                {
                    ((StringBuilder) (obj1)).append(" << $$$");
                }
                logger.config(((StringBuilder) (obj1)).toString());
            }
        }
        if (flag1 && i > 0)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        lowlevelhttprequest.setTimeout(connectTimeout, readTimeout);
        obj1 = lowlevelhttprequest.execute();
        obj = new HttpResponse(this, ((LowLevelHttpResponse) (obj1)));
        obj1 = null;
_L5:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1180;
        }
        if (((HttpResponse) (obj)).isSuccessStatusCode())
        {
            break MISSING_BLOCK_LABEL_1180;
        }
        flag2 = false;
        if (unsuccessfulResponseHandler != null)
        {
            flag2 = unsuccessfulResponseHandler.handleResponse(this, ((HttpResponse) (obj)), flag4);
        }
        flag3 = flag2;
        if (flag2) goto _L2; else goto _L1
_L1:
        if (!handleRedirect(((HttpResponse) (obj)).getStatusCode(), ((HttpResponse) (obj)).getHeaders())) goto _L4; else goto _L3
_L3:
        flag3 = true;
_L2:
        flag1 = flag4 & flag3;
        flag = flag1;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_856;
        }
        ((HttpResponse) (obj)).ignore();
        flag = flag1;
_L9:
        if (obj == null);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_1267;
        }
        if (obj == null)
        {
            throw obj1;
        }
        break MISSING_BLOCK_LABEL_1214;
        obj;
        obj1 = ((LowLevelHttpResponse) (obj1)).getContent();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1048;
        }
        ((InputStream) (obj1)).close();
        throw obj;
        obj1;
        if (!retryOnExecuteIOException && (ioExceptionHandler == null || !ioExceptionHandler.handleIOException(this, flag4)))
        {
            throw obj1;
        }
        logger.log(Level.WARNING, "exception thrown while executing request", ((Throwable) (obj1)));
        obj = null;
          goto _L5
_L4:
        flag3 = flag2;
        if (!flag4) goto _L2; else goto _L6
_L6:
        flag3 = flag2;
        if (backOffPolicy == null) goto _L2; else goto _L7
_L7:
        flag3 = flag2;
        if (!backOffPolicy.isBackOffRequired(((HttpResponse) (obj)).getStatusCode())) goto _L2; else goto _L8
_L8:
        long l2 = backOffPolicy.getNextBackOffMillis();
        flag3 = flag2;
        if (l2 != -1L)
        {
            Exception exception;
            try
            {
                sleeper.a(l2);
            }
            catch (InterruptedException interruptedexception) { }
            finally
            {
                if (obj == null) goto _L0; else goto _L0
            }
            flag3 = true;
        }
          goto _L2
        if (obj == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag = flag4 & flag;
          goto _L9
        ((HttpResponse) (obj)).disconnect();
        throw exception;
        if (responseInterceptor != null)
        {
            responseInterceptor.interceptResponse(((HttpResponse) (obj)));
        }
        if (!throwExceptionOnExecuteError || ((HttpResponse) (obj)).isSuccessStatusCode())
        {
            break MISSING_BLOCK_LABEL_1261;
        }
        throw new HttpResponseException(((HttpResponse) (obj)));
        exception;
        ((HttpResponse) (obj)).disconnect();
        throw exception;
        return ((HttpResponse) (obj));
        i--;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public Future executeAsync()
    {
        return executeAsync(((Executor) (Executors.newSingleThreadExecutor())));
    }

    public Future executeAsync(Executor executor)
    {
        FutureTask futuretask = new FutureTask(new _cls1());
        executor.execute(futuretask);
        return futuretask;
    }

    public BackOffPolicy getBackOffPolicy()
    {
        return backOffPolicy;
    }

    public int getConnectTimeout()
    {
        return connectTimeout;
    }

    public HttpContent getContent()
    {
        return content;
    }

    public int getContentLoggingLimit()
    {
        return contentLoggingLimit;
    }

    public HttpEncoding getEncoding()
    {
        return encoding;
    }

    public boolean getFollowRedirects()
    {
        return followRedirects;
    }

    public HttpHeaders getHeaders()
    {
        return headers;
    }

    public HttpIOExceptionHandler getIOExceptionHandler()
    {
        return ioExceptionHandler;
    }

    public HttpExecuteInterceptor getInterceptor()
    {
        return executeInterceptor;
    }

    public int getNumberOfRetries()
    {
        return numRetries;
    }

    public final hsx getParser()
    {
        return objectParser;
    }

    public int getReadTimeout()
    {
        return readTimeout;
    }

    public String getRequestMethod()
    {
        return requestMethod;
    }

    public HttpHeaders getResponseHeaders()
    {
        return responseHeaders;
    }

    public HttpResponseInterceptor getResponseInterceptor()
    {
        return responseInterceptor;
    }

    public boolean getRetryOnExecuteIOException()
    {
        return retryOnExecuteIOException;
    }

    public hsz getSleeper()
    {
        return sleeper;
    }

    public boolean getSuppressUserAgentSuffix()
    {
        return suppressUserAgentSuffix;
    }

    public boolean getThrowExceptionOnExecuteError()
    {
        return throwExceptionOnExecuteError;
    }

    public HttpTransport getTransport()
    {
        return transport;
    }

    public HttpUnsuccessfulResponseHandler getUnsuccessfulResponseHandler()
    {
        return unsuccessfulResponseHandler;
    }

    public GenericUrl getUrl()
    {
        return url;
    }

    public boolean handleRedirect(int i, HttpHeaders httpheaders)
    {
        httpheaders = httpheaders.getLocation();
        if (getFollowRedirects() && HttpStatusCodes.isRedirect(i) && httpheaders != null)
        {
            setUrl(new GenericUrl(url.toURL(httpheaders)));
            if (i == 303)
            {
                setRequestMethod("GET");
                setContent(null);
            }
            headers.setAuthorization(null);
            headers.setIfMatch(null);
            headers.setIfNoneMatch(null);
            headers.setIfModifiedSince(null);
            headers.setIfUnmodifiedSince(null);
            headers.setIfRange(null);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean isCurlLoggingEnabled()
    {
        return curlLoggingEnabled;
    }

    public boolean isLoggingEnabled()
    {
        return loggingEnabled;
    }

    public HttpRequest setBackOffPolicy(BackOffPolicy backoffpolicy)
    {
        backOffPolicy = backoffpolicy;
        return this;
    }

    public HttpRequest setConnectTimeout(int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.a(flag);
        connectTimeout = i;
        return this;
    }

    public HttpRequest setContent(HttpContent httpcontent)
    {
        content = httpcontent;
        return this;
    }

    public HttpRequest setContentLoggingLimit(int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.a(flag, "The content logging limit must be non-negative.");
        contentLoggingLimit = i;
        return this;
    }

    public HttpRequest setCurlLoggingEnabled(boolean flag)
    {
        curlLoggingEnabled = flag;
        return this;
    }

    public HttpRequest setEncoding(HttpEncoding httpencoding)
    {
        encoding = httpencoding;
        return this;
    }

    public HttpRequest setFollowRedirects(boolean flag)
    {
        followRedirects = flag;
        return this;
    }

    public HttpRequest setHeaders(HttpHeaders httpheaders)
    {
        headers = (HttpHeaders)h.a(httpheaders);
        return this;
    }

    public HttpRequest setIOExceptionHandler(HttpIOExceptionHandler httpioexceptionhandler)
    {
        ioExceptionHandler = httpioexceptionhandler;
        return this;
    }

    public HttpRequest setInterceptor(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        executeInterceptor = httpexecuteinterceptor;
        return this;
    }

    public HttpRequest setLoggingEnabled(boolean flag)
    {
        loggingEnabled = flag;
        return this;
    }

    public HttpRequest setNumberOfRetries(int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.a(flag);
        numRetries = i;
        return this;
    }

    public HttpRequest setParser(hsx hsx)
    {
        objectParser = hsx;
        return this;
    }

    public HttpRequest setReadTimeout(int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.a(flag);
        readTimeout = i;
        return this;
    }

    public HttpRequest setRequestMethod(String s)
    {
        boolean flag;
        if (s == null || HttpMediaType.matchesToken(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.a(flag);
        requestMethod = s;
        return this;
    }

    public HttpRequest setResponseHeaders(HttpHeaders httpheaders)
    {
        responseHeaders = (HttpHeaders)h.a(httpheaders);
        return this;
    }

    public HttpRequest setResponseInterceptor(HttpResponseInterceptor httpresponseinterceptor)
    {
        responseInterceptor = httpresponseinterceptor;
        return this;
    }

    public HttpRequest setRetryOnExecuteIOException(boolean flag)
    {
        retryOnExecuteIOException = flag;
        return this;
    }

    public HttpRequest setSleeper(hsz hsz1)
    {
        sleeper = (hsz)h.a(hsz1);
        return this;
    }

    public HttpRequest setSuppressUserAgentSuffix(boolean flag)
    {
        suppressUserAgentSuffix = flag;
        return this;
    }

    public HttpRequest setThrowExceptionOnExecuteError(boolean flag)
    {
        throwExceptionOnExecuteError = flag;
        return this;
    }

    public HttpRequest setUnsuccessfulResponseHandler(HttpUnsuccessfulResponseHandler httpunsuccessfulresponsehandler)
    {
        unsuccessfulResponseHandler = httpunsuccessfulresponsehandler;
        return this;
    }

    public HttpRequest setUrl(GenericUrl genericurl)
    {
        url = (GenericUrl)h.a(genericurl);
        return this;
    }

    private class _cls1
        implements Callable
    {

        final HttpRequest this$0;

        public HttpResponse call()
        {
            return execute();
        }

        public volatile Object call()
        {
            return call();
        }

        _cls1()
        {
            this$0 = HttpRequest.this;
            super();
        }
    }

}
