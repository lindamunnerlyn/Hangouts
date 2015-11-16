// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import bnk;
import bpm;
import eev;
import g;

public class Q extends BroadcastReceiver
{

    public void onReceive(Context context, Intent intent)
    {
        String s = intent.getStringExtra("session");
        bpm bpm1 = bnk.a().s();
        if (bpm1 == null || !bpm1.l().equals(s))
        {
            eev.a("Babel", "SessionId is no longer valid");
        } else
        {
            if ("com.google.android.apps.hangouts.hangout.joined".equals(intent.getAction()))
            {
                intent = g.a(bpm1.e(), null, false, 51, bpm1.L(), SystemClock.elapsedRealtime());
                intent.setFlags(0x34000000);
                context.startActivity(intent);
                return;
            }
            if ("com.google.android.apps.hangouts.hangout.exit".equals(intent.getAction()))
            {
                bpm1.c(1004);
                return;
            }
        }
    }

    public Q()
    {
    }
}
