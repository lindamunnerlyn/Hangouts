// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import g;
import qd;

public class  extends BroadcastReceiver
{

    public void onReceive(Context context, Intent intent)
    {
        if (!"start_next_hangout".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        if (qd.m != null) goto _L4; else goto _L3
_L3:
        intent.getParcelableExtra("hangout_intent");
_L6:
        return;
_L4:
        qd.m.f();
        return;
_L2:
        if ("stop_stress".equals(intent.getAction()))
        {
            if (qd.m != null)
            {
                qd.m.g();
            }
            qd.m = null;
            context = g.nU;
            ((AlarmManager)context.getSystemService("alarm")).cancel(qd.a(null));
            ((NotificationManager)context.getSystemService("notification")).cancel(14);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public ()
    {
    }
}
