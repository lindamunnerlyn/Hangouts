// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

final class u
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final View a;
    final Object b;
    final ArrayList c;
    final x d;
    final boolean e;
    final ad f;
    final ad g;
    final t h;

    u(t t1, View view, Object obj, ArrayList arraylist, x x1, boolean flag, ad ad, 
            ad ad1)
    {
        h = t1;
        a = view;
        b = obj;
        c = arraylist;
        d = x1;
        e = flag;
        f = ad;
        g = ad1;
        super();
    }

    public boolean onPreDraw()
    {
        a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (b != null)
        {
            g.a(b, c);
            c.clear();
            gz gz = t.a(h, d, e, f);
            g.a(b, d.d, gz, c);
            t.a(h, gz, d);
            t.a(f, g, e, gz);
        }
        return true;
    }
}
