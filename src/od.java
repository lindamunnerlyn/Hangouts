// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public final class od extends hp
{

    final DrawerLayout b;
    private final Rect c = new Rect();

    public od(DrawerLayout drawerlayout)
    {
        b = drawerlayout;
        super();
    }

    public void a(View view, mq mq1)
    {
        if (DrawerLayout.i())
        {
            super.a(view, mq1);
        } else
        {
            mq mq2 = mq.a(mq1);
            super.a(view, mq2);
            mq1.a(view);
            Object obj = kb.i(view);
            if (obj instanceof View)
            {
                mq1.c((View)obj);
            }
            obj = c;
            mq2.a(((Rect) (obj)));
            mq1.b(((Rect) (obj)));
            mq2.c(((Rect) (obj)));
            mq1.d(((Rect) (obj)));
            mq1.c(mq2.e());
            mq1.a(mq2.k());
            mq1.b(mq2.l());
            mq1.c(mq2.m());
            mq1.h(mq2.j());
            mq1.f(mq2.h());
            mq1.a(mq2.c());
            mq1.b(mq2.d());
            mq1.d(mq2.f());
            mq1.e(mq2.g());
            mq1.g(mq2.i());
            mq1.a(mq2.b());
            mq2.n();
            view = (ViewGroup)view;
            int j = view.getChildCount();
            int i = 0;
            while (i < j) 
            {
                View view1 = view.getChildAt(i);
                if (DrawerLayout.l(view1))
                {
                    mq1.b(view1);
                }
                i++;
            }
        }
        mq1.b(android/support/v4/widget/DrawerLayout.getName());
        mq1.a(false);
        mq1.b(false);
        mq1.a(mr.a);
        mq1.a(mr.b);
    }

    public boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        if (DrawerLayout.i() || DrawerLayout.l(view))
        {
            return super.a(viewgroup, view, accessibilityevent);
        } else
        {
            return false;
        }
    }

    public boolean b(View view, AccessibilityEvent accessibilityevent)
    {
        if (accessibilityevent.getEventType() == 32)
        {
            view = accessibilityevent.getText();
            accessibilityevent = DrawerLayout.a(b);
            if (accessibilityevent != null)
            {
                int i = b.e(accessibilityevent);
                accessibilityevent = b.a(i);
                if (accessibilityevent != null)
                {
                    view.add(accessibilityevent);
                }
            }
            return true;
        } else
        {
            return super.b(view, accessibilityevent);
        }
    }

    public void d(View view, AccessibilityEvent accessibilityevent)
    {
        super.d(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v4/widget/DrawerLayout.getName());
    }
}
