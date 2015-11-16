// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.TimerTask;

final class dtw extends TimerTask
{

    dtw()
    {
    }

    public void run()
    {
label0:
        {
            synchronized (dtv.a())
            {
                if (dtv.a().a > 0)
                {
                    break label0;
                }
            }
            return;
        }
        dtv.c(g.nU);
_L1:
        dty1;
        JVM INSTR monitorexit ;
        return;
        exception;
        dty1;
        JVM INSTR monitorexit ;
        throw exception;
        abz abz1;
        abz1;
        dtv.a().b = false;
        String s = String.valueOf(abz1);
        eev.g("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 46)).append("MmsSendReceiveManager.MMS_APN_EXTENSION_TASK: ").append(s).toString());
          goto _L1
    }
}
