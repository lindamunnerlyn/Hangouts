// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.ArrayList;

final class xn extends xr
{

    final xp a;
    final lr b;
    final xg c;

    xn(xg xg1, xp xp1, lr lr1)
    {
        c = xg1;
        a = xp1;
        b = lr1;
        super();
    }

    public void a(View view)
    {
    }

    public void b(View view)
    {
        b.a(null);
        kb.c(view, 1.0F);
        kb.a(view, 0.0F);
        kb.b(view, 0.0F);
        c.g(a.a);
        c.g.remove(a.a);
        c.c();
    }
}
