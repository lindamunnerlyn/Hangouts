// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class jss
{

    private String a;
    private Boolean b;
    private Integer c;
    private Thread.UncaughtExceptionHandler d;
    private ThreadFactory e;

    public jss()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
    }

    public jss a()
    {
        b = Boolean.valueOf(true);
        return this;
    }

    public jss a(String s)
    {
        String.format(s, new Object[] {
            Integer.valueOf(0)
        });
        a = s;
        return this;
    }

    public jss a(ThreadFactory threadfactory)
    {
        e = (ThreadFactory)n.b(threadfactory);
        return this;
    }

    public ThreadFactory b()
    {
        String s = a;
        Boolean boolean1 = b;
        Integer integer = c;
        Thread.UncaughtExceptionHandler uncaughtexceptionhandler = d;
        ThreadFactory threadfactory;
        AtomicLong atomiclong;
        if (e != null)
        {
            threadfactory = e;
        } else
        {
            threadfactory = Executors.defaultThreadFactory();
        }
        if (s != null)
        {
            atomiclong = new AtomicLong(0L);
        } else
        {
            atomiclong = null;
        }
        return new jst(threadfactory, s, atomiclong, boolean1, integer, uncaughtexceptionhandler);
    }
}
