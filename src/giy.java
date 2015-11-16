// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Set;

final class giy extends BroadcastReceiver
{

    final gir a;

    giy(gir gir1)
    {
        a = gir1;
        super();
    }

    private void a()
    {
        if (a.h == giw.d || a.h == giw.e || a.h == giw.f)
        {
            a.i();
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (!context.equals("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) goto _L2; else goto _L1
_L1:
        int i = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 10);
        if (i != 12) goto _L4; else goto _L3
_L3:
        gkc.b("vclib", "ACTION_AUDIO_STATE_CHANGED : STATE_AUDIO_CONNECTED");
        a.h = giw.d;
        a.h();
        a.d();
_L6:
        return;
_L4:
        if (i != 10) goto _L6; else goto _L5
_L5:
        gkc.b("vclib", "ACTION_AUDIO_STATE_CHANGED : STATE_AUDIO_DISCONNECTED");
        if (isInitialStickyBroadcast()) goto _L6; else goto _L7
_L7:
        a.h();
        a();
        a.d();
        return;
_L2:
        if (!context.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) goto _L6; else goto _L8
_L8:
        int j = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
        context = String.valueOf("BluetoothReceiver.onReceive: got ACTION_CONNECTION_STATE_CHANGED, profileState=");
        boolean flag = isInitialStickyBroadcast();
        gkc.b("vclib", (new StringBuilder(String.valueOf(context).length() + 34)).append(context).append(j).append(", isInitialSticky=").append(flag).toString());
        context = (BluetoothDevice)intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        switch (j)
        {
        case 1: // '\001'
        default:
            return;

        case 0: // '\0'
            gkc.b("vclib", "ACTION_CONNECTION_STATE_CHANGED : STATE_DISCONNECTED");
            a.f();
            a();
            a.n = null;
            if (a.i.contains(giv.c))
            {
                a.i.remove(giv.c);
                a.d();
                return;
            }
            break;

        case 2: // '\002'
            gkc.b("vclib", "ACTION_CONNECTION_STATE_CHANGED : STATE_CONNECTED");
            a.i.add(giv.c);
            a.d();
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L6; else goto _L9
_L9:
        if (a.n != null) goto _L6; else goto _L10
_L10:
        a.n = context;
        a.a(giv.c);
        return;
    }
}
