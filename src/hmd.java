// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.LowLevelHttpResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class hmd extends LowLevelHttpResponse
{

    private final HttpURLConnection a;
    private final int b;
    private final String c;
    private final ArrayList d = new ArrayList();
    private final ArrayList e = new ArrayList();

    hmd(HttpURLConnection httpurlconnection)
    {
        a = httpurlconnection;
        int j = httpurlconnection.getResponseCode();
        int i = j;
        if (j == -1)
        {
            i = 0;
        }
        b = i;
        c = httpurlconnection.getResponseMessage();
        ArrayList arraylist = d;
        ArrayList arraylist1 = e;
        for (httpurlconnection = httpurlconnection.getHeaderFields().entrySet().iterator(); httpurlconnection.hasNext();)
        {
            Object obj = (java.util.Map.Entry)httpurlconnection.next();
            String s = (String)((java.util.Map.Entry) (obj)).getKey();
            if (s != null)
            {
                obj = ((List)((java.util.Map.Entry) (obj)).getValue()).iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    String s1 = (String)((Iterator) (obj)).next();
                    if (s1 != null)
                    {
                        arraylist.add(s);
                        arraylist1.add(s1);
                    }
                }
            }
        }

    }

    public void disconnect()
    {
        a.disconnect();
    }

    public InputStream getContent()
    {
        Object obj;
        try
        {
            obj = a.getInputStream();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = a.getErrorStream();
        }
        if (obj == null)
        {
            return null;
        } else
        {
            return new hme(this, ((InputStream) (obj)));
        }
    }

    public String getContentEncoding()
    {
        return a.getContentEncoding();
    }

    public long getContentLength()
    {
        String s = a.getHeaderField("Content-Length");
        if (s == null)
        {
            return -1L;
        } else
        {
            return Long.parseLong(s);
        }
    }

    public String getContentType()
    {
        return a.getHeaderField("Content-Type");
    }

    public int getHeaderCount()
    {
        return d.size();
    }

    public String getHeaderName(int i)
    {
        return (String)d.get(i);
    }

    public String getHeaderValue(int i)
    {
        return (String)e.get(i);
    }

    public String getReasonPhrase()
    {
        return c;
    }

    public int getStatusCode()
    {
        return b;
    }

    public String getStatusLine()
    {
        String s = a.getHeaderField(0);
        if (s != null && s.startsWith("HTTP/1."))
        {
            return s;
        } else
        {
            return null;
        }
    }
}
