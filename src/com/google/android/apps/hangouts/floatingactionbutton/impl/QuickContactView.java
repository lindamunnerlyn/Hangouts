// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.floatingactionbutton.impl;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import ani;
import com.google.android.apps.hangouts.views.AvatarView;
import g;
import h;

public class QuickContactView extends FrameLayout
{

    private String a;
    private String b;
    private String c;
    private TextView d;
    private AvatarView e;

    public QuickContactView(Context context)
    {
        this(context, null);
    }

    public QuickContactView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public QuickContactView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        inflate(context, h.hQ, this);
        d = (TextView)findViewById(g.lO);
        e = (AvatarView)findViewById(g.lL);
        e.e();
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a(context);
        }
    }

    public String a()
    {
        return a;
    }

    public void a(Context context)
    {
        e.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, g.lG));
    }

    public void a(String s)
    {
        a = s;
        d.setText(s);
    }

    public void a(String s, String s1, ani ani)
    {
        b = s;
        e.a(s, s1, ani);
    }

    public String b()
    {
        return b;
    }

    public void b(String s)
    {
        c = s;
    }

    public String c()
    {
        return c;
    }

    public void d()
    {
        e.d();
    }
}
