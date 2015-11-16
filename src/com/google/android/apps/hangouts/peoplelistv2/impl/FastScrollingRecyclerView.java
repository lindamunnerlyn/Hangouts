// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.peoplelistv2.impl;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import chm;
import g;
import yt;

public class FastScrollingRecyclerView extends yt
{

    private int h;
    private int i;
    private int j;

    public FastScrollingRecyclerView(Context context)
    {
        super(context);
        a(new chm(this));
        h = getResources().getDimensionPixelSize(g.nu);
    }

    public FastScrollingRecyclerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(new chm(this));
        h = getResources().getDimensionPixelSize(g.nu);
    }

    public FastScrollingRecyclerView(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        a(new chm(this));
        h = getResources().getDimensionPixelSize(g.nu);
    }

    public static int a(FastScrollingRecyclerView fastscrollingrecyclerview)
    {
        return fastscrollingrecyclerview.i;
    }

    public static int b(FastScrollingRecyclerView fastscrollingrecyclerview)
    {
        return fastscrollingrecyclerview.h;
    }

    public static int c(FastScrollingRecyclerView fastscrollingrecyclerview)
    {
        return fastscrollingrecyclerview.j;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName("android.support.v7.widget.RecyclerView");
    }

    protected void onSizeChanged(int k, int l, int i1, int j1)
    {
        super.onSizeChanged(k, l, i1, j1);
        i = k;
        j = l;
    }
}
