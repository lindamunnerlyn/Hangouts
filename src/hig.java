// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.ConditionVariable;
import android.util.Log;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLException;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;

public class hig
    implements HttpUrlRequestListener
{

    private static AtomicBoolean C = new AtomicBoolean(true);
    private static final hnb a = new hnb("debug.rpc.metrics");
    private static final AtomicInteger b = new AtomicInteger(1);
    private static final hnb c = new hnb("debug.rpc.use_obscura_nonce", false);
    private static volatile String d = null;
    public static final hnb f = new hnb("debug.rpc.dogfood");
    private hjc A;
    private String B;
    private final String e;
    public final Context g;
    public final hio h;
    public final int i;
    hih j;
    public int k;
    public String l;
    public Exception m;
    int n;
    public final hil o;
    private final ConditionVariable p;
    private final String q;
    private final hik r;
    private final List s;
    private final String t;
    private String u;
    private ByteBuffer v;
    private HttpUrlRequest w;
    private WritableByteChannel x;
    private int y;
    private boolean z;

    public hig(Context context, hio hio1, String s1, hik hik1)
    {
        this(context, hio1, s1, hik1, (byte)0);
    }

    private hig(Context context, hio hio1, String s1, hik hik1, byte byte0)
    {
        i = b.getAndIncrement();
        p = new ConditionVariable();
        k = -1;
        n = 3;
        g = context;
        h = hio1;
        q = s1;
        r = hik1;
        e = null;
        t = null;
        s = hlp.c(g, hif);
        A = (hjc)hlp.b(g, hjc);
        o = new hil();
    }

    public String a()
    {
        return t;
    }

    public void a(int i1, IOException ioexception)
    {
        if (i1 != 200 || ioexception == null) goto _L2; else goto _L1
_L1:
        Object obj;
        int j1;
        j1 = 0;
        obj = ioexception;
_L4:
        k = j1;
        l = null;
        m = ((Exception) (obj));
        if (A != null && j1 == 0)
        {
            j();
            i();
        }
        return;
_L2:
        j1 = i1;
        obj = ioexception;
        if (i1 != 200)
        {
            j1 = i1;
            obj = ioexception;
            if (i1 != 0)
            {
                j1 = i1;
                obj = ioexception;
                if (ioexception == null)
                {
                    obj = new hid(i1, null);
                    j1 = i1;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(int i1, Exception exception)
    {
    }

    public void a(String s1)
    {
        if (m != null)
        {
            String s2 = String.valueOf(i());
            String s4 = String.valueOf(m);
            Log.e(s1, (new StringBuilder(String.valueOf(s2).length() + 28 + String.valueOf(s4).length())).append("[").append(s2).append("] failed due to exception: ").append(s4).toString(), m);
        } else
        if (m() && Log.isLoggable(s1, 4))
        {
            s1 = String.valueOf(i());
            int i1 = k;
            String s3 = l;
            (new StringBuilder(String.valueOf(s1).length() + 38 + String.valueOf(s3).length())).append("[").append(s1).append("] failed due to error: ").append(i1).append(" [").append(s3).append("]");
            return;
        }
    }

    public void a(ByteBuffer bytebuffer)
    {
        b(bytebuffer, null);
    }

    public void a(ByteBuffer bytebuffer, String s1)
    {
        b(bytebuffer, null);
    }

    public final void a(HttpUrlRequest httpurlrequest)
    {
        if (!httpurlrequest.j() && x == null)
        {
            String s1 = httpurlrequest.b("Content-Length");
            if (s1 != null)
            {
                o.b(Long.parseLong(s1));
            }
        }
        B = httpurlrequest.k();
        if (j != null)
        {
            j.a();
            o.a(B);
        }
    }

    protected boolean a(Exception exception)
    {
        return b(exception);
    }

    public void b(String s1)
    {
        if (m())
        {
            a(s1);
            p();
        }
    }

    public void b(ByteBuffer bytebuffer, String s1)
    {
        int j1 = s.size();
        int i1 = 0;
        while (i1 < j1) 
        {
            try
            {
                hif hif1 = (hif)s.get(i1);
                if (hif1.b(i()))
                {
                    i();
                    bytebuffer.duplicate();
                    hif1.d(s1);
                }
            }
            catch (Throwable throwable)
            {
                Log.e("HttpOperation", "Couldn't log response", throwable);
            }
            i1++;
        }
    }

    public final void b(HttpUrlRequest httpurlrequest)
    {
        if (httpurlrequest.j())
        {
            z = true;
        } else
        {
            u = httpurlrequest.l();
            if (x == null)
            {
                v = httpurlrequest.e();
            }
            a(httpurlrequest.b(), httpurlrequest.d());
        }
        p.open();
    }

    protected boolean b(Exception exception)
    {
        if (!(exception instanceof hid)) goto _L2; else goto _L1
_L1:
        ((hid)exception).a();
        JVM INSTR tableswitch 401 401: default 32
    //                   401 34;
           goto _L2 _L3
_L2:
        return false;
_L3:
        return true;
    }

    public byte[] b()
    {
        return null;
    }

    public void c(String s1)
    {
        int j1 = s.size();
        int i1 = 0;
        while (i1 < j1) 
        {
            try
            {
                hif hif1 = (hif)s.get(i1);
                if (hif1.a(i()))
                {
                    i();
                    hif1.c(s1);
                }
            }
            catch (Throwable throwable)
            {
                Log.e("HttpOperation", "Couldn't log request", throwable);
            }
            i1++;
        }
    }

    public void d()
    {
    }

    public final void g()
    {
        ((hie)hlp.a(g, hie)).a(this);
    }

    public boolean h()
    {
        return z;
    }

    public String i()
    {
        return getClass().getSimpleName();
    }

    public String j()
    {
        return e;
    }

    public String[] k()
    {
        return (new String[] {
            i()
        });
    }

    public String l()
    {
        return null;
    }

    public boolean m()
    {
        return k != 200 || m != null;
    }

    void n()
    {
        Object obj;
        Object obj1;
        Iterator iterator;
        d();
        o.h();
        obj = r.a(j());
        obj1 = d;
        if (!Log.isLoggable("HttpOperation", 3))
        {
            break MISSING_BLOCK_LABEL_188;
        }
        obj1 = new StringBuilder("HTTP headers:\n");
        iterator = ((Map) (obj)).entrySet().iterator();
_L2:
        java.util.Map.Entry entry;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_188;
        }
        entry = (java.util.Map.Entry)iterator.next();
        if (!"Authorization".equals(entry.getKey()))
        {
            break; /* Loop/switch isn't completed */
        }
        ((StringBuilder) (obj1)).append("Authorization: <removed>");
_L3:
        ((StringBuilder) (obj1)).append('\n');
        if (true) goto _L2; else goto _L1
        obj;
        a(0, ((IOException) (obj)));
        q();
        v = null;
        w = null;
        return;
_L1:
        ((StringBuilder) (obj1)).append((String)entry.getKey()).append(": ").append((String)entry.getValue());
          goto _L3
        obj;
        v = null;
        w = null;
        throw obj;
        this;
        JVM INSTR monitorenter ;
        if (!h())
        {
            break MISSING_BLOCK_LABEL_210;
        }
        this;
        JVM INSTR monitorexit ;
        v = null;
        w = null;
        return;
        if (x == null) goto _L5; else goto _L4
_L4:
        w = hgc.a(g, j(), n, ((Map) (obj)), x, this);
_L6:
        p.close();
        this;
        JVM INSTR monitorexit ;
        o.d();
        obj = b();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_306;
        }
        w.a(a(), ((byte []) (obj)));
        o.a(obj.length);
        if (s())
        {
            c(l());
        }
        w.h();
        p.block();
        w = null;
        if (k != 200)
        {
            break MISSING_BLOCK_LABEL_433;
        }
        if (j != null)
        {
            j.c();
        }
        if (v != null && o.a() < 0L)
        {
            o.b(v.capacity());
        }
        a(v);
_L7:
        v = null;
        w = null;
        return;
_L5:
        w = hgc.a(g, j(), n, ((Map) (obj)), this);
          goto _L6
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (!h() && k != 401)
        {
            a(v, u);
        }
          goto _L7
    }

    void o()
    {
        y = y + 1;
        if (a(m) && y < 2)
        {
            try
            {
                if (b(m))
                {
                    r.a();
                }
                n();
                o();
                return;
            }
            catch (IOException ioexception)
            {
                a(0, ioexception);
            }
        }
        a(k, m);
    }

    public void p()
    {
        if (m())
        {
            if (m != null)
            {
                throw new IOException(String.valueOf(i()).concat(" operation failed"), m);
            }
            if (m())
            {
                String s1 = String.valueOf(i());
                int i1 = k;
                String s2 = l;
                throw new IOException((new StringBuilder(String.valueOf(s1).length() + 40 + String.valueOf(s2).length())).append(s1).append(" operation failed, error: ").append(i1).append(" [").append(s2).append("]").toString());
            }
        }
    }

    protected void q()
    {
        Object obj = m;
        boolean flag;
        if (obj == null)
        {
            flag = true;
        } else
        if (obj instanceof SocketException)
        {
            flag = true;
        } else
        if (obj instanceof UnknownHostException)
        {
            flag = true;
        } else
        if (obj instanceof SSLException)
        {
            flag = true;
        } else
        if ((obj instanceof hid) && ((hid)obj).a() == 401)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            obj = String.valueOf(i());
            Log.e("HttpOperation", (new StringBuilder(String.valueOf(obj).length() + 23)).append("[").append(((String) (obj))).append("] Unexpected exception").toString(), m);
        }
    }

    void r()
    {
        int j1 = s.size();
        int i1 = 0;
        while (i1 < j1) 
        {
            try
            {
                hif hif1 = (hif)s.get(i1);
                String s1 = h.b();
                i();
                hif1.a(s1, j, k, B);
            }
            catch (Throwable throwable)
            {
                Log.e("HttpOperation", "Couldn't save network data", throwable);
            }
            i1++;
        }
    }

    protected boolean s()
    {
        int j1 = s.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((hif)s.get(i1)).a(i()))
            {
                return true;
            }
        }

        return false;
    }

    public boolean t()
    {
        int j1 = s.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((hif)s.get(i1)).b(i()))
            {
                return true;
            }
        }

        return false;
    }

}
