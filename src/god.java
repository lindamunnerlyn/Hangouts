// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class god
{

    public static final String a = gnh.getName();
    public static final String b = gnc.getName();
    public static final String c = gms.getName();
    public static final String d = gnd.getName();
    public static final String e = gta.getName();
    public static final String f = hig.getName();
    private static goc g;

    public static void a(Context context, hgx hgx1)
    {
        if (g == null)
        {
            g = new goc();
        }
        hgx1.a(gnc, goc.a(context, (fxq)hgx1.a(fxq)));
    }

    public static void a(hgx hgx1)
    {
        if (g == null)
        {
            g = new goc();
        }
        hgx1.a(gnh, goc.a((gms)hgx1.a(gms)));
    }

    public static void b(Context context, hgx hgx1)
    {
        if (g == null)
        {
            g = new goc();
        }
        hgx1.a(gms, goc.a(context));
    }

    public static void b(hgx hgx1)
    {
        if (g == null)
        {
            g = new goc();
        }
        hgx1.a(gnh);
        hgx1.a(gta, goc.b());
    }

    public static void c(Context context, hgx hgx1)
    {
        if (g == null)
        {
            g = new goc();
        }
        hgx1.a(gnd, goc.b(context));
    }

    public static void c(hgx hgx1)
    {
        if (g == null)
        {
            g = new goc();
        }
        hgx1.a(gnh);
        hgx1.a(hig, goc.a());
    }

}
