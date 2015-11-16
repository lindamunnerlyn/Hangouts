// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import aoa;
import cfo;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.sms.SmsReceiver;
import dcn;
import dnw;
import eev;
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
            eev.c("Babel", "Scheduling babel db cleanup after reboot");
            if (a(context))
            {
                RealTimeChatService.a(intent.getAction(), context.getPackageName());
            }
            dnw.a();
            dcn.r();
            SmsReceiver.a();
            intent = dcn.l();
            if (intent != null)
            {
                cfo.a(context, intent.h(), true);
            }
            intent = dcn.t();
            int i = intent.size();
            eev.f("Babel", (new StringBuilder(41)).append("On boot, found ").append(i).append(" ready accounts").toString());
            intent = intent.iterator();
            do
            {
                if (!intent.hasNext())
                {
                    break;
                }
                aoa aoa1 = (aoa)intent.next();
                String s = String.valueOf(aoa1);
                eev.e("Babel", (new StringBuilder(String.valueOf(s).length() + 20)).append("babel boot account: ").append(s).toString());
                if (aoa1 != null)
                {
                    cfo.a(context, aoa1.h(), true);
                }
            } while (true);
        }
    }
}
