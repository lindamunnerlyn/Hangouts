// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public final class lf extends hp
{

    final ViewPager b;

    public lf(ViewPager viewpager)
    {
        b = viewpager;
        super();
    }

    private boolean b()
    {
        return ViewPager.b(b) != null && ViewPager.b(b).b() > 1;
    }

    public void a(View view, mq mq1)
    {
        super.a(view, mq1);
        mq1.b(android/support/v4/view/ViewPager.getName());
        mq1.i(b());
        if (b.canScrollHorizontally(1))
        {
            mq1.a(4096);
        }
        if (b.canScrollHorizontally(-1))
        {
            mq1.a(8192);
        }
    }

    public boolean a(View view, int i, Bundle bundle)
    {
        if (super.a(view, i, bundle))
        {
            return true;
        }
        switch (i)
        {
        default:
            return false;

        case 4096: 
            if (b.canScrollHorizontally(1))
            {
                b.a(ViewPager.c(b) + 1);
                return true;
            } else
            {
                return false;
            }

        case 8192: 
            break;
        }
        if (b.canScrollHorizontally(-1))
        {
            b.a(ViewPager.c(b) - 1);
            return true;
        } else
        {
            return false;
        }
    }

    public void d(View view, AccessibilityEvent accessibilityevent)
    {
        super.d(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v4/view/ViewPager.getName());
        view = nm.a();
        view.a(b());
        if (accessibilityevent.getEventType() == 4096 && ViewPager.b(b) != null)
        {
            view.a(ViewPager.b(b).b());
            view.b(ViewPager.c(b));
            view.c(ViewPager.c(b));
        }
    }
}
