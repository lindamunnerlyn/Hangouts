// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class but extends gbb
{

    final buq a;

    but(buq buq1)
    {
        a = buq1;
        super();
    }

    private void a(boolean flag)
    {
        gbh.b(buq.b(a));
        btv btv1 = buq.c(a);
        if (!g.a(buq.b(a).k, false))
        {
            buq.a(a, btv.e);
        } else
        if (g.a(buq.b(a).u, 0) == 2)
        {
            buq.a(a, btv.d);
        } else
        if (g.a(buq.b(a).w, 0) == 2)
        {
            buq.a(a, btv.c);
        } else
        if (g.a(buq.b(a).b, 0) == 2)
        {
            buq.a(a, btv.b);
        } else
        {
            buq.a(a, btv.a);
        }
        if (btv1 != buq.c(a))
        {
            for (Iterator iterator = buq.d(a).iterator(); iterator.hasNext(); ((btt)iterator.next()).a(buq.c(a), flag)) { }
        }
    }

    public void a()
    {
        buq.a(a, (jav)buq.a(a).b().values().iterator().next());
        a(true);
    }

    public void a(kop kop, kop kop1)
    {
        kop = (jav)kop1;
        buq.a(a, kop);
        a(false);
    }
}
