// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.fragments;

import android.os.Bundle;
import bfv;
import cjg;
import gqu;
import grn;
import h;
import hlp;
import hly;
import java.util.Collections;

public class a extends hly
{

    private final gqu c;

    protected void a(Bundle bundle)
    {
        super.a(bundle);
        ((cjg)a.a(cjg)).a(h.ek, new bfv(this));
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle == null)
        {
            ((cjg)a.a(cjg)).a(h.ek, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), 2667, null);
        }
    }

    public ()
    {
        c = (new grn(this, b)).a(a);
    }
}
