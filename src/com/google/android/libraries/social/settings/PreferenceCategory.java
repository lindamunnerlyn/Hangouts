// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.settings;

import android.content.Context;
import android.util.AttributeSet;
import g;
import hjr;
import hkd;

public final class PreferenceCategory extends hkd
{

    public PreferenceCategory(Context context)
    {
        this(context, null);
    }

    public PreferenceCategory(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, g.tK);
    }

    private PreferenceCategory(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean B_()
    {
        return false;
    }

    public boolean D()
    {
        return !super.B_();
    }

    protected boolean b(hjr hjr)
    {
        if (hjr instanceof PreferenceCategory)
        {
            throw new IllegalArgumentException("Cannot add a PreferenceCategory directly to a PreferenceCategory");
        } else
        {
            return super.b(hjr);
        }
    }
}
