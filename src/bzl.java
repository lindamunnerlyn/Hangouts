// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public class bzl
    implements gxg, gxq
{

    private gms a;

    public bzl(Context context)
    {
        a = (gms)hgx.a(context, gms);
    }

    public static boolean a(gmu gmu1)
    {
        while (!gmu1.a("gaia_id") || f(gmu1) && g(gmu1) && !h(gmu1)) 
        {
            return false;
        }
        return true;
    }

    static void b(int i)
    {
        dbf.f(i);
    }

    static boolean c(gmu gmu1)
    {
        return g(gmu1);
    }

    static boolean d(gmu gmu1)
    {
        return f(gmu1);
    }

    static boolean e(gmu gmu1)
    {
        return h(gmu1);
    }

    private static boolean f(gmu gmu1)
    {
        return dbf.x() || gmu1.d("allowed_for_domain");
    }

    private static boolean g(gmu gmu1)
    {
        return gmu1.d("chat_archive_enabled") || !gmu1.d("allowed_for_domain");
    }

    private static boolean h(gmu gmu1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (gmu1.a("account_age_group", 0) == 3)
        {
            flag = flag1;
            if (gmu1.d("blocked_for_child"))
            {
                flag = true;
            }
        }
        return flag;
    }

    public bzn a()
    {
        return new bzn();
    }

    public void a(int i)
    {
label0:
        {
            boolean flag;
            if (a.a(i).b("full_jid") != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                if (dcx.c().d())
                {
                    break label0;
                }
                dcx.c().a(new bzm(this, i));
                dcx.c().h();
            }
            return;
        }
        dbf.f(i);
    }

    public ad b()
    {
        return a();
    }

    public boolean b(gmu gmu1)
    {
        while (gmu1.d("sms_only") || gmu1.a("gaia_id") && !a(gmu1)) 
        {
            return true;
        }
        return false;
    }
}
