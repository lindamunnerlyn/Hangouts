// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.ArrayList;

final class xo extends xt
{

    final zs a;
    final int b;
    final int c;
    final lr d;
    final xi e;

    xo(xi xi1, zs zs, int i, int j, lr lr1)
    {
        e = xi1;
        a = zs;
        b = i;
        c = j;
        d = lr1;
        super();
    }

    public void a(View view)
    {
    }

    public void b(View view)
    {
        d.a(null);
        e.e(a);
        e.e.remove(a);
        e.c();
    }

    public void c(View view)
    {
        if (b != 0)
        {
            kb.a(view, 0.0F);
        }
        if (c != 0)
        {
            kb.b(view, 0.0F);
        }
    }
}
