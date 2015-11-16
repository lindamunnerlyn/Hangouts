// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class gru
    implements grg
{

    final grq a;

    gru(grq grq)
    {
        a = grq;
        super();
    }

    public String a()
    {
        return "upgrade_direct_login_to_managed_login";
    }

    public void a(Context context, grd grd1)
    {
        boolean flag;
        if (grd1.a("is_direct_login"))
        {
            boolean flag1 = grd1.a("is_direct_login", false);
            if (!flag1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            grd1.b("is_managed_account", flag);
            grd1.f("is_direct_login");
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (grd1.a("is_plus_page", false) && !flag)
        {
            grd1.b("is_managed_account", true);
        }
    }
}
