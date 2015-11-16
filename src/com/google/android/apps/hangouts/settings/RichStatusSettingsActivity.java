// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.settings;

import android.os.Bundle;
import doy;
import g;
import gng;
import hgt;
import hhj;

public class RichStatusSettingsActivity extends hhj
{

    public RichStatusSettingsActivity()
    {
        (new gng(this, q)).a(p).d();
        new hgt(this, q);
        new doy(this, this, q);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.fL);
    }
}
