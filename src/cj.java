// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;

class cj
{

    cj()
    {
    }

    public Notification a(cf cf1)
    {
        Notification notification = cf1.B;
        notification.setLatestEventInfo(cf1.a, cf1.b, cf1.c, cf1.d);
        if (cf1.j > 0)
        {
            notification.flags = notification.flags | 0x80;
        }
        return notification;
    }

    public Bundle a(Notification notification)
    {
        return null;
    }

    public ArrayList a(cb acb[])
    {
        return null;
    }
}
