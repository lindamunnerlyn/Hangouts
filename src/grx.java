// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class grx
    implements grg
{

    final grq a;

    grx(grq grq)
    {
        a = grq;
        super();
    }

    public String a()
    {
        return "upgrade:remove_account_status";
    }

    public void a(Context context, grd grd1)
    {
        switch (grd1.a("account_status", 0))
        {
        case 0: // '\0'
        case 2: // '\002'
        default:
            return;

        case 1: // '\001'
            grd1.b("is_bad", true);
            return;

        case 3: // '\003'
            grd1.b("gplus_no_mobile_tos", true);
            return;

        case 4: // '\004'
            grd1.b("is_google_plus", true);
            grd1.b("logged_in", true);
            return;

        case 5: // '\005'
            grd1.b("is_google_plus", true);
            break;
        }
        grd1.b("logged_out", true);
    }
}
