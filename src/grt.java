// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class grt
    implements grg
{

    final grq a;

    grt(grq grq)
    {
        a = grq;
        super();
    }

    public String a()
    {
        return "upgrade:active_to_logged_in";
    }

    public void a(Context context, grd grd1)
    {
        if (grd1.d("active"))
        {
            grd1.f("active");
            grd1.b("logged_in", true);
        }
    }
}
