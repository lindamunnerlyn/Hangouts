// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dgx
    implements Runnable
{

    final dgw a;

    dgx(dgw dgw1)
    {
        a = dgw1;
        super();
    }

    public void run()
    {
label0:
        {
            synchronized (dgw.a(a))
            {
                if (dgw.i())
                {
                    ebw.b("Babel", a.a("Shutdown Runnable"));
                }
                if (dgw.b(a) <= 0)
                {
                    break label0;
                }
            }
            return;
        }
        if (!a.stopSelfResult(dgw.c(a))) goto _L2; else goto _L1
_L1:
        if (dgw.i())
        {
            ebw.b("Babel", a.a("StopSelf Succeeded"));
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
        if (!dgw.i()) goto _L4; else goto _L3
_L3:
        ebw.b("Babel", a.a("StopSelf Cancelled"));
          goto _L4
    }
}
