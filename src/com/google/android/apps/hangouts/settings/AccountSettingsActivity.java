// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.settings;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import dqd;
import g;
import gqu;
import grb;
import grn;
import hll;
import hmb;
import pq;

public class AccountSettingsActivity extends hmb
{

    public gqu j;

    public AccountSettingsActivity()
    {
        j = (new grn(this, r)).a(q).d();
        new hll(this, r);
        new dqd(this, this, r);
    }

    protected void onCreate(Bundle bundle)
    {
        Object obj;
        pq pq1;
        boolean flag;
        super.onCreate(bundle);
        setContentView(g.fJ);
        grb grb1 = j.c();
        pq1 = g();
        obj = grb1.b("display_name");
        bundle = grb1.b("account_name");
        flag = grb1.d("is_plus_page");
        if (pq1 == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj)))) goto _L2; else goto _L1
_L1:
        pq1.a(bundle);
_L4:
        return;
_L2:
        pq1.a(((CharSequence) (obj)));
        if (flag) goto _L4; else goto _L3
_L3:
        obj = SpannableStringBuilder.valueOf(bundle);
        ((SpannableStringBuilder) (obj)).setSpan(new ForegroundColorSpan(getResources().getColor(g.dA)), 0, bundle.length(), 33);
        pq1.b(((CharSequence) (obj)));
        return;
        if (flag && !TextUtils.isEmpty(((CharSequence) (obj))))
        {
            bundle = ((Bundle) (obj));
        }
        setTitle(bundle);
        return;
    }
}
