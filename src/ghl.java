// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class ghl extends gea
{

    private static final int a[] = {
        2
    };
    private final geb b;
    private final gfh c;

    public ghl(Context context, geb geb1)
    {
        super(context, a);
        b = geb1;
        c = new gfh(context);
    }

    public void a(jll jll1)
    {
        super.a(jll1);
        gmq gmq1 = b.d();
        jll1.a = new jlk();
        jll1.a.k = gmq1.c();
        jll1.a.b = gmq1.d();
        jll1.g = new iui();
        jll1.g.d = Integer.valueOf(c.a());
    }

}
