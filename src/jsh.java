// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class jsh
    implements jsj
{

    private static final Logger a = Logger.getLogger(jsh.getName());

    jsh()
    {
    }

    public void a(Runnable runnable, Executor executor)
    {
        n.b(runnable, "Runnable was null.");
        n.b(executor, "Executor was null.");
        try
        {
            executor.execute(runnable);
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            a.log(Level.SEVERE, (new StringBuilder("RuntimeException while executing runnable ")).append(runnable).append(" with executor ").append(executor).toString(), runtimeexception);
        }
    }

    public boolean cancel(boolean flag)
    {
        return false;
    }

    public abstract Object get();

    public Object get(long l, TimeUnit timeunit)
    {
        n.b(timeunit);
        return get();
    }

    public boolean isCancelled()
    {
        return false;
    }

    public boolean isDone()
    {
        return true;
    }

}
