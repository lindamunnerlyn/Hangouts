// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public final class ino
{

    private static final AtomicLong a = new AtomicLong(1L);
    private static final ThreadLocal b = new ThreadLocal();
    private static final List c = new ArrayList();
    private static final Runnable d = new inp();
    private static imy e;

    static long a()
    {
        return a.getAndIncrement();
    }

    static void a(imy imy1)
    {
        boolean flag;
        if (imy1 == null || imy1.c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(imy1, flag);
    }

    private static void a(imy imy1, boolean flag)
    {
        b.set(imy1);
        if (flag && g.v())
        {
            c.add(imy1);
            g.a(d);
        }
    }

    public static void a(String s)
    {
        imy imy1 = b();
        if (imy1 == null)
        {
            throw new IllegalStateException("Was supposed to have a trace - did you neglect to propagate or create one? See http://go/tiktok-tracing for more details.");
        } else
        {
            imy1.a(s);
            a(imy1.a(), imy1.c());
            return;
        }
    }

    static imy b()
    {
        return (imy)b.get();
    }

    static imy b(imy imy1)
    {
        e = imy1;
        return imy1;
    }

    static List c()
    {
        return c;
    }

}
