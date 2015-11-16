// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;

final class wx extends ya
{

    final wu a;
    private CharSequence c;
    private ListAdapter d;
    private final Rect e = new Rect();

    public wx(wu wu1, Context context, AttributeSet attributeset, int i)
    {
        a = wu1;
        super(context, attributeset, i);
        a(wu1);
        e();
        d();
        a(new wy(this, wu1));
    }

    static ListAdapter a(wx wx1)
    {
        return wx1.d;
    }

    static boolean a(wx wx1, View view)
    {
        return kb.y(view) && view.getGlobalVisibleRect(wx1.e);
    }

    static void b(wx wx1)
    {
        wx1.ya.c();
    }

    public CharSequence a()
    {
        return c;
    }

    public void a(ListAdapter listadapter)
    {
        super.a(listadapter);
        d = listadapter;
    }

    public void a(CharSequence charsequence)
    {
        c = charsequence;
    }

    void b()
    {
        Drawable drawable = f();
        int i;
        int l;
        int i1;
        int j1;
        if (drawable != null)
        {
            drawable.getPadding(wu.b(a));
            int j;
            int k;
            if (vp.a(a))
            {
                i = wu.b(a).right;
            } else
            {
                i = -wu.b(a).left;
            }
        } else
        {
            Rect rect = wu.b(a);
            wu.b(a).right = 0;
            rect.left = 0;
            i = 0;
        }
        l = a.getPaddingLeft();
        i1 = a.getPaddingRight();
        j1 = a.getWidth();
        if (wu.c(a) == -2)
        {
            j = wu.a(a, (SpinnerAdapter)d, f());
            k = a.getContext().getResources().getDisplayMetrics().widthPixels - wu.b(a).left - wu.b(a).right;
            if (j > k)
            {
                j = k;
            }
            e(Math.max(j, j1 - l - i1));
        } else
        if (wu.c(a) == -1)
        {
            e(j1 - l - i1);
        } else
        {
            e(wu.c(a));
        }
        if (vp.a(a))
        {
            i = (j1 - i1 - j()) + i;
        } else
        {
            i += l;
        }
        a(i);
    }

    public void c()
    {
        boolean flag = n();
        b();
        l();
        super.c();
        p().setChoiceMode(1);
        f(a.getSelectedItemPosition());
        ViewTreeObserver viewtreeobserver;
        if (!flag)
        {
            if ((viewtreeobserver = a.getViewTreeObserver()) != null)
            {
                wz wz1 = new wz(this);
                viewtreeobserver.addOnGlobalLayoutListener(wz1);
                a(new xa(this, wz1));
                return;
            }
        }
    }
}
