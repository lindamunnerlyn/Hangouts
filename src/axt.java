// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;

final class axt
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, fsn, hjx, hka
{

    final ave a;
    private final Rect b = new Rect();
    private final View c;
    private Boolean d;

    axt(ave ave1, View view)
    {
        a = ave1;
        super();
        d = null;
        c = view;
        ave.bI(ave1).a(this);
    }

    public void E_()
    {
        c.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public void a()
    {
        gke.a(c, this);
    }

    public void onGlobalLayout()
    {
        c.getWindowVisibleDisplayFrame(b);
        int i = c.getRootView().getHeight() - b.height() - dzk.a(ave.bJ(a));
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            i -= dzk.b(ave.bK(a));
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
            ave.am(a).a(i);
        }
        if (ave.o(a).b().a() == 1 && !flag && d == null)
        {
            View view = a.getView();
            g.b(view.getContext()).toggleSoftInputFromWindow(view.getWindowToken(), 2, 0);
        }
        if ((d == null || g.a(d, false) != flag) && flag)
        {
            ave.am(a).b();
        }
        d = Boolean.valueOf(flag);
    }
}
