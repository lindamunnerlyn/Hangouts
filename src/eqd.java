// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public abstract class eqd
{

    private Object a;
    private boolean b;
    final eqa d;

    public eqd(eqa eqa1, Object obj)
    {
        d = eqa1;
        super();
        a = obj;
        b = false;
    }

    protected abstract void a(Object obj);

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = a;
        if (b)
        {
            (new StringBuilder("Callback proxy ")).append(this).append(" being reused. This is not safe.");
        }
        this;
        JVM INSTR monitorexit ;
        Object obj1;
        if (obj != null)
        {
            try
            {
                a(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw obj1;
            }
        }
        this;
        JVM INSTR monitorenter ;
        b = true;
        this;
        JVM INSTR monitorexit ;
        c();
        return;
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public void c()
    {
        d();
        synchronized (eqa.c(d))
        {
            eqa.c(d).remove(this);
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        a = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
