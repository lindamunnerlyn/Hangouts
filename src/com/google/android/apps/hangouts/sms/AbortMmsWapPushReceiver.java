// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dcn;

public class AbortMmsWapPushReceiver extends BroadcastReceiver
{

    public AbortMmsWapPushReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if ("android.provider.Telephony.WAP_PUSH_RECEIVED".equals(intent.getAction()) && "application/vnd.wap.mms-message".equals(intent.getType()) && android.os.Build.VERSION.SDK_INT < 19 && dcn.j())
        {
            abortBroadcast();
        }
    }
}
