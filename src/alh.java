// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class alh
{

    public static final String a = alm.getName();
    public static final String b = gxq.getName();
    public static final String c = ddm.getName();
    public static final String d = ali.getName();
    public static final String e = beb.getName();
    public static final String f = gmx.getName();
    private static alg g;

    public static void a(Context context, hgx hgx1)
    {
        if (g == null)
        {
            g = new alg();
        }
        hgx1.a(alm, g.a(hgx1, context));
    }

    public static void a(hgx hgx1)
    {
        if (g == null)
        {
            g = new alg();
        }
        hgx1.a(beb, g.a());
    }

    public static void b(Context context, hgx hgx1)
    {
        if (g == null)
        {
            g = new alg();
        }
        hgx1.a(gxq, g.b(hgx1, context));
    }

    public static void c(Context context, hgx hgx1)
    {
        if (g == null)
        {
            g = new alg();
        }
        hgx1.a(ddm, g.c(context));
    }

    public static void d(Context context, hgx hgx1)
    {
        if (g == null)
        {
            g = new alg();
        }
        hgx1.a(ali, g.a(context));
    }

    public static void e(Context context, hgx hgx1)
    {
        if (g == null)
        {
            g = new alg();
        }
        hgx1.a(gmx, g.b(context));
    }

}
