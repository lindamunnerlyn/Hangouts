// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.fragments;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import ani;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class  extends RelativeLayout
{

    private String a;
    private ani b;
    private String c;

    public void a()
    {
        if (a != null)
        {
            RealTimeChatService.a(b, a, false, false, false);
        }
    }

    public void a(ani ani, String s)
    {
        b = ani;
        a = s;
    }

    protected void onDetachedFromWindow()
    {
        c = null;
        super.onDetachedFromWindow();
    }

    public (Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }
}
