// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.accessibility.AccessibilityManager;

public final class mn
{

    private static final mp a;

    public static boolean a(AccessibilityManager accessibilitymanager)
    {
        return a.a(accessibilitymanager);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new mo();
        } else
        {
            a = new mp();
        }
    }
}
