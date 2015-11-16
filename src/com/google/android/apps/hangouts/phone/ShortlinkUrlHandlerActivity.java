// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import ani;
import bpa;
import cpe;
import cpf;
import dbf;
import g;
import gmp;
import gmq;
import gwt;
import gxe;
import gxj;
import hhw;
import java.util.List;
import l;

public class ShortlinkUrlHandlerActivity extends hhw
    implements gmq
{

    private gwt j;

    public ShortlinkUrlHandlerActivity()
    {
        j = (new gwt(this, l)).a("active-hangouts-account").a(k).b(this);
    }

    private static ani a(String s)
    {
        int ai[] = dbf.c();
        int k = ai.length;
        for (int i = 0; i < k; i++)
        {
            ani ani1 = dbf.e(ai[i]);
            if (ani1.l() != null && (s == null || s.equals(ani1.l())))
            {
                return ani1;
            }
        }

        return null;
    }

    private void a(String s, String s1, String s2)
    {
        startActivity(g.a((new bpa(s, 1)).d(s1).e(s2).a(), null, null, false, 48, SystemClock.elapsedRealtime()));
        finish();
    }

    private void g()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setMessage(l.dS);
        builder.setPositiveButton(l.hJ, new cpe(this));
        builder.setOnCancelListener(new cpf(this));
        builder.show();
    }

    public void a(boolean flag, gmp gmp1, gmp gmp2, int i, int k)
    {
        Object obj;
        if (gmp2 != gmp.c)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        gmp1 = dbf.e(k);
        obj = getIntent().getData().getPathSegments();
        if (((List) (obj)).size() != 2) goto _L2; else goto _L1
_L1:
        gmp2 = (String)((List) (obj)).get(1);
        a(gmp1.a(), gmp1.l(), ((String) (gmp2)));
_L4:
        return;
_L2:
        if (((List) (obj)).size() != 3) goto _L4; else goto _L3
_L3:
        gmp2 = (String)((List) (obj)).get(1);
        obj = (String)((List) (obj)).get(2);
        a(gmp1.a(), ((String) (gmp2)), ((String) (obj)));
        return;
        finish();
        return;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent().getData().getPathSegments();
        if (bundle.size() != 2) goto _L2; else goto _L1
_L1:
        bundle = a(null);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        bundle = bundle.a();
_L6:
        bundle = (new gxe()).b().a(bundle).a(gxj);
        j.a(bundle);
        return;
_L4:
        g();
        return;
_L2:
        if (bundle.size() == 3)
        {
            bundle = a((String)bundle.get(1));
            if (bundle != null)
            {
                bundle = bundle.a();
            } else
            {
                bundle = null;
            }
        } else
        {
            g();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
