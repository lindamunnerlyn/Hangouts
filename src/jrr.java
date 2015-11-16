// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class jrr
    implements jsj
{

    final jrs a = new jrs();
    private final jrv b = new jrv();

    protected jrr()
    {
    }

    static final CancellationException a(String s, Throwable throwable)
    {
        s = new CancellationException(s);
        s.initCause(throwable);
        return s;
    }

    public void a(Runnable runnable, Executor executor)
    {
        b.a(runnable, executor);
    }

    protected boolean a(Object obj)
    {
        boolean flag = a.a(obj);
        if (flag)
        {
            b.a();
        }
        return flag;
    }

    protected boolean a(Throwable throwable)
    {
        boolean flag = a.a((Throwable)n.b(throwable));
        if (flag)
        {
            b.a();
        }
        return flag;
    }

    public boolean cancel(boolean flag)
    {
        if (!a.a(flag))
        {
            return false;
        } else
        {
            b.a();
            return true;
        }
    }

    public Object get()
    {
        return a.a();
    }

    public Object get(long l, TimeUnit timeunit)
    {
        return a.a(timeunit.toNanos(l));
    }

    public boolean isCancelled()
    {
        return a.c();
    }

    public boolean isDone()
    {
        return a.b();
    }
}
