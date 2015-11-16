// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dni extends fqp
{

    private fqp b;
    private final Object c = new Object();
    private Throwable d;

    public dni(fqp fqp1)
    {
        super(null);
        gbh.b(fqp1.c());
        b = fqp1;
    }

    static byte[] a(long l)
    {
        byte abyte0[] = new byte[8];
        for (int i = 7; i >= 0; i--)
        {
            abyte0[i] = (byte)(int)(255L & l);
            l >>= 8;
        }

        return abyte0;
    }

    private dnj b(int i)
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
        dnj dnj1 = new dnj((fqo)b.a(i));
        obj;
        JVM INSTR monitorexit ;
        return dnj1;
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
