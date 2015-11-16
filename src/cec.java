// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.LauncherApps;
import android.content.pm.PackageManager;
import android.os.UserHandle;
import android.os.UserManager;
import java.util.Iterator;
import java.util.List;

public final class cec
{

    public static volatile boolean a = false;
    public static volatile boolean b = false;
    private static volatile boolean c = false;
    private static volatile boolean d = false;

    public static boolean a(Context context)
    {
        if (!a)
        {
            c = a(context, "com.google.android.wearable.app");
            a = true;
        }
        return c;
    }

    private static boolean a(Context context, String s)
    {
        if (android.os.Build.VERSION.SDK_INT < 21) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = (UserManager)context.getSystemService("user");
        context = (LauncherApps)context.getSystemService("launcherapps");
        obj = ((UserManager) (obj)).getUserProfiles().iterator();
_L6:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        if (!context.isPackageEnabled(s, (UserHandle)((Iterator) (obj)).next())) goto _L6; else goto _L5
_L5:
        boolean flag = true;
_L8:
        if (cfi.m)
        {
            eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 39)).append("isCompanionAppInstalled ").append(s).append(" returned ").append(flag).toString());
        }
        return flag;
_L4:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L2:
        flag = b(context, s);
        if (true) goto _L8; else goto _L7
_L7:
    }

    static boolean b(Context context)
    {
        if (!b)
        {
            d = a(context, "com.google.android.projection.gearhead");
            b = true;
        }
        return d;
    }

    private static boolean b(Context context, String s)
    {
        try
        {
            context.getPackageManager().getPackageInfo(s, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }

    static boolean c(Context context)
    {
        return a(context) || b(context);
    }

}
