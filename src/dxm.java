// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class dxm
    implements ServiceConnection
{

    private final Context a;

    public dxm(Context context)
    {
        a = context;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        ebw.e("Babel_telephony", "TeleTychoController.SimCallManagerChangedConnection.onServiceConnected");
        componentname = eht.a(ibinder);
        componentname.c();
        a.unbindService(this);
        return;
        componentname;
        ebw.e("Babel_telephony", "TeleTychoController.SimCallManagerChangedConnection.onServiceConnected, calling onSimCallManagerChanged failed", componentname);
        a.unbindService(this);
        return;
        componentname;
        a.unbindService(this);
        throw componentname;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        ebw.e("Babel_telephony", "TeleTychoController.SimCallManagerChangedConnection.onServiceDisconnected");
    }
}
