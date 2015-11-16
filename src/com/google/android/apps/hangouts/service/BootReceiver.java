// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import ani;
import cej;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.sms.SmsReceiver;
import dbf;
import dkz;
import ebw;
import java.util.Iterator;
import java.util.List;

public class BootReceiver extends BroadcastReceiver
{

    public BootReceiver()
    {
    }

    public static boolean a(Context context)
    {
        context = context.getSharedPreferences("EsApplication", 0);
        boolean flag = context.getBoolean("first_upgrade", true);
        context.edit().putBoolean("first_upgrade", false).apply();
        return flag;
    }

    public void onReceive(Context context, Intent intent)
    {
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction()))
        {
            ebw.c("Babel", "Scheduling babel db cleanup after reboot");
            if (a(context))
            {
                RealTimeChatService.a(intent.getAction(), context.getPackageName());
            }
            dkz.a();
            dbf.r();
            SmsReceiver.a();
            intent = dbf.l();
            if (intent != null)
            {
                cej.a(context, intent.h(), true);
            }
            intent = dbf.t().iterator();
            do
            {
                if (!intent.hasNext())
                {
                    break;
                }
                ani ani1 = (ani)intent.next();
                String s = String.valueOf(ani1);
                ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 20)).append("babel boot account: ").append(s).toString());
                if (ani1 != null)
                {
                    cej.a(context, ani1.h(), true);
                }
            } while (true);
        }
    }
}
