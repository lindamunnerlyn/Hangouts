// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.TimerTask;

final class drc extends TimerTask
{

    drc()
    {
    }

    public void run()
    {
label0:
        {
            synchronized (drb.a())
            {
                if (drb.a().a > 0)
                {
                    break label0;
                }
            }
            return;
        }
        drb.c(g.nS);
_L1:
        dre1;
        JVM INSTR monitorexit ;
        return;
        exception;
        dre1;
        JVM INSTR monitorexit ;
        throw exception;
        abx abx1;
        abx1;
        drb.a().b = false;
        String s = String.valueOf(abx1);
        ebw.g("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 46)).append("MmsSendReceiveManager.MMS_APN_EXTENSION_TASK: ").append(s).toString());
          goto _L1
    }
}
