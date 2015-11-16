// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gyl
{

    public static final String a = gxj.getName();
    public static final String b = gxx.getName();
    public static final String c = gmr.getName();
    public static final String d = gyf.getName();
    public static final String e = gwq.getName();
    public static final String f = gxa.getName();
    public static final String g = gxi.getName();
    private static gyk h;

    public static void a(Context context, hgx hgx1)
    {
        if (h == null)
        {
            h = new gyk();
        }
        hgx1.a(gxx, new gxx(context));
    }

    public static void a(hgx hgx1)
    {
        if (h == null)
        {
            h = new gyk();
        }
        hgx1.a(gxj, new gym());
    }

    public static void b(Context context, hgx hgx1)
    {
        if (h == null)
        {
            h = new gyk();
        }
        hgx1.a(gyf, new gyf(context));
    }

    public static void b(hgx hgx1)
    {
        if (h == null)
        {
            h = new gyk();
        }
        hgx1.a(gmr, new gmr[] {
            (gyf)hgx1.a(gyf)
        });
    }

    public static void c(Context context, hgx hgx1)
    {
        if (h == null)
        {
            h = new gyk();
        }
        hgx1.a(gxa, (gxa)hgx.a(context, gyf));
    }

    public static void c(hgx hgx1)
    {
        if (h == null)
        {
            h = new gyk();
        }
        hgx1.a(gwq, new gxv());
    }

    public static void d(hgx hgx1)
    {
        if (h == null)
        {
            h = new gyk();
        }
        hgx1.a(gxi, new gyq());
    }

}
