// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class bqx
{

    private final bpd a;
    private final boolean b;
    private final List c;
    private final List d;
    private long e;
    private final ArrayList f;
    private bqz g;
    private final Handler h = new Handler();
    private final Runnable i = new bqy(this);

    bqx(bpd bpd1, boolean flag, List list, List list1)
    {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) 
        {
            ceu ceu1 = (ceu)iterator.next();
            boolean flag1;
            if (ceu1.b.a != null || ceu1.s != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            gbh.a(flag1);
        }
        a = bpd1;
        b = flag;
        c = list;
        d = list1;
        f = new ArrayList(list);
    }

    private static ceu a(gho gho1, List list)
    {
        if (gho1 instanceof ghs)
        {
            gho1 = (ghs)gho1;
            for (list = list.iterator(); list.hasNext();)
            {
                ceu ceu1 = (ceu)list.next();
                if (ceu1.b.a != null && ceu1.b.a.equals(gho1.x()))
                {
                    return ceu1;
                }
            }

            return null;
        }
        if (gho1 instanceof ghv)
        {
            gho1 = (ghv)gho1;
            for (list = list.iterator(); list.hasNext();)
            {
                ceu ceu2 = (ceu)list.next();
                if (ceu2.b.a == null && g.g(ceu2.s, gho1.x()))
                {
                    return ceu2;
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
            if (((ceu)iterator.next()).a == cfa.d)
            {
                return true;
            }
        }

        return false;
    }

    void a(gho gho1, Integer integer)
    {
        gbh.b(gho1.l());
        if (gho1.g())
        {
            if ((gho1 = a(gho1, ((List) (f)))) != null)
            {
                f.remove(gho1);
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
        a.t().remove(this);
        j();
        boolean flag1;
        if (a.J() == 0 && !a.E())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            bpd bpd1 = a;
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
            bpd1.c(c1);
        }
        for (integer = a.q().iterator(); integer.hasNext(); ((boh)integer.next()).a(flag1)) { }
    }

    boolean a()
    {
        return b;
    }

    boolean a(gho gho1)
    {
        return a(gho1, ((List) (f))) != null;
    }

    List b()
    {
        return c;
    }

    void b(gho gho1)
    {
        boolean flag;
        if (gho1.l() || gho1.f())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.b(flag);
        gho1 = a(gho1, f);
        if (gho1 != null)
        {
            f.remove(gho1);
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
            Iterator iterator = a.q().iterator();
            while (iterator.hasNext()) 
            {
                ((boh)iterator.next()).d();
            }
        }
        if (!l())
        {
            h.postDelayed(i, bpd.F());
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
            if (a.k() && g == null)
            {
                g = new bqz(a.N());
                g.a();
            }
            for (Iterator iterator = a.q().iterator(); iterator.hasNext(); ((boh)iterator.next()).h()) { }
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
                for (Iterator iterator = a.q().iterator(); iterator.hasNext(); ((boh)iterator.next()).b()) { }
            }
        }
    }
}
