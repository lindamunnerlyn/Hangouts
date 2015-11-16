// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.GZIPInputStream;
import org.chromium.net.ChunkedWritableByteChannel;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;
import org.chromium.net.ResponseTooLargeException;

public final class lmq
    implements HttpUrlRequest
{

    private static ExecutorService B;
    private static final Object C = new Object();
    private final Object A;
    private final Context a;
    private final String b;
    private final String c;
    private final Map d;
    private final WritableByteChannel e;
    private final HttpUrlRequestListener f;
    private IOException g;
    private HttpURLConnection h;
    private long i;
    private int j;
    private int k;
    private long l;
    private boolean m;
    private boolean n;
    private boolean o;
    private long p;
    private String q;
    private byte r[];
    private ReadableByteChannel s;
    private String t;
    private int u;
    private String v;
    private boolean w;
    private boolean x;
    private String y;
    private InputStream z;

    public lmq(Context context, String s1, String s2, Map map, WritableByteChannel writablebytechannel, HttpUrlRequestListener httpurlrequestlistener)
    {
        if (context == null)
        {
            throw new NullPointerException("Context is required");
        }
        if (s2 == null)
        {
            throw new NullPointerException("URL is required");
        } else
        {
            a = context;
            b = s1;
            c = s2;
            d = map;
            e = writablebytechannel;
            f = httpurlrequestlistener;
            A = new Object();
            return;
        }
    }

    public lmq(Context context, String s1, String s2, Map map, HttpUrlRequestListener httpurlrequestlistener)
    {
        this(context, s1, s2, map, ((WritableByteChannel) (new ChunkedWritableByteChannel())), httpurlrequestlistener);
    }

    static void a(lmq lmq1)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = false;
        flag = flag2;
        Object obj = lmq1.A;
        flag = flag2;
        obj;
        JVM INSTR monitorenter ;
        if (!lmq1.x)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        obj;
        JVM INSTR monitorexit ;
        Object obj1;
        Object obj2;
        Object obj3;
        if (lmq1.s != null)
        {
            try
            {
                lmq1.s.close();
            }
            catch (IOException ioexception) { }
        }
        lmq1.f.b(lmq1);
        return;
        obj;
        JVM INSTR monitorexit ;
        flag = flag2;
        lmq1.h = (HttpURLConnection)(new URL(lmq1.c)).openConnection();
        flag = flag2;
        obj = lmq1.y;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        flag = flag2;
        lmq1.h.setRequestMethod(lmq1.y);
        flag = flag2;
        lmq1.h.setConnectTimeout(3000);
        flag = flag2;
        lmq1.h.setReadTimeout(0x15f90);
        flag = flag2;
        lmq1.h.setInstanceFollowRedirects(true);
        flag = flag2;
        if (lmq1.d == null) goto _L2; else goto _L1
_L1:
        flag = flag2;
        obj = lmq1.d.entrySet().iterator();
_L3:
        flag = flag2;
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag2;
        obj2 = (java.util.Map.Entry)((Iterator) (obj)).next();
        flag = flag2;
        lmq1.h.setRequestProperty((String)((java.util.Map.Entry) (obj2)).getKey(), (String)((java.util.Map.Entry) (obj2)).getValue());
        if (true) goto _L3; else goto _L2
_L4:
        flag = flag1;
        lmq1.g = ((IOException) (obj));
        if (lmq1.s != null)
        {
            try
            {
                lmq1.s.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (!flag1)
        {
            lmq1.f.b(lmq1);
            return;
        } else
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj3;
        obj;
        JVM INSTR monitorexit ;
        flag = flag2;
        try
        {
            throw obj3;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally { }
          goto _L4
_L9:
        flag = true;
        if (lmq1.s != null)
        {
            try
            {
                lmq1.s.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj3) { }
        }
        if (!flag)
        {
            lmq1.f.b(lmq1);
        }
        throw obj1;
        obj1;
        flag = flag2;
        throw new IllegalArgumentException(((Throwable) (obj1)));
_L2:
        flag = flag2;
        if (lmq1.i == 0L)
        {
            break MISSING_BLOCK_LABEL_370;
        }
        flag = flag2;
        lmq1.h.setRequestProperty("Range", (new StringBuilder("bytes=")).append(lmq1.i).append("-").toString());
        flag = flag2;
        if (lmq1.h.getRequestProperty("User-Agent") != null)
        {
            break MISSING_BLOCK_LABEL_401;
        }
        flag = flag2;
        lmq1.h.setRequestProperty("User-Agent", lmq1.b);
        flag = flag2;
        if (lmq1.r != null)
        {
            break MISSING_BLOCK_LABEL_421;
        }
        flag = flag2;
        if (lmq1.s == null)
        {
            break MISSING_BLOCK_LABEL_428;
        }
        flag = flag2;
        lmq1.o();
        obj1 = null;
        flag = flag2;
        obj3 = lmq1.h.getInputStream();
        obj1 = obj3;
_L10:
        flag = flag2;
        lmq1.u = lmq1.h.getResponseCode();
        flag = flag2;
        lmq1.v = lmq1.h.getResponseMessage();
        flag = flag2;
        lmq1.t = lmq1.h.getContentType();
        flag = flag2;
        lmq1.j = lmq1.h.getContentLength();
        flag = flag2;
        if (lmq1.l <= 0L)
        {
            break MISSING_BLOCK_LABEL_571;
        }
        flag = flag2;
        if ((long)lmq1.j <= lmq1.l)
        {
            break MISSING_BLOCK_LABEL_571;
        }
        flag = flag2;
        if (!lmq1.m)
        {
            break MISSING_BLOCK_LABEL_571;
        }
        flag = flag2;
        lmq1.p();
        if (lmq1.s != null)
        {
            try
            {
                lmq1.s.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        lmq1.f.b(lmq1);
        return;
        flag = flag2;
        lmq1.f.a(lmq1);
        flag = flag2;
        if (lmq1.u / 100 != 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_615;
        }
        flag = flag2;
        obj1 = lmq1.h.getErrorStream();
        flag = flag2;
        lmq1.z = ((InputStream) (obj1));
        flag = flag2;
        if (lmq1.z == null)
        {
            break MISSING_BLOCK_LABEL_678;
        }
        flag = flag2;
        if (!"gzip".equals(lmq1.h.getContentEncoding()))
        {
            break MISSING_BLOCK_LABEL_678;
        }
        flag = flag2;
        lmq1.z = new GZIPInputStream(lmq1.z);
        flag = flag2;
        lmq1.j = -1;
        flag = flag2;
        if (lmq1.i == 0L) goto _L6; else goto _L5
_L5:
        flag = flag2;
        if (lmq1.u != 200) goto _L8; else goto _L7
_L7:
        flag = flag2;
        if (lmq1.j == -1)
        {
            break MISSING_BLOCK_LABEL_732;
        }
        flag = flag2;
        lmq1.j = (int)((long)lmq1.j - lmq1.i);
        flag = flag2;
        lmq1.o = true;
_L6:
        flag = flag2;
        obj1 = lmq1.z;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_857;
        }
        g().execute(new lmt(lmq1));
        flag = true;
_L11:
        if (lmq1.s != null)
        {
            try
            {
                lmq1.s.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (!flag)
        {
            lmq1.f.b(lmq1);
            return;
        }
        break MISSING_BLOCK_LABEL_54;
_L8:
        flag = flag2;
        lmq1.p = lmq1.i;
          goto _L6
        obj1;
          goto _L9
        obj1;
        flag1 = true;
          goto _L4
        obj3;
          goto _L10
        flag = false;
          goto _L11
    }

    static void b(lmq lmq1)
    {
        if (lmq1.z == null) goto _L2; else goto _L1
_L1:
        byte abyte0[] = new byte[8192];
_L8:
        if (lmq1.j()) goto _L2; else goto _L3
_L3:
        int j1 = lmq1.z.read(abyte0);
        if (j1 == -1) goto _L2; else goto _L4
_L4:
        lmq1.p = lmq1.p + (long)j1;
        if (!lmq1.o) goto _L6; else goto _L5
_L5:
        if (lmq1.p <= lmq1.i) goto _L8; else goto _L7
_L7:
        int i1;
        lmq1.o = false;
        i1 = (int)(lmq1.i - (lmq1.p - (long)j1));
        j1 -= i1;
_L12:
        if (lmq1.l == 0L || lmq1.p <= lmq1.l) goto _L10; else goto _L9
_L9:
        j1 -= (int)(lmq1.p - lmq1.l);
        if (j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        lmq1.e.write(ByteBuffer.wrap(abyte0, i1, j1));
        lmq1.p();
_L2:
        Object obj;
        Object obj1;
        try
        {
            lmq1.h.disconnect();
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) { }
        try
        {
            lmq1.e.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (lmq1.g == null)
            {
                lmq1.g = ((IOException) (obj));
            }
        }
        lmq1.f.b(lmq1);
        return;
_L10:
        lmq1.e.write(ByteBuffer.wrap(abyte0, i1, j1));
          goto _L8
        obj;
        lmq1.g = ((IOException) (obj));
        try
        {
            lmq1.h.disconnect();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            lmq1.e.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (lmq1.g == null)
            {
                lmq1.g = ((IOException) (obj));
            }
        }
        break MISSING_BLOCK_LABEL_171;
        obj;
        try
        {
            lmq1.h.disconnect();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        lmq1.e.close();
_L11:
        throw obj;
        obj1;
        if (lmq1.g == null)
        {
            lmq1.g = ((IOException) (obj1));
        }
        if (true) goto _L11; else goto _L6
_L6:
        i1 = 0;
          goto _L12
    }

    private static ExecutorService g()
    {
        ExecutorService executorservice;
        synchronized (C)
        {
            if (B == null)
            {
                B = Executors.newCachedThreadPool(new lmr());
            }
            executorservice = B;
        }
        return executorservice;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void o()
    {
        OutputStream outputstream;
        OutputStream outputstream1;
        h.setDoOutput(true);
        if (!TextUtils.isEmpty(q))
        {
            h.setRequestProperty("Content-Type", q);
        }
        outputstream1 = null;
        outputstream = outputstream1;
        if (r == null) goto _L2; else goto _L1
_L1:
        outputstream = outputstream1;
        h.setFixedLengthStreamingMode(r.length);
        outputstream = outputstream1;
        outputstream1 = h.getOutputStream();
        outputstream = outputstream1;
        outputstream1.write(r);
_L4:
        if (outputstream1 != null)
        {
            outputstream1.close();
        }
        return;
_L2:
        outputstream = outputstream1;
        h.setFixedLengthStreamingMode(k);
        outputstream = outputstream1;
        OutputStream outputstream2 = h.getOutputStream();
        outputstream = outputstream2;
        byte abyte0[] = new byte[8192];
        outputstream = outputstream2;
        ByteBuffer bytebuffer = ByteBuffer.wrap(abyte0);
_L5:
        outputstream1 = outputstream2;
        outputstream = outputstream2;
        if (s.read(bytebuffer) <= 0) goto _L4; else goto _L3
_L3:
        outputstream = outputstream2;
        bytebuffer.flip();
        outputstream = outputstream2;
        outputstream2.write(abyte0, 0, bytebuffer.limit());
        outputstream = outputstream2;
        bytebuffer.clear();
          goto _L5
        Exception exception;
        exception;
        if (outputstream != null)
        {
            outputstream.close();
        }
        throw exception;
    }

    private void p()
    {
        n = true;
        i();
    }

    private void q()
    {
        if (w)
        {
            throw new IllegalStateException("Request already started");
        } else
        {
            return;
        }
    }

    public long a()
    {
        return (long)j;
    }

    public void a(long l1)
    {
        i = l1;
    }

    public void a(long l1, boolean flag)
    {
        l = l1;
        m = flag;
    }

    public void a(String s1)
    {
        q();
        y = s1;
    }

    public void a(String s1, ReadableByteChannel readablebytechannel, long l1)
    {
        q();
        if (l1 > 0x7fffffffL)
        {
            throw new IllegalArgumentException("Upload contentLength is too big.");
        } else
        {
            k = (int)l1;
            q = s1;
            s = readablebytechannel;
            r = null;
            return;
        }
    }

    public void a(String s1, byte abyte0[])
    {
        q();
        q = s1;
        r = abyte0;
        s = null;
    }

    public int b()
    {
        int j1 = u;
        int i1 = j1;
        if (j1 == 206)
        {
            i1 = 200;
        }
        return i1;
    }

    public String b(String s1)
    {
        if (h == null)
        {
            throw new IllegalStateException("Response headers not available");
        }
        Map map = h.getHeaderFields();
        if (map != null)
        {
            s1 = (List)map.get(s1);
            if (s1 != null)
            {
                return TextUtils.join(", ", s1);
            }
        }
        return null;
    }

    public String c()
    {
        return v;
    }

    public IOException d()
    {
        if (g == null && n)
        {
            g = new ResponseTooLargeException();
        }
        return g;
    }

    public ByteBuffer e()
    {
        return ((ChunkedWritableByteChannel)e).a();
    }

    public byte[] f()
    {
        return ((ChunkedWritableByteChannel)e).b();
    }

    public void h()
    {
        g().execute(new lms(this));
    }

    public void i()
    {
label0:
        {
            synchronized (A)
            {
                if (!x)
                {
                    break label0;
                }
            }
            return;
        }
        x = true;
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean j()
    {
        boolean flag;
        synchronized (A)
        {
            flag = x;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String k()
    {
        return "";
    }

    public String l()
    {
        return t;
    }

    public Map m()
    {
        if (h == null)
        {
            throw new IllegalStateException("Response headers not available");
        } else
        {
            return h.getHeaderFields();
        }
    }

    public String n()
    {
        return c;
    }

}
