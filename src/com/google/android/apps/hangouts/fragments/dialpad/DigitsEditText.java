// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.fragments.dialpad;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import bmq;

public class DigitsEditText extends EditText
{

    public DigitsEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setInputType(getInputType() | 0x80000);
        addTextChangedListener(new bmq(this));
    }

    protected void onFocusChanged(boolean flag, int i, Rect rect)
    {
        super.onFocusChanged(flag, i, rect);
        rect = (InputMethodManager)getContext().getSystemService("input_method");
        if (rect != null && rect.isActive(this))
        {
            rect.hideSoftInputFromWindow(getApplicationWindowToken(), 0);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = super.onTouchEvent(motionevent);
        motionevent = (InputMethodManager)getContext().getSystemService("input_method");
        if (motionevent != null && motionevent.isActive(this))
        {
            motionevent.hideSoftInputFromWindow(getApplicationWindowToken(), 0);
        }
        return flag;
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityevent)
    {
        if (accessibilityevent.getEventType() != 16) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        int k;
        i = accessibilityevent.getAddedCount();
        j = accessibilityevent.getRemovedCount();
        k = accessibilityevent.getBeforeText().length();
        if (i <= j) goto _L4; else goto _L3
_L3:
        accessibilityevent.setRemovedCount(0);
        accessibilityevent.setAddedCount(1);
        accessibilityevent.setFromIndex(k);
_L8:
        super.sendAccessibilityEventUnchecked(accessibilityevent);
_L6:
        return;
_L4:
        if (j <= i) goto _L6; else goto _L5
_L5:
        accessibilityevent.setRemovedCount(1);
        accessibilityevent.setAddedCount(0);
        accessibilityevent.setFromIndex(k - 1);
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        if (accessibilityevent.getEventType() == 8)
        {
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }
}
