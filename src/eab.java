// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class eab extends BroadcastReceiver
{

    final dzx a;

    eab(dzx dzx1)
    {
        a = dzx1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        if (dzx.b())
        {
            context = String.valueOf(intent.getAction());
            if (context.length() != 0)
            {
                context = "TeleWifiMonitor.Receiver.onReceive, action: ".concat(context);
            } else
            {
                context = new String("TeleWifiMonitor.Receiver.onReceive, action: ");
            }
            eev.b("Babel_telephony", context);
        }
        dzx.a(a);
    }
}
