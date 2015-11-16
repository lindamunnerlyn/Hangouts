// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gsl
{

    public static final String a = gro.getName();
    public static final String b = grj.getName();
    public static final String c = gqz.getName();
    public static final String d = grk.getName();
    public static final String e = gxm.getName();
    public static final String f = hmy.getName();
    private static gsk g;

    public static void a(Context context, hlp hlp1)
    {
        if (g == null)
        {
            g = new gsk();
        }
        hlp1.a(grj, gsk.a(context, (fzu)hlp1.a(fzu)));
    }

    public static void a(hlp hlp1)
    {
        if (g == null)
        {
            g = new gsk();
        }
        hlp1.a(gro, gsk.a((gqz)hlp1.a(gqz)));
    }

    public static void b(Context context, hlp hlp1)
    {
        if (g == null)
        {
            g = new gsk();
        }
        hlp1.a(gqz, gsk.a(context));
    }

    public static void b(hlp hlp1)
    {
        if (g == null)
        {
            g = new gsk();
        }
        hlp1.a(gro);
        hlp1.a(gxm, gsk.b());
    }

    public static void c(Context context, hlp hlp1)
    {
        if (g == null)
        {
            g = new gsk();
        }
        hlp1.a(grk, gsk.b(context));
    }

    public static void c(hlp hlp1)
    {
        if (g == null)
        {
            g = new gsk();
        }
        hlp1.a(gro);
        hlp1.a(hmy, gsk.a());
    }

}
