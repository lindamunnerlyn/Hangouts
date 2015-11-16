// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class bwi
{

    public static final String a = goh.getName();
    public static final String b = gog.getName();
    private static bwf c;

    public static void a(Context context, hlp hlp1)
    {
        if (c == null)
        {
            c = new bwf();
        }
        hlp1.a(goh, c.b(context));
    }

    public static void b(Context context, hlp hlp1)
    {
        if (c == null)
        {
            c = new bwf();
        }
        hlp1.a(gog, c.a(context));
    }

}
