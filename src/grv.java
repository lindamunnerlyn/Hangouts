// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class grv
    implements grg
{

    final grq a;

    grv(grq grq)
    {
        a = grq;
        super();
    }

    public String a()
    {
        return "add_effective_gaia_id";
    }

    public void a(Context context, grd grd1)
    {
        if (grd1.d("is_managed_account"))
        {
            grd1.b("effective_gaia_id", grd1.b("gaia_id"));
        }
    }
}
