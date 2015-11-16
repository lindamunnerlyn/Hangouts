// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import ai;
import android.os.Bundle;
import bof;
import bps;
import g;

public final class InCallDialpadActivity extends ai
{

    private final bof j = bof.a();
    private bps k;

    public InCallDialpadActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.gs);
    }

    protected void onStart()
    {
        super.onStart();
        k = new bps(this);
        j.a(k);
    }

    protected void onStop()
    {
        super.onStop();
        j.b(k);
    }
}
