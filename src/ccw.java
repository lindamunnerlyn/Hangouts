// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

final class ccw
{

    ccw()
    {
    }

    void a(Context context, int i, int j)
    {
        int k = g.a(context, "babel_business_renotification_max_count", 3);
        if (j <= 0 && j > k) goto _L2; else goto _L1
_L1:
        ccy ccy1 = ccy.a(i, false, false, true);
        if (ccy1.a <= 0) goto _L2; else goto _L3
_L3:
        if (cdu.b)
        {
            ebw.b("Babel", (new StringBuilder(41)).append("Renotify the business. Count: ").append(j).toString());
        }
        cdu.a(context, i, ccy1, false, false, false);
        j++;
        j;
        JVM INSTR tableswitch 1 3: default 108
    //                   1 192
    //                   2 206
    //                   3 220;
           goto _L4 _L5 _L6 _L7
_L4:
        long l = -1L;
_L9:
        if (l >= 0L)
        {
            AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
            Intent intent = (new ccv()).a(context, i, j);
            intent.setAction("com.google.android.apps.hangouts.UPDATE_NOTIFICATION");
            intent.setComponent(null);
            context = PendingIntent.getBroadcast(context, eba.a(i, 1, 100, null), intent, 0x10000000);
            alarmmanager.set(2, l + SystemClock.elapsedRealtime(), context);
        }
_L2:
        return;
_L5:
        l = g.a(context, "babel_business_1st_renotification_delay_ms", djk.q);
        continue; /* Loop/switch isn't completed */
_L6:
        l = g.a(context, "babel_business_2nd_renotification_delay_ms", djk.r);
        continue; /* Loop/switch isn't completed */
_L7:
        l = g.a(context, "babel_business_3rd_renotification_delay_ms", djk.s);
        if (true) goto _L9; else goto _L8
_L8:
    }
}
