// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dla
{

    public static final String a = ber.getName();
    public static final String b = dkx.getName();
    public static final String c = amb.getName();
    private static dky d;

    public static void a(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new dky();
        }
        hlp1.a(dkx, d.a(context));
    }

    public static void a(hlp hlp1)
    {
        if (d == null)
        {
            d = new dky();
        }
        hlp1.a(ber, d.a());
    }

    public static void b(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new dky();
        }
        hlp1.a(amb, d.b(context));
    }

}
