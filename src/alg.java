// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class alg
    implements grg
{

    final alf a;

    alg(alf alf1)
    {
        a = alf1;
        super();
    }

    public String a()
    {
        return "cmm-signed-out";
    }

    public void a(Context context, grd grd1)
    {
        if (grd1.b("effective_gaia_id") != null && grd1.d("is_business_features_enabled"))
        {
            grd1.b("logged_in", true).b("logged_out", false);
            if (grd1.b("full_jid") == null)
            {
                dcn.f(a.a.b(grd1.b("account_name"), grd1.b("effective_gaia_id")));
            }
        }
    }
}
