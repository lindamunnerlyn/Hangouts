// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

final class ajb
    implements dij
{

    private final ajc a;
    private final Context b;

    ajb(Context context)
    {
        a = (ajc)hlp.a(context, ajc);
        b = context;
    }

    public void a(grd grd1, czm czm1)
    {
        byte byte0 = 0;
        boolean flag1 = true;
        PackageManager packagemanager;
        boolean flag;
        int i;
        if (czm1.n() == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (czm1.n() == 1)
        {
            byte0 = 1;
        }
        if (!flag && !byte0)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        czm1 = czm1.o();
        packagemanager = b.getPackageManager();
        try
        {
            i = packagemanager.getPackageInfo(b.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (grd grd1)
        {
            throw new AssertionError(grd1);
        }
        byte0 = flag1;
        if (flag)
        {
            byte0 = 2;
        }
        grd1.b("app_upgrade_type", byte0);
        grd1.b("app_upgrade_url", czm1);
        grd1.b("app_upgrade_version_code", i);
    }
}
