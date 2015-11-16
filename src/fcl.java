// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.CountDownLatch;

final class fcl
    implements ServiceConnection
{

    final fck a;

    fcl(fck fck1)
    {
        a = fck1;
        super();
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        fck.a(a, fcn.a(ibinder));
        fck.a(a).countDown();
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
    }
}
