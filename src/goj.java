// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActivityManager;

public final class goj
{

    private static ActivityManager a = null;

    public static boolean a()
    {
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = new android.app.ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningappprocessinfo);
        return runningappprocessinfo.importance == 100;
    }

}
