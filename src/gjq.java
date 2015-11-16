// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class gjq extends gea
{

    private static final int a[] = {
        4
    };
    private final String b;

    gjq(Context context, String s)
    {
        super(context, a);
        b = s;
    }

    protected void a(jll jll1)
    {
        super.a(jll1);
        jll1.a = new jlk();
        jll1.a.k = b;
    }

}
