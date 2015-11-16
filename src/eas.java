// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.os.Handler;
import java.util.List;

final class eas extends ear
    implements eat
{

    final eap a;
    private final PendingIntent b;
    private final eaq c;

    eas(eap eap1, PendingIntent pendingintent, eaq eaq1)
    {
        a = eap1;
        super();
        b = pendingintent;
        c = eaq1;
    }

    private void e()
    {
        eap.a(a).removeCallbacks(this);
        eap.b(a).remove(this);
    }

    public void a()
    {
        eev.e("Babel_telephony", "TeleInCallUiController.ShowDialogAction.onConnected");
        eap.a(a, b, c);
        e();
    }

    public void b()
    {
        eev.e("Babel_telephony", "TeleInCallUiController.ShowDialogAction.onError");
        c.a();
        e();
    }

    public void c()
    {
        eev.e("Babel_telephony", "TeleInCallUiController.ShowDialogAction.onTimeout");
        c.b();
        e();
    }

    public void d()
    {
        b.cancel();
        e();
    }
}
