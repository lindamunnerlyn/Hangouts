// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class cie
    implements android.view.View.OnClickListener
{

    final View a;
    final cic b;

    cie(cic cic1, View view)
    {
        b = cic1;
        a = view;
        super();
    }

    public void onClick(View view)
    {
        eev.e("Babel", "contact permission banner declined");
        g.a(cic.b(b), 2672);
        a.setVisibility(8);
        aoc.j(cic.c(b), cic.b(b).h());
    }
}
