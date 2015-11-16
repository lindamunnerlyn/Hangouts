// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.telephony;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telecom.TelecomManager;
import duw;
import dux;
import duy;
import ebw;
import g;
import gbh;

public class  extends BroadcastReceiver
    implements dux
{

    private boolean a;

    public void a(duw duw1)
    {
        ebw.e("Babel_telephony", "TeleIncomingWifiCallFallback.AlarmReceiver.onInviteCompleted");
        a = true;
    }

    public void onReceive(Context context, Intent intent)
    {
        ebw.e("Babel_telephony", "TeleIncomingWifiCallFallback.AlarmReceiver.onReceive");
        intent = duy.a(intent.getBundleExtra("invite_info"));
        if (!g.a(context, ((duy) (intent)).f, ((duy) (intent)).a))
        {
            ebw.e("Babel_telephony", "TeleIncomingWifiCallFallback.AlarmReceiver.onReceive, invite was cancelled");
            g.a(context, ((duy) (intent)).f, ((duy) (intent)).b, 2337);
            return;
        } else
        {
            (new duw(context, this, (TelecomManager)context.getSystemService("telecom"), intent, true)).a(null);
            gbh.a(a);
            return;
        }
    }

    public ()
    {
    }
}
