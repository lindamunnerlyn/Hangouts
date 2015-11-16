// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.views.MultiLineLayout;

public class efw
{

    final MultiLineLayout b;

    private efw(MultiLineLayout multilinelayout)
    {
        b = multilinelayout;
        super();
    }

    efw(MultiLineLayout multilinelayout, byte byte0)
    {
        this(multilinelayout);
    }

    public void a(int i)
    {
        b.getRootView();
        boolean flag = ebr.d();
        int j;
        int k;
        int l;
        int i1;
        int l1;
        int i2;
        int j2;
        if (flag)
        {
            l = b.getPaddingRight();
        } else
        {
            l = b.getPaddingLeft();
        }
        k = b.getPaddingTop();
        l1 = b.getPaddingLeft();
        i2 = b.getPaddingRight();
        j2 = b.getChildCount();
        i1 = 0;
        j = 0;
        while (i1 < j2) 
        {
            View view = b.getChildAt(i1);
            if (view.getVisibility() != 8)
            {
                a(view);
                int l2 = view.getMeasuredWidth();
                int k2 = view.getMeasuredHeight();
                int j1;
                if (l + l2 > i - l1 - i2)
                {
                    if (flag)
                    {
                        l = b.getPaddingRight();
                    } else
                    {
                        l = b.getPaddingLeft();
                    }
                    k += j;
                    j = l;
                    l = 0;
                } else
                {
                    int k1 = j;
                    j = l;
                    l = k1;
                }
                if (flag)
                {
                    j1 = b.getWidth() - j - l2;
                } else
                {
                    j1 = j;
                }
                a(view, j1, k, l2, k2);
                j1 = j + l2;
                j = Math.max(l, k2);
                l = j1;
            }
            i1++;
        }
    }

    protected void a(View view)
    {
    }

    protected void a(View view, int i, int j, int k, int l)
    {
    }
}
