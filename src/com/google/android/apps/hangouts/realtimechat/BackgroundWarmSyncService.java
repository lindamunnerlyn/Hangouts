// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.realtimechat;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import dlb;
import eev;
import g;

// Referenced classes of package com.google.android.apps.hangouts.realtimechat:
//            RealTimeChatService

public class BackgroundWarmSyncService extends IntentService
{

    private static final boolean a = false;

    public BackgroundWarmSyncService()
    {
        super("BackgroundWarmSyncService");
    }

    public static void a(Context context, boolean flag)
    {
        Object obj = new Intent(context, com/google/android/apps/hangouts/realtimechat/BackgroundWarmSyncService);
        ((Intent) (obj)).putExtra("op", 1);
        SharedPreferences sharedpreferences = g.nU.getSharedPreferences("BackgroundPolling", 0);
        long l = g.a(g.nU, "babel_background_polling_initial_delay_ms", dlb.j);
        sharedpreferences.edit().putLong("background_polling_delay_in_ms", l).apply();
        obj = PendingIntent.getService(context, 0, ((Intent) (obj)), 0);
        context = (AlarmManager)context.getSystemService("alarm");
        if (flag)
        {
            if (a)
            {
                eev.b("Babel", (new StringBuilder(72)).append("Schedule warm sync with backgroundPollingDelayInMs: ").append(l).toString());
            }
            context.set(2, l + SystemClock.elapsedRealtime(), ((PendingIntent) (obj)));
            return;
        }
        if (a)
        {
            eev.b("Babel", "Cancel warm sync alarm");
        }
        context.cancel(((PendingIntent) (obj)));
        ((PendingIntent) (obj)).cancel();
    }

    public static boolean a(Context context)
    {
        boolean flag = false;
        if (PendingIntent.getService(context, 0, new Intent(context, com/google/android/apps/hangouts/realtimechat/BackgroundWarmSyncService), 0x20000000) != null)
        {
            flag = true;
        }
        return flag;
    }

    protected void a()
    {
        RealTimeChatService.a(true);
        Context context = g.nU;
        Object obj = context.getSharedPreferences("BackgroundPolling", 0);
        long l1 = g.a(g.nU, "babel_background_polling_initial_delay_ms", dlb.j);
        long l = g.a(g.nU, "babel_background_polling_max_delay_ms", dlb.k);
        l1 = ((SharedPreferences) (obj)).getLong("background_polling_delay_in_ms", l1);
        l = Math.min(l1 << 1, l);
        if (l != l1)
        {
            ((SharedPreferences) (obj)).edit().putLong("background_polling_delay_in_ms", l).apply();
        }
        if (a)
        {
            eev.b("Babel", (new StringBuilder(78)).append("Schedule warm sync alarm with backgroundPollingDelayInMs: ").append(l).toString());
        }
        obj = new Intent(context, com/google/android/apps/hangouts/realtimechat/BackgroundWarmSyncService);
        ((Intent) (obj)).putExtra("op", 1);
        obj = PendingIntent.getService(context, 0, ((Intent) (obj)), 0);
        ((AlarmManager)context.getSystemService("alarm")).set(2, l + SystemClock.elapsedRealtime(), ((PendingIntent) (obj)));
    }

    protected void onHandleIntent(Intent intent)
    {
        int i;
        if (intent == null)
        {
            eev.f("Babel", "BackgroundWarmSyncService onHandleIntent called with null intent");
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
        intent = "OP_PERFORM_AND_SCHEDULE_WARM_SYNC";
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        hnc hnc = eev.n;
    }
}
