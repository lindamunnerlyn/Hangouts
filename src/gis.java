// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.bluetooth.BluetoothHeadset;

final class gis
    implements Runnable
{

    final gir a;

    gis(gir gir1)
    {
        a = gir1;
        super();
    }

    public void run()
    {
        gir gir1 = a;
        gkc.b("vclib", "Starting or stopping Bluetooth timed out");
        gir1.h();
        switch (giu.b[gir1.h.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            if (gir1.l != null && gir1.n != null && gir1.l.isAudioConnected(gir1.n))
            {
                gkc.e("vclib", "We thought BT had timed out, but it's actually on; updating state.");
                gir1.h = giw.d;
            } else
            {
                gir1.f();
                gir1.i();
            }
            gir1.d();
            return;

        case 2: // '\002'
            break;
        }
        if (gir1.l == null || gir1.n == null || !gir1.l.isAudioConnected(gir1.n))
        {
            gkc.e("vclib", "We thought BT had timed out, but it's actually off; updating state.");
            gir1.i();
        } else
        {
            gir1.h = giw.d;
        }
        gir1.d();
    }
}
