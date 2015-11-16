// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.hangouts.video.RendererManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

final class ghy extends gex
    implements ghr
{

    final Map a = new ConcurrentHashMap();
    private final geg b;
    private final gfu c;
    private final RendererManager d;
    private final ghn e;
    private final gdm f;
    private final ghz g = new ghz(this);
    private ghm h;

    public ghy(geg geg1, gfu gfu, RendererManager renderermanager, ghn ghn1)
    {
        b = geg1;
        c = gfu;
        d = renderermanager;
        e = ghn1;
        ghn1.a(this);
        geg1.a(this);
        f = (gdm)geg1.c().a(gdm);
        f.a(g);
    }

    private ghu d(String s)
    {
        geu geu1 = b.a();
        ghu ghu1;
        if (geu1 == null)
        {
            gne.a(5, "vclib", "Attempted to access remote video while not in a call");
            ghu1 = null;
        } else
        {
            ghu ghu3 = (ghu)a.get(s);
            ghu1 = ghu3;
            if (ghu3 == null)
            {
                if (geu1.b(s) == null)
                {
                    gne.a(4, "vclib", "Attempted to get remote source for a non-remote participant");
                    return null;
                } else
                {
                    ghu ghu2 = new ghu(b, d, c, e.a(s));
                    a.put(s, ghu2);
                    return ghu2;
                }
            }
        }
        return ghu1;
    }

    public void a()
    {
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); ((ghu)iterator.next()).F_()) { }
        a.clear();
        e.b(this);
        b.b(this);
        f.b(g);
    }

    public void a(ghm ghm1)
    {
        if (ghm1.e())
        {
            return;
        }
        ghu ghu1 = d(ghm1.a());
        gdv.b("Expected non-null", ghu1);
        Object obj = String.valueOf(g.B(ghm1.a()));
        obj = (new StringBuilder(String.valueOf(obj).length() + 11)).append(((String) (obj))).append(2).toString();
        obj = (jiz)f.b().get(obj);
        if (obj != null)
        {
            ghu1.a(((jiz) (obj)));
        }
        ghm1.a(ghu1);
    }

    public void a(gkq gkq1, gap gap)
    {
        int i = 0;
        if (!gkq1.k() && a.containsKey(gkq1.a())) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ghu ghu1;
        ghu1 = d(gkq1.a());
        if (!(gap instanceof gkw))
        {
            continue; /* Loop/switch isn't completed */
        }
        gap = (gkw)gap;
        if (((gkw) (gap)).a == 3)
        {
            if (!gkq1.m().isEmpty())
            {
                i = ((Integer)gkq1.m().get(0)).intValue();
            }
            ghu1.a(i);
            return;
        }
        if (((gkw) (gap)).a != 2) goto _L1; else goto _L3
_L3:
        ghu1.a(((Integer)gkq1.m().get(0)).intValue());
        return;
        if (!(gap instanceof gky)) goto _L1; else goto _L4
_L4:
        ghu1.a(gkq1.o());
        return;
    }

    public void b(ghm ghm1)
    {
        if (!ghm1.e())
        {
            ghm1 = ghm1.a();
            ghm1 = (ghu)a.remove(ghm1);
            if (ghm1 != null)
            {
                ghm1.F_();
                return;
            }
        }
    }

    public void c(ghm ghm1)
    {
        if (h != null)
        {
            ghu ghu1 = (ghu)a.get(h.a());
            if (ghu1 != null)
            {
                ghu1.b(false);
            }
        }
        h = ghm1;
        ghm1 = (ghu)a.get(h.a());
        if (ghm1 != null)
        {
            ghm1.b(true);
        }
    }
}
