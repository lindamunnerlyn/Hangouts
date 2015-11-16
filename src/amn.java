// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class amn
{

    public static final String a = amo.getName();
    public static final String b = gxq.getName();
    public static final String c = ank.getName();
    public static final String d = gmx.getName();
    private static amm e;

    public static void a(Context context, hgx hgx1)
    {
        if (e == null)
        {
            e = new amm();
        }
        hgx1.a(ank, new ank(context));
    }

    public static void a(hgx hgx1)
    {
        if (e == null)
        {
            e = new amm();
        }
        hgx1.a(amo, new amo[] {
            new aqm()
        });
    }

    public static void b(Context context, hgx hgx1)
    {
        if (e == null)
        {
            e = new amm();
        }
        hgx1.a(gmx, new gmx[] {
            (gmx)hgx.a(context, ank)
        });
    }

    public static void b(hgx hgx1)
    {
        if (e == null)
        {
            e = new amm();
        }
        hgx1.a(gxq, new gxq[] {
            (gxq)hgx1.a(ank)
        });
    }

}
