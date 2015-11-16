// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.telephony;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class  extends BroadcastReceiver
{

    public void onReceive(Context context, Intent intent)
    {
        ((NotificationManager)context.getSystemService("notification")).cancel("telephony_call_feedback", intent.getIntExtra("telephony_id", -1));
    }

    public ()
    {
    }
}
