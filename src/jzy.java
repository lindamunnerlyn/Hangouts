// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

public abstract class jzy extends AbstractExecutorService
    implements kal
{

    public jzy()
    {
    }

    public kak a(Runnable runnable)
    {
        return (kak)super.submit(runnable);
    }

    public kak a(Runnable runnable, Object obj)
    {
        return (kak)super.submit(runnable, obj);
    }

    public kak a(Callable callable)
    {
        return (kak)super.submit(callable);
    }

    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj)
    {
        return kav.a(runnable, obj);
    }

    protected final RunnableFuture newTaskFor(Callable callable)
    {
        return kav.a(callable);
    }

    public Future submit(Runnable runnable)
    {
        return a(runnable);
    }

    public Future submit(Runnable runnable, Object obj)
    {
        return a(runnable, obj);
    }

    public Future submit(Callable callable)
    {
        return a(callable);
    }
}
