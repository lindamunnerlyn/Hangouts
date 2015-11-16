// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.fragments;

import android.os.Bundle;
import bfj;
import cia;
import gmo;
import gng;
import h;
import hgx;
import hhg;
import java.util.Collections;

public class a extends hhg
{

    private final gmo c;

    protected void a(Bundle bundle)
    {
        super.a(bundle);
        ((cia)a.a(cia)).a(h.eB, new bfj(this));
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle == null)
        {
            ((cia)a.a(cia)).a(h.eB, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), 2667, null);
        }
    }

    public ()
    {
        c = (new gng(this, b)).a(a);
    }
}
