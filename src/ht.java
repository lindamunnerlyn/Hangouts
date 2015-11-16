// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.View;

final class ht extends hq
{

    ht()
    {
    }

    public Object a(hp hp)
    {
        return new hx(new hu(this, hp));
    }

    public nc a(Object obj, View view)
    {
        obj = ((android.view.View.AccessibilityDelegate)obj).getAccessibilityNodeProvider(view);
        if (obj != null)
        {
            return new nc(obj);
        } else
        {
            return null;
        }
    }

    public boolean a(Object obj, View view, int i, Bundle bundle)
    {
        return ((android.view.View.AccessibilityDelegate)obj).performAccessibilityAction(view, i, bundle);
    }
}
