// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;

final class ayh
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, hor, hou, hoy
{

    final avv a;
    private final Rect b = new Rect();
    private final View c;
    private Boolean d;

    ayh(avv avv1, View view)
    {
        a = avv1;
        super();
        d = null;
        c = view;
        avv.bF(avv1).a(this);
    }

    public void G_()
    {
        c.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public void a()
    {
        gng.a(c, this);
    }

    public void onGlobalLayout()
    {
        c.getWindowVisibleDisplayFrame(b);
        int i = c.getRootView().getHeight() - b.height() - eco.a(avv.bG(a));
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            i -= eco.b(avv.bH(a));
        }
        boolean flag;
        if (i > 250)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            avv.an(a).a(i);
        }
        if (avv.m(a).b().a() == 1 && !flag && d == null)
        {
            View view = a.getView();
            g.b(view.getContext()).toggleSoftInputFromWindow(view.getWindowToken(), 2, 0);
        }
        if ((d == null || g.a(d, false) != flag) && flag)
        {
            avv.an(a).b();
        }
        d = Boolean.valueOf(flag);
    }
}
