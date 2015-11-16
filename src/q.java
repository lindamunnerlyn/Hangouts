// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.pm.PackageManager;

final class q
    implements Runnable
{

    final String a[];
    final Activity b;
    final int c;

    q(String as[], Activity activity, int i)
    {
        a = as;
        b = activity;
        c = i;
        super();
    }

    public void run()
    {
        int ai[] = new int[a.length];
        PackageManager packagemanager = b.getPackageManager();
        String s = b.getPackageName();
        int j = a.length;
        for (int i = 0; i < j; i++)
        {
            ai[i] = packagemanager.checkPermission(a[i], s);
        }

        ((r)b).onRequestPermissionsResult(c, a, ai);
    }
}
