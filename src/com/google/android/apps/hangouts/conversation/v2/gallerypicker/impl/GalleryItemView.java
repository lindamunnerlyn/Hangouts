// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.conversation.v2.gallerypicker.impl;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import bbo;
import bbp;
import bbt;
import bbu;
import bbw;
import g;
import h;
import java.io.File;

public class GalleryItemView extends ImageView
    implements bbu
{

    public bbt a;
    Runnable b;
    private int c;
    private int d;
    private String e;
    private View f;

    public GalleryItemView(Context context)
    {
        super(context);
        c = 512;
        d = 512;
    }

    public GalleryItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 512;
        d = 512;
    }

    public GalleryItemView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = 512;
        d = 512;
    }

    public ImageView a()
    {
        return this;
    }

    public void a(Cursor cursor, View view, bbt bbt1)
    {
        a = bbt1;
        if (b != null)
        {
            Runnable runnable = b;
            g.x().removeCallbacks(runnable);
            b = null;
        }
        view.findViewById(g.kU).setVisibility(0);
        e = bbt1.a(cursor).a;
        f = view;
        view.findViewById(g.kT).setVisibility(4);
        view.findViewById(g.kV).setVisibility(4);
        setBackgroundColor(0xffffff);
        setAlpha(255);
        cursor = e;
        if (b == null)
        {
            b = new bbw(this, cursor);
            g.a(b, 33L);
        }
    }

    public void a(bbo bbo1, boolean flag)
    {
        float f1 = 0.88F;
        float f2 = 1.0F;
        Object obj = f.findViewById(g.kT);
        f.findViewById(g.kU).setVisibility(8);
        int i;
        if (bbo1.d)
        {
            ((View) (obj)).setVisibility(0);
            setBackgroundColor(getResources().getColor(h.he));
            setAlpha(127);
            if (!flag)
            {
                f2 = 0.88F;
            }
        } else
        {
            ((View) (obj)).setVisibility(4);
            setBackgroundColor(getResources().getColor(h.hf));
            setAlpha(255);
            if (flag)
            {
                f2 = 0.87F;
                f1 = 1.0F;
            } else
            {
                f1 = 1.0F;
            }
        }
        obj = getResources();
        if (bbo1.d)
        {
            i = g.lc;
        } else
        {
            i = g.ld;
        }
        setContentDescription(((Resources) (obj)).getString(i, new Object[] {
            (new File(bbo1.a)).getName()
        }));
        if (f2 != f1)
        {
            setScaleX(f2);
            setScaleY(f2);
            animate().scaleX(f1).scaleY(f1).setDuration(135L).setStartDelay(51L).setInterpolator(g.b()).start();
        } else
        {
            setScaleX(f2);
            setScaleY(f2);
        }
        obj = f.findViewById(g.kV);
        if (bbo1.b == bbp.b)
        {
            ((View) (obj)).setVisibility(0);
            return;
        } else
        {
            ((View) (obj)).setVisibility(4);
            return;
        }
    }

    public boolean a(bbo bbo1)
    {
        if (e != null && bbo1.a.equals(e))
        {
            a(bbo1, false);
            bbo1 = new AlphaAnimation(0.0F, 1.0F);
            bbo1.setDuration(167L);
            bbo1.setFillAfter(true);
            startAnimation(bbo1);
            return true;
        } else
        {
            return false;
        }
    }

    public String b()
    {
        return e;
    }

    public int c()
    {
        return Math.max(c, d);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (e != null)
        {
            a.a(e);
            e = null;
        }
        clearAnimation();
        setImageBitmap(null);
        setImageDrawable(null);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        c = (getMeasuredWidth() * 60) / 100;
        d = getMeasuredHeight();
        setMeasuredDimension(c, d);
    }
}
