// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.os.Bundle;
import cpi;
import dbf;
import gmp;
import gmq;
import gwt;
import gxe;
import gxj;
import gxk;
import hhw;
import l;

public class SmsAccountPickerActivity extends hhw
    implements gmq
{

    private gwt j;

    public SmsAccountPickerActivity()
    {
        j = (new gwt(this, l)).a(k).b(this);
    }

    public void a(boolean flag, gmp gmp1, gmp gmp2, int i, int k)
    {
        if (gmp2 == gmp.c)
        {
            dbf.b(dbf.e(k));
        }
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = (new gxe()).d().a(gxj, (new gxk()).a(new cpi()).a(getString(l.kc)).c());
        j.a(bundle);
    }
}
