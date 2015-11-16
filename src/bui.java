// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class bui
{

    public static final String a = btu.getName();
    public static final String b = bsh.getName();
    public static final String c = beb.getName();
    public static final String d = bts.getName();
    private static buf e;

    public static void a(Context context, hgx hgx1)
    {
        if (e == null)
        {
            e = new buf();
        }
        hgx1.a(btu, e.a(context));
    }

    public static void a(hgx hgx1)
    {
        if (e == null)
        {
            e = new buf();
        }
        hgx1.a(beb, e.a());
    }

    public static void b(Context context, hgx hgx1)
    {
        if (e == null)
        {
            e = new buf();
        }
        hgx1.a(bsh, e.c(context));
    }

    public static void c(Context context, hgx hgx1)
    {
        if (e == null)
        {
            e = new buf();
        }
        hgx1.a(bts, e.b(context));
    }

}
