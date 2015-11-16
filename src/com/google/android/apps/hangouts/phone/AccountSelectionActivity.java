// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.content.Intent;
import android.os.Bundle;
import cjx;
import gqv;
import gqw;
import hax;
import hbd;
import hbo;
import hbu;
import hbv;
import hmb;
import l;

public class AccountSelectionActivity extends hmb
    implements gqw
{

    private hbd j;

    public AccountSelectionActivity()
    {
        j = (new hbd(this, r)).a(q).b(this);
    }

    public void a(boolean flag, gqv gqv1, gqv gqv2, int i, int k)
    {
        if (gqv2 == gqv.c)
        {
            gqv1 = (Intent)getIntent().getParcelableExtra("intent");
            gqv1.putExtra("account_id", k);
            startActivity(gqv1);
        }
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        boolean flag = getIntent().getBooleanExtra("sms_accts_only", false);
        bundle = new hbo();
        if (flag)
        {
            bundle.a(hbu, (new hbv()).a(getString(l.cb)).a().a(new cjx()).c());
        } else
        {
            bundle.a(hbu, (new hbv()).a(getString(l.cb)).a().a((new hax()).b("sms_only")).c());
        }
        j.a(bundle);
    }
}
