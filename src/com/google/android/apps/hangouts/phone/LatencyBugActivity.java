// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import ac;
import ai;
import android.content.Intent;
import android.os.Bundle;
import ap;
import blw;
import eev;
import hlp;

public final class LatencyBugActivity extends ai
{

    public LatencyBugActivity()
    {
    }

    private blw g()
    {
        return (blw)hlp.b(this, blw);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        eev.a("Babel", "LatencyBugActivity.onCreate");
        bundle = u_().a();
        getIntent().getStringExtra("latency_message");
        if (g() != null)
        {
            g().a().a(bundle, "latencybug");
        }
    }
}
