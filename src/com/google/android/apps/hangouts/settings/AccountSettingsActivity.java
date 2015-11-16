// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.settings;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import dnk;
import g;
import gmo;
import gmu;
import gng;
import hgt;
import hhj;
import po;

public class AccountSettingsActivity extends hhj
{

    public gmo j;

    public AccountSettingsActivity()
    {
        j = (new gng(this, q)).a(p).d();
        new hgt(this, q);
        new dnk(this, this, q);
    }

    protected void onCreate(Bundle bundle)
    {
        Object obj;
        po po1;
        boolean flag;
        super.onCreate(bundle);
        setContentView(g.fL);
        gmu gmu1 = j.c();
        po1 = g();
        obj = gmu1.b("display_name");
        bundle = gmu1.b("account_name");
        flag = gmu1.d("is_plus_page");
        if (po1 == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj)))) goto _L2; else goto _L1
_L1:
        po1.a(bundle);
_L4:
        return;
_L2:
        po1.a(((CharSequence) (obj)));
        if (flag) goto _L4; else goto _L3
_L3:
        obj = SpannableStringBuilder.valueOf(bundle);
        ((SpannableStringBuilder) (obj)).setSpan(new ForegroundColorSpan(getResources().getColor(g.dB)), 0, bundle.length(), 33);
        po1.b(((CharSequence) (obj)));
        return;
        if (flag && !TextUtils.isEmpty(((CharSequence) (obj))))
        {
            bundle = ((Bundle) (obj));
        }
        setTitle(bundle);
        return;
    }
}
