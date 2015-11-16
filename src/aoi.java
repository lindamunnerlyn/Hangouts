// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class aoi
    implements grg
{

    final aoc a;

    aoi(aoc aoc)
    {
        a = aoc;
        super();
    }

    public String a()
    {
        return "fix_sms_logged_off2";
    }

    public void a(Context context, grd grd1)
    {
        boolean flag1 = true;
        if ("SMS".equals(grd1.b("account_name")))
        {
            boolean flag;
            if (grd1.d("is_sms_account") && dcn.j())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            grd1.b("logged_in", flag);
            if (!flag)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            grd1.b("logged_out", flag);
        }
    }
}
