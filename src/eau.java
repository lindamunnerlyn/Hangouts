// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class eau
    implements ServiceConnection
{

    private final Context a;
    private eav b;

    public eau(Context context, eav eav1)
    {
        a = context;
        b = eav1;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        eev.e("Babel_telephony", "TeleTychoController.HomeVocieNetworkConnection.onServiceConnected");
        componentname = eku.a(ibinder);
        b.a(true, componentname.b());
        b = null;
        a.unbindService(this);
        return;
        componentname;
        eev.e("Babel_telephony", "TeleTychoController.HomeVocieNetworkConnection.onServiceConnected, calling isOnHomeVoiceNetwork failed", componentname);
        b.a(false, false);
        b = null;
        a.unbindService(this);
        return;
        componentname;
        b = null;
        a.unbindService(this);
        throw componentname;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        eev.e("Babel_telephony", "TeleTychoController.HomeVocieNetworkConnection.onServiceDisconnected");
        if (b != null)
        {
            b.a(false, false);
            b = null;
        }
    }
}
