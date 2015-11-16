// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.callmemaybe;

import alm;
import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import ani;
import g;
import hgx;

public class NewPlusAccountService extends IntentService
{

    public NewPlusAccountService()
    {
        super("NewPlusAccountService");
    }

    public static void a(ani ani1)
    {
        Context context = g.nS;
        Intent intent = new Intent(context, com/google/android/apps/hangouts/callmemaybe/NewPlusAccountService);
        intent.putExtra("account_id", ani1.h());
        ani1 = PendingIntent.getService(context, 0, intent, 0);
        ((AlarmManager)context.getSystemService("alarm")).set(1, 0x240c8400L, ani1);
    }

    protected void onHandleIntent(Intent intent)
    {
        int i = intent.getIntExtra("account_id", -1);
        ((alm)hgx.a(getApplicationContext(), alm)).a(i);
    }
}
