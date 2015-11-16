// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import g;
import gdv;
import h;

public class HangoutsToolbar extends Toolbar
{

    private ViewGroup e;
    private View f;
    private TextView g;
    private TextView h;
    private int i;
    private float j;
    private CharSequence k;

    public HangoutsToolbar(Context context)
    {
        this(context, null);
    }

    public HangoutsToolbar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public HangoutsToolbar(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        i = 0;
    }

    private void A()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(g.getText());
        if (!TextUtils.isEmpty(k))
        {
            stringbuilder.append(", ");
            stringbuilder.append(k);
        }
        f.setContentDescription(stringbuilder.toString());
    }

    private void z()
    {
        if (TextUtils.isEmpty(h.getText()))
        {
            g.setTextSize(0, getResources().getDimension(g.eI));
            h.setVisibility(8);
            return;
        } else
        {
            g.setTextSize(0, getResources().getDimension(g.es));
            h.setTextSize(0, getResources().getDimension(g.eJ));
            h.setVisibility(0);
            return;
        }
    }

    public void a(float f1)
    {
        setElevation(f1);
    }

    public void a(View view)
    {
        e.addView(view);
    }

    public void b(CharSequence charsequence)
    {
        g.setText(charsequence);
        A();
        z();
    }

    public void c(CharSequence charsequence)
    {
        h.setText(charsequence);
        e(charsequence);
        z();
    }

    public void e(CharSequence charsequence)
    {
        k = charsequence;
        A();
    }

    public int getVisibility()
    {
        return i;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        e = (ViewGroup)findViewById(h.aj);
        f = findViewById(h.gj);
        g = (TextView)findViewById(h.gh);
        h = (TextView)findViewById(h.fU);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            j = y();
        }
    }

    public void setVisibility(int l)
    {
        if (l == getVisibility())
        {
            return;
        }
        if (l == 8)
        {
            setScaleY(0.0F);
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                a(0.0F);
            }
            i = l;
            return;
        }
        if (l == 0)
        {
            setScaleY(1.0F);
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                a(j);
            }
            i = l;
            return;
        } else
        {
            gdv.a((new StringBuilder(44)).append("Does not support visibility type ").append(l).toString());
            return;
        }
    }

    public View v()
    {
        return f;
    }

    public TextView w()
    {
        return g;
    }

    public TextView x()
    {
        return h;
    }

    public float y()
    {
        return getElevation();
    }
}
