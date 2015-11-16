// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class bwy
{

    public static final String a = gdu.getName();
    public static final String b = ber.getName();
    private static bwx c;

    public static void a(Context context, hlp hlp1)
    {
        if (c == null)
        {
            c = new bwx();
        }
        hlp1.a(gdu, c.a(context));
    }

    public static void a(hlp hlp1)
    {
        if (c == null)
        {
            c = new bwx();
        }
        hlp1.a(ber, c.a());
    }

}
