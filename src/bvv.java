// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;

final class bvv
    implements gdq
{

    final bvu a;
    private boolean b;

    bvv(bvu bvu1)
    {
        a = bvu1;
        super();
    }

    private boolean a(jhh jhh1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (b)
        {
            flag = flag1;
            if (jhh1 != a.c.a())
            {
                flag = flag1;
                if (g.a(jhh1.r, false))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public void a()
    {
        b = true;
    }

    public void a(kws kws)
    {
        kws = (jhh)kws;
        if (a(((jhh) (kws))))
        {
            a.b.a(g.a(a.a, kws));
        }
    }

    public void a(kws kws, kws kws1)
    {
        kws = (jhh)kws;
        kws1 = (jhh)kws1;
        if (a(((jhh) (kws1))) && !g.a(((jhh) (kws)).r, false))
        {
            a.b.a(g.a(a.a, kws1));
        }
    }

    public void b(kws kws)
    {
        kws = (jhh)kws;
        if (a(kws))
        {
            bvm bvm1 = a.b;
            Context context = a.a;
            bvm1.a((new bvl()).a(context.getResources().getString(l.dP, new Object[] {
                ((jhh) (kws)).d
            })).b());
        }
    }
}
