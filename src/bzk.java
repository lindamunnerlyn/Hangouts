// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class bzk
{

    public static final String a = gxm.getName();
    public static final String b = gxq.getName();
    public static final String c = bzl.getName();
    public static final String d = gnc.getName();
    public static final String e = gxl.getName();
    public static final String f = bzb.getName();
    public static final String g = bzc.getName();
    private static bzj h;

    public static void a(Context context, hgx hgx1)
    {
        if (h == null)
        {
            h = new bzj();
        }
        hgx1.a(gxq, new gxq[] {
            (gxq)hgx.a(context, bzl)
        });
    }

    public static void a(hgx hgx1)
    {
        if (h == null)
        {
            h = new bzj();
        }
        hgx1.a(gxm, new gxm[] {
            new bzh()
        });
    }

    public static void b(Context context, hgx hgx1)
    {
        if (h == null)
        {
            h = new bzj();
        }
        hgx1.a(bzl, new bzl(context));
    }

    public static void b(hgx hgx1)
    {
        if (h == null)
        {
            h = new bzj();
        }
        hgx1.a(gnc, new gnc[] {
            new bzs()
        });
    }

    public static void c(hgx hgx1)
    {
        if (h == null)
        {
            h = new bzj();
        }
        hgx1.a(gxl, new bzi());
    }

    public static void d(hgx hgx1)
    {
        if (h == null)
        {
            h = new bzj();
        }
        hgx1.a(bzb, new bzo());
    }

    public static void e(hgx hgx1)
    {
        if (h == null)
        {
            h = new bzj();
        }
        hgx1.a(bzc, new bzq());
    }

}
