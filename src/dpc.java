// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dpc
    implements Runnable
{

    final doy a;

    dpc(doy doy1)
    {
        a = doy1;
        super();
    }

    public void run()
    {
label0:
        {
            synchronized (doy.a(a))
            {
                if (!doy.b(a))
                {
                    break label0;
                }
            }
            return;
        }
        doy.g(a);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
