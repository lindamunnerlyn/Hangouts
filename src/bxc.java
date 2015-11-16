// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class bxc
{

    public static final String a = hcb.getName();
    public static final String b = bxd.getName();
    public static final String c = bwz.getName();
    private static bxb d;

    public static void a(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new bxb();
        }
        hlp1.a(hcb, new hcb[] {
            (hcb)hlp.a(context, bxd)
        });
    }

    public static void b(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new bxb();
        }
        hlp1.a(bxd, new bxd(context));
    }

    public static void c(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new bxb();
        }
        hlp1.a(bwz, (bwz)hlp.a(context, bxd));
    }

}
