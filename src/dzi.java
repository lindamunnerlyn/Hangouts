// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

final class dzi
    implements Runnable
{

    final dzh a;

    dzi(dzh dzh1)
    {
        a = dzh1;
        super();
    }

    public void run()
    {
        eev.f("Babel_telephony", "TeleSetupController, setup account timed out");
        a.c.removeCallbacks(a.d);
        dzh.a(a);
    }
}
