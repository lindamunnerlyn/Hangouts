// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

public final class enf
    implements ServiceConnection
{

    final ena a;
    private final int b;

    public enf(ena ena1, int i)
    {
        a = ena1;
        super();
        b = i;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        h.a(ibinder, "Expecting a valid IBinder");
        ena.a(a, enz.a(ibinder));
        a.a(b);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        a.b.sendMessage(a.b.obtainMessage(4, b, 1));
    }
}
