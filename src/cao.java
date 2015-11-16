// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public class cao
    implements hbq, hcb
{

    private gqz a;

    public cao(Context context)
    {
        a = (gqz)hlp.a(context, gqz);
    }

    static boolean a(grb grb1)
    {
        return dcn.x() || grb1.d("allowed_for_domain");
    }

    static boolean b(grb grb1)
    {
        return grb1.d("chat_archive_enabled") || !grb1.d("allowed_for_domain");
    }

    static boolean c(grb grb1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (grb1.a("account_age_group", 0) == 3)
        {
            flag = flag1;
            if (grb1.d("blocked_for_child"))
            {
                flag = true;
            }
        }
        return flag;
    }

    public static boolean d(grb grb1)
    {
        while (!grb1.a("gaia_id") || a(grb1) && b(grb1) && !c(grb1)) 
        {
            return false;
        }
        return true;
    }

    public caq a()
    {
        return new caq();
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
                if (def.c().d())
                {
                    break label0;
                }
                def.c().a(new cap(this, i));
                def.c().h();
            }
            return;
        }
        dcn.f(i);
    }

    public ad b()
    {
        return a();
    }

    public boolean e(grb grb1)
    {
        while (grb1.d("sms_only") || grb1.a("gaia_id") && !d(grb1)) 
        {
            return true;
        }
        return false;
    }
}
