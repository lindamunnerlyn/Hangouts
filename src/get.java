// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import com.google.android.libraries.hangouts.video.CallService;

final class get extends gmo
{

    final ges a;

    get(ges ges1)
    {
        a = ges1;
        super();
    }

    public void a(int i)
    {
        a.a.d = null;
        a.a.stopForeground(true);
        if (a.a.b == 0)
        {
            a.a.stopSelf();
        }
    }

    public void a(gms gms)
    {
        gms = a.a.d.d().a().s();
        if (gms == null)
        {
            gne.a(5, "vclib", "No notification was specified for the call; service may be terminated unexpectedly.");
            return;
        } else
        {
            gms.flags = ((Notification) (gms)).flags | 2;
            a.a.startForeground(1, gms);
            return;
        }
    }
}
