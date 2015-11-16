// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.peoplelistv2.impl;

import android.os.Bundle;
import ap;
import bg;
import bkm;
import cix;
import dvi;
import g;
import grn;
import h;
import pq;

public class PeopleSearchActivity extends bkm
{

    public PeopleSearchActivity()
    {
        (new grn(this, r)).a(q);
        (new dvi(this, r)).b(q);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.gM);
        ap ap1 = u_();
        Object obj = (cix)ap1.a(h.eg);
        bundle = ((Bundle) (obj));
        if (obj == null)
        {
            bundle = new cix();
            ap1.a().a(h.eg, bundle, com/google/android/apps/hangouts/peoplelistv2/impl/PeopleSearchActivity.getName()).b();
        }
        obj = getLayoutInflater();
        findViewById(h.eh);
        bundle.a(((android.view.LayoutInflater) (obj)), m);
        g().a(true);
    }
}
