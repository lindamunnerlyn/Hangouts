// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.settings;

import android.os.Bundle;
import drx;
import g;
import grn;
import hll;
import hmb;

public class SettingsActivity extends hmb
{

    public SettingsActivity()
    {
        (new grn(this, r)).a(q).d();
        new hll(this, r);
        new drx(this, this, r);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.fJ);
    }
}
