// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.realtimechat.wakelock.impl;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import djm;
import djn;
import djo;
import djp;
import djr;
import djs;
import dju;
import djv;
import g;
import h;
import hgx;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class DebugWakelocksActivity extends Activity
{

    private djv a;
    private LinearLayout b;
    private ListView c;
    private final Runnable d = new djn(this);

    public DebugWakelocksActivity()
    {
    }

    public static BaseAdapter a(DebugWakelocksActivity debugwakelocksactivity, List list, List list1)
    {
        return new dju(debugwakelocksactivity, list, list1);
    }

    public static Runnable a(DebugWakelocksActivity debugwakelocksactivity)
    {
        return debugwakelocksactivity.d;
    }

    public static ArrayAdapter b(DebugWakelocksActivity debugwakelocksactivity)
    {
        return new djr(debugwakelocksactivity, debugwakelocksactivity, h.jd, g.oP, h.b(debugwakelocksactivity.a.b.values()));
    }

    public static ListView c(DebugWakelocksActivity debugwakelocksactivity)
    {
        return debugwakelocksactivity.c;
    }

    public static android.widget.AdapterView.OnItemClickListener d(DebugWakelocksActivity debugwakelocksactivity)
    {
        return new djs(debugwakelocksactivity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = (djv)hgx.a(this, djm);
        c = new djo(this, this);
        b = new djp(this, this);
        setContentView(b);
    }

    public void onPause()
    {
        super.onPause();
        Runnable runnable = d;
        g.y().removeCallbacks(runnable);
    }

    public void onResume()
    {
        super.onResume();
        d.run();
    }
}
