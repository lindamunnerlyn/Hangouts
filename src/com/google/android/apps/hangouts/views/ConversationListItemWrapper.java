// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import aht;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bzd;
import efx;
import egr;
import egs;
import h;

public class ConversationListItemWrapper extends LinearLayout
    implements bzd
{

    public View a;
    final Runnable b = new egr(this);
    private int c;
    private View d;
    private View e;
    private View f;

    public ConversationListItemWrapper(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = -1;
    }

    public View a()
    {
        return e();
    }

    public void a(int i)
    {
        byte byte1 = 8;
        d.setVisibility(0);
        View view = e;
        byte byte0;
        if (i < 0)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
        view = f;
        if (i > 0)
        {
            i = byte1;
        } else
        {
            i = 0;
        }
        view.setVisibility(i);
    }

    public void a(View view)
    {
        ((FrameLayout)findViewById(h.an)).addView(view);
        a = view;
    }

    public boolean b()
    {
        return a instanceof efx;
    }

    public void c()
    {
        Runnable runnable = b;
        ObjectAnimator objectanimator = ObjectAnimator.ofInt(this, "animatedHeight", new int[] {
            getMeasuredHeight(), 0
        });
        objectanimator.setInterpolator(new aht((byte)0));
        objectanimator.setDuration(200L);
        objectanimator.addListener(new egs(this, runnable));
        objectanimator.start();
    }

    public void d()
    {
        d.setVisibility(8);
    }

    public View e()
    {
        return a;
    }

    public void f()
    {
        c = -1;
        a.setTranslationX(0.0F);
        a.setAlpha(1.0F);
        setAlpha(1.0F);
        d();
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        d = findViewById(h.ak);
        e = findViewById(h.al);
        f = findViewById(h.am);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (c == -1)
        {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        } else
        {
            setMeasuredDimension(getMeasuredWidth(), c);
            return;
        }
    }

    public void setAnimatedHeight(int i)
    {
        c = i;
        requestLayout();
    }
}
