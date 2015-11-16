// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;

final class bvi
    implements gbc
{

    final bvh a;
    private boolean b;

    bvi(bvh bvh1)
    {
        a = bvh1;
        super();
    }

    private boolean a(jba jba1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (b)
        {
            flag = flag1;
            if (jba1 != a.c.a())
            {
                flag = flag1;
                if (g.a(jba1.r, false))
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

    public void a(kop kop)
    {
        kop = (jba)kop;
        if (a(((jba) (kop))))
        {
            a.b.a(g.a(a.a, kop));
        }
    }

    public void a(kop kop, kop kop1)
    {
        kop = (jba)kop;
        kop1 = (jba)kop1;
        if (a(((jba) (kop1))) && !g.a(((jba) (kop)).r, false))
        {
            a.b.a(g.a(a.a, kop1));
        }
    }

    public void b(kop kop)
    {
        kop = (jba)kop;
        if (a(kop))
        {
            buz buz1 = a.b;
            Context context = a.a;
            buz1.a((new buy()).a(context.getResources().getString(l.eg, new Object[] {
                ((jba) (kop)).d
            })).b());
        }
    }
}
