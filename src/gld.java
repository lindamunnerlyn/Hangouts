// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class gld
    implements ServiceConnection
{

    final glc a;

    gld(glc glc1)
    {
        a = glc1;
        super();
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        gne.a(4, "vclib", "onServiceConnected");
        if (ibinder == null)
        {
            gne.a(6, "vclib", "Failed to bind to CallService.");
            return;
        }
        if (!(ibinder instanceof gmp))
        {
            gne.a(6, "vclib", "CallService does not appear to be running in the current process. This is most likely because the application created a CallClient instance using the application context rather than an activity or service context. This CallClient instance will not be usable for making calls.");
            return;
        }
        a.b = (gmp)ibinder;
        if (a.b.a().a())
        {
            a.a.run();
            return;
        } else
        {
            gne.a(6, "vclib", "Hangouts is not supported by this device.");
            return;
        }
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        gne.a(4, "vclib", "onServiceDisconnected");
        a.b = null;
    }
}
