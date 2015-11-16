// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.os.Bundle;
import cqy;
import dcn;
import gqv;
import gqw;
import hbd;
import hbo;
import hbu;
import hbv;
import hmo;
import l;

public class SmsAccountPickerActivity extends hmo
    implements gqw
{

    private hbd j;

    public SmsAccountPickerActivity()
    {
        j = (new hbd(this, l)).a(k).b(this);
    }

    public void a(boolean flag, gqv gqv1, gqv gqv2, int i, int k)
    {
        if (gqv2 == gqv.c)
        {
            dcn.b(dcn.e(k));
        }
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = (new hbo()).d().a(hbu, (new hbv()).a(new cqy()).a(getString(l.jv)).c());
        j.a(bundle);
    }
}
