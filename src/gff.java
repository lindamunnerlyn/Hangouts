// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import com.google.android.libraries.hangouts.video.EncoderManager;
import com.google.android.libraries.hangouts.video.RendererManager;
import java.util.concurrent.atomic.AtomicInteger;

public final class gff extends gfo
    implements gdb, gjw
{

    private volatile long A;
    final Object a = new Object();
    final AtomicInteger b = new AtomicInteger(0);
    gdf c;
    int d;
    int e;
    int f;
    SurfaceTexture g;
    gda h;
    gki i;
    boolean j;
    boolean k;
    int l;
    gjx m;
    private final gdx r;
    private final EncoderManager s;
    private final RendererManager t;
    private gki u;
    private gki v;
    private int w;
    private long x;
    private long y;
    private long z;

    public gff(gdx gdx1, EncoderManager encodermanager, RendererManager renderermanager, gdg gdg1, gem gem)
    {
        super(gdg1, gem);
        d = 0;
        e = 0;
        f = d;
        y = 0x7fffffffffffffffL;
        A = 16L;
        r = gdx1;
        s = encodermanager;
        t = renderermanager;
        gdx1 = new gki(0, 0);
        v = gdx1;
        u = gdx1;
        i = gdx1;
        gdg1.a(new gfg(this));
    }

    private int q()
    {
        if (h != null)
        {
            int i1 = h.b();
            if (i1 != -1)
            {
                return i1;
            }
        }
        return 0;
    }

    public void D_()
    {
        super.D_();
        o.a(new gfh(this));
    }

    public void a()
    {
        a(v);
        if (m != null)
        {
            g.a(new gfn(this));
        }
    }

    public void a(int i1)
    {
        A = 1000 / i1;
    }

    public void a(int i1, int j1)
    {
        w = gco.a(i1 * j1).d();
        a(v);
    }

    public void a(int i1, int j1, int k1, int l1, boolean flag)
    {
        o.a(new gfk(this, flag, i1, j1, k1, l1));
    }

    public void a(gjx gjx1)
    {
        m = gjx1;
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (g == null || gjx1 == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        gjx1.a(g);
        obj;
        JVM INSTR monitorexit ;
        return;
        gjx1;
        obj;
        JVM INSTR monitorexit ;
        throw gjx1;
    }

    void a(gki gki1)
    {
        v = gki1;
        if (!k) goto _L2; else goto _L1
_L1:
        gki gki2 = gki1;
_L4:
        u = gki2;
        c();
        return;
_L2:
        int j1 = gfq.c(q()).d();
        int i1 = j1;
        if (w != 0)
        {
            i1 = Math.min(w, j1);
        }
        gki2 = gki1;
        if (gki1.a * gki1.b > i1)
        {
            int k1 = (int)(Math.sqrt(((double)i1 * (double)gki1.a) / (double)gki1.b) + 0.5D);
            gki2 = new gki(k1, (int)((double)i1 / (double)k1 + 0.5D));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(boolean flag)
    {
        c(flag);
        r.a(flag);
    }

    public gjy b()
    {
        gjy gjy1 = new gjy();
        gfq gfq1 = gfq.c(q());
        gjy1.a = gfq1.c().a;
        gjy1.b = gfq1.c().b;
        gjy1.c = gfq1.e();
        gfq1 = gfq.a();
        gjy1.d = gfq1.c().a;
        gjy1.e = gfq1.c().b;
        gjy1.f = gfq1.e();
        return gjy1;
    }

    public void b(int i1)
    {
        o.a(new gfm(this, i1));
    }

    public void b(boolean flag)
    {
        o.a(new gfl(this, flag));
    }

    void c()
    {
        if (c != null)
        {
            gdf gdf1 = c;
            gki gki1 = i;
            gki gki2 = u;
            boolean flag;
            if (!k)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gdf1.a(gki1, gki2, flag);
        }
        if (h != null)
        {
            h.a(u.a, u.b, k);
        }
    }

    public boolean d()
    {
        return !q;
    }

    public boolean e()
    {
        gbh.b("Attempted to processFrame without initializing.", g);
        gbh.b("Attempted to processFrame without initializing.", c);
        if (!q && i.a != 0 && i.b != 0) goto _L2; else goto _L1
_L1:
        long l1;
        return false;
_L2:
        if ((l1 = SystemClock.elapsedRealtime()) < x) goto _L1; else goto _L3
_L3:
        int i1 = b.getAndSet(0);
        if (i1 <= 0) goto _L5; else goto _L4
_L4:
        try
        {
            g.updateTexImage();
        }
        catch (RuntimeException runtimeexception)
        {
            gkc.b("vclib", "Failed to updateTexImage", runtimeexception);
            return false;
        }
        z = g.getTimestamp();
        if (i1 > 1)
        {
            gkc.b("vclib", (new StringBuilder(35)).append("Skipped encoding ").append(i1 - 1).append(" frames").toString());
        }
_L7:
        c.b();
        x = A + l1;
        y = l1 + 1000L;
        if (h == null)
        {
            h = s.a(t, this, o);
            h.a();
            c();
        }
        h.a(f, z, i());
        return true;
_L5:
        if (l1 < y)
        {
            break; /* Loop/switch isn't completed */
        }
        z = z + 0xf4240L;
        if (true) goto _L7; else goto _L6
_L6:
        if (i1 != 0) goto _L7; else goto _L8
_L8:
        return false;
    }

    public String f()
    {
        return "InputCapture";
    }

    public int g()
    {
        return f;
    }

    public boolean h()
    {
        return j;
    }

    public boolean i()
    {
        return d == f;
    }

    public int j()
    {
        return u.a;
    }

    public int k()
    {
        return u.b;
    }
}
