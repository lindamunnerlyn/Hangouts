// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public final class zr extends hp
{

    final yr b;
    final hp c = new zs(this);

    public zr(yr yr1)
    {
        b = yr1;
    }

    public void a(View view, mq mq1)
    {
        super.a(view, mq1);
        mq1.b(yr.getName());
        if (!b.x() && b.d() != null)
        {
            b.d().a(mq1);
        }
    }

    public boolean a(View view, int i, Bundle bundle)
    {
        if (super.a(view, i, bundle))
        {
            return true;
        }
        if (!b.x() && b.d() != null)
        {
            return b.d().h(i);
        } else
        {
            return false;
        }
    }

    hp b()
    {
        return c;
    }

    public void d(View view, AccessibilityEvent accessibilityevent)
    {
        super.d(view, accessibilityevent);
        accessibilityevent.setClassName(yr.getName());
        if ((view instanceof yr) && !b.x())
        {
            view = (yr)view;
            if (view.d() != null)
            {
                view.d().a(accessibilityevent);
            }
        }
    }
}
