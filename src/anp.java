// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class anp
    implements gmz
{

    final ank a;

    anp(ank ank)
    {
        a = ank;
        super();
    }

    public String a()
    {
        return "logged_off_to_logged_in";
    }

    public void a(Context context, gmw gmw1)
    {
        boolean flag1 = true;
        boolean flag = gmw1.a("logged_off", false);
        context = String.valueOf(ebw.b(gmw1.b("account_name")));
        ebw.e("Babel", (new StringBuilder(String.valueOf(context).length() + 35)).append("Account ").append(context).append(" logged off: ").append(flag).append(" migrated").toString());
        if ("SMS".equals(gmw1.b("account_name")))
        {
            if (!gmw1.d("is_sms_account") || !dbf.j())
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
        gmw1.b("logged_in", flag1);
        gmw1.b("logged_out", flag);
        gmw1.f("logged_off");
    }
}
