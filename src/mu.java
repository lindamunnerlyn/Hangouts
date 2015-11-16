// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

class mu extends mv
{

    mu()
    {
    }

    public Object a(Object obj)
    {
        return AccessibilityNodeInfo.obtain((AccessibilityNodeInfo)obj);
    }

    public void a(Object obj, int i1)
    {
        ((AccessibilityNodeInfo)obj).addAction(i1);
    }

    public void a(Object obj, Rect rect)
    {
        ((AccessibilityNodeInfo)obj).getBoundsInParent(rect);
    }

    public void a(Object obj, View view)
    {
        ((AccessibilityNodeInfo)obj).addChild(view);
    }

    public void a(Object obj, CharSequence charsequence)
    {
        ((AccessibilityNodeInfo)obj).setClassName(charsequence);
    }

    public void a(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setClickable(flag);
    }

    public int b(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getActions();
    }

    public void b(Object obj, Rect rect)
    {
        ((AccessibilityNodeInfo)obj).getBoundsInScreen(rect);
    }

    public void b(Object obj, View view)
    {
        ((AccessibilityNodeInfo)obj).setParent(view);
    }

    public void b(Object obj, CharSequence charsequence)
    {
        ((AccessibilityNodeInfo)obj).setContentDescription(charsequence);
    }

    public void b(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setEnabled(flag);
    }

    public CharSequence c(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getClassName();
    }

    public void c(Object obj, Rect rect)
    {
        ((AccessibilityNodeInfo)obj).setBoundsInParent(rect);
    }

    public void c(Object obj, View view)
    {
        ((AccessibilityNodeInfo)obj).setSource(view);
    }

    public void c(Object obj, CharSequence charsequence)
    {
        ((AccessibilityNodeInfo)obj).setPackageName(charsequence);
    }

    public void c(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setFocusable(flag);
    }

    public CharSequence d(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getContentDescription();
    }

    public void d(Object obj, Rect rect)
    {
        ((AccessibilityNodeInfo)obj).setBoundsInScreen(rect);
    }

    public void d(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setFocused(flag);
    }

    public CharSequence e(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getPackageName();
    }

    public void e(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setLongClickable(flag);
    }

    public CharSequence f(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getText();
    }

    public void f(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setScrollable(flag);
    }

    public void g(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setSelected(flag);
    }

    public boolean g(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isCheckable();
    }

    public boolean h(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isChecked();
    }

    public boolean i(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isClickable();
    }

    public boolean j(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isEnabled();
    }

    public boolean k(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isFocusable();
    }

    public boolean l(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isFocused();
    }

    public boolean m(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isLongClickable();
    }

    public boolean n(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isPassword();
    }

    public boolean o(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isScrollable();
    }

    public boolean p(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isSelected();
    }

    public void q(Object obj)
    {
        ((AccessibilityNodeInfo)obj).recycle();
    }
}
