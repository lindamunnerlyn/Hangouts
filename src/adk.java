// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import junit.framework.Assert;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HttpContext;

public final class adk
    implements HttpClient
{

    public static long a = 256L;
    private static String b[] = {
        "text/", "application/xml", "application/json"
    };
    private static final HttpRequestInterceptor c = new adl();
    private final HttpClient d;
    private RuntimeException e;
    private volatile qd f;

    private adk(ClientConnectionManager clientconnectionmanager, HttpParams httpparams)
    {
        e = new IllegalStateException("AndroidHttpClient created and never closed");
        d = new adm(this, clientconnectionmanager, httpparams);
    }

    public static adk a(String s, Context context, boolean flag)
    {
        Object obj = null;
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setStaleCheckingEnabled(basichttpparams, false);
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 60000);
        HttpConnectionParams.setSoTimeout(basichttpparams, 60000);
        HttpConnectionParams.setSocketBufferSize(basichttpparams, 8192);
        HttpClientParams.setRedirecting(basichttpparams, false);
        SchemeRegistry schemeregistry;
        if (context == null)
        {
            context = null;
        } else
        {
            context = new SSLSessionCache(context);
        }
        HttpProtocolParams.setUserAgent(basichttpparams, s);
        schemeregistry = new SchemeRegistry();
        schemeregistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        try
        {
            s = android/net/SSLCertificateSocketFactory.getMethod("getHttpSocketFactory", new Class[] {
                Integer.TYPE, android/net/SSLSessionCache
            });
            s.setAccessible(true);
            s = (SSLSocketFactory)s.invoke(null, new Object[] {
                Integer.valueOf(60000), context
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Assert.fail(s.toString());
            s = obj;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Assert.fail(s.toString());
            s = obj;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Assert.fail(s.toString());
            s = obj;
        }
        Assert.assertNotNull(s);
        schemeregistry.register(new Scheme("https", s, 443));
        if (flag)
        {
            s = new adq(basichttpparams, schemeregistry);
        } else
        {
            s = new adp(basichttpparams, schemeregistry);
        }
        return new adk(s, basichttpparams);
    }

    static String a(HttpUriRequest httpurirequest)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("curl ");
        stringbuilder.append("-X ");
        stringbuilder.append(httpurirequest.getMethod());
        stringbuilder.append(" ");
        Header aheader[] = httpurirequest.getAllHeaders();
        int j = aheader.length;
        for (int i = 0; i < j; i++)
        {
            Header header = aheader[i];
            if (!header.getName().equals("Authorization") && !header.getName().equals("Cookie"))
            {
                stringbuilder.append("--header \"");
                stringbuilder.append(header.toString().trim());
                stringbuilder.append("\" ");
            }
        }

        java.net.URI uri = httpurirequest.getURI();
        if (httpurirequest instanceof RequestWrapper)
        {
            HttpRequest httprequest = ((RequestWrapper)httpurirequest).getOriginal();
            if (httprequest instanceof HttpUriRequest)
            {
                uri = ((HttpUriRequest)httprequest).getURI();
            }
        }
        stringbuilder.append("\"");
        stringbuilder.append(uri);
        stringbuilder.append("\"");
        if (httpurirequest instanceof HttpEntityEnclosingRequest)
        {
            HttpEntity httpentity = ((HttpEntityEnclosingRequest)httpurirequest).getEntity();
            if (httpentity != null && httpentity.isRepeatable())
            {
                if (httpentity.getContentLength() < 1024L)
                {
                    ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                    httpentity.writeTo(bytearrayoutputstream);
                    if (b(httpurirequest))
                    {
                        httpurirequest = Base64.encodeToString(bytearrayoutputstream.toByteArray(), 2);
                        stringbuilder.insert(0, (new StringBuilder(String.valueOf(httpurirequest).length() + 35)).append("echo '").append(httpurirequest).append("' | base64 -d > /tmp/$$.bin; ").toString());
                        stringbuilder.append(" --data-binary @/tmp/$$.bin");
                    } else
                    {
                        httpurirequest = bytearrayoutputstream.toString();
                        stringbuilder.append(" --data-ascii \"").append(httpurirequest).append("\"");
                    }
                } else
                {
                    stringbuilder.append(" [TOO MUCH DATA TO INCLUDE]");
                }
            }
        }
        return stringbuilder.toString();
    }

    static qd a(adk adk1)
    {
        return adk1.f;
    }

    static HttpRequestInterceptor b()
    {
        return c;
    }

    private static boolean b(HttpUriRequest httpurirequest)
    {
        Header aheader[];
        int i;
        int k;
        aheader = httpurirequest.getHeaders("content-encoding");
        if (aheader == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        k = aheader.length;
        i = 0;
_L3:
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (!"gzip".equalsIgnoreCase(aheader[i].getValue())) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        i++;
          goto _L3
        httpurirequest = httpurirequest.getHeaders("content-type");
        if (httpurirequest != null)
        {
            int i1 = httpurirequest.length;
            int j = 0;
            while (j < i1) 
            {
                Header header = httpurirequest[j];
                String as[] = b;
                int j1 = as.length;
                for (int l = 0; l < j1; l++)
                {
                    String s = as[l];
                    if (header.getValue().startsWith(s))
                    {
                        return false;
                    }
                }

                j++;
            }
        }
          goto _L1
    }

    public void a()
    {
        if (e != null)
        {
            getConnectionManager().shutdown();
            e = null;
        }
    }

    public Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler)
    {
        return d.execute(httphost, httprequest, responsehandler);
    }

    public Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler, HttpContext httpcontext)
    {
        return d.execute(httphost, httprequest, responsehandler, httpcontext);
    }

    public Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler)
    {
        return d.execute(httpurirequest, responsehandler);
    }

    public Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler, HttpContext httpcontext)
    {
        return d.execute(httpurirequest, responsehandler, httpcontext);
    }

    public HttpResponse execute(HttpHost httphost, HttpRequest httprequest)
    {
        return d.execute(httphost, httprequest);
    }

    public HttpResponse execute(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
    {
        return d.execute(httphost, httprequest, httpcontext);
    }

    public HttpResponse execute(HttpUriRequest httpurirequest)
    {
        return d.execute(httpurirequest);
    }

    public HttpResponse execute(HttpUriRequest httpurirequest, HttpContext httpcontext)
    {
        return d.execute(httpurirequest, httpcontext);
    }

    protected void finalize()
    {
        super.finalize();
        if (e != null)
        {
            Log.e("MmsHttpClient", "Leak found", e);
            e = null;
        }
    }

    public ClientConnectionManager getConnectionManager()
    {
        return d.getConnectionManager();
    }

    public HttpParams getParams()
    {
        return d.getParams();
    }

}
