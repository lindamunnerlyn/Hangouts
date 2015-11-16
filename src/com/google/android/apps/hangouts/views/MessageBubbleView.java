// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class MessageBubbleView extends LinearLayout
{

    private int a;
    private int b;

    public MessageBubbleView(Context context)
    {
        this(context, null);
    }

    public MessageBubbleView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = -1;
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        b = getMeasuredWidth();
        if (a > 0)
        {
            setMeasuredDimension(a, getMeasuredHeight());
            return;
        } else
        {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
    }
}
