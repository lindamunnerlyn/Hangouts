// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.callerid.impl;

import akn;
import android.content.Intent;
import android.os.Bundle;
import ap;
import bg;
import ctj;
import g;
import h;

public class CallerIdPromoActivity extends ctj
{

    public CallerIdPromoActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.iA);
        bundle = u_().a();
        bundle.a(h.gP, akn.a(getIntent().getBooleanExtra("callerid_from_promo_flow", false), getIntent().getStringExtra("callerid_current_sim_number")));
        bundle.b();
    }
}
