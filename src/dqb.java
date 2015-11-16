// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dqb extends fti
{

    private fti b;
    private final Object c = new Object();
    private Throwable d;

    public dqb(fti fti1)
    {
        super(null);
        gdv.b("Expected condition to be false", fti1.c());
        b = fti1;
    }

    private dqc b(int i)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            throw new IllegalStateException("Already released", d);
        }
        break MISSING_BLOCK_LABEL_33;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        dqc dqc1 = new dqc((fth)b.a(i));
        obj;
        JVM INSTR monitorexit ;
        return dqc1;
    }

    public int a()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            throw new IllegalStateException("Already released", d);
        }
        break MISSING_BLOCK_LABEL_33;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        int i = b.a();
        obj;
        JVM INSTR monitorexit ;
        return i;
    }

    public Object a(int i)
    {
        return b(i);
    }

    public void b()
    {
        super.b();
        d = new Throwable("ThreadSafeAggregatedPersonBuffer released");
        synchronized (c)
        {
            if (b != null)
            {
                b.b();
                b = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean c()
    {
label0:
        {
            synchronized (c)
            {
                if (b != null)
                {
                    break label0;
                }
            }
            return true;
        }
        boolean flag = b.c();
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
