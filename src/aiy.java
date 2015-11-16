// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

final class aiy
    implements fsn, hhi, hjx, hka
{

    ai a;
    Dialog b;
    private gmo c;
    private gms d;
    private ajf e;
    private boolean f;

    aiy(ai ai1, hjm hjm1)
    {
        a = ai1;
        hjm1.a(this);
    }

    public void E_()
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

    public void a(Context context, hgx hgx1, Bundle bundle)
    {
        c = (gmo)hgx1.a(gmo);
        d = (gms)hgx1.a(gms);
        e = (ajf)hgx1.a(ajf);
        c.a(new aiz(this));
    }

    void c()
    {
        boolean flag = false;
        int i;
        if (f)
        {
            if ((i = c.a()) != -1 && d.c(i))
            {
                Object obj = a.getPackageManager();
                int j;
                try
                {
                    obj = ((PackageManager) (obj)).getPackageInfo(a.getPackageName(), 0);
                }
                catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
                {
                    throw new AssertionError(namenotfoundexception);
                }
                j = ajf.a(a, i, ((PackageInfo) (obj)).versionCode);
                if (j != 0)
                {
                    if (j == 2)
                    {
                        flag = true;
                    }
                    aja aja1 = new aja(this, i);
                    ajb ajb1 = new ajb(this, flag);
                    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a);
                    if (flag)
                    {
                        i = g.it;
                    } else
                    {
                        i = g.iw;
                    }
                    builder = builder.setTitle(i);
                    if (flag)
                    {
                        i = g.iu;
                    } else
                    {
                        i = g.iv;
                    }
                    b = builder.setMessage(i).setOnCancelListener(ajb1).setPositiveButton(g.is, aja1).create();
                    b.show();
                    return;
                }
            }
        }
    }
}
