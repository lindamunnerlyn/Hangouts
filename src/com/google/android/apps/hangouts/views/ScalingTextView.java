// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class ScalingTextView extends TextView
{

    private float a;

    public ScalingTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, -1);
    }

    public ScalingTextView(Context context, AttributeSet attributeset, int i)
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
        i = getMeasuredHeight();
        setMeasuredDimension((int)((float)getMeasuredWidth() * a), (int)((float)i * a));
    }
}
