// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import java.util.Set;

final class glz
    implements Runnable
{

    final glt a;

    glz(glt glt1)
    {
        a = glt1;
        super();
    }

    public void run()
    {
        boolean flag = true;
        Object obj = a.d;
        obj;
        JVM INSTR monitorenter ;
        glt glt1;
        gdv.b("Expected condition to be false", a.e);
        a.f = a.b.isSpeakerphoneOn();
        boolean flag1 = a.f;
        gne.a(3, "vclib", (new StringBuilder(31)).append("initAudio: speakerphone = ").append(flag1).toString());
        a.b.requestAudioFocus(null, 0, 2);
        a.b.setMode(3);
        glt1 = a;
        gne.a(3, "vclib", "initWiredHeadsetAudio");
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.HEADSET_PLUG");
        glt1.a.registerReceiver(glt1.c, intentfilter);
        a.e = true;
        glt1 = a;
        gne.a(3, "vclib", "initBluetoothAudio");
        if (glt1.k == null)
        {
            glt1.k = BluetoothAdapter.getDefaultAdapter();
        }
        if (glt1.k == null) goto _L2; else goto _L1
_L1:
        glt1.k.getProfileProxy(glt1.a, new gmb(glt1), 1);
        IntentFilter intentfilter1 = new IntentFilter();
        intentfilter1.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentfilter1.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
        glt1.m = new gma(glt1);
        glt1.a.registerReceiver(glt1.m, intentfilter1);
        if (2 != glt1.k.getProfileConnectionState(1)) goto _L2; else goto _L3
_L3:
        glt1.i.add(glx.c);
        glt1.g();
        glt1.h = gly.e;
        glt1.d();
_L7:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_329;
        }
        gne.a(4, "vclib", "Bluetooth is not connected, using default device.");
        if (a.o != null)
        {
            break MISSING_BLOCK_LABEL_332;
        }
        a.a(a.g);
_L5:
        obj;
        JVM INSTR monitorexit ;
        return;
        a.i();
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
