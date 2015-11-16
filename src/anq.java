// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class anq
    implements gmz
{

    final ank a;

    anq(ank ank)
    {
        a = ank;
        super();
    }

    public String a()
    {
        return "fix_sms_logged_off2";
    }

    public void a(Context context, gmw gmw1)
    {
        boolean flag1 = true;
        if ("SMS".equals(gmw1.b("account_name")))
        {
            boolean flag;
            if (gmw1.d("is_sms_account") && dbf.j())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gmw1.b("logged_in", flag);
            if (!flag)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            gmw1.b("logged_out", flag);
        }
    }
}
