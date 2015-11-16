// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class dfy extends dgj
{

    private final long a;
    private final long e;
    private int f;

    public dfy(aoa aoa, long l, long l1)
    {
        super(aoa);
        a = l;
        e = l1;
        f = 0;
    }

    public void a(int j)
    {
        this;
        JVM INSTR monitorenter ;
        f = j;
        if (f == 3)
        {
            a(System.currentTimeMillis());
            f = 0;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected abstract void a(long l);

    public int d()
    {
        return f;
    }

    public boolean e()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (f <= 0)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        if (System.currentTimeMillis() - i() > a)
        {
            flag = true;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean f()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (f < 2)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        long l;
        long l1;
        l = System.currentTimeMillis();
        l1 = i();
        Exception exception;
        if (l - l1 > e || l1 - l > 0x5265c00L)
        {
            flag = true;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean g()
    {
        this;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (f == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void h()
    {
        this;
        JVM INSTR monitorenter ;
        a(-1L);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected abstract long i();
}
