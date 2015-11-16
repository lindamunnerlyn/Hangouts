// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class brg
{

    private final bpm a;
    private final boolean b;
    private final List c;
    private final List d;
    private long e;
    private final ArrayList f;
    private bri g;
    private final Handler h = new Handler();
    private final Runnable i = new brh(this);

    brg(bpm bpm1, boolean flag, List list, List list1)
    {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) 
        {
            cfz cfz1 = (cfz)iterator.next();
            boolean flag1;
            if (cfz1.b.a != null || cfz1.s != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            gdv.a("Expected condition to be true", flag1);
        }
        a = bpm1;
        b = flag;
        c = list;
        d = list1;
        f = new ArrayList(list);
    }

    private static cfz a(gkq gkq1, List list)
    {
        if (gkq1 instanceof gku)
        {
            gkq1 = (gku)gkq1;
            for (list = list.iterator(); list.hasNext();)
            {
                cfz cfz1 = (cfz)list.next();
                if (cfz1.b.a != null && cfz1.b.a.equals(gkq1.w()))
                {
                    return cfz1;
                }
            }

            return null;
        }
        if (gkq1 instanceof gkx)
        {
            gkq1 = (gkx)gkq1;
            for (list = list.iterator(); list.hasNext();)
            {
                cfz cfz2 = (cfz)list.next();
                if (cfz2.b.a == null && g.g(cfz2.s, gkq1.w()))
                {
                    return cfz2;
                }
            }

            return null;
        } else
        {
            return null;
        }
    }

    private boolean k()
    {
        return f.size() != 0;
    }

    private boolean l()
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext();)
        {
            if (((cfz)iterator.next()).a == cgf.d)
            {
                return true;
            }
        }

        return false;
    }

    void a(gkq gkq1, Integer integer)
    {
        gdv.b("Expected condition to be false", gkq1.k());
        if (gkq1.f())
        {
            if ((gkq1 = a(gkq1, ((List) (f)))) != null)
            {
                f.remove(gkq1);
                if (!k())
                {
                    a(true, integer);
                    return;
                }
            }
        }
    }

    void a(boolean flag, Integer integer)
    {
        h.removeCallbacks(i);
        a.s().remove(this);
        j();
        boolean flag1;
        if (a.I() == 0 && !a.D())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            bpm bpm1 = a;
            char c1;
            if (!flag)
            {
                c1 = '\u03F2';
            } else
            if (g.a(integer, 0) == 7)
            {
                c1 = '\u03F6';
            } else
            {
                c1 = '\u03F3';
            }
            bpm1.c(c1);
        }
        for (integer = a.p().iterator(); integer.hasNext(); ((boq)integer.next()).a(flag1)) { }
    }

    boolean a()
    {
        return b;
    }

    boolean a(gkq gkq1)
    {
        return a(gkq1, ((List) (f))) != null;
    }

    List b()
    {
        return c;
    }

    void b(gkq gkq1)
    {
        boolean flag;
        if (gkq1.k() || gkq1.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.b("Expected condition to be false", flag);
        gkq1 = a(gkq1, f);
        if (gkq1 != null)
        {
            f.remove(gkq1);
            if (!k())
            {
                a(false, ((Integer) (null)));
            }
            j();
        }
        if (b && e == 0L)
        {
            a(false, ((Integer) (null)));
        }
    }

    List c()
    {
        return d;
    }

    long d()
    {
        return e;
    }

    List e()
    {
        return f;
    }

    void f()
    {
        e = System.currentTimeMillis();
        if (b)
        {
            if (!l())
            {
                i();
            }
        } else
        {
            Iterator iterator = a.p().iterator();
            while (iterator.hasNext()) 
            {
                ((boq)iterator.next()).d();
            }
        }
        if (!l())
        {
            h.postDelayed(i, bpm.E());
        }
    }

    void g()
    {
        h.removeCallbacks(i);
        j();
    }

    void h()
    {
        h.removeCallbacks(i);
        j();
    }

    void i()
    {
        if (b)
        {
            if (a.j() && g == null)
            {
                g = new bri(a.M());
                g.a();
            }
            for (Iterator iterator = a.p().iterator(); iterator.hasNext(); ((boq)iterator.next()).h()) { }
        }
    }

    void j()
    {
        if (g != null)
        {
            g.b();
            g = null;
            if (b)
            {
                for (Iterator iterator = a.p().iterator(); iterator.hasNext(); ((boq)iterator.next()).b()) { }
            }
        }
    }
}
