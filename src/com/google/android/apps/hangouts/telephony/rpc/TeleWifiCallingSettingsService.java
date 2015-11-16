// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.telephony.rpc;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import eax;
import eaz;
import eev;

public class TeleWifiCallingSettingsService extends Service
{

    private eaz a;

    public TeleWifiCallingSettingsService()
    {
    }

    public IBinder onBind(Intent intent)
    {
        if (!"com.google.android.apps.hangouts.telephony.ui.ITeleWifiCallingSettingsService".equals(intent.getAction()))
        {
            eev.g("Babel_telephony", "Unknown binding action; ignoring");
            return null;
        } else
        {
            return a;
        }
    }

    public void onCreate()
    {
        super.onCreate();
        a = new eax(this);
    }
}
