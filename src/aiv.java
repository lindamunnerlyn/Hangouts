// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

final class aiv
    implements hma, hor, hou, hoy
{

    ai a;
    Dialog b;
    private gqu c;
    private gqz d;
    private ajc e;
    private boolean f;

    aiv(ai ai1, hof hof1)
    {
        a = ai1;
        hof1.a(this);
    }

    public void G_()
    {
        f = true;
        c();
    }

    public void a()
    {
        f = false;
        if (b != null)
        {
            b.dismiss();
            b = null;
        }
    }

    public void a(Context context, hlp hlp1, Bundle bundle)
    {
        c = (gqu)hlp1.a(gqu);
        d = (gqz)hlp1.a(gqz);
        e = (ajc)hlp1.a(ajc);
        c.a(new aiw(this));
    }

    void c()
    {
        int j;
        if (f)
        {
            if ((j = c.a()) != -1 && d.c(j))
            {
                Object obj = a.getPackageManager();
                ai ai1;
                int i;
                try
                {
                    obj = ((PackageManager) (obj)).getPackageInfo(a.getPackageName(), 0);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw new AssertionError(obj);
                }
                ai1 = a;
                i = ((PackageInfo) (obj)).versionCode;
                obj = ((gqz)hlp.a(ai1, gqz)).a(j);
                if (((grb) (obj)).a("app_upgrade_version_code", 0) < i)
                {
                    i = 0;
                } else
                {
                    i = ((grb) (obj)).a("app_upgrade_type", 0);
                }
                if (i != 0)
                {
                    aiy aiy1;
                    android.app.AlertDialog.Builder builder;
                    boolean flag;
                    if (i == 2)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    obj = new aix(this, j);
                    aiy1 = new aiy(this, flag);
                    builder = new android.app.AlertDialog.Builder(a);
                    if (flag)
                    {
                        i = g.il;
                    } else
                    {
                        i = g.io;
                    }
                    builder = builder.setTitle(i);
                    if (flag)
                    {
                        i = g.im;
                    } else
                    {
                        i = g.in;
                    }
                    b = builder.setMessage(i).setOnCancelListener(aiy1).setPositiveButton(g.ik, ((android.content.DialogInterface.OnClickListener) (obj))).create();
                    b.show();
                    return;
                }
            }
        }
    }
}
