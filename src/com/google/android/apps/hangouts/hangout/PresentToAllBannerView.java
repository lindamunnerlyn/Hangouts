// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.FrameLayout;
import bof;
import bos;
import bot;
import brq;
import brr;
import brs;
import g;
import h;

public final class PresentToAllBannerView extends FrameLayout
    implements bos
{

    private final Button a;
    private final bof b = bof.a();
    private final brs c = new brs(this);

    public PresentToAllBannerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = (Button)LayoutInflater.from(context).inflate(g.gh, this, true).findViewById(h.eJ);
        a.setOnClickListener(new brq(this));
        a.setAllCaps(true);
    }

    public static void a(PresentToAllBannerView presenttoallbannerview)
    {
        if (presenttoallbannerview.getVisibility() == 0)
        {
            if (presenttoallbannerview.getAnimation() != null)
            {
                presenttoallbannerview.getAnimation().cancel();
            }
            int i = -presenttoallbannerview.getHeight();
            brr brr1 = new brr(presenttoallbannerview, (android.widget.RelativeLayout.LayoutParams)presenttoallbannerview.getLayoutParams(), i);
            brr1.setDuration(presenttoallbannerview.getContext().getResources().getInteger(g.eX));
            presenttoallbannerview.startAnimation(brr1);
        }
    }

    public void a(int i)
    {
        if (i != 2)
        {
            setVisibility(8);
        }
    }

    public void a(bot bot)
    {
        b.a(c);
    }

    public void i_()
    {
        b.b(c);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
    }
}
