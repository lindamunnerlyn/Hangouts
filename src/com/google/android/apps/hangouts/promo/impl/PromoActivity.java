// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.promo.impl;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.FrameLayout;
import ap;
import bg;
import ctj;
import ctk;
import cto;
import ctt;
import g;
import gqu;
import gqv;
import gqw;
import hlp;

public class PromoActivity extends ctj
    implements gqw
{

    private static final cto p = new cto();
    private ctt m;
    private int n;
    private int o;

    public PromoActivity()
    {
        j.a(this);
    }

    public void a(boolean flag, gqv gqv1, gqv gqv2, int i, int j)
    {
        if (gqv2 == gqv.c)
        {
            m = (ctt)k.a(ctt);
            m.a(this);
            if (m.a() == 0)
            {
                finish();
            }
        }
    }

    public void g()
    {
        if (n + 1 < m.a())
        {
            int i = n;
            int j = n + 1;
            bg bg1 = u_().a();
            ObjectAnimator objectanimator;
            if (i < j)
            {
                bg1.a(g.oy, g.oz);
            } else
            {
                bg1.a(g.ox, g.oA);
            }
            objectanimator = ObjectAnimator.ofInt((FrameLayout)findViewById(g.oB), "backgroundColor", new int[] {
                getResources().getColor(m.a(i).c()), getResources().getColor(m.a(j).c())
            });
            objectanimator.setEvaluator(p);
            objectanimator.setDuration(getResources().getInteger(g.oC));
            objectanimator.start();
            bg1.b(g.oB, m.a(j).a());
            bg1.b();
            n = n + 1;
            return;
        } else
        {
            finish();
            return;
        }
    }

    public void onBackPressed()
    {
        m.b(n);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        m = (ctt)k.a(ctt);
        if (bundle != null)
        {
            n = bundle.getInt("current_item");
            o = getResources().getColor(m.a(n).c());
        }
        setContentView(g.oD);
        bundle = u_();
        if (bundle.a(g.oB) == null)
        {
            bundle = bundle.a();
            bundle.b(g.oB, m.a(n).a());
            bundle.b();
            o = getResources().getColor(m.a(n).c());
        }
        ((FrameLayout)findViewById(g.oB)).setBackgroundColor(o);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("current_item", n);
    }

}
