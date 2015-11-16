// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class bvz
{

    public static final String a = bvu.getName();
    public static final String b = bvt.getName();
    public static final String c = cpl.getName();
    public static final String d = cbh.getName();
    private static bvy e;

    public static void a(Context context, hgx hgx1)
    {
        if (e == null)
        {
            e = new bvy();
        }
        hgx1.a(cpl, new cpl[] {
            (cpl)hgx.a(context, bvu)
        });
    }

    public static void a(hgx hgx1)
    {
        if (e == null)
        {
            e = new bvy();
        }
        hgx1.a(bvu, new bvw());
    }

    public static void b(hgx hgx1)
    {
        if (e == null)
        {
            e = new bvy();
        }
        hgx1.a(bvt, new bwa());
    }

    public static void c(hgx hgx1)
    {
        if (e == null)
        {
            e = new bvy();
        }
        hgx1.a(cbh, new cbh[] {
            new bvv()
        });
    }

}
