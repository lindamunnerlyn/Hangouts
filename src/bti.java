// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class bti
    implements android.view.View.OnClickListener
{

    final gmt a;
    final btf b;

    bti(btf btf1, gmt gmt1)
    {
        b = btf1;
        a = gmt1;
        super();
    }

    public void onClick(View view)
    {
        g.b(264);
        b.a.c(a.a());
    }
}
