// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class crg
{

    public static final String a = crd.getName();
    public static final String b = beb.getName();
    public static final String c = crj.getName();
    private static crf d;

    public static void a(Context context, hgx hgx1)
    {
        if (d == null)
        {
            d = new crf();
        }
        hgx1.a(crd, d.a(context));
    }

    public static void a(hgx hgx1)
    {
        if (d == null)
        {
            d = new crf();
        }
        hgx1.a(beb, d.a());
    }

    public static void b(hgx hgx1)
    {
        if (d == null)
        {
            d = new crf();
        }
        hgx1.a(crj, d.b());
    }

}
