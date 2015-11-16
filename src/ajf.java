// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class ajf
{

    ajf()
    {
    }

    static int a(Context context, int i, int j)
    {
        context = ((gms)hgx.a(context, gms)).a(i);
        if (context.a("app_upgrade_version_code", 0) < j)
        {
            return 0;
        } else
        {
            return context.a("app_upgrade_type", 0);
        }
    }

    static String a(Context context, int i)
    {
        return ((gms)hgx.a(context, gms)).a(i).a("app_upgrade_url", "");
    }

    static void a(gmw gmw1, String s, int i, boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 1;
        }
        gmw1.b("app_upgrade_type", byte0);
        gmw1.b("app_upgrade_url", s);
        gmw1.b("app_upgrade_version_code", i);
    }
}
