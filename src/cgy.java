// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class cgy
    implements android.view.View.OnClickListener
{

    final View a;
    final cgw b;

    cgy(cgw cgw1, View view)
    {
        b = cgw1;
        a = view;
        super();
    }

    public void onClick(View view)
    {
        ebw.e("Babel", "contact permission banner declined");
        g.a(cgw.b(b), 2672);
        a.setVisibility(8);
        ank.j(cgw.c(b), cgw.b(b).h());
    }
}
