// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import java.util.Set;

final class gix
    implements Runnable
{

    final gir a;

    gix(gir gir1)
    {
        a = gir1;
        super();
    }

    public void run()
    {
        boolean flag = true;
        Object obj = a.d;
        obj;
        JVM INSTR monitorenter ;
        gir gir1;
        gbh.b(a.e);
        a.f = a.b.isSpeakerphoneOn();
        boolean flag1 = a.f;
        gkc.b("vclib", (new StringBuilder(31)).append("initAudio: speakerphone = ").append(flag1).toString());
        a.b.requestAudioFocus(null, 0, 2);
        a.b.setMode(3);
        gir1 = a;
        gkc.b("vclib", "initWiredHeadsetAudio");
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.HEADSET_PLUG");
        gir1.a.registerReceiver(gir1.c, intentfilter);
        a.e = true;
        gir1 = a;
        gkc.b("vclib", "initBluetoothAudio");
        if (gir1.k == null)
        {
            gir1.k = BluetoothAdapter.getDefaultAdapter();
        }
        if (gir1.k == null) goto _L2; else goto _L1
_L1:
        gir1.k.getProfileProxy(gir1.a, new giz(gir1), 1);
        IntentFilter intentfilter1 = new IntentFilter();
        intentfilter1.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentfilter1.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
        gir1.m = new giy(gir1);
        gir1.a.registerReceiver(gir1.m, intentfilter1);
        if (2 != gir1.k.getProfileConnectionState(1)) goto _L2; else goto _L3
_L3:
        gir1.i.add(giv.c);
        gir1.g();
        gir1.h = giw.e;
        gir1.d();
_L7:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_323;
        }
        gkc.c("vclib", "Bluetooth is not connected, using default device.");
        if (a.o != null)
        {
            break MISSING_BLOCK_LABEL_326;
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
