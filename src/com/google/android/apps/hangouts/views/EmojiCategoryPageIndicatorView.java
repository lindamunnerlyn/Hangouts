// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import g;

public class EmojiCategoryPageIndicatorView extends LinearLayout
{

    private final Paint a;
    private final float b;
    private int c;
    private int d;
    private float e;

    public EmojiCategoryPageIndicatorView(Context context)
    {
        this(context, null);
    }

    public EmojiCategoryPageIndicatorView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new Paint();
        c = 0;
        d = 0;
        e = 0.0F;
        context = context.getResources();
        a.setColor(context.getColor(g.dk));
        b = context.getDimension(g.eJ);
    }

    public void a(int i, int j, float f)
    {
        c = i;
        d = j;
        e = f;
        invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        if (c <= 1)
        {
            return;
        } else
        {
            float f = (float)getWidth() / (float)c;
            float f1 = (float)d * f + e * f;
            canvas.drawRect(f1, 0.0F, f1 + f, b, a);
            return;
        }
    }
}
