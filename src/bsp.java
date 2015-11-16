// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class bsp
{

    public static final String a = bsk.getName();
    public static final String b = bsl.getName();
    public static final String c = beb.getName();
    private static bsn d;

    public static void a(Context context, hgx hgx1)
    {
        if (d == null)
        {
            d = new bsn();
        }
        hgx1.a(bsk, d.a(context));
    }

    public static void a(hgx hgx1)
    {
        if (d == null)
        {
            d = new bsn();
        }
        hgx1.a(bsl, d.b());
    }

    public static void b(hgx hgx1)
    {
        if (d == null)
        {
            d = new bsn();
        }
        hgx1.a(beb, d.a());
    }

}
