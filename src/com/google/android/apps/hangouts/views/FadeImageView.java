// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import ahb;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import ehg;

public class FadeImageView extends ImageView
{

    public Animation a;
    public Animation b;
    public BitmapDrawable c;
    private android.view.animation.Animation.AnimationListener d;
    private int e;
    private int f;
    private float g;

    public FadeImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.getTheme().obtainStyledAttributes(attributeset, ahb.p, 0, 0);
        e = context.getInt(ahb.r, 0);
        f = context.getInt(ahb.q, 250);
        g = context.getFloat(ahb.s, 0.25F);
        context.recycle();
        a = new AlphaAnimation(g, 1.0F);
        a.setDuration(f);
        b = new AlphaAnimation(1.0F, g);
        b.setDuration(e);
        d = new ehg(this);
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    public void a(boolean flag, Bitmap bitmap)
    {
        b.setAnimationListener(null);
        clearAnimation();
        c = new BitmapDrawable(getResources(), bitmap);
        if (!flag)
        {
            setBackgroundDrawable(c);
            return;
        }
        if (e > 0)
        {
            b.setAnimationListener(d);
            startAnimation(b);
            return;
        } else
        {
            setBackgroundDrawable(c);
            startAnimation(a);
            return;
        }
    }
}
