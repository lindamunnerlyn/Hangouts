// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import dcn;

public class MmsWapPushReceiver extends BroadcastReceiver
{

    public MmsWapPushReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if ("android.provider.Telephony.WAP_PUSH_RECEIVED".equals(intent.getAction()) && "application/vnd.wap.mms-message".equals(intent.getType()) && dcn.j())
        {
            RealTimeChatService.a(intent.getByteArrayExtra("data"));
        }
    }
}
