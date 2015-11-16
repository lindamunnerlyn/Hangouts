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
import bcb;
import bcc;
import bcd;
import bce;
import jq;
import lg;

public class SlidingTabLayout extends HorizontalScrollView
{

    private int a;
    private int b;
    private int c;
    private boolean d;
    private ViewPager e;
    private SparseArray f;
    private lg g;
    private final bce h;

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
        f = new SparseArray();
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        a = (int)(24F * getResources().getDisplayMetrics().density);
        attributeset = context.getTheme().obtainStyledAttributes(attributeset, bcb.J, 0, 0);
        i = attributeset.getInteger(bcb.K, 0);
        attributeset.recycle();
        h = new bce(context, i);
        addView(h, -1, -2);
        return;
        context;
        attributeset.recycle();
        throw context;
    }

    public static bce a(SlidingTabLayout slidingtablayout)
    {
        return slidingtablayout.h;
    }

    public static void a(SlidingTabLayout slidingtablayout, int i, int j)
    {
        slidingtablayout.b(i, j);
    }

    public static lg b(SlidingTabLayout slidingtablayout)
    {
        return slidingtablayout.g;
    }

    private void b(int i, int j)
    {
        int k = h.getChildCount();
        View view;
        if (k != 0 && i >= 0 && i < k)
        {
            if ((view = h.getChildAt(i)) != null)
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
                    i = l - a;
                }
                scrollTo(i, 0);
                return;
            }
        }
    }

    public static ViewPager c(SlidingTabLayout slidingtablayout)
    {
        return slidingtablayout.e;
    }

    public View a(int i)
    {
        if (h == null || i >= h.getChildCount())
        {
            return null;
        } else
        {
            return h.getChildAt(i);
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
        d = true;
    }

    public void a(int i, int j)
    {
        b = i;
        c = j;
    }

    public void a(ViewPager viewpager)
    {
        h.removeAllViews();
        e = viewpager;
        if (viewpager != null)
        {
            viewpager.a(new bcc(this));
            jq jq1 = e.b();
            bcd bcd1 = new bcd(this);
            if (jq1 != null)
            {
                int i = 0;
                while (i < jq1.b()) 
                {
                    Object obj;
                    Object obj1;
                    if (b != 0)
                    {
                        obj = LayoutInflater.from(getContext()).inflate(b, h, false);
                        viewpager = (TextView)((View) (obj)).findViewById(c);
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
                    if (d)
                    {
                        obj = (android.widget.LinearLayout.LayoutParams)((View) (obj1)).getLayoutParams();
                        obj.width = 0;
                        obj.weight = 1.0F;
                    }
                    viewpager.setText(jq1.c(i));
                    ((View) (obj1)).setOnClickListener(bcd1);
                    viewpager = (String)f.get(i, null);
                    if (viewpager != null)
                    {
                        ((View) (obj1)).setContentDescription(viewpager);
                    }
                    h.addView(((View) (obj1)));
                    if (i == e.c())
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
        if (a != i)
        {
            a = i;
            if (e != null)
            {
                b(e.c(), 0);
            }
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (e != null)
        {
            b(e.c(), 0);
        }
    }
}
