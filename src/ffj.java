// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.CountDownLatch;

final class ffj
    implements ServiceConnection
{

    final ffi a;

    ffj(ffi ffi1)
    {
        a = ffi1;
        super();
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        ffi ffi1 = a;
        if (ibinder == null)
        {
            componentname = null;
        } else
        {
            componentname = ibinder.queryLocalInterface("com.google.android.gms.http.IGoogleHttpService");
            if (componentname != null && (componentname instanceof ffk))
            {
                componentname = (ffk)componentname;
            } else
            {
                componentname = new ffm(ibinder);
            }
        }
        ffi.a(ffi1, componentname);
        ffi.a(a).countDown();
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
    }
}
