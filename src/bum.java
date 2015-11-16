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

final class bum
    implements buf
{

    private static final boolean a = false;
    private static final long b;
    private final bnk c = bnk.a();
    private final buh d;
    private final bup e = new bup(this);
    private final buq f = new buq(this);
    private final bur g = new bur(this);
    private final Map h = new LinkedHashMap();
    private final List i = new CopyOnWriteArrayList();
    private final Handler j = new Handler(Looper.getMainLooper());
    private gdk k;
    private jhh l;
    private jhh m;
    private int n;
    private boolean o;
    private boolean p;

    public bum(Context context)
    {
        d = (buh)hlp.a(context, buh);
        c.a(e);
    }

    static Handler a(bum bum1)
    {
        return bum1.j;
    }

    static gdk a(bum bum1, gdk gdk1)
    {
        bum1.k = gdk1;
        return gdk1;
    }

    static jhh a(bum bum1, jhh jhh1)
    {
        bum1.m = jhh1;
        return jhh1;
    }

    static void a(bum bum1, jhh jhh1, boolean flag)
    {
        bum1.a(jhh1, flag);
    }

    private void a(jhh jhh1, boolean flag)
    {
        if (!f() || !h.containsKey(jhh1.b))
        {
            return;
        }
        jhh jhh2 = new jhh();
        jhh2.a = jhh1.a;
        jhh2.b = jhh1.b;
        jhm jhm1;
        byte byte0;
        if (flag)
        {
            byte0 = 12;
        } else
        {
            byte0 = 11;
        }
        jhh2.q = Integer.valueOf(byte0);
        jhm1 = new jhm();
        jhm1.c = (new jhh[] {
            jhh2
        });
        k.b(jhm1, new bun(this, jhh1, flag));
    }

    static boolean a(bum bum1, boolean flag)
    {
        bum1.o = flag;
        return flag;
    }

    static gdk b(bum bum1)
    {
        return bum1.k;
    }

    static void b(bum bum1, jhh jhh1)
    {
        for (bum1 = bum1.i.iterator(); bum1.hasNext(); ((bue)bum1.next()).b(jhh1)) { }
    }

    static Map c(bum bum1)
    {
        return bum1.h;
    }

    static void c(bum bum1, jhh jhh1)
    {
        for (bum1 = bum1.i.iterator(); bum1.hasNext(); ((bue)bum1.next()).c(jhh1)) { }
    }

    private void c(jhh jhh1)
    {
        for (Iterator iterator = i.iterator(); iterator.hasNext(); ((bue)iterator.next()).a(jhh1)) { }
    }

    static boolean c()
    {
        return a;
    }

    static long d()
    {
        return b;
    }

    static jhh d(bum bum1)
    {
        return bum1.m;
    }

    private void e()
    {
        Object obj2 = null;
        if (!f())
        {
            if (l != null)
            {
                l = null;
                c(((jhh) (null)));
            }
        } else
        {
            Object obj;
            jhh jhh1;
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
                jhh1 = null;
            } else
            {
                jhh1 = (jhh)h.values().iterator().next();
            }
            if (jhh1 == null)
            {
                obj1 = null;
            } else
            {
                obj1 = jhh1.b;
            }
            if (!TextUtils.equals(((CharSequence) (obj)), ((CharSequence) (obj1))))
            {
                if (jhh1 == null)
                {
                    obj = obj2;
                } else
                {
                    obj = jhh1.b;
                }
                eev.e("Babel", String.format("New head of knocking queue (%s)", new Object[] {
                    obj
                }));
                l = jhh1;
                c(l);
                return;
            }
        }
    }

    static void e(bum bum1)
    {
        int i1 = 0;
        boolean flag = bum1.p;
        bum1.p = false;
        if (bum1.o && bum1.m != null && bum1.m.s != null)
        {
            int ai[] = bum1.m.s;
            for (int j1 = ai.length; i1 < j1; i1++)
            {
                if (ai[i1] == 1)
                {
                    bum1.p = true;
                }
            }

        }
        if (flag != bum1.p)
        {
            for (Iterator iterator = bum1.i.iterator(); iterator.hasNext(); ((bue)iterator.next()).a()) { }
            bum1.e();
        }
    }

    static void f(bum bum1)
    {
        bum1.e();
    }

    private boolean f()
    {
        return k != null && c.l() && d.a() == bui.d && b();
    }

    static boolean g(bum bum1)
    {
        return bum1.o;
    }

    static bur h(bum bum1)
    {
        return bum1.g;
    }

    static buh i(bum bum1)
    {
        return bum1.d;
    }

    static bnk j(bum bum1)
    {
        return bum1.c;
    }

    static buq k(bum bum1)
    {
        return bum1.f;
    }

    static jhh l(bum bum1)
    {
        return bum1.l;
    }

    static jhh m(bum bum1)
    {
        bum1.l = null;
        return null;
    }

    static void n(bum bum1)
    {
        bum1.c(((jhh) (null)));
    }

    static int o(bum bum1)
    {
        bum1.n = 0;
        return 0;
    }

    static boolean p(bum bum1)
    {
        bum1.p = false;
        return false;
    }

    public jhh a()
    {
        return l;
    }

    public void a(bue bue1)
    {
        i.add(bue1);
    }

    public void a(jhh jhh1)
    {
        eev.e("Babel", String.format("Accepting knock (%s)", new Object[] {
            jhh1.b
        }));
        a(jhh1, true);
    }

    public void b(bue bue1)
    {
        i.remove(bue1);
    }

    public void b(jhh jhh1)
    {
        boolean flag = true;
        eev.e("Babel", String.format("Rejecting knock (%s)", new Object[] {
            jhh1.b
        }));
        a(jhh1, false);
        int i1 = n + 1;
        n = i1;
        if ((long)i1 % 3L != 0L)
        {
            flag = false;
        }
        if (d.b() && flag)
        {
            for (jhh1 = i.iterator(); jhh1.hasNext(); ((bue)jhh1.next()).b()) { }
        }
    }

    public boolean b()
    {
        return p;
    }

    static 
    {
        hnc hnc = eev.f;
        b = TimeUnit.SECONDS.toMillis(30L);
    }
}
