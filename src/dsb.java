// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dsb
{

    public static final String a = dse.getName();
    public static final String b = drj.getName();
    public static final String c = dra.getName();
    private static dsa d;

    public static void a(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new dsa();
        }
        hlp1.a(dse, new dse(context));
    }

    public static void b(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new dsa();
        }
        hlp1.a(drj, new drj(context));
    }

    public static void c(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new dsa();
        }
        hlp1.a(dra, new dra(context));
    }

}
