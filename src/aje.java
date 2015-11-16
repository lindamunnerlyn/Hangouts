// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

final class aje
    implements dha
{

    private final ajf a;
    private final Context b;

    aje(Context context)
    {
        a = (ajf)hgx.a(context, ajf);
        b = context;
    }

    public void a(gmw gmw, cxi cxi1)
    {
        boolean flag = true;
        PackageManager packagemanager;
        boolean flag1;
        if (cxi1.n() == 2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (cxi1.n() != 1)
        {
            flag = false;
        }
        if (!flag1 && !flag)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        cxi1 = cxi1.o();
        packagemanager = b.getPackageManager();
        ajf.a(gmw, cxi1, packagemanager.getPackageInfo(b.getPackageName(), 0).versionCode, flag1);
        return;
        gmw;
        throw new AssertionError(gmw);
    }
}
