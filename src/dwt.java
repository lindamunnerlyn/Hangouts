// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

final class dwt
    implements dij, hcb
{

    private final gqz a;
    private final efu b;
    private final dic c;

    dwt(Context context)
    {
        a = (gqz)hlp.a(context, gqz);
        b = (efu)hlp.a(context, efu);
        c = (dic)hlp.a(context, dic);
    }

    public void a(int i)
    {
        if (a.a(i).d("logged_out"))
        {
            a.b(i).h("SyncManager.reg_build_version").d();
        }
    }

    public void a(grd grd1, czm czm1)
    {
        if (czm1.k() == 1)
        {
            czm1 = grd1.b("SyncManager.reg_build_version");
            String s = b.c();
            if (!TextUtils.equals(czm1, s))
            {
                czm1 = grd1.b("account_name");
                String s1 = grd1.b("effective_gaia_id");
                int i = a.b(czm1, s1);
                s1 = String.valueOf("Perform warm sync in case there are messages missed before the device is registered for account ");
                czm1 = String.valueOf(eev.b(czm1));
                if (czm1.length() != 0)
                {
                    czm1 = s1.concat(czm1);
                } else
                {
                    czm1 = new String(s1);
                }
                eev.e("Babel_SyncManager", czm1);
                c.a(i);
            }
            grd1.b("SyncManager.reg_build_version", s);
        }
    }
}
