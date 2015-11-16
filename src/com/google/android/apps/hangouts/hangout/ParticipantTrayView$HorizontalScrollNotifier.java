// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import brs;

public class  extends HorizontalScrollView
{

    brs a;

    void a(brs brs1)
    {
        a = brs1;
    }

    public void onScrollChanged(int i, int j, int k, int l)
    {
        if (a != null)
        {
            a.a();
        }
    }

    public (Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }
}
