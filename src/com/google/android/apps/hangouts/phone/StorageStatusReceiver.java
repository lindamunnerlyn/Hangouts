// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class StorageStatusReceiver extends BroadcastReceiver
{

    public StorageStatusReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if ("android.intent.action.DEVICE_STORAGE_LOW".equals(intent.getAction()))
        {
            RealTimeChatService.j();
        } else
        if ("android.intent.action.DEVICE_STORAGE_OK".equals(intent.getAction()))
        {
            RealTimeChatService.k();
            return;
        }
    }
}
