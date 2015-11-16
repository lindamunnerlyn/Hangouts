// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.CancellationSignal;

public final class ga
{

    private boolean a;
    private Object b;
    private boolean c;

    public ga()
    {
    }

    private boolean d()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a()
    {
        if (d())
        {
            throw new gb();
        } else
        {
            return;
        }
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (!a)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        a = true;
        c = true;
        obj = b;
        this;
        JVM INSTR monitorexit ;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        ((CancellationSignal)obj).cancel();
        this;
        JVM INSTR monitorenter ;
        c = false;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        this;
        JVM INSTR monitorenter ;
        c = false;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object c()
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            return null;
        }
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (b == null)
        {
            b = new CancellationSignal();
            if (a)
            {
                ((CancellationSignal)b).cancel();
            }
        }
        obj = b;
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
