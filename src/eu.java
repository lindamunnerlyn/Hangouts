// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class eu
{

    private static final ThreadFactory a;
    private static final BlockingQueue b;
    public static final Executor c;
    private static fa g;
    private static volatile Executor h;
    final fc d = new ew(this);
    final FutureTask e;
    volatile int f;
    private final AtomicBoolean i = new AtomicBoolean();

    public eu()
    {
        f = fb.a;
        e = new ex(this, d);
    }

    static Object a(eu eu1, Object obj)
    {
        return eu1.c(obj);
    }

    static AtomicBoolean a(eu eu1)
    {
        return eu1.i;
    }

    static void b(eu eu1, Object obj)
    {
        if (!eu1.i.get())
        {
            eu1.c(obj);
        }
    }

    private static Handler c()
    {
        eu;
        JVM INSTR monitorenter ;
        fa fa1;
        if (g == null)
        {
            g = new fa();
        }
        fa1 = g;
        eu;
        JVM INSTR monitorexit ;
        return fa1;
        Exception exception;
        exception;
        eu;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private Object c(Object obj)
    {
        c().obtainMessage(1, new ez(this, new Object[] {
            obj
        })).sendToTarget();
        return obj;
    }

    static void c(eu eu1, Object obj)
    {
        if (eu1.e.isCancelled())
        {
            eu1.b(obj);
        } else
        {
            eu1.a(obj);
        }
        eu1.f = fb.c;
    }

    protected transient abstract Object a();

    protected void a(Object obj)
    {
    }

    protected transient void b()
    {
    }

    protected void b(Object obj)
    {
    }

    static 
    {
        a = new ev();
        b = new LinkedBlockingQueue(10);
        ThreadPoolExecutor threadpoolexecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, b, a);
        c = threadpoolexecutor;
        h = threadpoolexecutor;
    }
}
