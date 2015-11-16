// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Timer;

public final class dre
{

    public int a;
    public boolean b;
    public Timer c;
    public dsj d;
    public abx e;

    public dre()
    {
        a = 0;
        b = false;
        c = null;
        d = null;
        e = null;
    }

    public static void a(boolean flag, abx abx)
    {
        drb.a().b = flag;
        drb.a().e = abx;
        drb.a().notifyAll();
        if (!flag || drb.a().c != null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        abx = drb.a();
        if (((dre) (abx)).c != null)
        {
            ((dre) (abx)).c.cancel();
        }
        abx.c = new Timer("mms_apn_extension_timer", true);
        ((dre) (abx)).c.schedule(new drc(), g.a(g.nS, "babel_apn_extension_wait_in_millis", 30000L));
        return;
        abx;
        abx = String.valueOf(abx);
        ebw.g("Babel_SMS", (new StringBuilder(String.valueOf(abx).length() + 60)).append("MmsSendReceiveManager.SendingStatus.startApnExtensionTimer: ").append(abx).toString());
        return;
    }

    public void a()
    {
        if (c != null)
        {
            c.cancel();
        }
        c = null;
    }
}
