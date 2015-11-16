// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.realtimechat.wakelock.impl;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;
import android.widget.ListView;
import dld;
import dle;
import dlf;
import dlg;
import dlm;
import g;
import hlp;

public class DebugWakelocksActivity extends Activity
{

    public dlm a;
    public ListView b;
    public final Runnable c = new dle(this);
    private LinearLayout d;

    public DebugWakelocksActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = (dlm)hlp.a(this, dld);
        b = new dlf(this, this);
        d = new dlg(this, this);
        setContentView(d);
    }

    public void onPause()
    {
        super.onPause();
        Runnable runnable = c;
        g.x().removeCallbacks(runnable);
    }

    public void onResume()
    {
        super.onResume();
        c.run();
    }
}
