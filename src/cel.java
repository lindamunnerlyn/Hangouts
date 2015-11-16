// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.SystemClock;
import com.google.android.apps.hangouts.content.EsProvider;

final class cel
{

    cel()
    {
    }

    static void a(Context context, int i)
    {
        Cursor cursor;
        long l4;
        l4 = g.a(context, "babel_max_pending_message_animation", 0x1d4c0L);
        ceh.a(i, l4);
        android.net.Uri uri = EsProvider.a(EsProvider.j, i);
        cursor = context.getContentResolver().query(uri, cey.a, ceh.a, null, "timestamp ASC");
        if (cursor == null) goto _L2; else goto _L1
_L1:
        Object obj = new edb();
        int j;
        int k;
        long l1;
        j = 0;
        k = -1;
        l1 = 0L;
        cursor.moveToPosition(-1);
        long l2 = 0x7fffffffffffffffL;
_L9:
        dsu dsu1;
        String s;
        long l3;
        if (!cursor.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        dsu1 = dsu.values()[cursor.getInt(12)];
        s = cursor.getString(7);
        l3 = cursor.getLong(11) / 1000L;
        cei.a[dsu1.ordinal()];
        JVM INSTR tableswitch 1 3: default 493
    //                   1 160
    //                   2 160
    //                   3 243;
           goto _L3 _L4 _L4 _L5
_L3:
        continue; /* Loop/switch isn't completed */
_L4:
        long l5 = System.currentTimeMillis() - (l3 + l4);
        if (l5 <= 0L) goto _L7; else goto _L6
_L6:
        int l = j + 1;
        int i1;
        ((edb) (obj)).add(s);
        i1 = cursor.getPosition();
        k = i1;
        j = l;
        if (l3 > l1)
        {
            l1 = l3;
            k = i1;
            j = l;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        l2 = Math.min(l2, -l5);
        continue; /* Loop/switch isn't completed */
_L5:
        l = j + 1;
        ((edb) (obj)).add(s);
        i1 = cursor.getPosition();
        k = i1;
        j = l;
        if (l3 > l1)
        {
            k = i1;
            l1 = l3;
            j = l;
        }
        if (true) goto _L9; else goto _L8
_L8:
        if (cfi.m)
        {
            eev.b("Babel", (new StringBuilder(43)).append("query for failed message sends: ").append(j).toString());
        }
        if (j <= 0) goto _L11; else goto _L10
_L10:
        if (j != 1) goto _L13; else goto _L12
_L12:
        cursor.moveToPosition(k);
        obj = new cen(context, i, new cew(cursor, i), l1);
_L16:
        ((ceh) (obj)).a(true);
_L17:
        if (l2 == 0x7fffffffffffffffL) goto _L15; else goto _L14
_L14:
        obj = (AlarmManager)context.getSystemService("alarm");
        Intent intent = (new cek()).a(context, i);
        intent.setAction("com.google.android.apps.hangouts.UPDATE_NOTIFICATION");
        intent.setComponent(null);
        context = PendingIntent.getBroadcast(context, eee.a(i, 1, 100, null), intent, 0x10000000);
        ((AlarmManager) (obj)).set(2, SystemClock.elapsedRealtime() + l2, context);
_L15:
        cursor.close();
_L2:
        return;
_L13:
        obj = new cem(context, i, ((edb) (obj)), j, l1);
          goto _L16
_L11:
        ceh.a(context, i);
          goto _L17
        context;
        cursor.close();
        throw context;
          goto _L16
    }

    void a(Context context, int i, String s)
    {
        s = edb.a(s);
        if (aoq.c(new aow(context, i), s) > 0 && cfo.f(context, i))
        {
            a(context, i);
        }
    }
}
