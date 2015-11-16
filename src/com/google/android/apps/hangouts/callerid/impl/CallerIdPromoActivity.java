// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.callerid.impl;

import akq;
import android.content.Intent;
import android.os.Bundle;
import ap;
import bg;
import cqz;
import g;
import h;

public class CallerIdPromoActivity extends cqz
{

    public CallerIdPromoActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.iI);
        bundle = t_().a();
        bundle.a(h.hj, akq.a(getIntent().getBooleanExtra("callerid_from_promo_flow", false), getIntent().getStringExtra("callerid_current_sim_number")));
        bundle.b();
    }
}
