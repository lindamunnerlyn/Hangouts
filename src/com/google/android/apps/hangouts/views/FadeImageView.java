// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import ahj;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import eee;

public class FadeImageView extends ImageView
{

    private Animation a;
    private Animation b;
    private android.view.animation.Animation.AnimationListener c;
    private BitmapDrawable d;
    private int e;
    private int f;
    private float g;

    public FadeImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.getTheme().obtainStyledAttributes(attributeset, ahj.p, 0, 0);
        e = context.getInt(ahj.r, 0);
        f = context.getInt(ahj.q, 250);
        g = context.getFloat(ahj.s, 0.25F);
        context.recycle();
        a = new AlphaAnimation(g, 1.0F);
        a.setDuration(f);
        b = new AlphaAnimation(1.0F, g);
        b.setDuration(e);
        c = new eee(this);
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    public static Animation a(FadeImageView fadeimageview)
    {
        return fadeimageview.b;
    }

    public static BitmapDrawable b(FadeImageView fadeimageview)
    {
        return fadeimageview.d;
    }

    public static Animation c(FadeImageView fadeimageview)
    {
        return fadeimageview.a;
    }

    public void a(boolean flag, Bitmap bitmap)
    {
        b.setAnimationListener(null);
        clearAnimation();
        d = new BitmapDrawable(getResources(), bitmap);
        if (!flag)
        {
            setBackgroundDrawable(d);
            return;
        }
        if (e > 0)
        {
            b.setAnimationListener(c);
            startAnimation(b);
            return;
        } else
        {
            setBackgroundDrawable(d);
            startAnimation(a);
            return;
        }
    }
}
