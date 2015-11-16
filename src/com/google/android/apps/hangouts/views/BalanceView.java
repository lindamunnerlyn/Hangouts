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
import ani;
import dbf;
import ede;
import edf;
import edg;
import gmo;
import gms;
import gmy;
import h;
import hgx;
import l;

public class BalanceView extends LinearLayout
{

    private final gmy a;
    private TextView b;
    private boolean c;
    private final gmo d;
    private final gms e;

    public BalanceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new ede(this);
        e = (gms)hgx.a(getContext(), gms);
        d = (gmo)hgx.a(getContext(), gmo);
        a(false);
        setOnClickListener(new edf(this));
        post(new edg(this));
    }

    public BalanceView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new ede(this);
        e = (gms)hgx.a(getContext(), gms);
        d = (gmo)hgx.a(getContext(), gmo);
        a(false);
        setOnClickListener(new edf(this));
        post(new edg(this));
    }

    public BalanceView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        a = new ede(this);
        e = (gms)hgx.a(getContext(), gms);
        d = (gmo)hgx.a(getContext(), gmo);
        a(false);
        setOnClickListener(new edf(this));
        post(new edg(this));
    }

    private void a()
    {
        if (d.b() && e.c(d.a()))
        {
            a(dbf.e(d.a()).Z());
            return;
        } else
        {
            a("");
            return;
        }
    }

    public static void a(BalanceView balanceview)
    {
        balanceview.a();
    }

    private void a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            b.setText("");
            b.setContentDescription(getResources().getString(l.ds));
            return;
        } else
        {
            b.setText(s);
            b.setContentDescription(getResources().getString(l.dx, new Object[] {
                s
            }));
            return;
        }
    }

    public static gmo b(BalanceView balanceview)
    {
        return balanceview.d;
    }

    public static boolean c(BalanceView balanceview)
    {
        return balanceview.c;
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
        c = true;
        e.a(a);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        c = false;
        e.b(a);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        b = (TextView)findViewById(h.gA);
        a();
    }
}
