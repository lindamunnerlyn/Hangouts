// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gak
{

    public static final String a = gab.getName();
    public static final String b = gad.getName();
    public static final String c = gac.getName();
    private static gaj d;

    public static void a(Context context, hgx hgx1)
    {
        if (d == null)
        {
            d = new gaj();
        }
        hgx1.a(gab, new gag(context));
    }

    public static void a(hgx hgx1)
    {
        if (d == null)
        {
            d = new gaj();
        }
        hgx1.a(gad, new gai());
    }

    public static void b(hgx hgx1)
    {
        if (d == null)
        {
            d = new gaj();
        }
        hgx1.a(gac, new gah());
    }

}
