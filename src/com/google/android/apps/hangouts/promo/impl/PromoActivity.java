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
import cqz;
import cra;
import cre;
import crj;
import g;
import hgx;

public class PromoActivity extends cqz
{

    private static final cre o = new cre();
    private crj j;
    private int m;
    private int n;

    public PromoActivity()
    {
    }

    public void g()
    {
        if (m + 1 < j.a())
        {
            int i = m;
            int k = m + 1;
            bg bg1 = t_().a();
            ObjectAnimator objectanimator;
            if (i < k)
            {
                bg1.a(g.ow, g.ox);
            } else
            {
                bg1.a(g.ov, g.oy);
            }
            objectanimator = ObjectAnimator.ofInt((FrameLayout)findViewById(g.oz), "backgroundColor", new int[] {
                getResources().getColor(j.a(i).c()), getResources().getColor(j.a(k).c())
            });
            objectanimator.setEvaluator(o);
            objectanimator.setDuration(getResources().getInteger(g.oA));
            objectanimator.start();
            bg1.b(g.oz, j.a(k).a());
            bg1.b();
            m = m + 1;
            return;
        } else
        {
            finish();
            return;
        }
    }

    public void onBackPressed()
    {
        j.b(m);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        j = (crj)k.a(crj);
        if (j.a() == 0)
        {
            finish();
            return;
        }
        if (bundle != null)
        {
            m = bundle.getInt("current_item");
            n = getResources().getColor(j.a(m).c());
        }
        setContentView(g.oB);
        if (bundle == null)
        {
            bundle = t_().a();
            bundle.b(g.oz, j.a(m).a());
            bundle.b();
            n = getResources().getColor(j.a(m).c());
        }
        ((FrameLayout)findViewById(g.oz)).setBackgroundColor(n);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("current_item", m);
    }

}
