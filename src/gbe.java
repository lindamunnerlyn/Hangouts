// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gbe
{

    public static final String a = gar.getName();
    public static final String b = gas.getName();
    public static final String c = gax.getName();
    private static gbd d;

    public static void a(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new gbd();
        }
        hlp1.a(gar, new gbb(context));
    }

    public static void a(hlp hlp1)
    {
        if (d == null)
        {
            d = new gbd();
        }
        hlp1.a(gas, new gbc());
    }

    public static void b(hlp hlp1)
    {
        if (d == null)
        {
            d = new gbd();
        }
        hlp1.a(gax, new gbl());
    }

}
