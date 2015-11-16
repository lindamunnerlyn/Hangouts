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
import ebl;
import ebm;
import ebn;
import ees;
import eet;
import g;
import gmo;
import h;
import hgx;
import lg;

public class TabHostEx extends TabHost
{

    private boolean a;
    private MainViewPager b;
    private TabWidget c;
    private gmo d;
    private final android.widget.TabHost.TabContentFactory e;
    private final lg f;
    private final android.widget.TabHost.OnTabChangeListener g;

    public TabHostEx(Context context)
    {
        super(context);
        c = getTabWidget();
        e = new ebl(this);
        f = new ebm(this);
        g = new ebn(this);
    }

    public TabHostEx(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = getTabWidget();
        e = new ebl(this);
        f = new ebm(this);
        g = new ebn(this);
    }

    public static android.widget.TabHost.OnTabChangeListener a(TabHostEx tabhostex)
    {
        return tabhostex.g;
    }

    private void a()
    {
        int i;
        if (!a && c.getTabCount() > 1)
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
                f1 = getResources().getDimension(g.eN);
            } else
            {
                f1 = 0.0F;
            }
            setElevation(f1);
        }
        c.setVisibility(i);
    }

    private void a(int i)
    {
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            int j = 0;
            while (j < c.getChildCount()) 
            {
                ImageView imageview = (ImageView)c.getChildAt(j).findViewById(h.go);
                if (imageview != null)
                {
                    TypedValue typedvalue = new TypedValue();
                    Resources resources = getResources();
                    int k;
                    if (j == i)
                    {
                        k = g.dX;
                    } else
                    {
                        k = g.dW;
                    }
                    resources.getValue(k, typedvalue, true);
                    imageview.setAlpha(typedvalue.getFloat());
                }
                j++;
            }
        }
    }

    public static void a(TabHostEx tabhostex, int i)
    {
        tabhostex.a(i);
    }

    public static MainViewPager b(TabHostEx tabhostex)
    {
        return tabhostex.b;
    }

    public static gmo c(TabHostEx tabhostex)
    {
        return tabhostex.d;
    }

    public void a(LayoutInflater layoutinflater)
    {
        setOnTabChangedListener(null);
        clearAllTabs();
        eet eet1 = b.i();
        int k = eet1.b();
        for (int i = 0; i < k; i++)
        {
            ees ees1 = eet1.d(i);
            View view = layoutinflater.inflate(g.hg, null);
            ImageView imageview = (ImageView)view.findViewById(h.go);
            imageview.setContentDescription(getResources().getString(ees1.a));
            imageview.setImageResource(ees1.b);
            addTab(newTabSpec(ees1.d).setIndicator(view).setContent(e));
        }

        if (k > 0)
        {
            int j = b.c();
            setCurrentTab(j);
            a(j);
        }
        a();
        setOnTabChangedListener(g);
    }

    public void a(MainViewPager mainviewpager)
    {
        b = mainviewpager;
        b.b(f);
    }

    public void a(boolean flag)
    {
        if (a != flag)
        {
            a = flag;
            a();
        }
    }

    public void onTouchModeChanged(boolean flag)
    {
    }

    public void setup()
    {
        super.setup();
        c = getTabWidget();
        d = (gmo)hgx.b(getContext()).a(gmo);
    }
}
