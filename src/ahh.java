// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class ahh
    implements ahd
{

    private final gqz a;
    private final Context b;

    ahh(Context context)
    {
        b = context;
        a = (gqz)hlp.a(context, gqz);
    }

    private grb j(int k)
    {
        return a.a(k);
    }

    public boolean a(int k)
    {
        return b(k) || c(k);
    }

    public boolean b(int k)
    {
        grb grb1 = j(k);
        return dcn.j() && (grb1.d("is_sms_account") || grb1.d("sms_only"));
    }

    public boolean c(int k)
    {
        return j(k).d("is_gv_sms_integration_enabled");
    }

    public boolean d(int k)
    {
        grb grb1 = j(k);
        return grb1.a("is_gv_calling_available") && grb1.d("gv_use_tycho_branding");
    }

    public boolean e(int k)
    {
        return !j(k).a("allowed_for_domain", true);
    }

    public boolean f(int k)
    {
        return j(k).a("is_photo_service_enabled", true);
    }

    public boolean g(int k)
    {
        boolean flag = false;
        if (j(k).a("account_age_group", 0) == 3)
        {
            flag = true;
        }
        return flag;
    }

    public boolean h(int k)
    {
        boolean flag = false;
        k = j(k).a("account_age_group", 0);
        if (k == 3 || k == 2)
        {
            flag = true;
        }
        return flag;
    }

    public boolean i(int k)
    {
        grb grb1 = j(k);
        if (c(k) && d(k))
        {
            String s = grb1.b("account_name");
            ahe ahe1 = (ahe)hlp.b(b, ahe);
            if (ahe1 != null && ahe1.a(s))
            {
                k = 1;
            } else
            {
                k = 0;
            }
            if (k != 0 && grb1.b("effective_gaia_id") == null)
            {
                return true;
            }
        }
        return false;
    }
}
