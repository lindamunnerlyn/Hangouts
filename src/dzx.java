// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import java.util.Locale;

final class dzx
{

    private static final boolean a = false;
    private final Context b;
    private dzy c;
    private BroadcastReceiver d;
    private android.net.ConnectivityManager.NetworkCallback e;
    private eac f;

    dzx(Context context)
    {
        b = context;
    }

    static eac a(Context context)
    {
        if (!g.k(context))
        {
            return new eac(false, 0, 0);
        } else
        {
            context = ((WifiManager)context.getSystemService("wifi")).getConnectionInfo();
            return new eac(true, WifiManager.calculateSignalLevel(context.getRssi(), 100), context.getLinkSpeed());
        }
    }

    static void a(dzx dzx1)
    {
        gdv.a();
        eac eac1 = a(dzx1.b);
        if (!eac1.equals(dzx1.f))
        {
            eev.e("Babel_telephony", String.format(Locale.US, "TeleWifiMonitor.updateSignalState, (%s) -> (%s)", new Object[] {
                dzx1.f, eac1
            }));
            dzx1.f = eac1;
            if (dzx1.c != null)
            {
                dzx1.c.a(dzx1.f);
            }
        }
    }

    static boolean b()
    {
        return a;
    }

    void a()
    {
        c = null;
        String s1;
        try
        {
            b.unregisterReceiver(d);
            ((ConnectivityManager)b.getSystemService("connectivity")).unregisterNetworkCallback(e);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            String s = String.valueOf(illegalargumentexception);
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 27)).append("unregisterReceiver failed, ").append(s).toString());
            return;
        }
        catch (NoSuchMethodError nosuchmethoderror)
        {
            s1 = String.valueOf(nosuchmethoderror);
        }
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 34)).append("unregisterNetworkCallback failed, ").append(s1).toString());
    }

    void a(dzy dzy1)
    {
        gdv.a();
        c = dzy1;
        dzy1 = new IntentFilter();
        dzy1.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        dzy1.addAction("android.net.wifi.RSSI_CHANGED");
        d = new eab(this);
        b.registerReceiver(d, dzy1);
        dzy1 = (new android.net.NetworkRequest.Builder()).addTransportType(1).build();
        e = new dzz(this);
        ConnectivityManager connectivitymanager = (ConnectivityManager)b.getSystemService("connectivity");
        try
        {
            connectivitymanager.registerNetworkCallback(dzy1, e);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (dzy dzy1)
        {
            dzy1 = String.valueOf(dzy1);
        }
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(dzy1).length() + 32)).append("registerNetworkCallback failed, ").append(dzy1).toString());
    }

    static 
    {
        hnc hnc = eev.s;
    }
}
