// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.conversation.v2;

import android.content.Context;
import android.util.AttributeSet;

public class TabWidget extends android.widget.TabWidget
{

    public TabWidget(Context context)
    {
        super(context);
    }

    public TabWidget(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public TabWidget(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i), 0), j);
    }
}
