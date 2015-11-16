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
import bay;
import baz;
import bbd;
import bbe;
import bbg;
import g;
import h;
import java.io.File;

public class GalleryItemView extends ImageView
    implements bbe
{

    Runnable a;
    private int b;
    private int c;
    private String d;
    private bbd e;
    private View f;

    public GalleryItemView(Context context)
    {
        super(context);
        b = 512;
        c = 512;
    }

    public GalleryItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = 512;
        c = 512;
    }

    public GalleryItemView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = 512;
        c = 512;
    }

    public static bbd a(GalleryItemView galleryitemview)
    {
        return galleryitemview.e;
    }

    public ImageView a()
    {
        return this;
    }

    public void a(Cursor cursor, View view, bbd bbd1)
    {
        e = bbd1;
        if (a != null)
        {
            Runnable runnable = a;
            g.y().removeCallbacks(runnable);
            a = null;
        }
        view.findViewById(g.lc).setVisibility(0);
        d = bbd1.a(cursor).a;
        f = view;
        view.findViewById(g.lb).setVisibility(4);
        view.findViewById(g.ld).setVisibility(4);
        setBackgroundColor(0xffffff);
        setAlpha(255);
        cursor = d;
        if (a == null)
        {
            a = new bbg(this, cursor);
            g.a(a, 33L);
        }
    }

    public void a(bay bay1, boolean flag)
    {
        float f1 = 0.88F;
        float f2 = 1.0F;
        Object obj = f.findViewById(g.lb);
        f.findViewById(g.lc).setVisibility(8);
        int i;
        if (bay1.d)
        {
            ((View) (obj)).setVisibility(0);
            setBackgroundColor(getResources().getColor(h.hy));
            setAlpha(127);
            if (!flag)
            {
                f2 = 0.88F;
            }
        } else
        {
            ((View) (obj)).setVisibility(4);
            setBackgroundColor(getResources().getColor(h.hz));
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
        if (bay1.d)
        {
            i = g.lk;
        } else
        {
            i = g.ll;
        }
        setContentDescription(((Resources) (obj)).getString(i, new Object[] {
            (new File(bay1.a)).getName()
        }));
        if (f2 != f1)
        {
            setScaleX(f2);
            setScaleY(f2);
            animate().scaleX(f1).scaleY(f1).setDuration(135L).setStartDelay(51L).setInterpolator(g.c()).start();
        } else
        {
            setScaleX(f2);
            setScaleY(f2);
        }
        obj = f.findViewById(g.ld);
        if (bay1.b == baz.b)
        {
            ((View) (obj)).setVisibility(0);
            return;
        } else
        {
            ((View) (obj)).setVisibility(4);
            return;
        }
    }

    public boolean a(bay bay1)
    {
        if (d != null && bay1.a.equals(d))
        {
            a(bay1, false);
            bay1 = new AlphaAnimation(0.0F, 1.0F);
            bay1.setDuration(167L);
            bay1.setFillAfter(true);
            startAnimation(bay1);
            return true;
        } else
        {
            return false;
        }
    }

    public String b()
    {
        return d;
    }

    public int c()
    {
        return Math.max(b, c);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (d != null)
        {
            e.a(d);
            d = null;
        }
        clearAnimation();
        setImageBitmap(null);
        setImageDrawable(null);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        b = (getMeasuredWidth() * 60) / 100;
        c = getMeasuredHeight();
        setMeasuredDimension(b, c);
    }
}
