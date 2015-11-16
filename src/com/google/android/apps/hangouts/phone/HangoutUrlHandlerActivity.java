// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import bph;
import cpr;
import cps;
import g;
import gqv;
import gqw;
import grb;
import hax;
import hbd;
import hbo;
import hbu;
import hbv;
import hmo;
import l;

public class HangoutUrlHandlerActivity extends hmo
    implements gqw
{

    private hbd j;

    public HangoutUrlHandlerActivity()
    {
        j = (new hbd(this, l)).a("active-hangouts-account").a(k).b(this);
    }

    public void a(boolean flag, gqv gqv1, gqv gqv2, int i, int k)
    {
        if (gqv2 == gqv.c)
        {
            gqv1 = bph.a(getIntent().getData(), j.c().b("account_name"), null);
            if (gqv1 == null)
            {
                gqv1 = new android.app.AlertDialog.Builder(this);
                gqv1.setMessage(l.dB);
                gqv1.setPositiveButton(l.hd, new cpr(this));
                gqv1.setOnCancelListener(new cps(this));
                gqv1.show();
                return;
            } else
            {
                startActivity(g.a(gqv1, null, null, false, 51, SystemClock.elapsedRealtime()));
                finish();
                return;
            }
        } else
        {
            finish();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = (new hbo()).b().a(hbu, (new hbv()).a().a((new hax()).a("logged_in").b("sms_only")).c());
        j.a(bundle);
    }
}
