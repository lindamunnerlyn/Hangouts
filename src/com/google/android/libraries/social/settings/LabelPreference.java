// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import g;
import hfa;
import hga;
import o;

public class LabelPreference extends hfa
{

    private CharSequence b;
    private boolean c;
    private boolean d;
    private int e;
    private int f;

    public LabelPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = -1;
        d(g.tp);
        if (attributeset != null)
        {
            context = context.obtainStyledAttributes(attributeset, hga.r);
            f = context.getDimensionPixelSize(hga.t, -1);
            e = context.getInt(hga.s, 1);
            context.recycle();
        }
    }

    protected View a(ViewGroup viewgroup)
    {
        viewgroup = super.a(viewgroup);
        ((TextView)viewgroup.findViewById(o.I)).setAutoLinkMask(e);
        return viewgroup;
    }

    protected void a(View view)
    {
        super.a(view);
        if (f >= 0)
        {
            view.setMinimumHeight(f);
        }
        TextView textview = (TextView)view.findViewById(o.F);
        View view1 = view.findViewById(o.H);
        if (textview != null)
        {
            if (TextUtils.isEmpty(b) || c)
            {
                textview.setVisibility(8);
            } else
            {
                textview.setVisibility(0);
                textview.setText(b);
            }
        }
        view = (TextView)view.findViewById(o.I);
        if (d)
        {
            view.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (view1 != null)
        {
            int i;
            if (c)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view1.setVisibility(i);
        }
    }

    public boolean z_()
    {
        return true;
    }
}
