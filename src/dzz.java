// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Network;
import android.os.Handler;

final class dzz extends android.net.ConnectivityManager.NetworkCallback
{

    final dzx a;
    private final Handler b = new Handler();

    dzz(dzx dzx)
    {
        a = dzx;
        super();
    }

    private void a()
    {
        b.post(new eaa(this));
    }

    public void onAvailable(Network network)
    {
        eev.e("Babel_telephony", "TeleWifiMonitor.NetworkCallback.onAvailable");
        a();
    }

    public void onLosing(Network network, int i)
    {
        eev.e("Babel_telephony", "TeleWifiMonitor.NetworkCallback.onLosing");
        a();
    }

    public void onLost(Network network)
    {
        eev.e("Babel_telephony", "TeleWifiMonitor.NetworkCallback.onLost");
        a();
    }
}
