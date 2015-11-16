// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dig
    implements Runnable
{

    final dif a;

    dig(dif dif1)
    {
        a = dif1;
        super();
    }

    public void run()
    {
label0:
        {
            synchronized (dif.a(a))
            {
                if (dif.i())
                {
                    eev.b("Babel", a.a("Shutdown Runnable"));
                }
                if (dif.b(a) <= 0)
                {
                    break label0;
                }
            }
            return;
        }
        if (!a.stopSelfResult(dif.c(a))) goto _L2; else goto _L1
_L1:
        if (dif.i())
        {
            eev.b("Babel", a.a("StopSelf Succeeded"));
        }
        a.d();
_L4:
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        if (!dif.i()) goto _L4; else goto _L3
_L3:
        eev.b("Babel", a.a("StopSelf Cancelled"));
          goto _L4
    }
}
