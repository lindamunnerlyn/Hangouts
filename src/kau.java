// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

final class kau
    implements ThreadFactory
{

    final ThreadFactory a;
    final String b;
    final AtomicLong c;
    final Boolean d;
    final Integer e;
    final Thread.UncaughtExceptionHandler f;

    kau(ThreadFactory threadfactory, String s, AtomicLong atomiclong, Boolean boolean1, Integer integer, Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
    {
        a = threadfactory;
        b = s;
        c = atomiclong;
        d = boolean1;
        e = integer;
        f = uncaughtexceptionhandler;
        super();
    }

    public Thread newThread(Runnable runnable)
    {
        runnable = a.newThread(runnable);
        if (b != null)
        {
            runnable.setName(kat.a(b, new Object[] {
                Long.valueOf(c.getAndIncrement())
            }));
        }
        if (d != null)
        {
            runnable.setDaemon(d.booleanValue());
        }
        if (e != null)
        {
            runnable.setPriority(e.intValue());
        }
        if (f != null)
        {
            runnable.setUncaughtExceptionHandler(f);
        }
        return runnable;
    }
}
