// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net.urlconnection;

import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.chromium.base.Log;
import org.chromium.net.ResponseInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequestContext;
import org.chromium.net.UrlRequestException;

// Referenced classes of package org.chromium.net.urlconnection:
//            MessageLoop, CronetInputStream, CronetOutputStream, CronetChunkedOutputStream, 
//            CronetFixedModeOutputStream, CronetBufferedOutputStream

public class CronetHttpURLConnection extends HttpURLConnection
{

    private final UrlRequestContext a;
    private final MessageLoop b = new MessageLoop();
    private final UrlRequest c;
    private final List d = new ArrayList();
    private CronetInputStream e;
    private CronetOutputStream f;
    private ResponseInfo g;
    private UrlRequestException h;
    private boolean i;
    private boolean j;

    public CronetHttpURLConnection(URL url, UrlRequestContext urlrequestcontext)
    {
        super(url);
        i = false;
        j = false;
        a = urlrequestcontext;
        c = a.a(url.toString(), new CronetUrlRequestListener(), b);
        e = new CronetInputStream(this);
    }

    private int a(String s)
    {
        for (int k = 0; k < d.size(); k++)
        {
            if (((String)((Pair)d.get(k)).first).equalsIgnoreCase(s))
            {
                return k;
            }
        }

        return -1;
    }

    private long a()
    {
        long l = fixedContentLength;
        long l1;
        try
        {
            l1 = getClass().getField("fixedContentLengthLong").getLong(this);
        }
        catch (Exception exception)
        {
            return l;
        }
label0:
        {
            if (l1 != -1L)
            {
                return l1;
            }
            break label0;
        }
    }

    private Pair a(int k)
    {
        List list;
        try
        {
            c();
        }
        catch (IOException ioexception)
        {
            return null;
        }
        list = g.c();
        if (k >= list.size())
        {
            return null;
        } else
        {
            return (Pair)list.get(k);
        }
    }

    static URL a(CronetHttpURLConnection cronethttpurlconnection, URL url)
    {
        cronethttpurlconnection.url = url;
        return url;
    }

    static ResponseInfo a(CronetHttpURLConnection cronethttpurlconnection, ResponseInfo responseinfo)
    {
        cronethttpurlconnection.g = responseinfo;
        return responseinfo;
    }

    static UrlRequestException a(CronetHttpURLConnection cronethttpurlconnection, UrlRequestException urlrequestexception)
    {
        cronethttpurlconnection.h = urlrequestexception;
        return urlrequestexception;
    }

    static MessageLoop a(CronetHttpURLConnection cronethttpurlconnection)
    {
        return cronethttpurlconnection.b;
    }

    private final void a(String s, String s1, boolean flag)
    {
label0:
        {
            if (connected)
            {
                throw new IllegalStateException("Cannot modify request property after connection is made.");
            }
            int k = a(s);
            if (k >= 0)
            {
                if (!flag)
                {
                    break label0;
                }
                d.remove(k);
            }
            d.add(Pair.create(s, s1));
            return;
        }
        throw new UnsupportedOperationException("Cannot add multiple headers of the same key. crbug.com/432719.");
    }

    private void b()
    {
        if (connected)
        {
            return;
        }
        if (!doOutput) goto _L2; else goto _L1
_L1:
        if (f == null) goto _L4; else goto _L3
_L3:
        c.a(f, b);
        if (getRequestProperty("Content-Length") == null && !d())
        {
            addRequestProperty("Content-Length", Long.toString(f.a()));
        }
        f.b();
_L6:
        if (getRequestProperty("Content-Type") == null)
        {
            addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        }
_L2:
        Pair pair;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); c.a((String)pair.first, (String)pair.second))
        {
            pair = (Pair)iterator.next();
        }

        break; /* Loop/switch isn't completed */
