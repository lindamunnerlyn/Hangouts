// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

public final class jsk extends FutureTask
    implements jsj
{

    private final jrv a;

    private jsk(Runnable runnable, Object obj)
    {
        super(runnable, obj);
        a = new jrv();
    }

    private jsk(Callable callable)
    {
        super(callable);
        a = new jrv();
    }

    public static jsk a(Runnable runnable, Object obj)
    {
        return new jsk(runnable, obj);
    }

    public static jsk a(Callable callable)
    {
        return new jsk(callable);
    }

    public void a(Runnable runnable, Executor executor)
    {
        a.a(runnable, executor);
    }

    protected void done()
    {
        a.a();
    }
}
