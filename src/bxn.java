// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class bxn
    implements android.view.View.OnClickListener
{

    final boolean a;
    final bxi b;
    final String c;
    final String d;
    final int e;
    final bxm f;

    bxn(bxm bxm1, boolean flag, bxi bxi, String s, String s1, int i)
    {
        f = bxm1;
        a = flag;
        b = bxi;
        c = s;
        d = s1;
        e = i;
        super();
    }

    public void onClick(View view)
    {
        bxm.a(f, a, b, c, d, e);
    }
}
