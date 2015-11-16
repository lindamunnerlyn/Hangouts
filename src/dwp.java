// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Network;
import android.os.Handler;

final class dwp extends android.net.ConnectivityManager.NetworkCallback
{

    final dwn a;
    private final Handler b = new Handler();

    dwp(dwn dwn)
    {
        a = dwn;
        super();
    }

    private void a()
    {
        b.post(new dwq(this));
    }

    public void onAvailable(Network network)
    {
        ebw.e("Babel_telephony", "TeleWifiMonitor.NetworkCallback.onAvailable");
        a();
    }

    public void onLosing(Network network, int i)
    {
        ebw.e("Babel_telephony", "TeleWifiMonitor.NetworkCallback.onLosing");
        a();
    }

    public void onLost(Network network)
    {
        ebw.e("Babel_telephony", "TeleWifiMonitor.NetworkCallback.onLost");
        a();
    }
}
