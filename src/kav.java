// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

final class kav extends jzu
    implements RunnableFuture
{

    private kaw a;

    private kav(Callable callable)
    {
        a = new kaw(this, callable);
    }

    static kav a(Runnable runnable, Object obj)
    {
        return new kav(Executors.callable(runnable, obj));
    }

    static kav a(Callable callable)
    {
        return new kav(callable);
    }

    protected final void a()
    {
        kaw kaw1 = a;
        if (kaw1 != null)
        {
            Thread thread = ((kaj) (kaw1)).a;
            if (thread != null)
            {
                thread.interrupt();
            }
            kaw1.b = true;
        }
    }

    final void c()
    {
        super.c();
        a = null;
    }

    public void run()
    {
        kaw kaw1 = a;
        if (kaw1 != null)
        {
            kaw1.run();
        }
    }
}
