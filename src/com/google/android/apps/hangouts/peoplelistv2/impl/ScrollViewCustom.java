// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.peoplelistv2.impl;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import chu;
import chv;
import chw;

public class ScrollViewCustom extends ScrollView
{

    public Runnable a;
    private int b;
    private int c;
    private Handler d;
    private boolean e;
    private ObjectAnimator f;

    public ScrollViewCustom(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = 0x7fffffff;
        d = new Handler();
        a = new chw(this);
        context = context.obtainStyledAttributes(attributeset, chu.H);
        b = context.getDimensionPixelSize(chu.I, b);
        c = context.getDimensionPixelSize(chu.J, c);
        context.recycle();
        if (f == null)
        {
            f = ObjectAnimator.ofInt(this, "height", new int[] {
                0, 0
            });
            f.addListener(new chv(this));
            f.setDuration(200L);
            f.setTarget(this);
        }
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    public static Handler a(ScrollViewCustom scrollviewcustom)
    {
        return scrollviewcustom.d;
    }

    public static boolean a(ScrollViewCustom scrollviewcustom, boolean flag)
    {
        scrollviewcustom.e = flag;
        return flag;
    }

    public static int b(ScrollViewCustom scrollviewcustom)
    {
        return scrollviewcustom.b;
    }

    protected void onMeasure(int i, int j)
    {
        int k = getChildAt(0).getMeasuredHeight();
        k = Math.min(b, Math.max(c, k));
        super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(Math.min(b, android.view.View.MeasureSpec.getSize(j)), android.view.View.MeasureSpec.getMode(j)));
        if (k != getMeasuredHeight() && !e)
        {
            e = true;
            f.setIntValues(new int[] {
                getMeasuredHeight(), k
            });
            f.start();
        }
    }

    public void setHeight(int i)
    {
        android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
        layoutparams.height = i;
        setLayoutParams(layoutparams);
        requestLayout();
    }
}
