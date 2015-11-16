// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class bvg extends gdp
{

    final bvd a;

    bvg(bvd bvd1)
    {
        a = bvd1;
        super();
    }

    private void a(boolean flag)
    {
        gdv.b("Expected non-null", bvd.b(a));
        bui bui1 = bvd.c(a);
        if (!g.a(bvd.b(a).k, false))
        {
            bvd.a(a, bui.e);
        } else
        if (g.a(bvd.b(a).u, 0) == 2)
        {
            bvd.a(a, bui.d);
        } else
        if (g.a(bvd.b(a).w, 0) == 2)
        {
            bvd.a(a, bui.c);
        } else
        if (g.a(bvd.b(a).b, 0) == 2)
        {
            bvd.a(a, bui.b);
        } else
        {
            bvd.a(a, bui.a);
        }
        if (bui1 != bvd.c(a))
        {
            for (Iterator iterator = bvd.d(a).iterator(); iterator.hasNext(); ((bug)iterator.next()).a(bvd.c(a), flag)) { }
        }
    }

    public void a()
    {
        bvd.a(a, (jhc)bvd.a(a).b().values().iterator().next());
        a(true);
    }

    public void a(kws kws, kws kws1)
    {
        kws = (jhc)kws1;
        bvd.a(a, kws);
        a(false);
    }
}
