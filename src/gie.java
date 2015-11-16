// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import com.google.android.libraries.hangouts.video.EncoderManager;
import com.google.android.libraries.hangouts.video.RendererManager;
import java.util.concurrent.atomic.AtomicInteger;

public final class gie extends gio
    implements gfp, gmy
{

    private long A;
    private long B;
    private long C;
    private volatile long D;
    final Object a = new Object();
    final AtomicInteger b = new AtomicInteger(0);
    gft c;
    int d;
    int e;
    int f;
    SurfaceTexture g;
    gfo h;
    gnk i;
    gnk j;
    int k;
    boolean l;
    boolean m;
    int n;
    gmz o;
    private final ggl w;
    private final EncoderManager x;
    private final RendererManager y;
    private gnk z;

    public gie(ggl ggl1, EncoderManager encodermanager, RendererManager renderermanager, gfu gfu1, ghm ghm)
    {
        super(gfu1, ghm);
        d = 0;
        e = 0;
        f = d;
        B = 0x7fffffffffffffffL;
        D = 16L;
        w = ggl1;
        x = encodermanager;
        y = renderermanager;
        ggl1 = new gnk(0, 0);
        j = ggl1;
        z = ggl1;
        i = ggl1;
        gfu1.a(new gif(this));
    }

    private int r()
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

    public void F_()
    {
        super.F_();
        q.a(new gig(this));
    }

    public void a()
    {
        a(j);
        if (o != null)
        {
            g.a(new gim(this));
        }
    }

    public void a(int i1)
    {
        D = 1000 / i1;
    }

    public void a(int i1, int j1)
    {
        q.a(new gin(this, i1, j1));
    }

    public void a(int i1, int j1, int k1, int l1, boolean flag)
    {
        q.a(new gij(this, flag, i1, j1, k1, l1));
    }

    public void a(gmz gmz1)
    {
        o = gmz1;
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (g == null || gmz1 == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        gmz1.a(g);
        obj;
        JVM INSTR monitorexit ;
        return;
        gmz1;
        obj;
        JVM INSTR monitorexit ;
        throw gmz1;
    }

    void a(gnk gnk1)
    {
        j = gnk1;
        if (!m)
        {
            int j1 = giq.c(r()).d();
            int i1 = j1;
            if (k != 0)
            {
                i1 = Math.min(k, j1);
            }
            gnk1 = gnk.a(gnk1, i1);
        }
        z = gnk1;
        o();
    }

    public void b(int i1)
    {
        q.a(new gil(this, i1));
    }

    public void b(boolean flag)
    {
        a(flag);
        w.a(flag);
    }

    public boolean b()
    {
        return !u;
    }

    public void c(boolean flag)
    {
        q.a(new gik(this, flag));
    }

    public boolean c()
    {
        gdv.b("Attempted to processFrame without initializing.", g);
        gdv.b("Attempted to processFrame without initializing.", c);
        long l1;
        if (!u && i.a != 0 && i.b != 0)
        {
            if ((l1 = SystemClock.elapsedRealtime()) >= A)
            {
                int i1 = b.getAndSet(0);
                if (i1 > 0)
                {
                    try
                    {
                        g.updateTexImage();
                    }
                    catch (RuntimeException runtimeexception)
                    {
                        gne.a("vclib", "Failed to updateTexImage", runtimeexception);
                        return false;
                    }
                    C = g.getTimestamp();
                    if (i1 > 1)
                    {
                        gne.a(3, "vclib", (new StringBuilder(35)).append("Skipped encoding ").append(i1 - 1).append(" frames").toString());
                    }
                } else
                {
                    if (l1 < B)
                    {
                        continue;
                    }
                    C = C + 0xf4240L;
                }
                do
                {
                    c.b();
                    A = D + l1;
                    B = l1 + 1000L;
                    if (h == null)
                    {
                        h = x.a(y, this, q);
                        h.a();
                        o();
                    }
                    if (!h.a(f, C, g()))
                    {
                        gne.a(5, "vclib", "Failed to encode frame.");
                        return false;
                    } else
                    {
                        return true;
                    }
                } while (i1 != 0);
                return false;
            }
        }
        return false;
    }

    public String d()
    {
        return "InputCapture";
    }

    public int e()
    {
        return f;
    }

    public boolean f()
    {
        return l;
    }

    public boolean g()
    {
        return d == f;
    }

    public int h()
    {
        return z.a;
    }

    public int i()
    {
        return z.b;
    }

    public gna n()
    {
        gna gna1 = new gna();
        giq giq1 = giq.c(r());
        gna1.a = giq1.c().a;
        gna1.b = giq1.c().b;
        gna1.c = giq1.e();
        giq1 = giq.a();
        gna1.d = giq1.c().a;
        gna1.e = giq1.c().b;
        gna1.f = giq1.e();
        return gna1;
    }

    void o()
    {
        if (c != null)
        {
            gft gft1 = c;
            gnk gnk1 = i;
            gnk gnk2 = z;
            boolean flag;
            if (!m)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gft1.a(gnk1, gnk2, flag);
        }
        if (h != null)
        {
            h.a(z.a, z.b, m);
        }
    }
}
