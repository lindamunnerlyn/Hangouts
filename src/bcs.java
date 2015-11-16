// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.conversation.v2.stickerpicker.impl.SlidingTabLayout;

public final class bcs
    implements lg
{

    final SlidingTabLayout a;
    private int b;

    public bcs(SlidingTabLayout slidingtablayout)
    {
        a = slidingtablayout;
        super();
    }

    public void a(int i)
    {
        if (b == 0)
        {
            a.c.a(i, 0.0F);
            a.b(i, 0);
        }
        int j = 0;
        while (j < a.c.getChildCount()) 
        {
            View view = a.c.getChildAt(j);
            boolean flag;
            if (i == j)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setSelected(flag);
            j++;
        }
        if (a.b != null)
        {
            a.b.a(i);
        }
    }

    public void a(int i, float f, int j)
    {
        int k = a.c.getChildCount();
        if (k != 0 && i >= 0 && i < k)
        {
            a.c.a(i, f);
            View view = a.c.getChildAt(i);
            int l;
            if (view != null)
            {
                l = (int)((float)view.getWidth() * f);
            } else
            {
                l = 0;
            }
            a.b(i, l);
            if (a.b != null)
            {
                a.b.a(i, f, j);
                return;
            }
        }
    }

    public void b(int i)
    {
        b = i;
        if (a.b != null)
        {
            a.b.b(i);
        }
    }
}
