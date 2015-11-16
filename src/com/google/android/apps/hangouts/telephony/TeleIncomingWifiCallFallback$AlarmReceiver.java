// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.telephony;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telecom.TelecomManager;
import dye;
import dyf;
import dyg;
import eev;
import g;
import gdv;

public class  extends BroadcastReceiver
    implements dyf
{

    private boolean a;

    public void a(dye dye1)
    {
        eev.e("Babel_telephony", "TeleIncomingWifiCallFallback.AlarmReceiver.onInviteCompleted");
        a = true;
    }

    public void onReceive(Context context, Intent intent)
    {
        eev.e("Babel_telephony", "TeleIncomingWifiCallFallback.AlarmReceiver.onReceive");
        intent = dyg.a(intent.getBundleExtra("invite_info"));
        if (!g.a(context, ((dyg) (intent)).f, ((dyg) (intent)).a))
        {
            eev.e("Babel_telephony", "TeleIncomingWifiCallFallback.AlarmReceiver.onReceive, invite was cancelled");
            g.a(context, ((dyg) (intent)).f, ((dyg) (intent)).b, 2337);
            return;
        } else
        {
            (new dye(context, this, (TelecomManager)context.getSystemService("telecom"), intent, true)).a(null);
            gdv.a("Expected condition to be true", a);
            return;
        }
    }

    public ()
    {
    }
}
