// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.webrtc.voiceengine;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package org.webrtc.voiceengine:
//            AudioEffectsJB

public final class WebRtcAudioUtils
{

    private static final String BLACKLISTED_AEC_MODELS[] = {
        "Nexus 5", "D6503"
    };
    private static final int SAMPLE_RATE_HZ = 16000;
    private static int defaultSampleRateHz = 16000;

    public WebRtcAudioUtils()
    {
    }

    public static boolean deviceIsBlacklistedForHwAecUsage()
    {
        return Arrays.asList(BLACKLISTED_AEC_MODELS).contains(Build.MODEL);
    }

    public static int getDefaultSampleRateHz()
    {
        return defaultSampleRateHz;
    }

    public static String getThreadInfo()
    {
        String s = String.valueOf(Thread.currentThread().getName());
        long l = Thread.currentThread().getId();
        return (new StringBuilder(String.valueOf(s).length() + 33)).append("@[name=").append(s).append(", id=").append(l).append("]").toString();
    }

    public static boolean hasPermission(Context context, String s)
    {
        return context.checkPermission(s, Process.myPid(), Process.myUid()) == 0;
    }

    public static boolean isAcousticEchoCancelerApproved()
    {
        return isAcousticEchoCancelerSupported();
    }

    public static boolean isAcousticEchoCancelerSupported()
    {
        return AudioEffectsJB.shouldUsePlatformAcousticEchoCanceler();
    }

    public static void logDeviceInfo(String s)
    {
        int i = android.os.Build.VERSION.SDK_INT;
        s = String.valueOf(android.os.Build.VERSION.RELEASE);
        String s1 = String.valueOf(Build.BRAND);
        String s2 = String.valueOf(Build.DEVICE);
        String s3 = String.valueOf(Build.ID);
        String s4 = String.valueOf(Build.HARDWARE);
        String s5 = String.valueOf(Build.MANUFACTURER);
        String s6 = String.valueOf(Build.MODEL);
        String s7 = String.valueOf(Build.PRODUCT);
        (new StringBuilder(String.valueOf(s).length() + 108 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length() + String.valueOf(s7).length())).append("Android SDK: ").append(i).append(", Release: ").append(s).append(", Brand: ").append(s1).append(", Device: ").append(s2).append(", Id: ").append(s3).append(", Hardware: ").append(s4).append(", Manufacturer: ").append(s5).append(", Model: ").append(s6).append(", Product: ").append(s7);
    }

    public static boolean runningOnEmulator()
    {
        return Build.HARDWARE.equals("goldfish") && Build.BRAND.startsWith("generic_");
    }

    public static boolean runningOnGingerBreadOrHigher()
    {
        return android.os.Build.VERSION.SDK_INT >= 9;
    }

    public static boolean runningOnJellyBeanMR1OrHigher()
    {
        return android.os.Build.VERSION.SDK_INT >= 17;
    }

    public static boolean runningOnJellyBeanOrHigher()
    {
        return android.os.Build.VERSION.SDK_INT >= 16;
    }

    public static boolean runningOnLollipopOrHigher()
    {
        return android.os.Build.VERSION.SDK_INT >= 21;
    }

    public static void setDefaultSampleRateHz(int i)
    {
        defaultSampleRateHz = i;
    }

}
