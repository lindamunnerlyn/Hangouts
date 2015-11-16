// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.floatingactionbutton.impl;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import bfp;
import bfq;

public class QuickButtonContainer extends FrameLayout
{

    public boolean a;
    public boolean b;
    public Animator c;
    public int d;
    public android.animation.Animator.AnimatorListener e;
    private android.animation.ValueAnimator.AnimatorUpdateListener f;

    public QuickButtonContainer(Context context)
    {
        super(context);
        f = new bfp(this);
        e = new bfq(this);
    }

    public QuickButtonContainer(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = new bfp(this);
        e = new bfq(this);
    }

    public QuickButtonContainer(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        f = new bfp(this);
        e = new bfq(this);
    }

    public QuickButtonContainer(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        f = new bfp(this);
        e = new bfq(this);
    }

    public android.animation.ValueAnimator.AnimatorUpdateListener a()
    {
        return f;
    }

    public android.animation.Animator.AnimatorListener b()
    {
        return e;
    }

    public boolean isClickable()
    {
        return getVisibility() != 8;
    }
}
