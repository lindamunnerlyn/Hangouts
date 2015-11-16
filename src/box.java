// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;

public final class box
{

    private final bpd a;
    private final Context b;

    public box(Context context, bpd bpd1)
    {
        gbh.b(bpd1);
        a = bpd1;
        b = context;
    }

    private boolean b()
    {
        return a.M() == 1;
    }

    public Notification a()
    {
        long l1 = System.currentTimeMillis();
        Object obj1 = a.m();
        Resources resources = b.getResources();
        Object obj = b;
        int i = eba.a(4);
        Object obj2 = new Intent("com.google.android.apps.hangouts.hangout.joined");
        ((Intent) (obj2)).setComponent(new ComponentName(g.nS, com/google/android/apps/hangouts/hangout/HangoutUtils$JoinedHangoutReceiver));
        ((Intent) (obj2)).setFlags(0x10000000);
        ((Intent) (obj2)).putExtra("session", ((String) (obj1)));
        obj = PendingIntent.getBroadcast(((Context) (obj)), i, ((Intent) (obj2)), 0x8000000);
        obj2 = b;
        i = eba.a(101);
        Intent intent = new Intent("com.google.android.apps.hangouts.hangout.exit");
        intent.setComponent(new ComponentName(g.nS, com/google/android/apps/hangouts/hangout/HangoutUtils$JoinedHangoutReceiver));
        intent.putExtra("session", ((String) (obj1)));
        obj1 = PendingIntent.getBroadcast(((Context) (obj2)), i, intent, 0x8000000);
        obj2 = (new cf(b)).a(l1);
        int j;
        if (b() || a.N())
        {
            i = com.google.android.apps.hangouts.R.drawable.cC;
        } else
        {
            i = com.google.android.apps.hangouts.R.drawable.cy;
        }
        obj2 = ((cf) (obj2)).a(i);
        if (b())
        {
            i = l.tB;
        } else
        if (a.N())
        {
            i = l.tP;
        } else
        {
            i = l.dO;
        }
        obj2 = ((cf) (obj2)).a(resources.getString(i));
        if (b())
        {
            i = l.tA;
        } else
        {
            i = l.dN;
        }
        obj = ((cf) (obj2)).b(resources.getString(i)).b().a(((PendingIntent) (obj))).d(2);
        j = com.google.android.apps.hangouts.R.drawable.bm;
        if (b())
        {
            i = l.tz;
        } else
        {
            i = l.cS;
        }
        return ((cf) (obj)).a(j, resources.getString(i), ((PendingIntent) (obj1))).g();
    }
}
