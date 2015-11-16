// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class kao extends jzy
{

    private final ExecutorService a;

    public kao(ExecutorService executorservice)
    {
        a = (ExecutorService)n.b(executorservice);
    }

    public final boolean awaitTermination(long l, TimeUnit timeunit)
    {
        return a.awaitTermination(l, timeunit);
    }

    public final void execute(Runnable runnable)
    {
        a.execute(runnable);
    }

    public final boolean isShutdown()
    {
        return a.isShutdown();
    }

    public final boolean isTerminated()
    {
        return a.isTerminated();
    }

    public final void shutdown()
    {
        a.shutdown();
    }

    public final List shutdownNow()
    {
        return a.shutdownNow();
    }
}
