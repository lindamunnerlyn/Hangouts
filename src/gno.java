// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class gno
    implements gmz
{

    final gnj a;

    gno(gnj gnj)
    {
        a = gnj;
        super();
    }

    public String a()
    {
        return "upgrade:account_status";
    }

    public void a(Context context, gmw gmw1)
    {
        if (gmw1.d("non_google_plus"))
        {
            gmw1.f("non_google_plus");
            gmw1.b("account_status", 2);
            return;
        }
        if (gmw1.d("notifications_only"))
        {
            gmw1.f("notifications_only");
            gmw1.b("account_status", 3);
            return;
        }
        if (gmw1.d("logged_in"))
        {
            gmw1.f("logged_in");
            gmw1.b("account_status", 4);
            return;
        } else
        {
            gmw1.b("account_status", 5);
            return;
        }
    }
}
