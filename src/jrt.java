// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

public abstract class jrt extends AbstractExecutorService
    implements ExecutorService
{

    public jrt()
    {
    }

    public jsj a(Runnable runnable)
    {
        return (jsj)super.submit(runnable);
    }

    public jsj a(Runnable runnable, Object obj)
    {
        return (jsj)super.submit(runnable, obj);
    }

    public jsj a(Callable callable)
    {
        return (jsj)super.submit(callable);
    }

    protected RunnableFuture newTaskFor(Runnable runnable, Object obj)
    {
        return jsk.a(runnable, obj);
    }

    protected RunnableFuture newTaskFor(Callable callable)
    {
        return jsk.a(callable);
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
