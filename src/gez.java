// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.hangouts.video.RendererManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

final class gez extends gcj
    implements ger, gey
{

    final Map a = new ConcurrentHashMap();
    final gbs b;
    gem c;
    boolean d;
    private final gdg e;
    private final RendererManager f;
    private final gen g;
    private final Runnable h = new gfa(this);

    public gez(gbs gbs1, gdg gdg, RendererManager renderermanager, gen gen1)
    {
        d = false;
        b = gbs1;
        e = gdg;
        f = renderermanager;
        g = gen1;
        gen1.a(this);
        gbs1.a(this);
    }

    private gev d(String s)
    {
        gcg gcg1 = b.a();
        gev gev1;
        if (gcg1 == null)
        {
            gkc.d("vclib", "Attempted to access remote video while not in a call");
            gev1 = null;
        } else
        {
            gev gev3 = (gev)a.get(s);
            gev1 = gev3;
            if (gev3 == null)
            {
                if (gcg1.b(s) == null)
                {
                    gkc.c("vclib", "Attempted to get remote source for a non-remote participant");
                    return null;
                } else
                {
                    gev gev2 = new gev(f, e, g.a(s), this);
                    a.put(s, gev2);
                    a();
                    return gev2;
                }
            }
        }
        return gev1;
    }

    public void a()
    {
        g.b(h);
    }

    public void a(gcg gcg1)
    {
        d = true;
        a();
    }

    public void a(gem gem1)
    {
        if (gem1.e())
        {
            return;
        } else
        {
            gev gev1 = d(gem1.a());
            gbh.b(gev1);
            gem1.a(gev1);
            return;
        }
    }

    public void a(gho gho1, fyb fyb)
    {
        if (!gho1.l()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!(fyb instanceof ghu))
        {
            continue; /* Loop/switch isn't completed */
        }
        fyb = (ghu)fyb;
        if (((ghu) (fyb)).a == 3)
        {
            gho1 = d(gho1.a());
            if (gho1 != null)
            {
                gho1.c();
            }
        }
        if (((ghu) (fyb)).a != 2 && ((ghu) (fyb)).a != 3) goto _L1; else goto _L3
_L3:
        a();
        return;
        if (!(fyb instanceof ghw)) goto _L1; else goto _L4
_L4:
        d(gho1.a()).c(gho1.p());
        gho1 = g.a(gho1.a());
        if (gho1 != null)
        {
            gho1.f();
        }
        a();
        return;
    }

    public void b()
    {
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); ((gev)iterator.next()).D_()) { }
        a.clear();
        g.b(this);
        b.b(this);
    }

    public void b(gem gem1)
    {
        if (!gem1.e())
        {
            gem1 = gem1.a();
            gem1 = (gev)a.remove(gem1);
            if (gem1 != null)
            {
                gem1.D_();
                a();
                return;
            }
        }
    }

    public void c(gem gem1)
    {
        c = gem1;
        a();
    }
}
