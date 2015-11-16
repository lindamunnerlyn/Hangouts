// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

class nn extends np
{

    nn()
    {
    }

    public Object a()
    {
        return AccessibilityRecord.obtain();
    }

    public void a(Object obj, int i)
    {
        ((AccessibilityRecord)obj).setFromIndex(i);
    }

    public void a(Object obj, View view)
    {
        ((AccessibilityRecord)obj).setSource(view);
    }

    public void a(Object obj, boolean flag)
    {
        ((AccessibilityRecord)obj).setScrollable(flag);
    }

    public void b(Object obj, int i)
    {
        ((AccessibilityRecord)obj).setItemCount(i);
    }

    public void c(Object obj, int i)
    {
        ((AccessibilityRecord)obj).setToIndex(i);
    }
}
