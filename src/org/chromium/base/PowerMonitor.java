// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import gap;
import llr;

public class PowerMonitor
    implements gap
{

    private static PowerMonitor a;
    private static final Runnable d = new llr();
    private boolean b;
    private final Handler c = new Handler(Looper.getMainLooper());

    private PowerMonitor()
    {
    }

    public static void b()
    {
        nativeOnMainActivitySuspended();
    }

    private static boolean isBatteryPower()
    {
        return a.b;
    }

    private static native void nativeOnBatteryChargingChanged();

    private static native void nativeOnMainActivityResumed();

    private static native void nativeOnMainActivitySuspended();

}
