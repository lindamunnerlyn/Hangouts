// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.os.Handler;
import java.util.List;

final class dxi extends dxh
    implements dxj
{

    final dxf a;
    private final PendingIntent b;
    private final dxg c;

    dxi(dxf dxf1, PendingIntent pendingintent, dxg dxg1)
    {
        a = dxf1;
        super();
        b = pendingintent;
        c = dxg1;
    }

    private void e()
    {
        dxf.a(a).removeCallbacks(this);
        dxf.b(a).remove(this);
    }

    public void a()
    {
        ebw.e("Babel_telephony", "TeleInCallUiController.ShowDialogAction.onConnected");
        dxf.a(a, b, c);
        e();
    }

    public void b()
    {
        ebw.e("Babel_telephony", "TeleInCallUiController.ShowDialogAction.onError");
        c.a();
        e();
    }

    public void c()
    {
        ebw.e("Babel_telephony", "TeleInCallUiController.ShowDialogAction.onTimeout");
        c.b();
        e();
    }

    public void d()
    {
        b.cancel();
        e();
    }
}
