// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class bwk
{

    public static final String a = gxq.getName();
    public static final String b = bwl.getName();
    public static final String c = bwf.getName();
    public static final String d = bwg.getName();
    private static bwj e;

    public static void a(Context context, hgx hgx1)
    {
        if (e == null)
        {
            e = new bwj();
        }
        hgx1.a(gxq, new gxq[] {
            (gxq)hgx.a(context, bwl)
        });
    }

    public static void b(Context context, hgx hgx1)
    {
        if (e == null)
        {
            e = new bwj();
        }
        hgx1.a(bwl, new bwl(context));
    }

    public static void c(Context context, hgx hgx1)
    {
        if (e == null)
        {
            e = new bwj();
        }
        hgx1.a(bwf, new bwi(context));
    }

    public static void d(Context context, hgx hgx1)
    {
        if (e == null)
        {
            e = new bwj();
        }
        hgx1.a(bwg, (bwg)hgx.a(context, bwl));
    }

}
