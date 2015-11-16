// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;

final class cm extends cj
{

    cm()
    {
    }

    public Notification a(cf cf1)
    {
        Notification notification = cf1.B;
        notification.setLatestEventInfo(cf1.a, cf1.b, cf1.c, cf1.d);
        android.content.Context context = cf1.a;
        CharSequence charsequence = cf1.b;
        CharSequence charsequence1 = cf1.c;
        android.app.PendingIntent pendingintent = cf1.d;
        android.app.PendingIntent pendingintent1 = cf1.e;
        notification.setLatestEventInfo(context, charsequence, charsequence1, pendingintent);
        notification.fullScreenIntent = pendingintent1;
        if (cf1.j > 0)
        {
            notification.flags = notification.flags | 0x80;
        }
        return notification;
    }
}
