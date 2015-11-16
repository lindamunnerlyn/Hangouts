// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

final class aks extends ctf
{

    aks()
    {
    }

    public ctg a()
    {
        return akn.a(true, eey.g());
    }

    public boolean a(Context context)
    {
        int i = ((gqu)hlp.a(context, gqu)).a();
        if (i == -1)
        {
            return false;
        }
        if (((gqz)hlp.a(context, gqz)).a(i).a("callerid_promo_shown", false) || !g.a(i, eey.g()))
        {
            return false;
        }
        NetworkInfo networkinfo = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        return networkinfo != null && networkinfo.isConnected() && !g.a(context, "babel_dialer_disable_promos_for_callerid", false) && g.a(context, i);
    }

    public int b()
    {
        return ctl.k;
    }

    public int c()
    {
        return g.iy;
    }
}
