// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import boy;
import coa;
import cob;
import g;
import gmp;
import gmq;
import gmu;
import gwn;
import gwt;
import gxe;
import gxj;
import gxk;
import hhw;
import l;

public class HangoutUrlHandlerActivity extends hhw
    implements gmq
{

    private gwt j;

    public HangoutUrlHandlerActivity()
    {
        j = (new gwt(this, l)).a("active-hangouts-account").a(k).b(this);
    }

    public void a(boolean flag, gmp gmp1, gmp gmp2, int i, int k)
    {
        if (gmp2 == gmp.c)
        {
            gmp1 = boy.a(getIntent().getData(), j.c().b("account_name"), null);
            if (gmp1 == null)
            {
                gmp1 = new android.app.AlertDialog.Builder(this);
                gmp1.setMessage(l.dS);
                gmp1.setPositiveButton(l.hJ, new coa(this));
                gmp1.setOnCancelListener(new cob(this));
                gmp1.show();
                return;
            } else
            {
                startActivity(g.a(gmp1, null, null, false, 51, SystemClock.elapsedRealtime()));
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
        bundle = (new gxe()).b().a(gxj, (new gxk()).a().a((new gwn()).a("logged_in").b("sms_only")).c());
        j.a(bundle);
    }
}
