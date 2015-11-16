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
import cja;
import cjb;
import cjc;

public class ScrollViewCustom extends ScrollView
{

    public int a;
    public Handler b;
    public boolean c;
    public Runnable d;
    private int e;
    private ObjectAnimator f;

    public ScrollViewCustom(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0x7fffffff;
        b = new Handler();
        d = new cjc(this);
        context = context.obtainStyledAttributes(attributeset, cja.H);
        a = context.getDimensionPixelSize(cja.I, a);
        e = context.getDimensionPixelSize(cja.J, e);
        context.recycle();
        if (f == null)
        {
            f = ObjectAnimator.ofInt(this, "height", new int[] {
                0, 0
            });
            f.addListener(new cjb(this));
            f.setDuration(200L);
            f.setTarget(this);
        }
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    public void a(int i)
    {
        a = i;
        requestLayout();
    }

    protected void onMeasure(int i, int j)
    {
        int k = getChildAt(0).getMeasuredHeight();
        k = Math.min(a, Math.max(e, k));
        super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(Math.min(a, android.view.View.MeasureSpec.getSize(j)), android.view.View.MeasureSpec.getMode(j)));
        if (k != getMeasuredHeight() && !c)
        {
            c = true;
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
