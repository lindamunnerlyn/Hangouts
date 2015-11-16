// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import com.google.android.libraries.hangouts.video.RemoteRenderer;
import com.google.android.libraries.hangouts.video.RendererManager;
import com.google.android.libraries.hangouts.video.VideoViewRequest;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class gev extends gfo
{

    final RemoteRenderer a;
    boolean b;
    boolean c;
    private final com.google.android.libraries.hangouts.video.RemoteRenderer.RendererFrameOutputData d = new com.google.android.libraries.hangouts.video.RemoteRenderer.RendererFrameOutputData();
    private final gey e;
    private int f;
    private int g;
    private Rect h;

    public gev(RendererManager renderermanager, gdg gdg1, gem gem1, gey gey1)
    {
        super(gdg1, gem1);
        b = false;
        c = false;
        h = new Rect();
        e = gey1;
        a = renderermanager.a(gdg1, gey1);
        q = gem1.d().p();
    }

    public void D_()
    {
        super.D_();
        c = false;
        a.e();
    }

    public VideoViewRequest a(gem gem1)
    {
        gho gho1 = p.d();
        List list = gho1.n();
        if (gho1.p() || gho1.q() || list.isEmpty() || ((Integer)list.get(0)).intValue() == 0 || n.get() == 0)
        {
            gem1 = p.a();
            boolean flag = gho1.p();
            boolean flag1 = gho1.q();
            int i1 = list.size();
            int j1 = n.get();
            gkc.c("vclib", (new StringBuilder(String.valueOf(gem1).length() + 94)).append("No view request for ").append(gem1).append(" muted=").append(flag).append(", blocked=").append(flag1).append(" sources=").append(i1).append(", rendererCount=").append(j1).toString());
            return null;
        }
        if (p == gem1)
        {
            gem1 = gfq.a(a.f());
        } else
        {
            gem1 = gfq.b(a.f());
        }
        return new VideoViewRequest(((Integer)list.get(0)).intValue(), a, gem1.c().a, gem1.c().a, gem1.e());
    }

    public void b()
    {
        gho gho1 = p.d();
        if (gho1.n().isEmpty())
        {
            return;
        } else
        {
            int i1 = ((Integer)gho1.n().get(0)).intValue();
            o.a(new gew(this, i1));
            return;
        }
    }

    public void c()
    {
        o.a(new gex(this));
    }

    boolean d()
    {
        return c && !q && n.get() > 0;
    }

    boolean e()
    {
        if (b) goto _L2; else goto _L1
_L1:
        List list = p.d().n();
        if (!list.isEmpty() && ((Integer)list.get(0)).intValue() != 0) goto _L4; else goto _L3
_L3:
        boolean flag = false;
_L6:
        return flag;
_L4:
        a.b();
        b = true;
_L2:
        boolean flag1 = a.a(d);
        flag = flag1;
        if (flag1)
        {
            flag = flag1;
            if (d.frameWidth > 0)
            {
                flag = flag1;
                if (d.frameHeight > 0)
                {
                    f = d.frameWidth;
                    g = d.frameHeight;
                    h.set(d.cropLeft, d.cropTop, d.cropRight, d.cropBottom);
                    return flag1;
                }
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    String f()
    {
        String s = String.valueOf(p.a());
        if (s.length() != 0)
        {
            return "Remote:".concat(s);
        } else
        {
            return new String("Remote:");
        }
    }

    int g()
    {
        return a.c();
    }

    boolean h()
    {
        return false;
    }

    boolean i()
    {
        return a.d();
    }

    int j()
    {
        return f;
    }

    int k()
    {
        return g;
    }

    Rect l()
    {
        return h;
    }

    void m()
    {
        super.m();
        e.a();
    }

    void n()
    {
        super.n();
        e.a();
    }
}
