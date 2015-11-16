// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import boo;
import bpb;
import bpc;
import brz;
import bsb;
import g;
import h;

public final class PresentToAllBannerView extends FrameLayout
    implements bpb
{

    private final Button a;
    private final boo b = boo.a();
    private final bsb c = new bsb(this);

    public PresentToAllBannerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = (Button)LayoutInflater.from(context).inflate(g.gd, this, true).findViewById(h.er);
        a.setOnClickListener(new brz(this));
        a.setAllCaps(true);
    }

    public void a(int i)
    {
        if (i != 2)
        {
            setVisibility(8);
        }
    }

    public void a(bpc bpc)
    {
        b.a(c);
    }

    public void j_()
    {
        b.b(c);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
    }
}
