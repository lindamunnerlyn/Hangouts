// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class jso extends jsn
    implements jsl
{

    final ScheduledExecutorService a;

    public jso(ScheduledExecutorService scheduledexecutorservice)
    {
        super(scheduledexecutorservice);
        a = (ScheduledExecutorService)n.b(scheduledexecutorservice);
    }

    public ScheduledFuture schedule(Runnable runnable, long l, TimeUnit timeunit)
    {
        runnable = jsk.a(runnable, null);
        return new jsp(runnable, a.schedule(runnable, l, timeunit));
    }

    public ScheduledFuture schedule(Callable callable, long l, TimeUnit timeunit)
    {
        callable = jsk.a(callable);
        return new jsp(callable, a.schedule(callable, l, timeunit));
    }

    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long l, long l1, TimeUnit timeunit)
    {
        runnable = new jsq(runnable);
        return new jsp(runnable, a.scheduleAtFixedRate(runnable, l, l1, timeunit));
    }

    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long l, long l1, TimeUnit timeunit)
    {
        runnable = new jsq(runnable);
        return new jsp(runnable, a.scheduleWithFixedDelay(runnable, l, l1, timeunit));
    }
}
