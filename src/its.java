// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public final class its
{

    private static final hnc a = new hnc("tiktok_systrace");
    private static final AtomicLong b = new AtomicLong(1L);
    private static final ThreadLocal c = new ThreadLocal();
    private static final List d = new ArrayList();
    private static final Runnable e = new itt();
    private static itc f;
    private static boolean g;

    static long a()
    {
        return b.getAndIncrement();
    }

    static void a(itc itc1)
    {
        boolean flag;
        if (itc1 == null || itc1.c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(itc1, flag);
    }

    private static void a(itc itc1, boolean flag)
    {
        int i = android.os.Build.VERSION.SDK_INT;
        c.set(itc1);
        if (flag && g.u())
        {
            d.add(itc1);
            g.a(e);
        }
    }

    public static void a(String s)
    {
        itc itc1 = b();
        if (itc1 == null)
        {
            throw new IllegalStateException("Was supposed to have a trace - did you neglect to propagate or create one? See http://go/tiktok-tracing for more details.");
        } else
        {
            itc1.a(s);
            a(itc1.a(), itc1.c());
            return;
        }
    }

    static itc b()
    {
        return (itc)c.get();
    }

    static itc b(itc itc1)
    {
        f = itc1;
        return itc1;
    }

    public static void c()
    {
        boolean flag;
        if (!g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "async trace was not properly paused");
        if (c.get() == null && f != null)
        {
            int i = android.os.Build.VERSION.SDK_INT;
            c.set(f);
            g = true;
            return;
        } else
        {
            g = false;
            return;
        }
    }

    public static void d()
    {
        if (g)
        {
            n.b(f, "current async trace should not be null");
            int i = android.os.Build.VERSION.SDK_INT;
            c.set(null);
            g = false;
        }
    }

    static List e()
    {
        return d;
    }

}
