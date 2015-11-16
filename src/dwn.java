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

final class dwn
{

    private static final boolean a = false;
    private final Context b;
    private dwo c;
    private BroadcastReceiver d;
    private android.net.ConnectivityManager.NetworkCallback e;
    private dws f;

    dwn(Context context)
    {
        b = context;
    }

    static dws a(Context context)
    {
        if (!g.k(context))
        {
            return new dws(false, 0, 0);
        } else
        {
            context = ((WifiManager)context.getSystemService("wifi")).getConnectionInfo();
            return new dws(true, WifiManager.calculateSignalLevel(context.getRssi(), 100), context.getLinkSpeed());
        }
    }

    static void a(dwn dwn1)
    {
        gbh.a();
        dws dws1 = a(dwn1.b);
        if (!dws1.equals(dwn1.f))
        {
            ebw.e("Babel_telephony", String.format(Locale.US, "TeleWifiMonitor.updateSignalState, (%s) -> (%s)", new Object[] {
                dwn1.f, dws1
            }));
            dwn1.f = dws1;
            if (dwn1.c != null)
            {
                dwn1.c.a(dwn1.f);
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
            ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 27)).append("unregisterReceiver failed, ").append(s).toString());
            return;
        }
        catch (NoSuchMethodError nosuchmethoderror)
        {
            s1 = String.valueOf(nosuchmethoderror);
        }
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 34)).append("unregisterNetworkCallback failed, ").append(s1).toString());
    }

    void a(dwo dwo1)
    {
        gbh.a();
        c = dwo1;
        dwo1 = new IntentFilter();
        dwo1.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        dwo1.addAction("android.net.wifi.RSSI_CHANGED");
        d = new dwr(this);
        b.registerReceiver(d, dwo1);
        dwo1 = (new android.net.NetworkRequest.Builder()).addTransportType(1).build();
        e = new dwp(this);
        ConnectivityManager connectivitymanager = (ConnectivityManager)b.getSystemService("connectivity");
        try
        {
            connectivitymanager.registerNetworkCallback(dwo1, e);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (dwo dwo1)
        {
            dwo1 = String.valueOf(dwo1);
        }
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(dwo1).length() + 32)).append("registerNetworkCallback failed, ").append(dwo1).toString());
    }

    static 
    {
        hik hik = ebw.s;
    }
}
