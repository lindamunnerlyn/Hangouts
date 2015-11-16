// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.listui;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ListView;
import byx;
import bzc;
import bzd;
import bze;

public class SwipeableListView extends ListView
    implements bzc
{

    private byx a;
    private boolean b;
    private boolean c;
    private int d;
    private bze e;

    public SwipeableListView(Context context)
    {
        super(context);
        b = false;
        c = false;
        a(context);
    }

    public SwipeableListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = false;
        c = false;
        a(context);
    }

    public SwipeableListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = false;
        c = false;
        a(context);
    }

    private void a(Context context)
    {
        Resources resources = getResources();
        float f = resources.getDisplayMetrics().density;
        float f1 = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        a = new byx(resources, VelocityTracker.obtain(), this, f, f1);
    }

    public View a(MotionEvent motionevent)
    {
        int j = getChildCount();
        int k = (int)motionevent.getY();
        for (int i = 0; i < j; i++)
        {
            motionevent = getChildAt(i);
            if (motionevent.getVisibility() != 8 && k >= motionevent.getTop() && k <= motionevent.getBottom())
            {
                return motionevent;
            }
        }

        return null;
    }

    public void a(bzd bzd1, int i)
    {
        requestDisallowInterceptTouchEvent(true);
        d = i;
        bzd1.a(i);
        if (e != null)
        {
            e.a(bzd1);
        }
    }

    public void a(bze bze1)
    {
        e = bze1;
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public boolean a(bzd bzd1)
    {
        return bzd1.b();
    }

    public void b(bzd bzd1)
    {
        if (bzd1 != null)
        {
            bzd1.c();
            if (e != null)
            {
                e.b(bzd1);
            }
        }
    }

    public void b(bzd bzd1, int i)
    {
        if (d != i)
        {
            bzd1.a(i);
            d = i;
        }
    }

    public void c(bzd bzd1)
    {
        bzd1.d();
        if (e != null)
        {
            e.b(bzd1);
        }
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        float f = getResources().getDisplayMetrics().density;
        a.a(f);
        f = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
        a.b(f);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (b)
        {
            boolean flag;
            if (c)
            {
                a.b(motionevent);
                flag = true;
            } else
            if (a.a(motionevent))
            {
                c = true;
                MotionEvent motionevent1 = MotionEvent.obtain(motionevent);
                motionevent1.setAction(3);
                super.onTouchEvent(motionevent1);
                a.b(motionevent);
                flag = true;
            } else
            {
                flag = super.onTouchEvent(motionevent);
            }
            if (motionevent.getAction() == 1 || motionevent.getAction() == 3)
            {
                c = false;
            }
            return flag;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }
}
