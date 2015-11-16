// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class buq
    implements btu
{

    private static final boolean a = false;
    private final bnd b = bnd.a();
    private final bus c = new bus(this);
    private final but d = new but(this);
    private final List e = new CopyOnWriteArrayList();
    private btv f;
    private gau g;
    private jav h;

    buq()
    {
        f = btv.e;
        g = null;
        b.a(c);
    }

    static btv a(buq buq1, btv btv1)
    {
        buq1.f = btv1;
        return btv1;
    }

    static gau a(buq buq1)
    {
        return buq1.g;
    }

    static gau a(buq buq1, gau gau1)
    {
        buq1.g = gau1;
        return gau1;
    }

    static jav a(buq buq1, jav jav1)
    {
        buq1.h = jav1;
        return jav1;
    }

    static jav b(buq buq1)
    {
        return buq1.h;
    }

    static btv c(buq buq1)
    {
        return buq1.f;
    }

    static List d(buq buq1)
    {
        return buq1.e;
    }

    static boolean d()
    {
        return a;
    }

    static bnd e(buq buq1)
    {
        return buq1.b;
    }

    static but f(buq buq1)
    {
        return buq1.d;
    }

    public btv a()
    {
        return f;
    }

    public void a(btt btt)
    {
        e.add(btt);
    }

    public void a(boolean flag)
    {
        if (g == null || h == null)
        {
            return;
        }
        jav jav1 = new jav();
        jav1.a = h.a;
        jay jay1;
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 1;
        }
        jav1.u = Integer.valueOf(byte0);
        jay1 = new jay();
        jay1.c = (new jav[] {
            jav1
        });
        g.b(jay1, new bur(this, flag));
    }

    public void b(btt btt)
    {
        e.remove(btt);
    }

    public boolean b()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (h != null)
        {
            flag = flag1;
            if (g.a(h.b, 0) == 2)
            {
                flag = true;
            }
        }
        return flag;
    }

    public String c()
    {
        if (h == null)
        {
            return null;
        } else
        {
            return h.A;
        }
    }

    static 
    {
        hik hik = ebw.f;
    }
}
