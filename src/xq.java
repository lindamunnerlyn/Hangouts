// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.ArrayList;

final class xq extends xt
{

    final xr a;
    final lr b;
    final View c;
    final xi d;

    xq(xi xi1, xr xr1, lr lr1, View view)
    {
        d = xi1;
        a = xr1;
        b = lr1;
        c = view;
        super();
    }

    public void a(View view)
    {
    }

    public void b(View view)
    {
        b.a(null);
        kb.c(c, 1.0F);
        kb.a(c, 0.0F);
        kb.b(c, 0.0F);
        d.g(a.b);
        d.g.remove(a.b);
        d.c();
    }
}
