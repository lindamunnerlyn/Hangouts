// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;

public class PowerMonitor
    implements ApplicationStatus.ApplicationStateListener
{

    private static PowerMonitor a;
    private static final Runnable d = new _cls1();
    private boolean b;
    private final Handler c = new Handler(Looper.getMainLooper());

    PowerMonitor()
    {
    }

    static void a()
    {
        nativeOnMainActivitySuspended();
    }

    public static void a(Intent intent)
    {
        boolean flag = true;
        if (a == null)
        {
            return;
        }
        int i = intent.getIntExtra("plugged", -1);
        intent = a;
        if (i == 2 || i == 1)
        {
            flag = false;
        }
        intent.b = flag;
        nativeOnBatteryChargingChanged();
    }

    private static boolean isBatteryPower()
    {
        return a.b;
    }

    private static native void nativeOnBatteryChargingChanged();

    private static native void nativeOnMainActivityResumed();

    private static native void nativeOnMainActivitySuspended();

    public void a(int i)
    {
        if (i == 1)
        {
            c.removeCallbacks(d);
            nativeOnMainActivityResumed();
        } else
        if (i == 2)
        {
            c.postDelayed(d, 60000L);
            return;
        }
    }


    private class _cls1
        implements Runnable
    {

        public void run()
        {
            PowerMonitor.a();
        }

        _cls1()
        {
        }
    }

}
