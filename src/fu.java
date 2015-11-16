// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.ConnectivityManager;

public final class fu
{

    private static final fw a;

    public static boolean a(ConnectivityManager connectivitymanager)
    {
        return a.a(connectivitymanager);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new fz();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 13)
        {
            a = new fy();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            a = new fx();
        } else
        {
            a = new fv();
        }
    }
}
