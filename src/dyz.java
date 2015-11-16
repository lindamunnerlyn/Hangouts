// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ListView;

public final class dyz extends android.view.View.AccessibilityDelegate
{

    public dyz()
    {
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(view, accessibilityevent);
        if (view instanceof ListView)
        {
            view = (ListView)view;
            if ((accessibilityevent.getEventType() == 4096 || accessibilityevent.getEventType() == 2048) && (accessibilityevent.getEventType() == 4096 || accessibilityevent.getEventType() == 2048))
            {
                int i = view.getHeaderViewsCount();
                int j = view.getFooterViewsCount();
                int k = accessibilityevent.getItemCount();
                int i1 = accessibilityevent.getFromIndex();
                int l = accessibilityevent.getToIndex();
                if (i + j >= k || l < i || i1 >= k - j)
                {
                    accessibilityevent.setItemCount(0);
                    return;
                } else
                {
                    accessibilityevent.setItemCount(k - i - j);
                    i1 = Math.max(0, i1 - i);
                    i = Math.min(k - i - j - 1, l - i);
                    accessibilityevent.setFromIndex(i1);
                    accessibilityevent.setToIndex(i);
                    return;
                }
            }
        }
    }
}
