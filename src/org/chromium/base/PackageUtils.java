// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public class PackageUtils
{

    private PackageUtils()
    {
    }

    public static PackageInfo a(Context context)
    {
        PackageManager packagemanager = context.getPackageManager();
        try
        {
            context = packagemanager.getPackageInfo(context.getApplicationContext().getPackageName(), 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new AssertionError("Failed to retrieve own package info");
        }
        return context;
    }
}
