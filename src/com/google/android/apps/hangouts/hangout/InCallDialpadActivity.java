// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import ai;
import android.os.Bundle;
import boo;
import bqb;
import g;

public final class InCallDialpadActivity extends ai
{

    private final boo j = boo.a();
    private bqb k;

    public InCallDialpadActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.go);
    }

    protected void onStart()
    {
        super.onStart();
        k = new bqb(this);
        j.a(k);
    }

    protected void onStop()
    {
        super.onStop();
        j.b(k);
    }
}
