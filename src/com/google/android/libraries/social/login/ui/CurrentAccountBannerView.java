// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.login.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import g;
import hdt;
import mn;

public final class CurrentAccountBannerView extends LinearLayout
{

    public String a;
    private TextView b;
    private TextView c;
    private boolean d;
    private boolean e;

    public CurrentAccountBannerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public CurrentAccountBannerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        d = true;
        if (!e) goto _L2; else goto _L1
_L1:
        e = false;
        if (a == null) goto _L2; else goto _L3
_L3:
        Context context = getContext();
        if (android.os.Build.VERSION.SDK_INT < 16) goto _L5; else goto _L4
_L4:
        boolean flag;
        boolean flag1;
        if (context != null)
        {
            flag1 = mn.a((AccessibilityManager)context.getSystemService("accessibility"));
        } else
        {
            flag1 = false;
        }
        if (!flag1) goto _L5; else goto _L6
_L6:
        flag = true;
_L8:
        if (!flag)
        {
            g.a(new hdt(this), 2000L);
        }
_L2:
        return;
_L5:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        d = false;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        b = (TextView)findViewById(g.tF);
        c = (TextView)findViewById(g.tE);
    }
}
