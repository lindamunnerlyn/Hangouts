// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.actionbar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Adapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import goq;

public final class ActionBarSpinner extends Spinner
{

    private goq a;

    public ActionBarSpinner(Context context)
    {
        super(context);
    }

    public ActionBarSpinner(Context context, int i)
    {
        super(context, i);
    }

    public ActionBarSpinner(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ActionBarSpinner(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public ActionBarSpinner(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
    }

    protected void onMeasure(int i, int j)
    {
        goq goq1 = a;
        if (goq1 != null)
        {
            goq1.a(getSelectedItemPosition());
        }
        super.onMeasure(i, j);
        if (goq1 != null)
        {
            goq1.a();
        }
    }

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((SpinnerAdapter)adapter);
    }

    public void setAdapter(SpinnerAdapter spinneradapter)
    {
        if (spinneradapter == null)
        {
            a = null;
        } else
        {
            a = new goq(this, spinneradapter);
        }
        super.setAdapter(a);
    }
}
