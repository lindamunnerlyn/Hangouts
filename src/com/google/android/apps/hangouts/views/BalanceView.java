// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import aoa;
import dcn;
import egg;
import egh;
import egi;
import gqu;
import gqz;
import grf;
import h;
import hlp;
import l;

public class BalanceView extends LinearLayout
{

    public boolean a;
    public final gqu b;
    private final grf c;
    private TextView d;
    private final gqz e;

    public BalanceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new egg(this);
        e = (gqz)hlp.a(getContext(), gqz);
        b = (gqu)hlp.a(getContext(), gqu);
        a(false);
        setOnClickListener(new egh(this));
        post(new egi(this));
    }

    public BalanceView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = new egg(this);
        e = (gqz)hlp.a(getContext(), gqz);
        b = (gqu)hlp.a(getContext(), gqu);
        a(false);
        setOnClickListener(new egh(this));
        post(new egi(this));
    }

    public BalanceView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        c = new egg(this);
        e = (gqz)hlp.a(getContext(), gqz);
        b = (gqu)hlp.a(getContext(), gqu);
        a(false);
        setOnClickListener(new egh(this));
        post(new egi(this));
    }

    private void a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            d.setText("");
            d.setContentDescription(getResources().getString(l.db));
            return;
        } else
        {
            d.setText(s);
            d.setContentDescription(getResources().getString(l.dg, new Object[] {
                s
            }));
            return;
        }
    }

    public void a()
    {
        if (b.b() && e.c(b.a()))
        {
            a(dcn.e(b.a()).W());
            return;
        } else
        {
            a("");
            return;
        }
    }

    public void a(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        setVisibility(i);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        a = true;
        e.a(c);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        a = false;
        e.b(c);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        d = (TextView)findViewById(h.gi);
        a();
    }
}
