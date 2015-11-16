// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dpi
{

    public static final String a = dpl.getName();
    public static final String b = doq.getName();
    public static final String c = doh.getName();
    private static dph d;

    public static void a(Context context, hgx hgx1)
    {
        if (d == null)
        {
            d = new dph();
        }
        hgx1.a(dpl, new dpl(context));
    }

    public static void b(Context context, hgx hgx1)
    {
        if (d == null)
        {
            d = new dph();
        }
        hgx1.a(doq, new doq(context));
    }

    public static void c(Context context, hgx hgx1)
    {
        if (d == null)
        {
            d = new dph();
        }
        hgx1.a(doh, new doh(context));
    }

}
