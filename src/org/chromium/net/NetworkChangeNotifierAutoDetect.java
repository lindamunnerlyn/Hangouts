// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.chromium.base.ApplicationStatus;

// Referenced classes of package org.chromium.net:
//            NetworkChangeNotifier

public class NetworkChangeNotifierAutoDetect extends BroadcastReceiver
    implements org.chromium.base.ApplicationStatus.ApplicationStateListener
{

    private final NetworkConnectivityIntentFilter a;
    private final Observer b;
    private final Context c;
    private ConnectivityManagerDelegate d;
    private WifiManagerDelegate e;
    private boolean f;
    private int g;
    private String h;
    private double i;

    public NetworkChangeNotifierAutoDetect(Observer observer, Context context, boolean flag)
    {
        b = observer;
        c = context.getApplicationContext();
        d = new ConnectivityManagerDelegate(context);
        e = new WifiManagerDelegate(context);
        observer = d.a();
        g = a(observer);
        h = c(observer);
        i = b(observer);
        a = new NetworkConnectivityIntentFilter(e.c());
        if (flag)
        {
            d();
            return;
        } else
        {
            ApplicationStatus.a(this);
            a(a());
            return;
        }
    }

    private String c(NetworkState networkstate)
    {
        if (a(networkstate) != 2)
        {
            return "";
        } else
        {
            return e.a();
        }
    }

    private void d()
    {
        if (!f)
        {
            f = true;
            c.registerReceiver(this, a);
        }
    }

    private void d(NetworkState networkstate)
    {
        int j = a(networkstate);
        networkstate = c(networkstate);
        if (j == g && networkstate.equals(h))
        {
            return;
        } else
        {
            g = j;
            h = networkstate;
            (new StringBuilder("Network connectivity changed, type is: ")).append(g);
            b.a(j);
            return;
        }
    }

    private void e()
    {
        if (f)
        {
            f = false;
            c.unregisterReceiver(this);
        }
    }

    private void e(NetworkState networkstate)
    {
        double d1 = b(networkstate);
        if (d1 == i)
        {
            return;
        } else
        {
            i = d1;
            b.a(d1);
            return;
        }
    }

    int a()
    {
        return ApplicationStatus.c();
    }

    public int a(NetworkState networkstate)
    {
        byte byte1 = 5;
        if (networkstate.a()) goto _L2; else goto _L1
_L1:
        byte byte0 = 6;
_L4:
        return byte0;
_L2:
        byte0 = byte1;
        switch (networkstate.b())
        {
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 8: // '\b'
        default:
            return 0;

        case 6: // '\006'
            continue; /* Loop/switch isn't completed */

        case 9: // '\t'
            return 1;

        case 1: // '\001'
            return 2;

        case 7: // '\007'
            return 7;

        case 0: // '\0'
            byte0 = byte1;
            break;
        }
        switch (networkstate.c())
        {
        default:
            return 0;

        case 1: // '\001'
        case 2: // '\002'
        case 4: // '\004'
        case 7: // '\007'
        case 11: // '\013'
            return 3;

        case 3: // '\003'
        case 5: // '\005'
        case 6: // '\006'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 12: // '\f'
        case 14: // '\016'
        case 15: // '\017'
            return 4;

        case 13: // '\r'
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(int j)
    {
        NetworkState networkstate = c();
        if (j == 1)
        {
            d(networkstate);
            e(networkstate);
            d();
        } else
        if (j == 2)
        {
            e();
            return;
        }
    }

    public double b(NetworkState networkstate)
    {
        byte byte1;
        byte1 = 30;
        if (a(networkstate) == 2)
        {
            int j = e.b();
            if (j != -1)
            {
                return (double)j;
            }
        }
        if (networkstate.a()) goto _L2; else goto _L1
_L1:
        byte byte0 = 31;
_L4:
        return NetworkChangeNotifier.a(byte0);
_L2:
        byte0 = byte1;
        switch (networkstate.b())
        {
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 8: // '\b'
        default:
            byte0 = byte1;
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
        case 6: // '\006'
        case 7: // '\007'
        case 9: // '\t'
            break;

        case 0: // '\0'
            switch (networkstate.c())
            {
            default:
                byte0 = byte1;
                break;

            case 1: // '\001'
                byte0 = 4;
                break;

            case 2: // '\002'
                byte0 = 5;
                break;

            case 4: // '\004'
                byte0 = 2;
                break;

            case 7: // '\007'
                byte0 = 3;
                break;

            case 11: // '\013'
                byte0 = 1;
                break;

            case 3: // '\003'
                byte0 = 6;
                break;

            case 5: // '\005'
                byte0 = 7;
                break;

            case 6: // '\006'
                byte0 = 8;
                break;

            case 8: // '\b'
                byte0 = 11;
                break;

            case 9: // '\t'
                byte0 = 12;
                break;

            case 10: // '\n'
                byte0 = 9;
                break;

            case 12: // '\f'
                byte0 = 10;
                break;

            case 14: // '\016'
                byte0 = 13;
                break;

            case 15: // '\017'
                byte0 = 14;
                break;

            case 13: // '\r'
                byte0 = 15;
                break;
            }
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void b()
    {
        e();
    }

    public NetworkState c()
    {
        return d.a();
    }

    public void onReceive(Context context, Intent intent)
    {
        context = c();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()))
        {
            d(context);
            e(context);
        } else
        if ("android.net.wifi.RSSI_CHANGED".equals(intent.getAction()))
        {
            e(context);
            return;
        }
    }

    private class ConnectivityManagerDelegate
    {

        private final ConnectivityManager a;

        NetworkState a()
        {
            NetworkInfo networkinfo = a.getActiveNetworkInfo();
            if (networkinfo == null || !networkinfo.isConnected())
            {
                return new NetworkState(false, -1, -1);
            } else
            {
                return new NetworkState(true, networkinfo.getType(), networkinfo.getSubtype());
            }
        }

        ConnectivityManagerDelegate()
        {
            a = null;
        }

        ConnectivityManagerDelegate(Context context)
        {
            a = (ConnectivityManager)context.getSystemService("connectivity");
        }
    }


    private class WifiManagerDelegate
    {

        private final Context a;
        private final WifiManager b;
        private final boolean c;

        String a()
        {
            Object obj = a.registerReceiver(null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            if (obj != null)
            {
                obj = (WifiInfo)((Intent) (obj)).getParcelableExtra("wifiInfo");
                if (obj != null)
                {
                    obj = ((WifiInfo) (obj)).getSSID();
                    if (obj != null)
                    {
                        return ((String) (obj));
                    }
                }
            }
            return "";
        }

        int b()
        {
            WifiInfo wifiinfo;
            if (c && b != null)
            {
                if ((wifiinfo = b.getConnectionInfo()) != null)
                {
                    return wifiinfo.getLinkSpeed();
                }
            }
            return -1;
        }

        boolean c()
        {
            return c;
        }

        WifiManagerDelegate()
        {
            a = null;
            b = null;
            c = false;
        }

        WifiManagerDelegate(Context context)
        {
            a = context;
            boolean flag;
            if (a.getPackageManager().checkPermission("android.permission.ACCESS_WIFI_STATE", a.getPackageName()) == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c = flag;
            if (c)
            {
                context = (WifiManager)a.getSystemService("wifi");
            } else
            {
                context = null;
            }
            b = context;
        }
    }


    private class NetworkConnectivityIntentFilter extends IntentFilter
    {

        NetworkConnectivityIntentFilter(boolean flag)
        {
            addAction("android.net.conn.CONNECTIVITY_CHANGE");
            if (flag)
            {
                addAction("android.net.wifi.RSSI_CHANGED");
            }
        }
    }


    private class Observer
    {

        public abstract void a(double d1);

        public abstract void a(int j);
    }


    private class NetworkState
    {

        private final boolean a;
        private final int b;
        private final int c;

        public boolean a()
        {
            return a;
        }

        public int b()
        {
            return b;
        }

        public int c()
        {
            return c;
        }

        public NetworkState(boolean flag, int j, int k)
        {
            a = flag;
            b = j;
            c = k;
        }
    }

}
