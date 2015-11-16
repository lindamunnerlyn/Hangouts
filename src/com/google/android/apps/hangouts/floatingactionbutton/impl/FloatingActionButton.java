// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.floatingactionbutton.impl;

import aic;
import aig;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import bei;
import bej;
import bek;
import bel;
import bem;
import g;

public class FloatingActionButton extends View
{

    private bel a;
    private ValueAnimator b;
    private Interpolator c;
    private int d;
    private Bitmap e;
    private int f;
    private Bitmap g;
    private float h;
    private int i;
    private android.animation.ValueAnimator.AnimatorUpdateListener j;
    private android.animation.Animator.AnimatorListener k;
    private android.view.View.OnClickListener l;

    public FloatingActionButton(Context context)
    {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public FloatingActionButton(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        d = 0;
        f = -1;
        j = new bei(this);
        k = new bej(this);
        l = new bek(this);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a(context);
        }
        setOnClickListener(l);
        c = new aic(aig.a);
        b = ValueAnimator.ofFloat(new float[] {
            0.0F, 1.0F
        });
        b.setInterpolator(c);
        b.setDuration(getResources().getInteger(g.lW));
        b.setStartDelay(0L);
        b.addUpdateListener(j);
        b.addListener(k);
    }

    public static float a(FloatingActionButton floatingactionbutton, float f1)
    {
        floatingactionbutton.h = f1;
        return f1;
    }

    public static int a(FloatingActionButton floatingactionbutton)
    {
        return floatingactionbutton.i;
    }

    public static int a(FloatingActionButton floatingactionbutton, int i1)
    {
        floatingactionbutton.d = i1;
        return i1;
    }

    public static Bitmap a(FloatingActionButton floatingactionbutton, Bitmap bitmap)
    {
        floatingactionbutton.e = bitmap;
        return bitmap;
    }

    private void a(Canvas canvas, Bitmap bitmap, float f1, int i1)
    {
        Object obj = new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(((android.graphics.Shader) (obj)));
        obj = new Matrix();
        ((Matrix) (obj)).preRotate((float)i1 * f1, (float)bitmap.getWidth() / 2.0F, (float)bitmap.getHeight() / 2.0F);
        paint.setAlpha((int)((1.0F - f1) * 255F));
        ((Matrix) (obj)).postTranslate((float)(getWidth() - bitmap.getWidth()) / 2.0F, (float)(getHeight() - bitmap.getHeight()) / 2.0F);
        canvas.drawBitmap(bitmap, ((Matrix) (obj)), paint);
    }

    public static int b(FloatingActionButton floatingactionbutton)
    {
        return floatingactionbutton.f;
    }

    public static Bitmap c(FloatingActionButton floatingactionbutton)
    {
        return floatingactionbutton.g;
    }

    public static int d(FloatingActionButton floatingactionbutton)
    {
        floatingactionbutton.f = -1;
        return -1;
    }

    public static Bitmap e(FloatingActionButton floatingactionbutton)
    {
        floatingactionbutton.g = null;
        return null;
    }

    public static bel f(FloatingActionButton floatingactionbutton)
    {
        return floatingactionbutton.a;
    }

    public static int g(FloatingActionButton floatingactionbutton)
    {
        return floatingactionbutton.d;
    }

    public Animator a(int i1, int j1)
    {
        i = j1;
        if (i1 != d)
        {
            if (b.isRunning())
            {
                b.cancel();
            }
            h = 0.0F;
            if (j1 == bem.a)
            {
                f = i1;
                g = ((BitmapDrawable)getResources().getDrawable(i1)).getBitmap();
                b.start();
            } else
            {
                f = d;
                g = e;
                d = i1;
                e = ((BitmapDrawable)getResources().getDrawable(i1)).getBitmap();
                b.reverse();
            }
        }
        return b;
    }

    public void a(int i1)
    {
        if (b.isRunning())
        {
            b.cancel();
        }
        h = 0.0F;
        f = -1;
        g = null;
        d = i1;
        e = ((BitmapDrawable)getResources().getDrawable(i1)).getBitmap();
        invalidate();
    }

    public void a(int i1, int j1, float f1)
    {
        if (f1 < 0.0F || f1 > 1.0F)
        {
            throw new IllegalArgumentException("fraction argument to transitionPartlyBetween should be between 0.0 and 1.0");
        }
        if (b.isRunning())
        {
            b.cancel();
        }
        if (f1 < 0.001F)
        {
            a(i1);
            return;
        }
        if (1.0F - f1 < 0.001F)
        {
            a(j1);
            return;
        } else
        {
            h = c.getInterpolation(f1);
            d = i1;
            e = ((BitmapDrawable)getResources().getDrawable(i1)).getBitmap();
            f = j1;
            g = ((BitmapDrawable)getResources().getDrawable(j1)).getBitmap();
            i = bem.a;
            invalidate();
            return;
        }
    }

    public void a(android.animation.Animator.AnimatorListener animatorlistener)
    {
        b.addListener(animatorlistener);
    }

    public void a(android.animation.ValueAnimator.AnimatorUpdateListener animatorupdatelistener)
    {
        b.addUpdateListener(animatorupdatelistener);
    }

    public void a(Context context)
    {
        setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, g.lG));
    }

    public void a(bel bel)
    {
        a = bel;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (e != null)
        {
            a(canvas, e, h, 135);
        }
        if (g != null)
        {
            a(canvas, g, 1.0F - h, -135);
        }
    }
}
