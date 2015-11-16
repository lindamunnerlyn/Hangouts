// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Callable;

final class cbt
    implements Callable
{

    final cbs a;

    cbt(cbs cbs1)
    {
        a = cbs1;
        super();
    }

    private Void a()
    {
label0:
        {
            synchronized (a)
            {
                if (cbs.a(a) != null)
                {
                    break label0;
                }
            }
            return null;
        }
        cbs.b(a);
        if (cbs.c(a))
        {
            cbs.d(a);
            cbs.e(a);
        }
        cbs1;
        JVM INSTR monitorexit ;
        return null;
        exception;
        cbs1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object call()
    {
        return a();
    }
}
