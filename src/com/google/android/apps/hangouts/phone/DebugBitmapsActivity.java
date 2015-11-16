// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;
import cmy;
import g;
import h;

public class DebugBitmapsActivity extends Activity
{

    public DebugBitmapsActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.fD);
        ((ExpandableListView)findViewById(h.Q)).setAdapter(new cmy(this));
    }
}
