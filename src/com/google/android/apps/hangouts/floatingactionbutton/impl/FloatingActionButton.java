// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.floatingactionbutton.impl;

import ahv;
import ahz;
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
import bey;
import bez;
import bfa;
import bfb;
import bfc;
import g;

public class FloatingActionButton extends View
{

    public bfb a;
    public int b;
    public Bitmap c;
    public int d;
    public Bitmap e;
    public float f;
    public int g;
    private ValueAnimator h;
    private Interpolator i;
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
        b = 0;
        d = -1;
        j = new bey(this);
        k = new bez(this);
        l = new bfa(this);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a(context);
        }
        setOnClickListener(l);
        i = new ahv(ahz.a);
        h = ValueAnimator.ofFloat(new float[] {
            0.0F, 1.0F
        });
        h.setInterpolator(i);
        h.setDuration(getResources().getInteger(g.lK));
        h.setStartDelay(0L);
        h.addUpdateListener(j);
        h.addListener(k);
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

    public Animator a(int i1, int j1)
    {
        g = j1;
        if (i1 != b)
        {
            if (h.isRunning())
            {
                h.cancel();
            }
            f = 0.0F;
            if (j1 == bfc.a)
            {
                d = i1;
                e = ((BitmapDrawable)getResources().getDrawable(i1)).getBitmap();
                h.start();
            } else
            {
                d = b;
                e = c;
                b = i1;
                c = ((BitmapDrawable)getResources().getDrawable(i1)).getBitmap();
                h.reverse();
            }
        }
        return h;
    }

    public void a(int i1)
    {
        if (h.isRunning())
        {
            h.cancel();
        }
        f = 0.0F;
        d = -1;
        e = null;
        b = i1;
        c = ((BitmapDrawable)getResources().getDrawable(i1)).getBitmap();
        invalidate();
    }

    public void a(int i1, int j1, float f1)
    {
        if (f1 < 0.0F || f1 > 1.0F)
        {
            throw new IllegalArgumentException("fraction argument to transitionPartlyBetween should be between 0.0 and 1.0");
        }
        if (h.isRunning())
        {
            h.cancel();
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
            f = i.getInterpolation(f1);
            b = i1;
            c = ((BitmapDrawable)getResources().getDrawable(i1)).getBitmap();
            d = j1;
            e = ((BitmapDrawable)getResources().getDrawable(j1)).getBitmap();
            g = bfc.a;
            invalidate();
            return;
        }
    }

    public void a(android.animation.Animator.AnimatorListener animatorlistener)
    {
        h.addListener(animatorlistener);
    }

    public void a(android.animation.ValueAnimator.AnimatorUpdateListener animatorupdatelistener)
    {
        h.addUpdateListener(animatorupdatelistener);
    }

    public void a(Context context)
    {
        setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, g.ly));
    }

    public void a(bfb bfb)
    {
        a = bfb;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (c != null)
        {
            a(canvas, c, f, 135);
        }
        if (e != null)
        {
            a(canvas, e, 1.0F - f, -135);
        }
    }
}
