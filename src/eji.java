// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class eji
{

    private int a;

    eji()
    {
        a = 0;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        a = a + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (a == 0)
        {
            throw new RuntimeException("too many decrements");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        a = a - 1;
        if (a == 0)
        {
            notifyAll();
        }
        this;
        JVM INSTR monitorexit ;
    }

    public boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        int i = a;
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }
}
