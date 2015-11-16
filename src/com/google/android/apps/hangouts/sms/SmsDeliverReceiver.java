// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

// Referenced classes of package com.google.android.apps.hangouts.sms:
//            SmsReceiver

public final class SmsDeliverReceiver extends BroadcastReceiver
{

    public SmsDeliverReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (!SmsReceiver.a(intent))
        {
            RealTimeChatService.c(intent);
        }
    }
}
