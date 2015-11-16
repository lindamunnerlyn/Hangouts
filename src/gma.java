// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Set;

final class gma extends BroadcastReceiver
{

    final glt a;

    gma(glt glt1)
    {
        a = glt1;
        super();
    }

    private void a()
    {
        if (a.h == gly.d || a.h == gly.e || a.h == gly.f)
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
        gne.a(3, "vclib", "ACTION_AUDIO_STATE_CHANGED : STATE_AUDIO_CONNECTED");
        a.h = gly.d;
        a.h();
        a.d();
_L6:
        return;
_L4:
        if (i != 10) goto _L6; else goto _L5
_L5:
        gne.a(3, "vclib", "ACTION_AUDIO_STATE_CHANGED : STATE_AUDIO_DISCONNECTED");
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
        gne.a(3, "vclib", (new StringBuilder(String.valueOf(context).length() + 34)).append(context).append(j).append(", isInitialSticky=").append(flag).toString());
        context = (BluetoothDevice)intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        switch (j)
        {
        case 1: // '\001'
        default:
            return;

        case 0: // '\0'
            gne.a(3, "vclib", "ACTION_CONNECTION_STATE_CHANGED : STATE_DISCONNECTED");
            a.f();
            a();
            a.n = null;
            if (a.i.contains(glx.c))
            {
                a.i.remove(glx.c);
                a.d();
                return;
            }
            break;

        case 2: // '\002'
            gne.a(3, "vclib", "ACTION_CONNECTION_STATE_CHANGED : STATE_CONNECTED");
            a.i.add(glx.c);
            a.d();
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L6; else goto _L9
_L9:
        if (a.n != null) goto _L6; else goto _L10
_L10:
        a.n = context;
        a.a(glx.c);
        return;
    }
}
