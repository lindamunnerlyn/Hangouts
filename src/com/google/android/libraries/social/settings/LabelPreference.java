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
import hjr;
import hkr;
import o;

public class LabelPreference extends hjr
{

    private CharSequence a;
    private boolean c;
    private boolean d;
    private int e;
    private int f;

    public LabelPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = -1;
        d(g.tQ);
        if (attributeset != null)
        {
            context = context.obtainStyledAttributes(attributeset, hkr.r);
            f = context.getDimensionPixelSize(hkr.t, -1);
            e = context.getInt(hkr.s, 1);
            context.recycle();
        }
    }

    public boolean B_()
    {
        return true;
    }

    protected View a(ViewGroup viewgroup)
    {
        viewgroup = super.a(viewgroup);
        ((TextView)viewgroup.findViewById(o.k)).setAutoLinkMask(e);
        return viewgroup;
    }

    protected void a(View view)
    {
        super.a(view);
        if (f >= 0)
        {
            view.setMinimumHeight(f);
        }
        TextView textview = (TextView)view.findViewById(o.g);
        View view1 = view.findViewById(o.j);
        if (textview != null)
        {
            if (TextUtils.isEmpty(a) || c)
            {
                textview.setVisibility(8);
            } else
            {
                textview.setVisibility(0);
                textview.setText(a);
            }
        }
        view = (TextView)view.findViewById(o.k);
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
}
