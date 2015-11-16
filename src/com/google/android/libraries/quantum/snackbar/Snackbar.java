// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.quantum.snackbar;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import g;
import gqg;
import gqh;
import gqq;
import gqr;
import gqs;
import java.util.List;

public class Snackbar extends LinearLayout
    implements gqg
{

    public final gqh a;
    private final TextView b;
    private final TextView c;
    private int d;

    public Snackbar(Context context)
    {
        this(context, null);
    }

    public Snackbar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, g.st);
    }

    public Snackbar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new gqh(this);
        d = 1;
        LayoutInflater.from(context).inflate(g.sw, this);
        b = (TextView)findViewById(g.sv);
        c = (TextView)findViewById(g.su);
        context = context.obtainStyledAttributes(attributeset, gqq.K, i, g.sx);
        attributeset = context.getDrawable(gqq.M);
        ColorStateList colorstatelist = context.getColorStateList(gqq.N);
        ColorStateList colorstatelist1 = context.getColorStateList(gqq.L);
        context.recycle();
        setOrientation(0);
        setBackgroundDrawable(attributeset);
        if (colorstatelist != null)
        {
            a(colorstatelist);
        }
        if (colorstatelist1 != null)
        {
            b(colorstatelist1);
        }
    }

    public static void a(Snackbar snackbar)
    {
        String s = snackbar.b.getText().toString().trim();
        if (!TextUtils.isEmpty(s))
        {
            Context context = snackbar.getContext();
            AccessibilityManager accessibilitymanager = (AccessibilityManager)context.getSystemService("accessibility");
            if (accessibilitymanager.isEnabled())
            {
                AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain(32);
                accessibilityevent.setClassName(com/google/android/libraries/quantum/snackbar/Snackbar.getName());
                accessibilityevent.setPackageName(context.getPackageName());
                accessibilityevent.getText().add(s);
                accessibilityevent.setEnabled(true);
                snackbar = snackbar.c.getText().toString().trim();
                if (!TextUtils.isEmpty(snackbar))
                {
                    accessibilityevent.getText().add(snackbar);
                }
                accessibilitymanager.sendAccessibilityEvent(accessibilityevent);
            }
        }
    }

    public void a()
    {
        gqh gqh1 = a;
        ObjectAnimator objectanimator = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[] {
            PropertyValuesHolder.ofFloat("alpha", new float[] {
                0.0F, 1.0F
            }), PropertyValuesHolder.ofFloat("translationY", new float[] {
                (float)getHeight(), 0.0F
            })
        });
        objectanimator.addListener(new gqr(this));
        gqh1.a(objectanimator);
    }

    public void a(ColorStateList colorstatelist)
    {
        b.setTextColor(colorstatelist);
    }

    public void a(CharSequence charsequence)
    {
        a(charsequence, null, null);
    }

    public void a(CharSequence charsequence, String s, android.view.View.OnClickListener onclicklistener)
    {
        b.setText(charsequence);
        c.setText(s);
        c.setOnClickListener(onclicklistener);
        charsequence = c;
        byte byte0;
        if (TextUtils.isEmpty(s))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        charsequence.setVisibility(byte0);
        b.requestLayout();
    }

    public void b()
    {
        gqh gqh1 = a;
        ObjectAnimator objectanimator = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[] {
            PropertyValuesHolder.ofFloat("alpha", new float[] {
                1.0F, 0.0F
            }), PropertyValuesHolder.ofFloat("translationY", new float[] {
                0.0F, (float)getHeight()
            })
        });
        objectanimator.addListener(new gqs(this));
        gqh1.b(objectanimator);
    }

    public void b(ColorStateList colorstatelist)
    {
        c.setTextColor(colorstatelist);
    }

    public boolean c()
    {
        return getVisibility() != 0;
    }

    public int d()
    {
        return d;
    }
}
