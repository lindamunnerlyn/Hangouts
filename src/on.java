// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.widget.DrawerLayout;
import android.view.View;

final class on
    implements Runnable
{

    final om a;

    on(om om1)
    {
        a = om1;
        super();
    }

    public void run()
    {
        int i = 0;
        om om1 = a;
        int j = om1.b.b();
        View view;
        boolean flag;
        if (om1.a == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            view = om1.c.b(3);
            if (view != null)
            {
                i = -view.getWidth();
            }
            i += j;
        } else
        {
            view = om1.c.b(5);
            i = om1.c.getWidth();
            i -= j;
        }
        if (view != null && (flag && view.getLeft() < i || !flag && view.getLeft() > i) && om1.c.a(view) == 0)
        {
            oj oj1 = (oj)view.getLayoutParams();
            om1.b.a(view, i, view.getTop());
            oj1.c = true;
            om1.c.invalidate();
            om1.b();
            om1.c.g();
        }
    }
}
