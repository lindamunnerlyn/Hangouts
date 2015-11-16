// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import bnd;
import bpd;
import ebw;
import g;

public class Q extends BroadcastReceiver
{

    public void onReceive(Context context, Intent intent)
    {
        String s = intent.getStringExtra("session");
        bpd bpd1 = bnd.a().t();
        if (bpd1 == null || !bpd1.m().equals(s))
        {
            ebw.a("Babel", "SessionId is no longer valid");
        } else
        {
            if ("com.google.android.apps.hangouts.hangout.joined".equals(intent.getAction()))
            {
                intent = g.a(bpd1.e(), null, false, 51, bpd1.M(), SystemClock.elapsedRealtime());
                intent.setFlags(0x34000000);
                context.startActivity(intent);
                return;
            }
            if ("com.google.android.apps.hangouts.hangout.exit".equals(intent.getAction()))
            {
                bpd1.c(1004);
                return;
            }
        }
    }

    public Q()
    {
    }
}
