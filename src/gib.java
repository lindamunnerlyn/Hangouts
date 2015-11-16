// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class gib
    implements ServiceConnection
{

    final gia a;

    gib(gia gia1)
    {
        a = gia1;
        super();
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        gkc.c("vclib", "onServiceConnected");
        if (ibinder == null)
        {
            gkc.e("vclib", "Failed to bind to CallService.");
            return;
        }
        if (!(ibinder instanceof gjn))
        {
            gkc.e("vclib", "CallService does not appear to be running in the current process. This is most likely because the application created a CallClient instance using the application context rather than an activity or service context. This CallClient instance will not be usable for making calls.");
            return;
        }
        gia.a(a, (gjn)ibinder);
        if (gia.a(a).a().a())
        {
            gia.b(a).run();
            return;
        } else
        {
            gkc.e("vclib", "Hangouts is not supported by this device.");
            return;
        }
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        gkc.c("vclib", "onServiceDisconnected");
        gia.a(a, null);
    }
}
