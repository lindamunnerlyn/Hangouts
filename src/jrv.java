// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class jrv
{

    static final Logger a = Logger.getLogger(jrv.getName());
    private jrw b;
    private boolean c;

    public jrv()
    {
    }

    private static void b(Runnable runnable, Executor executor)
    {
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

    public void a()
    {
        jrw jrw1 = null;
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        jrw jrw2;
        c = true;
        jrw2 = b;
        b = null;
        this;
        JVM INSTR monitorexit ;
          goto _L1
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L1:
        Exception exception;
        jrw jrw3;
        do
        {
            jrw3 = jrw1;
            if (jrw2 == null)
            {
                break;
            }
            jrw3 = jrw2.c;
            jrw2.c = jrw1;
            jrw1 = jrw2;
            jrw2 = jrw3;
        } while (true);
        for (; jrw3 != null; jrw3 = jrw3.c)
        {
            b(jrw3.a, jrw3.b);
        }

        return;
    }

    public void a(Runnable runnable, Executor executor)
    {
        n.b(runnable, "Runnable was null.");
        n.b(executor, "Executor was null.");
        this;
        JVM INSTR monitorenter ;
        if (c)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        b = new jrw(runnable, executor, b);
        this;
        JVM INSTR monitorexit ;
        return;
        this;
        JVM INSTR monitorexit ;
        b(runnable, executor);
        return;
        runnable;
        this;
        JVM INSTR monitorexit ;
        throw runnable;
    }

}
