// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class gnl
    implements gmz
{

    final gnj a;

    gnl(gnj gnj)
    {
        a = gnj;
        super();
    }

    public String a()
    {
        return "upgrade:active_to_logged_in";
    }

    public void a(Context context, gmw gmw1)
    {
        if (gmw1.d("active"))
        {
            gmw1.f("active");
            gmw1.b("logged_in", true);
        }
    }
}
