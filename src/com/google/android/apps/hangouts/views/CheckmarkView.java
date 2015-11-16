// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;

public class CheckmarkView extends CompoundButton
{

    public CheckmarkView(Context context)
    {
        this(context, null);
    }

    public CheckmarkView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CheckmarkView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void setChecked(boolean flag)
    {
        super.setChecked(flag);
        sendAccessibilityEvent(1);
    }
}
