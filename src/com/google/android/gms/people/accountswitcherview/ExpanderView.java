// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.accountswitcherview;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageButton;
import n;

public class ExpanderView extends ImageButton
{

    private static final int a[] = {
        0x10100a8
    };
    private boolean b;
    private String c;
    private String d;

    public ExpanderView(Context context)
    {
        this(context, null);
    }

    public ExpanderView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context);
    }

    public ExpanderView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(context);
    }

    private void a(Context context)
    {
        context = context.getResources();
        c = context.getString(n.v);
        d = context.getString(n.t);
    }

    public void a(boolean flag)
    {
        b = flag;
        String s;
        if (b)
        {
            s = d;
        } else
        {
            s = c;
        }
        setContentDescription(s);
        refreshDrawableState();
    }

    public int[] onCreateDrawableState(int i)
    {
        int ai[] = super.onCreateDrawableState(i + 1);
        if (b)
        {
            mergeDrawableStates(ai, a);
        }
        return ai;
    }

}
