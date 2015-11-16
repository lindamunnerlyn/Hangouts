// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class gnm
    implements gmz
{

    final gnj a;

    gnm(gnj gnj)
    {
        a = gnj;
        super();
    }

    public String a()
    {
        return "upgrade_direct_login_to_managed_login";
    }

    public void a(Context context, gmw gmw1)
    {
        boolean flag;
        if (gmw1.a("is_direct_login"))
        {
            boolean flag1 = gmw1.a("is_direct_login", false);
            if (!flag1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gmw1.b("is_managed_account", flag);
            gmw1.f("is_direct_login");
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (gmw1.a("is_plus_page", false) && !flag)
        {
            gmw1.b("is_managed_account", true);
        }
    }
}
