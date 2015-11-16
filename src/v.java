// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewTreeObserver;

final class v
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final View a;
    final x b;
    final int c;
    final Object d;
    final t e;

    v(t t1, View view, x x, int i, Object obj)
    {
        e = t1;
        a = view;
        b = x;
        c = i;
        d = obj;
        super();
    }

    public boolean onPreDraw()
    {
        a.getViewTreeObserver().removeOnPreDrawListener(this);
        t.a(e, b, c, d);
        return true;
    }
}
