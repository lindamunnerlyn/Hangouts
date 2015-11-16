// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

final class dvz
    implements Runnable
{

    final dvy a;

    dvz(dvy dvy1)
    {
        a = dvy1;
        super();
    }

    public void run()
    {
        ebw.f("Babel_telephony", "TeleSetupController, setup account timed out");
        dvy.b(a).removeCallbacks(dvy.a(a));
        dvy.c(a);
    }
}
