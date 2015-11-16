// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;
import java.text.Bidi;

public class WrapWidthTextView extends TextView
{

    public WrapWidthTextView(Context context)
    {
        super(context);
    }

    public WrapWidthTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public WrapWidthTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onMeasure(int i, int j)
    {
        boolean flag = false;
        super.onMeasure(i, j);
        char ac[] = getText().toString().toCharArray();
        if (!Bidi.requiresBidi(ac, 0, ac.length))
        {
            Layout layout = getLayout();
            if (layout != null)
            {
                float f = 0.0F;
                j = layout.getLineCount();
                for (i = ((flag) ? 1 : 0); i < j; i++)
                {
                    f = Math.max(f, layout.getLineWidth(i));
                }

                setMeasuredDimension((int)Math.ceil(f) + getCompoundPaddingLeft() + getCompoundPaddingRight(), getMeasuredHeight());
            }
        }
    }
}
