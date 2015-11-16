// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.telephony;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import g;

public class  extends BroadcastReceiver
{

    public static void a(Context context, int i)
    {
        PendingIntent pendingintent = PendingIntent.getBroadcast(context, i, (new Intent("com.google.android.apps.hangouts.telephony.TeleFeedback.ALARM")).putExtra("telephony_id", i), 0x40000000);
        long l = g.a(context, "babel_telephony_feedback_duration_millis", 0x493e0);
        ((AlarmManager)context.getSystemService("alarm")).set(3, l + SystemClock.elapsedRealtime(), pendingintent);
    }

    public void onReceive(Context context, Intent intent)
    {
        ((NotificationManager)context.getSystemService("notification")).cancel("telephony_call_feedback", intent.getIntExtra("telephony_id", -1));
    }

    public ()
    {
    }
}
