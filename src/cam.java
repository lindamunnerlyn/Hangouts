// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class cam
{

    public static final String a = bzu.getName();
    public static final String b = bzt.getName();
    public static final String c = bzw.getName();
    private static cak d;

    public static void a(Context context, hgx hgx1)
    {
        if (d == null)
        {
            d = new cak();
        }
        hgx1.a(bzu, new bzz(context));
    }

    public static void a(hgx hgx1)
    {
        if (d == null)
        {
            d = new cak();
        }
        hgx1.a(bzw, new caa());
    }

    public static void b(Context context, hgx hgx1)
    {
        if (d == null)
        {
            d = new cak();
        }
        hgx1.a(bzt, d.a(context));
    }

}
