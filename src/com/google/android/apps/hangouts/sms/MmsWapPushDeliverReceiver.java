// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class MmsWapPushDeliverReceiver extends BroadcastReceiver
{

    public MmsWapPushDeliverReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if ("android.provider.Telephony.WAP_PUSH_DELIVER".equals(intent.getAction()) && "application/vnd.wap.mms-message".equals(intent.getType()))
        {
            RealTimeChatService.a(intent.getByteArrayExtra("data"));
        }
    }
}
