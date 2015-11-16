// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class eaw
    implements ServiceConnection
{

    private final Context a;

    public eaw(Context context)
    {
        a = context;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        eev.e("Babel_telephony", "TeleTychoController.SimCallManagerChangedConnection.onServiceConnected");
        componentname = eku.a(ibinder);
        componentname.c();
        a.unbindService(this);
        return;
        componentname;
        eev.e("Babel_telephony", "TeleTychoController.SimCallManagerChangedConnection.onServiceConnected, calling onSimCallManagerChanged failed", componentname);
        a.unbindService(this);
        return;
        componentname;
        a.unbindService(this);
        throw componentname;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        eev.e("Babel_telephony", "TeleTychoController.SimCallManagerChangedConnection.onServiceDisconnected");
    }
}
