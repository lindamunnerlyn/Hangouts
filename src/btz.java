// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

final class btz
    implements bts
{

    private static final boolean a = false;
    private static final long b;
    private final bnd c = bnd.a();
    private final btu d;
    private final buc e = new buc(this);
    private final bud f = new bud(this);
    private final bue g = new bue(this);
    private final Map h = new LinkedHashMap();
    private final List i = new CopyOnWriteArrayList();
    private final Handler j = new Handler(Looper.getMainLooper());
    private gaw k;
    private jba l;
    private jba m;
    private int n;
    private boolean o;
    private boolean p;

    public btz(Context context)
    {
        d = (btu)hgx.a(context, btu);
        c.a(e);
    }

    static Handler a(btz btz1)
    {
        return btz1.j;
    }

    static gaw a(btz btz1, gaw gaw1)
    {
        btz1.k = gaw1;
        return gaw1;
    }

    static jba a(btz btz1, jba jba1)
    {
        btz1.m = jba1;
        return jba1;
    }

    static void a(btz btz1, jba jba1, boolean flag)
    {
        btz1.a(jba1, flag);
    }

    private void a(jba jba1, boolean flag)
    {
        if (!f() || !h.containsKey(jba1.b))
        {
            return;
        }
        jba jba2 = new jba();
        jba2.a = jba1.a;
        jba2.b = jba1.b;
        jbf jbf1;
        byte byte0;
        if (flag)
        {
            byte0 = 12;
        } else
        {
            byte0 = 11;
        }
        jba2.q = Integer.valueOf(byte0);
        jbf1 = new jbf();
        jbf1.c = (new jba[] {
            jba2
        });
        k.b(jbf1, new bua(this, jba1, flag));
    }

    static boolean a(btz btz1, boolean flag)
    {
        btz1.o = flag;
        return flag;
    }

    static gaw b(btz btz1)
    {
        return btz1.k;
    }

    static void b(btz btz1, jba jba1)
    {
        for (btz1 = btz1.i.iterator(); btz1.hasNext(); ((btr)btz1.next()).b(jba1)) { }
    }

    static Map c(btz btz1)
    {
        return btz1.h;
    }

    static void c(btz btz1, jba jba1)
    {
        for (btz1 = btz1.i.iterator(); btz1.hasNext(); ((btr)btz1.next()).c(jba1)) { }
    }

    private void c(jba jba1)
    {
        for (Iterator iterator = i.iterator(); iterator.hasNext(); ((btr)iterator.next()).a(jba1)) { }
    }

    static boolean c()
    {
        return a;
    }

    static long d()
    {
        return b;
    }

    static jba d(btz btz1)
    {
        return btz1.m;
    }

    private void e()
    {
        Object obj2 = null;
        if (!f())
        {
            if (l != null)
            {
                l = null;
                c(((jba) (null)));
            }
        } else
        {
            Object obj;
            jba jba1;
            Object obj1;
            if (l == null)
            {
                obj = null;
            } else
            {
                obj = l.b;
            }
            if (h.isEmpty())
            {
                jba1 = null;
            } else
            {
                jba1 = (jba)h.values().iterator().next();
            }
            if (jba1 == null)
            {
                obj1 = null;
            } else
            {
                obj1 = jba1.b;
            }
            if (!TextUtils.equals(((CharSequence) (obj)), ((CharSequence) (obj1))))
            {
                if (jba1 == null)
                {
                    obj = obj2;
                } else
                {
                    obj = jba1.b;
                }
                ebw.e("Babel", String.format("New head of knocking queue (%s)", new Object[] {
                    obj
                }));
                l = jba1;
                c(l);
                return;
            }
        }
    }

    static void e(btz btz1)
    {
        int i1 = 0;
        boolean flag = btz1.p;
        btz1.p = false;
        if (btz1.o && btz1.m != null && btz1.m.s != null)
        {
            int ai[] = btz1.m.s;
            for (int j1 = ai.length; i1 < j1; i1++)
            {
                if (ai[i1] == 1)
                {
                    btz1.p = true;
                }
            }

        }
        if (flag != btz1.p)
        {
            for (Iterator iterator = btz1.i.iterator(); iterator.hasNext(); ((btr)iterator.next()).a()) { }
            btz1.e();
        }
    }

    static void f(btz btz1)
    {
        btz1.e();
    }

    private boolean f()
    {
        return k != null && c.m() && d.a() == btv.d && b();
    }

    static boolean g(btz btz1)
    {
        return btz1.o;
    }

    static bue h(btz btz1)
    {
        return btz1.g;
    }

    static btu i(btz btz1)
    {
        return btz1.d;
    }

    static bnd j(btz btz1)
    {
        return btz1.c;
    }

    static bud k(btz btz1)
    {
        return btz1.f;
    }

    static jba l(btz btz1)
    {
        return btz1.l;
    }

    static jba m(btz btz1)
    {
        btz1.l = null;
        return null;
    }

    static void n(btz btz1)
    {
        btz1.c(((jba) (null)));
    }

    static int o(btz btz1)
    {
        btz1.n = 0;
        return 0;
    }

    static boolean p(btz btz1)
    {
        btz1.p = false;
        return false;
    }

    public jba a()
    {
        return l;
    }

    public void a(btr btr1)
    {
        i.add(btr1);
    }

    public void a(jba jba1)
    {
        ebw.e("Babel", String.format("Accepting knock (%s)", new Object[] {
            jba1.b
        }));
        a(jba1, true);
    }

    public void b(btr btr1)
    {
        i.remove(btr1);
    }

    public void b(jba jba1)
    {
        boolean flag = true;
        ebw.e("Babel", String.format("Rejecting knock (%s)", new Object[] {
            jba1.b
        }));
        a(jba1, false);
        int i1 = n + 1;
        n = i1;
        if ((long)i1 % 3L != 0L)
        {
            flag = false;
        }
        if (d.b() && flag)
        {
            for (jba1 = i.iterator(); jba1.hasNext(); ((btr)jba1.next()).b()) { }
        }
    }

    public boolean b()
    {
        return p;
    }

    static 
    {
        hik hik = ebw.f;
        b = TimeUnit.SECONDS.toMillis(30L);
    }
}
