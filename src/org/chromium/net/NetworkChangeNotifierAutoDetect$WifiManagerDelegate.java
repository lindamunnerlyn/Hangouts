// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

class b
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

    ()
    {
        a = null;
        b = null;
        c = false;
    }

    c(Context context)
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
