// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

public final class ni extends AccessibilityNodeProvider
{

    final nj a;

    public ni(nj nj1)
    {
        a = nj1;
        super();
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i)
    {
        a.c();
        return null;
    }

    public List findAccessibilityNodeInfosByText(String s, int i)
    {
        return a.b();
    }

    public boolean performAction(int i, int j, Bundle bundle)
    {
        return a.a();
    }
}
