// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.util;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import bb;

public class FragmentTabHostEx extends bb
{

    private boolean a;

    public FragmentTabHostEx(Context context)
    {
        super(context);
    }

    public FragmentTabHostEx(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onAttachedToWindow()
    {
        if (!a)
        {
            super.onAttachedToWindow();
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        a = true;
        return super.onSaveInstanceState();
    }

    public void onTouchModeChanged(boolean flag)
    {
    }
}
