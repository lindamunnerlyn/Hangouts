// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.settings;

import android.os.Bundle;
import dpe;
import g;
import gng;
import hgt;
import hhj;

public class SettingsActivity extends hhj
{

    public SettingsActivity()
    {
        (new gng(this, q)).a(p).d();
        new hgt(this, q);
        new dpe(this, this, q);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.fL);
    }
}
