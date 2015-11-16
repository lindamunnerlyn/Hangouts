// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import java.io.OutputStream;
import java.net.HttpURLConnection;

final class hmc extends LowLevelHttpRequest
{

    private final HttpURLConnection a;

    hmc(HttpURLConnection httpurlconnection)
    {
        a = httpurlconnection;
        httpurlconnection.setInstanceFollowRedirects(false);
    }

    public void addHeader(String s, String s1)
    {
        a.addRequestProperty(s, s1);
    }

    public LowLevelHttpResponse execute()
    {
        Object obj = a;
        if (getStreamingContent() == null) goto _L2; else goto _L1
_L1:
        Object obj1;
        long l1;
        obj1 = getContentType();
        if (obj1 != null)
        {
            addHeader("Content-Type", ((String) (obj1)));
        }
        obj1 = getContentEncoding();
        if (obj1 != null)
        {
            addHeader("Content-Encoding", ((String) (obj1)));
        }
        l1 = getContentLength();
        if (l1 >= 0L)
        {
            addHeader("Content-Length", Long.toString(l1));
        }
        obj1 = ((HttpURLConnection) (obj)).getRequestMethod();
        if (!"POST".equals(obj1) && !"PUT".equals(obj1)) goto _L4; else goto _L3
_L3:
        ((HttpURLConnection) (obj)).setDoOutput(true);
        if (l1 >= 0L && l1 <= 0x7fffffffL)
        {
            ((HttpURLConnection) (obj)).setFixedLengthStreamingMode((int)l1);
        } else
        {
            ((HttpURLConnection) (obj)).setChunkedStreamingMode(0);
        }
        obj1 = ((HttpURLConnection) (obj)).getOutputStream();
        getStreamingContent().writeTo(((OutputStream) (obj1)));
        ((OutputStream) (obj1)).close();
_L2:
        ((HttpURLConnection) (obj)).connect();
        obj1 = new hmd(((HttpURLConnection) (obj)));
        return ((LowLevelHttpResponse) (obj1));
        obj;
        ((OutputStream) (obj1)).close();
        throw obj;
_L4:
        boolean flag;
        if (l1 == 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.a(flag, "%s with non-zero content length is not supported", new Object[] {
            obj1
        });
        if (true) goto _L2; else goto _L5
_L5:
        Exception exception;
        exception;
        ((HttpURLConnection) (obj)).disconnect();
        throw exception;
    }

    public void setTimeout(int i, int j)
    {
        a.setReadTimeout(j);
        a.setConnectTimeout(i);
    }
}
