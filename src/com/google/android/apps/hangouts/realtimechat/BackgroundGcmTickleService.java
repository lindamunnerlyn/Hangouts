// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.realtimechat;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import dcn;
import dkg;
import dlb;
import eev;
import g;

public class BackgroundGcmTickleService extends IntentService
{

    private static final boolean a = false;

    public BackgroundGcmTickleService()
    {
        super("BackgroundGcmTickleService");
    }

    public static void a(Context context, boolean flag)
    {
        Object obj = new Intent(context, com/google/android/apps/hangouts/realtimechat/BackgroundGcmTickleService);
        ((Intent) (obj)).putExtra("op", 1);
        obj = PendingIntent.getService(context, 0, ((Intent) (obj)), 0);
        AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
        if (!flag)
        {
            if (a)
            {
                eev.b("Babel", "Cancel gcm tickle alarm");
            }
            alarmmanager.cancel(((PendingIntent) (obj)));
            ((PendingIntent) (obj)).cancel();
            return;
        }
        long l1 = g.a(g.nU, "babel_background_gcm_tickle_polling_interval_ms", dlb.m);
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        long l = l1;
        if (context != null)
        {
            l = l1;
            if (context.getType() == 0)
            {
                l = l1 * 2L;
            }
        }
        if (a)
        {
            eev.b("Babel", (new StringBuilder(61)).append("Schedule gcm tickle with interval in ms: ").append(l).toString());
        }
        alarmmanager.set(2, l + SystemClock.elapsedRealtime(), ((PendingIntent) (obj)));
    }

    public static boolean a(Context context)
    {
        boolean flag = false;
        if (PendingIntent.getService(context, 0, new Intent(context, com/google/android/apps/hangouts/realtimechat/BackgroundGcmTickleService), 0x20000000) != null)
        {
            flag = true;
        }
        return flag;
    }

    protected void a()
    {
        int i;
        Context context = g.nU;
        NetworkInfo networkinfo = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        int ai[];
        Object obj;
        int j;
        if (networkinfo != null && (networkinfo.getType() == 0 || networkinfo.getType() == 1 || networkinfo.getType() == 6))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L2; else goto _L1
_L1:
        ai = dcn.f();
        j = ai.length;
        i = 0;
_L8:
        if (i >= j) goto _L2; else goto _L3
_L3:
        obj = dcn.e(ai[i]);
        if (obj == null) goto _L5; else goto _L4
_L4:
        obj = dkg.a(((aoa) (obj)));
        if (obj == null) goto _L5; else goto _L6
_L6:
        ((dkg) (obj)).a();
_L2:
        a(context, true);
        return;
_L5:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected void onHandleIntent(Intent intent)
    {
        int i;
        if (intent == null)
        {
            eev.f("Babel", "BackgroundGcmTickleService onHandleIntent called with null intent");
            return;
        }
        i = intent.getIntExtra("op", 0);
        if (!a) goto _L2; else goto _L1
_L1:
        String s = String.valueOf(intent);
        i;
        JVM INSTR tableswitch 1 1: default 52
    //                   1 178;
           goto _L3 _L4
_L3:
        intent = String.valueOf(Integer.toString(i));
        intent = (new StringBuilder(String.valueOf(intent).length() + 17)).append("(unknown opCode ").append(intent).append(")").toString();
_L6:
        intent = String.valueOf(intent);
        eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 24 + String.valueOf(intent).length())).append("onHandleIntent ").append(s).append(" opCode: ").append(intent).toString());
_L2:
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
            a();
            break;
        }
        return;
_L4:
        intent = "OP_PERFORM_AND_SCHEDULE_GCM_TICKLE";
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        hnc hnc = eev.n;
    }
}
