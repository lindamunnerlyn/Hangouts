// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.floatingactionbutton.impl;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import bfd;
import bfe;

public class QuickButtonContainer extends FrameLayout
{

    public android.animation.Animator.AnimatorListener a;
    private boolean b;
    private boolean c;
    private Animator d;
    private int e;
    private android.animation.ValueAnimator.AnimatorUpdateListener f;

    public QuickButtonContainer(Context context)
    {
        super(context);
        f = new bfd(this);
        a = new bfe(this);
    }

    public QuickButtonContainer(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = new bfd(this);
        a = new bfe(this);
    }

    public QuickButtonContainer(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        f = new bfd(this);
        a = new bfe(this);
    }

    public QuickButtonContainer(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        f = new bfd(this);
        a = new bfe(this);
    }

    public static boolean a(QuickButtonContainer quickbuttoncontainer)
    {
        return quickbuttoncontainer.b;
    }

    public static Animator b(QuickButtonContainer quickbuttoncontainer)
    {
        return quickbuttoncontainer.d;
    }

    public static boolean c(QuickButtonContainer quickbuttoncontainer)
    {
        quickbuttoncontainer.c = false;
        return false;
    }

    public static int d(QuickButtonContainer quickbuttoncontainer)
    {
        return quickbuttoncontainer.e;
    }

    public static boolean e(QuickButtonContainer quickbuttoncontainer)
    {
        quickbuttoncontainer.b = false;
        return false;
    }

    public static Animator f(QuickButtonContainer quickbuttoncontainer)
    {
        quickbuttoncontainer.d = null;
        return null;
    }

    public android.animation.ValueAnimator.AnimatorUpdateListener a()
    {
        return f;
    }

    public android.animation.Animator.AnimatorListener b()
    {
        return a;
    }

    public boolean isClickable()
    {
        return getVisibility() != 8;
    }
}
