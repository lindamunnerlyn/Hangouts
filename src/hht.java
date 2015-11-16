// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class hht
    implements ThreadFactory
{

    final hhr a;
    private final AtomicInteger b = new AtomicInteger(0);

    hht(hhr hhr)
    {
        a = hhr;
        super();
    }

    public Thread newThread(Runnable runnable)
    {
        runnable = Executors.defaultThreadFactory().newThread(runnable);
        int i = b.incrementAndGet();
        runnable.setName((new StringBuilder(36)).append("Resource Decoder Thread #").append(i).toString());
        return runnable;
    }
}
