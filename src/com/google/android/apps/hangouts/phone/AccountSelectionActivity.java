// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.content.Intent;
import android.os.Bundle;
import cis;
import gmp;
import gmq;
import gwn;
import gwt;
import gxe;
import gxj;
import gxk;
import hhj;
import l;

public class AccountSelectionActivity extends hhj
    implements gmq
{

    private gwt j;

    public AccountSelectionActivity()
    {
        j = (new gwt(this, q)).a(p).b(this);
    }

    public void a(boolean flag, gmp gmp1, gmp gmp2, int i, int k)
    {
        if (gmp2 == gmp.c)
        {
            gmp1 = (Intent)getIntent().getParcelableExtra("intent");
            gmp1.putExtra("account_id", k);
            startActivity(gmp1);
        }
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        boolean flag = getIntent().getBooleanExtra("sms_accts_only", false);
        bundle = new gxe();
        if (flag)
        {
            bundle.a(gxj, (new gxk()).a(getString(l.ck)).a().a(new cis()).c());
        } else
        {
            bundle.a(gxj, (new gxk()).a(getString(l.ck)).a().a((new gwn()).b("sms_only")).c());
        }
        j.a(bundle);
    }
}
