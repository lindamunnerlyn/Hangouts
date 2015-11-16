// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

public final class eqf
    implements ServiceConnection
{

    final eqa a;
    private final int b;

    public eqf(eqa eqa1, int i)
    {
        a = eqa1;
        super();
        b = i;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        g.b(ibinder, "Expecting a valid IBinder");
        eqa eqa1 = a;
        if (ibinder == null)
        {
            componentname = null;
        } else
        {
            componentname = ibinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (componentname != null && (componentname instanceof eqy))
            {
                componentname = (eqy)componentname;
            } else
            {
                componentname = new era(ibinder);
            }
        }
        eqa.a(eqa1, componentname);
        a.a(b);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        a.b.sendMessage(a.b.obtainMessage(4, b, 1));
    }
}
