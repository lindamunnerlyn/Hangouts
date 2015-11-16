// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class FixedAspectRatioImageView extends ImageView
{

    int a;
    int b;
    int c;
    int d;

    public FixedAspectRatioImageView(Context context)
    {
        super(context);
    }

    public FixedAspectRatioImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (attributeset != null)
        {
            context = context.obtainStyledAttributes(attributeset, new int[] {
                0x101011f, 0x1010120
            });
            a = context.getDimensionPixelSize(0, 0);
            b = context.getDimensionPixelSize(1, 0);
            context.recycle();
        }
    }

    public FixedAspectRatioImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void a(int i, int j)
    {
        c = i;
        d = j;
        requestLayout();
    }

    protected void onMeasure(int i, int j)
    {
        int k = 0;
        if (c == 0 || d == 0) goto _L2; else goto _L1
_L1:
        int l;
        int i1;
        int k1;
        i1 = android.view.View.MeasureSpec.getMode(i);
        k = android.view.View.MeasureSpec.getSize(i);
        k1 = android.view.View.MeasureSpec.getMode(j);
        l = android.view.View.MeasureSpec.getSize(j);
        if (i1 != 0x40000000 || k1 != 0x40000000) goto _L4; else goto _L3
_L3:
        j = l;
        i = k;
_L6:
        setMeasuredDimension(i, j);
        return;
_L4:
        if (i1 == 0x40000000)
        {
            int j1 = (d * k) / c;
            i1 = j1;
            j = k;
            if (k1 == 0x80000000)
            {
                i = k;
                j = l;
                if (j1 > l)
                {
                    continue; /* Loop/switch isn't completed */
                }
                j = k;
                i1 = j1;
            }
        } else
        if (k1 == 0x40000000)
        {
            if (android.os.Build.VERSION.SDK_INT < 18)
            {
                if (a > 0)
                {
                    i = Math.min(a, k);
                } else
                {
                    i = k;
                }
                i = Math.min(l, i);
            } else
            {
                i = l;
            }
            j = (c * i) / d;
            if (i1 != 0x80000000 || j <= k)
            {
                k = j;
            }
            i1 = i;
            j = k;
            if (k > a)
            {
                k = a;
                j = i;
                i = k;
                continue; /* Loop/switch isn't completed */
            }
        } else
        {
            if (a != 0 && k > a)
            {
                i = a;
            } else
            {
                i = k;
            }
            if (k1 != 0)
            {
                j = l;
            } else
            {
                j = i;
            }
            if (c > d)
            {
                j = (d * i) / c;
            } else
            {
                i = (c * j) / d;
            }
            continue; /* Loop/switch isn't completed */
        }
        i = j;
        j = i1;
        continue; /* Loop/switch isn't completed */
_L2:
        i = 0;
        j = k;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        super.setImageBitmap(bitmap);
        if (bitmap != null && (c != bitmap.getWidth() || d != bitmap.getHeight()))
        {
            a(bitmap.getWidth(), bitmap.getHeight());
        }
    }

    public void setImageDrawable(Drawable drawable)
    {
        super.setImageDrawable(drawable);
        if (drawable != null && (c != drawable.getIntrinsicWidth() || d != drawable.getIntrinsicHeight()))
        {
            a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    public void setMaxHeight(int i)
    {
        super.setMaxHeight(i);
        b = i;
    }

    public void setMaxWidth(int i)
    {
        super.setMaxHeight(i);
        a = i;
    }
}
