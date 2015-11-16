// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ListView;
import efs;

public class MessageListView extends ListView
{

    efs a;

    public MessageListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new efs(this);
    }

    public void a(int i, int j)
    {
        if (i >= a.a)
        {
            a.a = i;
            a.b = j;
            a.c = true;
        }
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, int i, AccessibilityNodeInfo accessibilitynodeinfo)
    {
        if (i == -1 || i >= getCount())
        {
            return;
        } else
        {
            super.onInitializeAccessibilityNodeInfoForItem(view, i, accessibilitynodeinfo);
            return;
        }
    }

    public void onLayout(boolean flag, int i, int j, int k, int l)
    {
        if (a.c)
        {
            if (getLastVisiblePosition() > getCount() - 3)
            {
                setSelectionFromTop(a.a, a.b);
            }
            a.c = false;
        }
        super.onLayout(flag, i, j, k, l);
    }
}
