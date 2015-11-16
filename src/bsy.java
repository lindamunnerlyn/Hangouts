// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class bsy
{

    public static final String a = bst.getName();
    public static final String b = bsu.getName();
    public static final String c = ber.getName();
    private static bsw d;

    public static void a(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new bsw();
        }
        hlp1.a(bst, d.a(context));
    }

    public static void a(hlp hlp1)
    {
        if (d == null)
        {
            d = new bsw();
        }
        hlp1.a(bsu, d.b());
    }

    public static void b(hlp hlp1)
    {
        if (d == null)
        {
            d = new bsw();
        }
        hlp1.a(ber, d.a());
    }

}
