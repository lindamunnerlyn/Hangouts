// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class bwv
    implements android.view.View.OnClickListener
{

    final boolean a;
    final bwr b;
    final String c;
    final String d;
    final String e;
    final int f;
    final bws g;

    bwv(bws bws1, boolean flag, bwr bwr, String s, String s1, String s2, int i)
    {
        g = bws1;
        a = flag;
        b = bwr;
        c = s;
        d = s1;
        e = s2;
        f = i;
        super();
    }

    public void onClick(View view)
    {
        bws.a(g, a, b, c, d, e, f);
    }
}
