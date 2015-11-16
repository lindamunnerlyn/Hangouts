// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public final class alp extends ctf
{

    public alp()
    {
    }

    public ctg a()
    {
        return new alo();
    }

    public boolean a(Context context)
    {
        aoa aoa1 = dcn.e(((gqu)hlp.a(context, gqu)).a());
        if (aoa1 != null)
        {
            dbt dbt1 = (dbt)hlp.a(context.getApplicationContext(), dbt);
            boolean flag;
            if (g.a(aoa1, aqc.b) && !PreferenceManager.getDefaultSharedPreferences(context).getBoolean("call_promo_shown", false) && (!eey.e() || dbt1.a(context)) && !aoa1.Z() && dbt1.b(aoa1))
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
        return ctl.j;
    }

    public int c()
    {
        return g.jh;
    }
}
