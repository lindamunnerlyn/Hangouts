// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.peoplelistv2.impl;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.ImageView;

public class MinHeightImageView extends ImageView
{

    public MinHeightImageView(Context context)
    {
        super(context);
    }

    public MinHeightImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public MinHeightImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public MinHeightImageView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        i = (int)((float)j / getResources().getDisplayMetrics().density);
        if (getVisibility() != 8 && i < 100)
        {
            setVisibility(4);
            return;
        } else
        {
            setVisibility(0);
            return;
        }
    }
}
