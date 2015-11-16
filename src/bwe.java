// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class bwe
{

    public static final String a = gbg.getName();
    public static final String b = beb.getName();
    private static bwd c;

    public static void a(Context context, hgx hgx1)
    {
        if (c == null)
        {
            c = new bwd();
        }
        hgx1.a(gbg, c.a(context));
    }

    public static void a(hgx hgx1)
    {
        if (c == null)
        {
            c = new bwd();
        }
        hgx1.a(beb, c.a());
    }

}
