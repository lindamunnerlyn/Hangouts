// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

final class hu
    implements hy
{

    final hp a;
    final ht b;

    hu(ht ht, hp hp1)
    {
        b = ht;
        a = hp1;
        super();
    }

    public Object a(View view)
    {
        view = a.a(view);
        if (view != null)
        {
            return view.a();
        } else
        {
            return null;
        }
    }

    public void a(View view, int i)
    {
        a.a(view, i);
    }

    public void a(View view, Object obj)
    {
        a.a(view, new mq(obj));
    }

    public boolean a(View view, int i, Bundle bundle)
    {
        return a.a(view, i, bundle);
    }

    public boolean a(View view, AccessibilityEvent accessibilityevent)
    {
        return a.b(view, accessibilityevent);
    }

    public boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        return a.a(viewgroup, view, accessibilityevent);
    }

    public void b(View view, AccessibilityEvent accessibilityevent)
    {
        a.d(view, accessibilityevent);
    }

    public void c(View view, AccessibilityEvent accessibilityevent)
    {
        a.c(view, accessibilityevent);
    }

    public void d(View view, AccessibilityEvent accessibilityevent)
    {
        a.a(view, accessibilityevent);
    }
}
