// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class aoh
    implements grg
{

    final aoc a;

    aoh(aoc aoc)
    {
        a = aoc;
        super();
    }

    public String a()
    {
        return "logged_off_to_logged_in";
    }

    public void a(Context context, grd grd1)
    {
        boolean flag1 = true;
        boolean flag = grd1.a("logged_off", false);
        context = String.valueOf(eev.b(grd1.b("account_name")));
        eev.e("Babel", (new StringBuilder(String.valueOf(context).length() + 35)).append("Account ").append(context).append(" logged off: ").append(flag).append(" migrated").toString());
        if ("SMS".equals(grd1.b("account_name")))
        {
            if (!grd1.d("is_sms_account") || !dcn.j())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        if (flag)
        {
            flag1 = false;
        }
        grd1.b("logged_in", flag1);
        grd1.b("logged_out", flag);
        grd1.f("logged_off");
    }
}