_L4:
        if (getRequestProperty("Content-Length") == null)
        {
            addRequestProperty("Content-Length", "0");
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (!getUseCaches())
        {
            c.e();
        }
        connected = true;
        c.a();
        return;
    }

    static boolean b(CronetHttpURLConnection cronethttpurlconnection)
    {
        cronethttpurlconnection.i = true;
        return true;
    }

    private void c()
    {
        if (f != null)
        {
            f.c();
            if (d())
            {
                f.close();
            }
        }
        if (!j)
        {
            b();
            b.a();
            j = true;
        }
        if (!j)
        {
            throw new IllegalStateException("No response.");
        }
        if (h != null)
        {
            throw h;
        }
        if (g == null)
        {
            throw new NullPointerException("Response info is null when there is no exception.");
        } else
        {
            return;
        }
    }

    static boolean c(CronetHttpURLConnection cronethttpurlconnection)
    {
        return cronethttpurlconnection.instanceFollowRedirects;
    }

    static UrlRequest d(CronetHttpURLConnection cronethttpurlconnection)
    {
        return cronethttpurlconnection.c;
    }

    private boolean d()
    {
        return chunkLength > 0;
    }

    static CronetInputStream e(CronetHttpURLConnection cronethttpurlconnection)
    {
        return cronethttpurlconnection.e;
    }

    void a(ByteBuffer bytebuffer)
    {
        c.a(bytebuffer);
        b.a();
    }

    public final void addRequestProperty(String s, String s1)
    {
        a(s, s1, false);
    }

    public void connect()
    {
        b();
    }

    public void disconnect()
    {
        if (connected && e != null)
        {
            try
            {
                e.close();
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
            e = null;
            c.c();
        }
    }

    public InputStream getErrorStream()
    {
        CronetInputStream cronetinputstream = null;
        try
        {
            c();
        }
        catch (IOException ioexception)
        {
            return null;
        }
        if (g.a() >= 400)
        {
            cronetinputstream = e;
        }
        return cronetinputstream;
    }

    public final String getHeaderField(int k)
    {
        Pair pair = a(k);
        if (pair == null)
        {
            return null;
        } else
        {
            return (String)pair.second;
        }
    }

    public final String getHeaderField(String s)
    {
        Map map;
        try
        {
            c();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        map = g.d();
        if (!map.containsKey(s))
        {
            return null;
        } else
        {
            s = (List)map.get(s);
            return (String)s.get(s.size() - 1);
        }
    }

    public final String getHeaderFieldKey(int k)
    {
        Pair pair = a(k);
        if (pair == null)
        {
            return null;
        } else
        {
            return (String)pair.first;
        }
    }

    public Map getHeaderFields()
    {
        try
        {
            c();
        }
        catch (IOException ioexception)
        {
            return Collections.emptyMap();
        }
        return g.d();
    }

    public InputStream getInputStream()
    {
        c();
        if (!instanceFollowRedirects && i)
        {
            throw new IOException("Cannot read response body of a redirect.");
        }
        if (g.a() >= 400)
        {
            throw new FileNotFoundException(url.toString());
        } else
        {
            return e;
        }
    }

    public OutputStream getOutputStream()
    {
        if (f == null)
        {
            if (connected)
            {
                throw new ProtocolException("Cannot write to OutputStream after receiving response.");
            }
            if (d())
            {
                f = new CronetChunkedOutputStream(this, chunkLength, b);
                b();
            } else
            {
                long l = a();
                if (l != -1L)
                {
                    f = new CronetFixedModeOutputStream(this, l, b);
                    b();
                } else
                {
                    Log.a("cr.CronetHttpURLConn", "Outputstream is being buffered in memory.");
                    String s = getRequestProperty("Content-Length");
                    if (s == null)
                    {
                        f = new CronetBufferedOutputStream(this);
                    } else
                    {
                        f = new CronetBufferedOutputStream(this, Long.parseLong(s));
                    }
                }
            }
        }
        return f;
    }

    public Map getRequestProperties()
    {
        if (connected)
        {
            throw new IllegalStateException("Cannot access request headers after connection is set.");
        }
        TreeMap treemap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        Pair pair;
        ArrayList arraylist;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); treemap.put(pair.first, Collections.unmodifiableList(arraylist)))
        {
            pair = (Pair)iterator.next();
            if (treemap.containsKey(pair.first))
            {
                throw new IllegalStateException("Should not have multiple values.");
            }
            arraylist = new ArrayList();
            arraylist.add(pair.second);
        }

        return Collections.unmodifiableMap(treemap);
    }

    public String getRequestProperty(String s)
    {
        int k = a(s);
        if (k >= 0)
        {
            return (String)((Pair)d.get(k)).second;
        } else
        {
            return null;
        }
    }

    public int getResponseCode()
    {
        c();
        return g.a();
    }

    public String getResponseMessage()
    {
        c();
        return g.b();
    }

    public final void setRequestProperty(String s, String s1)
    {
        a(s, s1, true);
    }

    public boolean usingProxy()
    {
        return false;
    }

    private class CronetUrlRequestListener
        implements UrlRequestListener
    {

        final CronetHttpURLConnection a;

        private void a()
        {
            if (CronetHttpURLConnection.e(a) != null)
            {
                CronetHttpURLConnection.e(a).a();
            }
            CronetHttpURLConnection.a(a).b();
        }

        public void a(ExtendedResponseInfo extendedresponseinfo)
        {
            CronetHttpURLConnection.a(a, extendedresponseinfo.a());
            a();
        }

        public void a(ResponseInfo responseinfo)
        {
            CronetHttpURLConnection.a(a, responseinfo);
            CronetHttpURLConnection.a(a).b();
        }

        public void a(ResponseInfo responseinfo, String s)
        {
            CronetHttpURLConnection.b(a);
            if (CronetHttpURLConnection.c(a))
            {
                try
                {
                    CronetHttpURLConnection.a(a, new URL(s));
                }
                // Misplaced declaration of an exception variable
                catch (ResponseInfo responseinfo) { }
                CronetHttpURLConnection.d(a).b();
                return;
            } else
            {
                CronetHttpURLConnection.a(a, responseinfo);
                CronetHttpURLConnection.d(a).c();
                a();
                return;
            }
        }

        public void a(ResponseInfo responseinfo, UrlRequestException urlrequestexception)
        {
            if (urlrequestexception == null)
            {
                throw new IllegalStateException("Exception cannot be null in onFailed.");
            } else
            {
                CronetHttpURLConnection.a(a, responseinfo);
                CronetHttpURLConnection.a(a, urlrequestexception);
                a();
                return;
            }
        }

        public void b(ResponseInfo responseinfo)
        {
            CronetHttpURLConnection.a(a, responseinfo);
            CronetHttpURLConnection.a(a).b();
        }

        public CronetUrlRequestListener()
        {
            a = CronetHttpURLConnection.this;
            super();
        }
    }

}
