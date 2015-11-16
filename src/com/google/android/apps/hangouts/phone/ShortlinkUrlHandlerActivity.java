// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import aoa;
import bpj;
import cqu;
import cqv;
import dcn;
import g;
import gqv;
import gqw;
import hbd;
import hbo;
import hbu;
import hmo;
import java.util.List;
import l;

public class ShortlinkUrlHandlerActivity extends hmo
    implements gqw
{

    private hbd j;

    public ShortlinkUrlHandlerActivity()
    {
        j = (new hbd(this, l)).a("active-hangouts-account").a(k).b(this);
    }

    private static aoa a(String s)
    {
        int ai[] = dcn.c();
        int k = ai.length;
        for (int i = 0; i < k; i++)
        {
            aoa aoa1 = dcn.e(ai[i]);
            if (aoa1.j() != null && (s == null || s.equals(aoa1.j())))
            {
                return aoa1;
            }
        }

        return null;
    }

    private void a(String s, String s1, String s2)
    {
        startActivity(g.a((new bpj(s, 1)).d(s1).e(s2).a(), null, null, false, 48, SystemClock.elapsedRealtime()));
        finish();
    }

    private void g()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setMessage(l.dB);
        builder.setPositiveButton(l.hd, new cqu(this));
        builder.setOnCancelListener(new cqv(this));
        builder.show();
    }

    public void a(boolean flag, gqv gqv1, gqv gqv2, int i, int k)
    {
        Object obj;
        if (gqv2 != gqv.c)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        gqv1 = dcn.e(k);
        obj = getIntent().getData().getPathSegments();
        if (((List) (obj)).size() != 2) goto _L2; else goto _L1
_L1:
        gqv2 = (String)((List) (obj)).get(1);
        a(gqv1.a(), gqv1.j(), ((String) (gqv2)));
_L4:
        return;
_L2:
        if (((List) (obj)).size() != 3) goto _L4; else goto _L3
_L3:
        gqv2 = (String)((List) (obj)).get(1);
        obj = (String)((List) (obj)).get(2);
        a(gqv1.a(), ((String) (gqv2)), ((String) (obj)));
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
        bundle = (new hbo()).b().a(bundle).a(hbu);
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
