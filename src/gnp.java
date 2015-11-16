// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class gnp
    implements gmz
{

    final gnj a;

    gnp(gnj gnj)
    {
        a = gnj;
        super();
    }

    public String a()
    {
        return "upgrade:remove_account_status";
    }

    public void a(Context context, gmw gmw1)
    {
        switch (gmw1.a("account_status", 0))
        {
        case 0: // '\0'
        case 2: // '\002'
        default:
            return;

        case 1: // '\001'
            gmw1.b("is_bad", true);
            return;

        case 3: // '\003'
            gmw1.b("gplus_no_mobile_tos", true);
            return;

        case 4: // '\004'
            gmw1.b("is_google_plus", true);
            gmw1.b("logged_in", true);
            return;

        case 5: // '\005'
            gmw1.b("is_google_plus", true);
            break;
        }
        gmw1.b("logged_out", true);
    }
}
