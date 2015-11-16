// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabWidget;
import com.google.android.apps.hangouts.views.MainViewPager;
import eej;
import eek;
import eel;
import ehu;
import ehv;
import g;
import gqu;
import h;
import hlp;
import lg;

public class TabHostEx extends TabHost
{

    public MainViewPager a;
    public gqu b;
    public final android.widget.TabHost.OnTabChangeListener c;
    private boolean d;
    private TabWidget e;
    private final android.widget.TabHost.TabContentFactory f;
    private final lg g;

    public TabHostEx(Context context)
    {
        super(context);
        e = getTabWidget();
        f = new eej(this);
        g = new eek(this);
        c = new eel(this);
    }

    public TabHostEx(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = getTabWidget();
        f = new eej(this);
        g = new eek(this);
        c = new eel(this);
    }

    private void a()
    {
        int i;
        if (!d && e.getTabCount() > 1)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            float f1;
            if (i == 0)
            {
                f1 = getResources().getDimension(g.eL);
            } else
            {
                f1 = 0.0F;
            }
            setElevation(f1);
        }
        e.setVisibility(i);
    }

    public void a(int i)
    {
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            int j = 0;
            while (j < e.getChildCount()) 
            {
                ImageView imageview = (ImageView)e.getChildAt(j).findViewById(h.fW);
                if (imageview != null)
                {
                    TypedValue typedvalue = new TypedValue();
                    Resources resources = getResources();
                    int k;
                    if (j == i)
                    {
                        k = g.dV;
                    } else
                    {
                        k = g.dU;
                    }
                    resources.getValue(k, typedvalue, true);
                    imageview.setAlpha(typedvalue.getFloat());
                }
                j++;
            }
        }
    }

    public void a(LayoutInflater layoutinflater)
    {
        setOnTabChangedListener(null);
        clearAllTabs();
        ehv ehv1 = a.i();
        int k = ehv1.b();
        for (int i = 0; i < k; i++)
        {
            ehu ehu1 = ehv1.d(i);
            View view = layoutinflater.inflate(g.gY, null);
            ImageView imageview = (ImageView)view.findViewById(h.fW);
            imageview.setContentDescription(getResources().getString(ehu1.a));
            imageview.setImageResource(ehu1.b);
            addTab(newTabSpec(ehu1.d).setIndicator(view).setContent(f));
        }

        if (k > 0)
        {
            int j = a.c();
            setCurrentTab(j);
            a(j);
        }
        a();
        setOnTabChangedListener(c);
    }

    public void a(MainViewPager mainviewpager)
    {
        a = mainviewpager;
        a.b(g);
    }

    public void a(boolean flag)
    {
        if (d != flag)
        {
            d = flag;
            a();
        }
    }

    public void onTouchModeChanged(boolean flag)
    {
    }

    public void setup()
    {
        super.setup();
        e = getTabWidget();
        b = (gqu)hlp.b(getContext()).a(gqu);
    }
}
