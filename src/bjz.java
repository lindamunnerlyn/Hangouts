// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

final class bjz extends android.view.View.AccessibilityDelegate
{

    bjz()
    {
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        if (accessibilityevent.getEventType() == 4096 || accessibilityevent.getEventType() == 2048)
        {
            Rect rect = new Rect();
            viewgroup.getHitRect(rect);
            if (!view.getLocalVisibleRect(rect))
            {
                return false;
            }
        }
        return super.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
    }
}
