// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class fyq
{

    public static final String a = fyd.getName();
    public static final String b = fye.getName();
    public static final String c = fyj.getName();
    private static fyp d;

    public static void a(Context context, hgx hgx1)
    {
        if (d == null)
        {
            d = new fyp();
        }
        hgx1.a(fyd, new fyn(context));
    }

    public static void a(hgx hgx1)
    {
        if (d == null)
        {
            d = new fyp();
        }
        hgx1.a(fye, new fyo());
    }

    public static void b(hgx hgx1)
    {
        if (d == null)
        {
            d = new fyp();
        }
        hgx1.a(fyj, new fyx());
    }

}
