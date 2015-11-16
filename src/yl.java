// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.PopupWindow;

final class yl
    implements android.widget.AbsListView.OnScrollListener
{

    final yc a;

    yl(yc yc1)
    {
        a = yc1;
        super();
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 1 && !a.o() && yc.b(a).getContentView() != null)
        {
            yc.d(a).removeCallbacks(yc.c(a));
            yc.c(a).run();
        }
    }
}
