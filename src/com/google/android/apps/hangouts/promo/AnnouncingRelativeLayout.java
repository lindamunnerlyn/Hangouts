// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.promo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.RelativeLayout;
import java.util.List;

public class AnnouncingRelativeLayout extends RelativeLayout
{

    private String a;

    public AnnouncingRelativeLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void a(String s)
    {
        a = s;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        if (accessibilityevent.getEventType() == 32)
        {
            onPopulateAccessibilityEvent(accessibilityevent);
            return true;
        } else
        {
            return super.dispatchPopulateAccessibilityEvent(accessibilityevent);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onPopulateAccessibilityEvent(accessibilityevent);
        if (accessibilityevent.getEventType() == 32 && a != null)
        {
            accessibilityevent.getText().add(a);
        }
    }
}
