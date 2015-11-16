// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class kap extends kao
    implements kam
{

    final ScheduledExecutorService a;

    public kap(ScheduledExecutorService scheduledexecutorservice)
    {
        super(scheduledexecutorservice);
        a = (ScheduledExecutorService)n.b(scheduledexecutorservice);
    }

    public ScheduledFuture schedule(Runnable runnable, long l, TimeUnit timeunit)
    {
        runnable = kav.a(runnable, null);
        return new kaq(runnable, a.schedule(runnable, l, timeunit));
    }

    public ScheduledFuture schedule(Callable callable, long l, TimeUnit timeunit)
    {
        callable = kav.a(callable);
        return new kaq(callable, a.schedule(callable, l, timeunit));
    }

    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long l, long l1, TimeUnit timeunit)
    {
        runnable = new kar(runnable);
        return new kaq(runnable, a.scheduleAtFixedRate(runnable, l, l1, timeunit));
    }

    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long l, long l1, TimeUnit timeunit)
    {
        runnable = new kar(runnable);
        return new kaq(runnable, a.scheduleWithFixedDelay(runnable, l, l1, timeunit));
    }
}
