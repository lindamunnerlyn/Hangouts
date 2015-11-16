// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Callable;

final class ccy
    implements Callable
{

    final ccx a;

    ccy(ccx ccx1)
    {
        a = ccx1;
        super();
    }

    private Void a()
    {
label0:
        {
            synchronized (a)
            {
                if (ccx.a(a) != null)
                {
                    break label0;
                }
            }
            return null;
        }
        ccx.b(a);
        if (ccx.c(a))
        {
            ccx.d(a);
            ccx.e(a);
        }
        ccx1;
        JVM INSTR monitorexit ;
        return null;
        exception;
        ccx1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object call()
    {
        return a();
    }
}
