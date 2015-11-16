// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public final class als extends cqv
{

    public als()
    {
    }

    public cqw a()
    {
        return new alr();
    }

    public boolean a(Context context)
    {
        ani ani1 = dbf.e(((gmo)hgx.a(context, gmo)).a());
        if (ani1 != null)
        {
            dan dan1 = (dan)hgx.a(context.getApplicationContext(), dan);
            boolean flag;
            if (g.a(ani1, apk.b) && !PreferenceManager.getDefaultSharedPreferences(context).getBoolean("call_promo_shown", false) && (!ebz.e() || dan1.a(context)) && !ani1.ac() && dan1.b(ani1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    public int b()
    {
        return crb.j;
    }

    public int c()
    {
        return g.jp;
    }
}
