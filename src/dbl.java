// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dbl
{

    public static final String a = gmr.getName();
    public static final String b = gxq.getName();
    public static final String c = dbf.getName();
    private static dbk d;

    public static void a(Context context, hgx hgx1)
    {
        if (d == null)
        {
            d = new dbk();
        }
        hgx1.a(dbf, new dbf(context));
    }

    public static void a(hgx hgx1)
    {
        if (d == null)
        {
            d = new dbk();
        }
        hgx1.a(gmr, new gmr[] {
            (gmr)hgx1.a(dbf)
        });
    }

    public static void b(hgx hgx1)
    {
        if (d == null)
        {
            d = new dbk();
        }
        hgx1.a(gxq, new gxq[] {
            (gxq)hgx1.a(dbf)
        });
    }

}
