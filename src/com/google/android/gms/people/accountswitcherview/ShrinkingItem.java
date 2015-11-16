// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.accountswitcherview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

class ShrinkingItem extends FrameLayout
{

    private float a;

    public ShrinkingItem(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 1.0F;
    }

    public ShrinkingItem(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = 1.0F;
    }

    public void a(float f)
    {
        a = f;
        requestLayout();
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        int k = getMeasuredHeight();
        j = k;
        if (a != 1.0F)
        {
            float f = a;
            j = Math.round((float)k * f);
        }
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), j);
    }
}
