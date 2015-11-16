// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.hangouts.video.RemoteRenderer;
import com.google.android.libraries.hangouts.video.RendererManager;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class ghu extends gio
{

    final geg a;
    final RemoteRenderer b;
    int c;
    volatile boolean d;
    private final ghx e = new ghx(this);
    private final com.google.android.libraries.hangouts.video.RemoteRenderer.RendererFrameOutputData f = new com.google.android.libraries.hangouts.video.RemoteRenderer.RendererFrameOutputData();
    private boolean g;
    private int h;
    private int i;

    public ghu(geg geg, RendererManager renderermanager, gfu gfu1, ghm ghm1)
    {
        int i1 = 0;
        super(gfu1, ghm1);
        a = geg;
        b = renderermanager.a(gfu1, this);
        u = ghm1.d().o();
        if (!ghm1.d().m().isEmpty())
        {
            i1 = ((Integer)ghm1.d().m().get(0)).intValue();
        }
        c = i1;
        if (c != 0)
        {
            n();
        }
    }

    public void F_()
    {
        super.F_();
        p.set(0);
        b.e();
    }

    void a(int i1)
    {
        if (i1 == c)
        {
            return;
        } else
        {
            q.a(new ghv(this, i1));
            return;
        }
    }

    void a(jiz jiz)
    {
        q.a(new ghw(this, jiz));
    }

    public void a(boolean flag)
    {
        super.a(flag);
        n();
    }

    void b(boolean flag)
    {
        if (flag != d)
        {
            d = flag;
            n();
        }
    }

    boolean b()
    {
        return !u && p.get() > 0;
    }

    boolean c()
    {
        if (g) goto _L2; else goto _L1
_L1:
        if (c != 0) goto _L4; else goto _L3
_L3:
        boolean flag = false;
_L6:
        return flag;
_L4:
        b.b();
        g = true;
_L2:
        boolean flag1 = b.a(f);
        flag = flag1;
        if (flag1)
        {
            flag = flag1;
            if (f.frameWidth > 0)
            {
                flag = flag1;
                if (f.frameHeight > 0)
                {
                    h = f.frameWidth;
                    i = f.frameHeight;
                    if (f.cropRight > 0 || f.cropBottom > 0)
                    {
                        s.a = (float)f.cropLeft / (float)h;
                        s.b = (float)f.cropTop / (float)i;
                        s.d = (float)(h - 1 - f.cropRight) / (float)h;
                        s.c = (float)(i - 1 - f.cropBottom) / (float)i;
                        return flag1;
                    } else
                    {
                        s.a = 0.0F;
                        s.b = 0.0F;
                        s.d = 0.0F;
                        s.c = 0.0F;
                        return flag1;
                    }
                }
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    String d()
    {
        String s = String.valueOf(r.a());
        if (s.length() != 0)
        {
            return "Remote:".concat(s);
        } else
        {
            return new String("Remote:");
        }
    }

    int e()
    {
        return b.c();
    }

    boolean f()
    {
        return false;
    }

    boolean g()
    {
        return b.d();
    }

    int h()
    {
        return h;
    }

    int i()
    {
        return i;
    }

    gfq j()
    {
        return s;
    }

    gfq k()
    {
        return t;
    }

    void l()
    {
        super.l();
        if (p.get() == 1)
        {
            n();
        }
    }

    void m()
    {
        super.m();
        if (p.get() == 0)
        {
            n();
        }
    }

    public void n()
    {
        g.b(e);
    }
}
