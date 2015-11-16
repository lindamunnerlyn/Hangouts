// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class grw
    implements grg
{

    final grq a;

    grw(grq grq)
    {
        a = grq;
        super();
    }

    public String a()
    {
        return "upgrade:account_status";
    }

    public void a(Context context, grd grd1)
    {
        if (grd1.d("non_google_plus"))
        {
            grd1.f("non_google_plus");
            grd1.b("account_status", 2);
            return;
        }
        if (grd1.d("notifications_only"))
        {
            grd1.f("notifications_only");
            grd1.b("account_status", 3);
            return;
        }
        if (grd1.d("logged_in"))
        {
            grd1.f("logged_in");
            grd1.b("account_status", 4);
            return;
        } else
        {
            grd1.b("account_status", 5);
            return;
        }
    }
}
