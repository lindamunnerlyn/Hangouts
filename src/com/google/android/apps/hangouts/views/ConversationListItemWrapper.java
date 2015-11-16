// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import aia;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bya;
import ecv;
import edp;
import edq;
import h;

public class ConversationListItemWrapper extends LinearLayout
    implements bya
{

    final Runnable a = new edp(this);
    private int b;
    private View c;
    private View d;
    private View e;
    private View f;

    public ConversationListItemWrapper(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = -1;
    }

    public static View a(ConversationListItemWrapper conversationlistitemwrapper)
    {
        return conversationlistitemwrapper.c;
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
        ((FrameLayout)findViewById(h.as)).addView(view);
        c = view;
    }

    public boolean b()
    {
        return c instanceof ecv;
    }

    public void c()
    {
        Runnable runnable = a;
        ObjectAnimator objectanimator = ObjectAnimator.ofInt(this, "animatedHeight", new int[] {
            getMeasuredHeight(), 0
        });
        objectanimator.setInterpolator(new aia((byte)0));
        objectanimator.setDuration(200L);
        objectanimator.addListener(new edq(this, runnable));
        objectanimator.start();
    }

    public void d()
    {
        d.setVisibility(8);
    }

    public View e()
    {
        return c;
    }

    public void f()
    {
        b = -1;
        c.setTranslationX(0.0F);
        c.setAlpha(1.0F);
        setAlpha(1.0F);
        d();
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        d = findViewById(h.ap);
        e = findViewById(h.aq);
        f = findViewById(h.ar);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (b == -1)
        {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        } else
        {
            setMeasuredDimension(getMeasuredWidth(), b);
            return;
        }
    }

    public void setAnimatedHeight(int i)
    {
        b = i;
        requestLayout();
    }
}
