// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.conversation.v2.stickerpicker.impl;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import bcr;
import bcs;
import bct;
import bcu;
import jq;
import lg;

public class SlidingTabLayout extends HorizontalScrollView
{

    public ViewPager a;
    public lg b;
    public final bcu c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private SparseArray h;

    public SlidingTabLayout(Context context)
    {
        this(context, null);
    }

    public SlidingTabLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SlidingTabLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        h = new SparseArray();
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        d = (int)(24F * getResources().getDisplayMetrics().density);
        attributeset = context.getTheme().obtainStyledAttributes(attributeset, bcr.J, 0, 0);
        i = attributeset.getInteger(bcr.K, 0);
        attributeset.recycle();
        c = new bcu(context, i);
        addView(c, -1, -2);
        return;
        context;
        attributeset.recycle();
        throw context;
    }

    public View a(int i)
    {
        if (c == null || i >= c.getChildCount())
        {
            return null;
        } else
        {
            return c.getChildAt(i);
        }
    }

    protected TextView a(Context context)
    {
        context = new TextView(context);
        context.setGravity(17);
        context.setTextSize(2, 12F);
        context.setTypeface(Typeface.DEFAULT_BOLD);
        context.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        TypedValue typedvalue = new TypedValue();
        getContext().getTheme().resolveAttribute(0x101030e, typedvalue, true);
        context.setBackgroundResource(typedvalue.resourceId);
        context.setAllCaps(true);
        int i = (int)(16F * getResources().getDisplayMetrics().density);
        context.setPadding(i, i, i, i);
        return context;
    }

    public void a()
    {
        g = true;
    }

    public void a(int i, int j)
    {
        e = i;
        f = j;
    }

    public void a(ViewPager viewpager)
    {
        c.removeAllViews();
        a = viewpager;
        if (viewpager != null)
        {
            viewpager.a(new bcs(this));
            jq jq1 = a.b();
            bct bct1 = new bct(this);
            if (jq1 != null)
            {
                int i = 0;
                while (i < jq1.b()) 
                {
                    Object obj;
                    Object obj1;
                    if (e != 0)
                    {
                        obj = LayoutInflater.from(getContext()).inflate(e, c, false);
                        viewpager = (TextView)((View) (obj)).findViewById(f);
                    } else
                    {
                        viewpager = null;
                        obj = null;
                    }
                    obj1 = obj;
                    if (obj == null)
                    {
                        obj1 = a(getContext());
                    }
                    if (viewpager == null && android/widget/TextView.isInstance(obj1))
                    {
                        viewpager = (TextView)obj1;
                    }
                    if (g)
                    {
                        obj = (android.widget.LinearLayout.LayoutParams)((View) (obj1)).getLayoutParams();
                        obj.width = 0;
                        obj.weight = 1.0F;
                    }
                    viewpager.setText(jq1.c(i));
                    ((View) (obj1)).setOnClickListener(bct1);
                    viewpager = (String)h.get(i, null);
                    if (viewpager != null)
                    {
                        ((View) (obj1)).setContentDescription(viewpager);
                    }
                    c.addView(((View) (obj1)));
                    if (i == a.c())
                    {
                        ((View) (obj1)).setSelected(true);
                    }
                    i++;
                }
            }
        }
    }

    public void b(int i)
    {
        if (d != i)
        {
            d = i;
            if (a != null)
            {
                b(a.c(), 0);
            }
        }
    }

    public void b(int i, int j)
    {
        int k = c.getChildCount();
        View view;
        if (k != 0 && i >= 0 && i < k)
        {
            if ((view = c.getChildAt(i)) != null)
            {
label0:
                {
                    int l = view.getLeft() + j;
                    if (i <= 0)
                    {
                        i = l;
                        if (j <= 0)
                        {
                            break label0;
                        }
                    }
                    i = l - d;
                }
                scrollTo(i, 0);
                return;
            }
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (a != null)
        {
            b(a.c(), 0);
        }
    }
}
