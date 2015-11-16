// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import g;
import hrx;
import hsr;
import hsx;
import htc;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;
import l;

// Referenced classes of package com.google.api.client.http:
//            HttpRequest, LowLevelHttpResponse, HttpTransport, HttpHeaders, 
//            HttpMediaType, HttpStatusCodes

public final class HttpResponse
{

    private InputStream content;
    private final String contentEncoding;
    private int contentLoggingLimit;
    private boolean contentRead;
    private final String contentType;
    private boolean loggingEnabled;
    private final HttpMediaType mediaType;
    private final HttpRequest request;
    LowLevelHttpResponse response;
    private final int statusCode;
    private final String statusMessage;

    HttpResponse(HttpRequest httprequest, LowLevelHttpResponse lowlevelhttpresponse)
    {
        Object obj1 = null;
        super();
        request = httprequest;
        contentLoggingLimit = httprequest.getContentLoggingLimit();
        loggingEnabled = httprequest.isLoggingEnabled();
        response = lowlevelhttpresponse;
        contentEncoding = lowlevelhttpresponse.getContentEncoding();
        int j = lowlevelhttpresponse.getStatusCode();
        int i = j;
        if (j < 0)
        {
            i = 0;
        }
        statusCode = i;
        Object obj = lowlevelhttpresponse.getReasonPhrase();
        statusMessage = ((String) (obj));
        Logger logger = HttpTransport.LOGGER;
        StringBuilder stringbuilder;
        boolean flag;
        if (loggingEnabled && logger.isLoggable(Level.CONFIG))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            stringbuilder = new StringBuilder();
            stringbuilder.append("-------------- RESPONSE --------------").append(htc.a);
            Object obj2 = lowlevelhttpresponse.getStatusLine();
            if (obj2 != null)
            {
                stringbuilder.append(((String) (obj2)));
            } else
            {
                stringbuilder.append(statusCode);
                if (obj != null)
                {
                    stringbuilder.append(' ').append(((String) (obj)));
                }
            }
            stringbuilder.append(htc.a);
        } else
        {
            stringbuilder = null;
        }
        obj2 = httprequest.getResponseHeaders();
        if (flag)
        {
            obj = stringbuilder;
        } else
        {
            obj = null;
        }
        ((HttpHeaders) (obj2)).fromHttpResponse(lowlevelhttpresponse, ((StringBuilder) (obj)));
        obj = lowlevelhttpresponse.getContentType();
        lowlevelhttpresponse = ((LowLevelHttpResponse) (obj));
        if (obj == null)
        {
            lowlevelhttpresponse = httprequest.getResponseHeaders().getContentType();
        }
        contentType = lowlevelhttpresponse;
        if (lowlevelhttpresponse == null)
        {
            httprequest = obj1;
        } else
        {
            httprequest = new HttpMediaType(lowlevelhttpresponse);
        }
        mediaType = httprequest;
        if (flag)
        {
            logger.config(stringbuilder.toString());
        }
    }

    private boolean hasMessageBody()
    {
        boolean flag = true;
        int i = getStatusCode();
        if (getRequest().getRequestMethod().equals("HEAD") || i / 100 == 1 || i == 204 || i == 304)
        {
            ignore();
            flag = false;
        }
        return flag;
    }

    public void disconnect()
    {
        ignore();
        response.disconnect();
    }

    public void download(OutputStream outputstream)
    {
        g.a(getContent(), outputstream, true);
    }

    public InputStream getContent()
    {
        Object obj1;
        Object obj2;
        if (contentRead)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        obj1 = response.getContent();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        obj2 = obj1;
        Object obj3 = contentEncoding;
        Object obj;
        obj = obj1;
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        obj = obj1;
        obj2 = obj1;
        if (!((String) (obj3)).contains("gzip"))
        {
            break MISSING_BLOCK_LABEL_59;
        }
        obj2 = obj1;
        obj = new GZIPInputStream(((InputStream) (obj1)));
        obj2 = obj;
        obj3 = obj;
        Logger logger = HttpTransport.LOGGER;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        if (!loggingEnabled)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        if (!logger.isLoggable(Level.CONFIG))
        {
            break MISSING_BLOCK_LABEL_124;
        }
        obj2 = obj;
        obj3 = obj;
        obj1 = new hsr(((InputStream) (obj)), logger, Level.CONFIG, contentLoggingLimit);
        obj2 = obj1;
        obj3 = obj1;
        Exception exception;
        try
        {
            content = ((InputStream) (obj1));
        }
        catch (EOFException eofexception)
        {
            ((InputStream) (obj2)).close();
        }
        finally
        {
            obj1 = obj3;
        }
        contentRead = true;
        return content;
        exception;
        ((InputStream) (obj1)).close();
        throw exception;
    }

    public Charset getContentCharset()
    {
        if (mediaType == null || mediaType.getCharsetParameter() == null)
        {
            return hrx.b;
        } else
        {
            return mediaType.getCharsetParameter();
        }
    }

    public String getContentEncoding()
    {
        return contentEncoding;
    }

    public int getContentLoggingLimit()
    {
        return contentLoggingLimit;
    }

    public String getContentType()
    {
        return contentType;
    }

    public HttpHeaders getHeaders()
    {
        return request.getResponseHeaders();
    }

    public HttpMediaType getMediaType()
    {
        return mediaType;
    }

    public HttpRequest getRequest()
    {
        return request;
    }

    public int getStatusCode()
    {
        return statusCode;
    }

    public String getStatusMessage()
    {
        return statusMessage;
    }

    public HttpTransport getTransport()
    {
        return request.getTransport();
    }

    public void ignore()
    {
        InputStream inputstream = getContent();
        if (inputstream != null)
        {
            inputstream.close();
        }
    }

    public boolean isLoggingEnabled()
    {
        return loggingEnabled;
    }

    public boolean isSuccessStatusCode()
    {
        return HttpStatusCodes.isSuccess(statusCode);
    }

    public Object parseAs(Class class1)
    {
        if (!hasMessageBody())
        {
            return null;
        } else
        {
            return request.getParser().parseAndClose(getContent(), getContentCharset(), class1);
        }
    }

    public Object parseAs(Type type)
    {
        if (!hasMessageBody())
        {
            return null;
        } else
        {
            return request.getParser().parseAndClose(getContent(), getContentCharset(), type);
        }
    }

    public String parseAsString()
    {
        InputStream inputstream = getContent();
        if (inputstream == null)
        {
            return "";
        } else
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            g.a(inputstream, bytearrayoutputstream, true);
            return bytearrayoutputstream.toString(getContentCharset().name());
        }
    }

    public HttpResponse setContentLoggingLimit(int i)
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

    public HttpResponse setLoggingEnabled(boolean flag)
    {
        loggingEnabled = flag;
        return this;
    }
}
