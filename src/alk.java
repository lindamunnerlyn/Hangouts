// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class alk
    implements gmz
{

    final ali a;

    alk(ali ali1)
    {
        a = ali1;
        super();
    }

    public String a()
    {
        return "cmm-signed-out2";
    }

    public void a(Context context, gmw gmw1)
    {
        if (gmw1.b("effective_gaia_id") != null && gmw1.d("is_business_features_enabled") && gmw1.b("full_jid") == null && gmw1.d("logged_in"))
        {
            dbf.f(ali.a(a).b(gmw1.b("account_name"), gmw1.b("effective_gaia_id")));
        }
    }
}
