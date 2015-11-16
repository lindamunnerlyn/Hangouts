// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class cqd
{

    public static final String a = cpx.getName();
    public static final String b = cqv.getName();
    public static final String c = beb.getName();
    private static cqc d;

    public static void a(Context context, hgx hgx1)
    {
        if (d == null)
        {
            d = new cqc();
        }
        hgx1.a(cpx, d.a(context));
    }

    public static void a(hgx hgx1)
    {
        if (d == null)
        {
            d = new cqc();
        }
        hgx1.a(beb, d.a());
    }

    public static void b(Context context, hgx hgx1)
    {
        if (d == null)
        {
            d = new cqc();
        }
        hgx1.a(cqv, d.b(context));
    }

}
