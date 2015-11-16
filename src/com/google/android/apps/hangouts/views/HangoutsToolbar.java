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
import gbh;
import h;

public class HangoutsToolbar extends Toolbar
{

    private ViewGroup b;
    private View c;
    private TextView d;
    private TextView e;
    private int f;
    private float g;
    private CharSequence h;

    public HangoutsToolbar(Context context)
    {
        this(context, null);
    }

    public HangoutsToolbar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public HangoutsToolbar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        f = 0;
    }

    private void A()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(d.getText());
        if (!TextUtils.isEmpty(h))
        {
            stringbuilder.append(", ");
            stringbuilder.append(h);
        }
        c.setContentDescription(stringbuilder.toString());
    }

    private void z()
    {
        if (TextUtils.isEmpty(e.getText()))
        {
            d.setTextSize(0, getResources().getDimension(g.eK));
            e.setVisibility(8);
            return;
        } else
        {
            d.setTextSize(0, getResources().getDimension(g.eu));
            e.setTextSize(0, getResources().getDimension(g.eL));
            e.setVisibility(0);
            return;
        }
    }

    public void a(float f1)
    {
        setElevation(f1);
    }

    public void a(View view)
    {
        b.addView(view);
    }

    public void b(CharSequence charsequence)
    {
        d.setText(charsequence);
        A();
        z();
    }

    public void c(CharSequence charsequence)
    {
        e.setText(charsequence);
        e(charsequence);
        z();
    }

    public void e(CharSequence charsequence)
    {
        h = charsequence;
        A();
    }

    public int getVisibility()
    {
        return f;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        b = (ViewGroup)findViewById(h.an);
        c = findViewById(h.gB);
        d = (TextView)findViewById(h.gz);
        e = (TextView)findViewById(h.gm);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            g = y();
        }
    }

    public void setVisibility(int i)
    {
        if (i == getVisibility())
        {
            return;
        }
        if (i == 8)
        {
            setScaleY(0.0F);
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                a(0.0F);
            }
            f = i;
            return;
        }
        if (i == 0)
        {
            setScaleY(1.0F);
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                a(g);
            }
            f = i;
            return;
        } else
        {
            gbh.a((new StringBuilder(44)).append("Does not support visibility type ").append(i).toString());
            return;
        }
    }

    public View v()
    {
        return c;
    }

    public TextView w()
    {
        return d;
    }

    public TextView x()
    {
        return e;
    }

    public float y()
    {
        return getElevation();
    }
}
