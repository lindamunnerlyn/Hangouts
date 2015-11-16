// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Timer;

public final class dty
{

    public int a;
    public boolean b;
    public Timer c;
    public dvc d;
    public abz e;

    public dty()
    {
        a = 0;
        b = false;
        c = null;
        d = null;
        e = null;
    }

    public static void a(boolean flag, abz abz)
    {
        dtv.a().b = flag;
        dtv.a().e = abz;
        dtv.a().notifyAll();
        if (!flag || dtv.a().c != null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        abz = dtv.a();
        if (((dty) (abz)).c != null)
        {
            ((dty) (abz)).c.cancel();
        }
        abz.c = new Timer("mms_apn_extension_timer", true);
        ((dty) (abz)).c.schedule(new dtw(), g.a(g.nU, "babel_apn_extension_wait_in_millis", 30000L));
        return;
        abz;
        abz = String.valueOf(abz);
        eev.g("Babel_SMS", (new StringBuilder(String.valueOf(abz).length() + 60)).append("MmsSendReceiveManager.SendingStatus.startApnExtensionTimer: ").append(abz).toString());
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
