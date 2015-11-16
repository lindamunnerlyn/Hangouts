// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import bph;
import ecn;
import g;
import gqv;
import gqw;
import grb;
import hbd;
import hbo;
import hbu;
import hmo;

public class NfcHangoutTransferActivity extends hmo
    implements gqw
{

    private bph j;
    private hbd m;

    public NfcHangoutTransferActivity()
    {
        m = (new hbd(this, l)).a("active-hangouts-account").a(k).b(this);
    }

    public void a(boolean flag, gqv gqv1, gqv gqv2, int i, int k)
    {
        if (gqv2 == gqv.c)
        {
            j = j.c(m.c().b("account_name"));
            startActivity(g.a(j, null, null, false, 51, SystemClock.elapsedRealtime()));
        }
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (ecn.d())
        {
            bundle = getIntent();
            boolean flag;
            if ("android.nfc.action.NDEF_DISCOVERED".equals(bundle.getAction()) && bundle.getData() != null && bundle.getData().toString().startsWith("vnd.android.nfc://ext/com.google.android.apps.hangouts:hangoutrequest"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                j = g.e(getIntent());
                bundle = (new hbo()).b().a(j.a()).a(hbu);
                m.a(bundle);
                return;
            }
        }
        finish();
    }
}
