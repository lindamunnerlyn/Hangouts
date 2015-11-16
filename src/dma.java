// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class dma
{

    final ani a;
    final dmd b;
    private final ejx c;
    private boolean d;
    private Map e;
    private final fmm f = new dmb(this);
    private final ekh g = new dmc(this);

    public dma(ejx ejx1, ani ani1, dmd dmd)
    {
        d = false;
        e = new HashMap();
        c = ejx1;
        a = ani1;
        b = dmd;
    }

    static void a(dma dma1, fqr fqr1)
    {
        if (fqr1 != null)
        {
            dma1.e.clear();
            fqq fqq1;
            for (fqr1 = fqr1.iterator(); fqr1.hasNext(); dma1.e.put(fqq1.a(), fqq1.b()))
            {
                fqq1 = (fqq)fqr1.next();
            }

        }
    }

    public void a()
    {
        c();
        if (c.e() && !d)
        {
            fmn.m.a(c, f, a.a(), a.ae(), 2);
            d = true;
        }
    }

    public void b()
    {
        if (c.e() && d)
        {
            fmn.m.a(c, f);
            d = false;
        }
    }

    void c()
    {
        if (!c.e())
        {
            ebw.f("Babel", "People client not connected. Skip loading circles");
            return;
        } else
        {
            fma fma1 = new fma();
            fma1.e();
            fmn.e.a(c, a.a(), a.ae(), fma1).a(g);
            return;
        }
    }
}
