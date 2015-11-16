// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class LocaleChangeReceiver extends BroadcastReceiver
{

    public LocaleChangeReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        RealTimeChatService.a();
    }
}
