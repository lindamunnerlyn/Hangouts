// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

public final class hx extends android.view.View.AccessibilityDelegate
{

    final hy a;

    public hx(hy hy1)
    {
        a = hy1;
        super();
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        return a.a(view, accessibilityevent);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider(View view)
    {
        return (AccessibilityNodeProvider)a.a(view);
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        a.b(view, accessibilityevent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilitynodeinfo)
    {
        a.a(view, accessibilitynodeinfo);
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        a.c(view, accessibilityevent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        return a.a(viewgroup, view, accessibilityevent);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle)
    {
        return a.a(view, i, bundle);
    }

    public void sendAccessibilityEvent(View view, int i)
    {
        a.a(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
    {
        a.d(view, accessibilityevent);
    }
}
