// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.accessibility.AccessibilityEvent;

public final class mj
{

    private static final mm a;

    public static nm a(AccessibilityEvent accessibilityevent)
    {
        return new nm(accessibilityevent);
    }

    public static void a(AccessibilityEvent accessibilityevent, int i)
    {
        a.a(accessibilityevent, i);
    }

    public static int b(AccessibilityEvent accessibilityevent)
    {
        return a.a(accessibilityevent);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new ml();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new mk();
        } else
        {
            a = new mm();
        }
    }
}
