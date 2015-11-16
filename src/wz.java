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

final class wz extends yc
{

    final ww a;
    private CharSequence c;
    private ListAdapter d;
    private final Rect e = new Rect();

    public wz(ww ww1, Context context, AttributeSet attributeset, int i)
    {
        a = ww1;
        super(context, attributeset, i);
        a(ww1);
        e();
        d();
        a(new xa(this, ww1));
    }

    static ListAdapter a(wz wz1)
    {
        return wz1.d;
    }

    static boolean a(wz wz1, View view)
    {
        return kb.z(view) && view.getGlobalVisibleRect(wz1.e);
    }

    static void b(wz wz1)
    {
        wz1.yc.c();
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
            drawable.getPadding(ww.b(a));
            int j;
            int k;
            if (vr.a(a))
            {
                i = ww.b(a).right;
            } else
            {
                i = -ww.b(a).left;
            }
        } else
        {
            Rect rect = ww.b(a);
            ww.b(a).right = 0;
            rect.left = 0;
            i = 0;
        }
        l = a.getPaddingLeft();
        i1 = a.getPaddingRight();
        j1 = a.getWidth();
        if (ww.c(a) == -2)
        {
            j = ww.a(a, (SpinnerAdapter)d, f());
            k = a.getContext().getResources().getDisplayMetrics().widthPixels - ww.b(a).left - ww.b(a).right;
            if (j > k)
            {
                j = k;
            }
            e(Math.max(j, j1 - l - i1));
        } else
        if (ww.c(a) == -1)
        {
            e(j1 - l - i1);
        } else
        {
            e(ww.c(a));
        }
        if (vr.a(a))
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
                xb xb1 = new xb(this);
                viewtreeobserver.addOnGlobalLayoutListener(xb1);
                a(new xc(this, xb1));
                return;
            }
        }
    }
}
