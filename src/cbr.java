// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class cbr
{

    public static final String a = cax.getName();
    public static final String b = caw.getName();
    public static final String c = caz.getName();
    private static cbp d;

    public static void a(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new cbp();
        }
        hlp1.a(cax, new cbc(context));
    }

    public static void a(hlp hlp1)
    {
        if (d == null)
        {
            d = new cbp();
        }
        hlp1.a(caz, new cbd());
    }

    public static void b(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new cbp();
        }
        hlp1.a(caw, d.a(context));
    }

}
