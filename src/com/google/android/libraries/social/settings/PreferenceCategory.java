// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.settings;

import android.content.Context;
import android.util.AttributeSet;
import g;
import hfa;
import hfm;

public final class PreferenceCategory extends hfm
{

    public PreferenceCategory(Context context)
    {
        this(context, null);
    }

    public PreferenceCategory(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, g.tj);
    }

    private PreferenceCategory(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean D()
    {
        return !super.z_();
    }

    protected boolean b(hfa hfa)
    {
        if (hfa instanceof PreferenceCategory)
        {
            throw new IllegalArgumentException("Cannot add a PreferenceCategory directly to a PreferenceCategory");
        } else
        {
            return super.b(hfa);
        }
    }

    public boolean z_()
    {
        return false;
    }
}
