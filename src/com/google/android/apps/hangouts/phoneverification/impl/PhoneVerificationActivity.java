// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phoneverification.impl;

import android.content.Intent;
import android.os.Bundle;
import ap;
import bg;
import crs;
import g;
import grn;
import hmo;
import w;

public class PhoneVerificationActivity extends hmo
{

    public PhoneVerificationActivity()
    {
        (new grn(this, l)).a(k);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.nY);
        if (bundle != null)
        {
            return;
        } else
        {
            bundle = new crs(getIntent().getBooleanExtra("from_settings", false));
            bg bg1 = u_().a();
            bg1.a(w.n, bundle.a());
            bg1.b();
            return;
        }
    }
}
