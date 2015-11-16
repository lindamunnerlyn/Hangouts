// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.widget.DrawerLayout;
import android.view.View;

final class op
    implements Runnable
{

    final oo a;

    op(oo oo1)
    {
        a = oo1;
        super();
    }

    public void run()
    {
        int i = 0;
        oo oo1 = a;
        int j = oo1.b.b();
        View view;
        boolean flag;
        if (oo1.a == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            view = oo1.c.b(3);
            if (view != null)
            {
                i = -view.getWidth();
            }
            i += j;
        } else
        {
            view = oo1.c.b(5);
            i = oo1.c.getWidth();
            i -= j;
        }
        if (view != null && (flag && view.getLeft() < i || !flag && view.getLeft() > i) && oo1.c.a(view) == 0)
        {
            ol ol1 = (ol)view.getLayoutParams();
            oo1.b.a(view, i, view.getTop());
            ol1.c = true;
            oo1.c.invalidate();
            oo1.b();
            oo1.c.g();
        }
    }
}
