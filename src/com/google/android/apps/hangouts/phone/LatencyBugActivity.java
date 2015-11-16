// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import ac;
import ai;
import android.content.Intent;
import android.os.Bundle;
import ap;
import bln;
import ebw;
import hgx;

public final class LatencyBugActivity extends ai
{

    public LatencyBugActivity()
    {
    }

    private bln g()
    {
        return (bln)hgx.b(this, bln);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ebw.a("Babel", "LatencyBugActivity.onCreate");
        bundle = t_().a();
        getIntent().getStringExtra("latency_message");
        if (g() != null)
        {
            g().a().a(bundle, "latencybug");
        }
    }
}
