// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import com.google.android.libraries.hangouts.video.CallService;

final class gcf extends gjm
{

    final gce a;

    gcf(gce gce1)
    {
        a = gce1;
        super();
    }

    public void a(int i)
    {
        CallService.a(a.a, null);
        a.a.stopForeground(true);
        if (CallService.d(a.a) == 0)
        {
            a.a.stopSelf();
        }
    }

    public void a(gjq gjq)
    {
        gjq = CallService.b(a.a).b().a().s();
        if (gjq == null)
        {
            gkc.d("vclib", "No notification was specified for the call; service may be terminated unexpectedly.");
            return;
        } else
        {
            gjq.flags = ((Notification) (gjq)).flags | 2;
            a.a.startForeground(1, gjq);
            return;
        }
    }
}
