// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.internal.widget.ActionBarContextView;
import android.view.View;

final class rg extends mf
{

    final ra a;

    rg(ra ra1)
    {
        a = ra1;
        super();
    }

    public void a(View view)
    {
        a.p.setVisibility(0);
        a.p.sendAccessibilityEvent(32);
        if (a.p.getParent() != null)
        {
            kb.r((View)a.p.getParent());
        }
    }

    public void b(View view)
    {
        kb.c(a.p, 1.0F);
        a.s.a(null);
        a.s = null;
    }
}
