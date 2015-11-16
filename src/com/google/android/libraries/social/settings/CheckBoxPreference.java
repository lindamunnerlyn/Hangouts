// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import g;
import hga;
import hgc;
import o;

public class CheckBoxPreference extends hgc
{

    public CheckBoxPreference(Context context)
    {
        this(context, null);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, g.th);
    }

    private CheckBoxPreference(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = context.obtainStyledAttributes(attributeset, hga.P, i, 0);
        a(context.getString(hga.S));
        d(context.getString(hga.R));
        h(context.getBoolean(hga.Q, false));
        context.recycle();
    }

    protected void a(View view)
    {
        super.a(view);
        View view1 = view.findViewById(o.D);
        if (view1 instanceof Checkable)
        {
            ((Checkable)view1).setChecked(b);
            b(view1);
        }
        c(view);
    }
}
