// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.PopupWindow;

final class yj
    implements android.widget.AbsListView.OnScrollListener
{

    final ya a;

    yj(ya ya1)
    {
        a = ya1;
        super();
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 1 && !a.o() && ya.b(a).getContentView() != null)
        {
            ya.d(a).removeCallbacks(ya.c(a));
            ya.c(a).run();
        }
    }
}
