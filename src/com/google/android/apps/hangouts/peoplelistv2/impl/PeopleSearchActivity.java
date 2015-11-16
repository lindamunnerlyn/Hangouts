// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.peoplelistv2.impl;

import android.os.Bundle;
import ap;
import bg;
import bka;
import chr;
import dsp;
import g;
import gng;
import h;
import po;

public class PeopleSearchActivity extends bka
{

    public PeopleSearchActivity()
    {
        (new gng(this, q)).a(p);
        (new dsp(this, q)).b(p);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.gU);
        ap ap1 = t_();
        Object obj = (chr)ap1.a(h.ex);
        bundle = ((Bundle) (obj));
        if (obj == null)
        {
            bundle = new chr();
            ap1.a().a(h.ex, bundle, com/google/android/apps/hangouts/peoplelistv2/impl/PeopleSearchActivity.getName()).b();
        }
        obj = getLayoutInflater();
        findViewById(h.ey);
        bundle.a(((android.view.LayoutInflater) (obj)), l);
        g().a(true);
    }
}
