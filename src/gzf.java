// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gzf
{

    public static final String a = gzd.getName();
    public static final String b = gzm.getName();
    public static final String c = gue.getName();
    private static gze d;

    public static void a(Context context, hgx hgx1)
    {
        if (d == null)
        {
            d = new gze();
        }
        hgx1.a(gzd, new gzd(context));
    }

    public static void a(hgx hgx1)
    {
        if (d == null)
        {
            d = new gze();
        }
        hgx1.a(gue, new gue[] {
            gzc.a
        });
    }

    public static void b(Context context, hgx hgx1)
    {
        if (d == null)
        {
            d = new gze();
        }
        hgx1.a(gzm, new gzn(context));
    }

}
