// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import efu;
import efv;

public class MultiLineLayout extends ViewGroup
{

    private final efu a = new efu(this);
    private final efv b = new efv(this);

    public MultiLineLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public static void a(MultiLineLayout multilinelayout, int i, int j)
    {
        multilinelayout.setMeasuredDimension(i, j);
    }

    public static void a(MultiLineLayout multilinelayout, View view, int i, int j)
    {
        multilinelayout.measureChild(view, i, j);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        a.a(k - i);
    }

    protected void onMeasure(int i, int j)
    {
        b.a(i, j);
        b.a(resolveSize(0x7fffffff, i));
    }
}
