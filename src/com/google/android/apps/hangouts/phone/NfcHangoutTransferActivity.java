// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import boy;
import dzj;
import g;
import gmp;
import gmq;
import gmu;
import gwt;
import gxe;
import gxj;
import hhw;

public class NfcHangoutTransferActivity extends hhw
    implements gmq
{

    private boy j;
    private gwt m;

    public NfcHangoutTransferActivity()
    {
        m = (new gwt(this, l)).a("active-hangouts-account").a(k).b(this);
    }

    public void a(boolean flag, gmp gmp1, gmp gmp2, int i, int k)
    {
        if (gmp2 == gmp.c)
        {
            j = j.c(m.c().b("account_name"));
            startActivity(g.a(j, null, null, false, 51, SystemClock.elapsedRealtime()));
        }
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (dzj.d())
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
                bundle = (new gxe()).b().a(j.a()).a(gxj);
                m.a(bundle);
                return;
            }
        }
        finish();
    }
}
