// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dmi
    implements Runnable
{

    final dme a;

    dmi(dme dme1)
    {
        a = dme1;
        super();
    }

    public void run()
    {
label0:
        {
            synchronized (dme.a(a))
            {
                if (!dme.b(a))
                {
                    break label0;
                }
            }
            return;
        }
        dme.g(a);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
