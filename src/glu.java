// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.bluetooth.BluetoothHeadset;

final class glu
    implements Runnable
{

    final glt a;

    glu(glt glt1)
    {
        a = glt1;
        super();
    }

    public void run()
    {
        glt glt1 = a;
        gne.a(3, "vclib", "Starting or stopping Bluetooth timed out");
        glt1.h();
        switch (glw.b[glt1.h.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            if (glt1.l != null && glt1.n != null && glt1.l.isAudioConnected(glt1.n))
            {
                gne.a(6, "vclib", "We thought BT had timed out, but it's actually on; updating state.");
                glt1.h = gly.d;
            } else
            {
                glt1.f();
                glt1.i();
            }
            glt1.d();
            return;

        case 2: // '\002'
            break;
        }
        if (glt1.l == null || glt1.n == null || !glt1.l.isAudioConnected(glt1.n))
        {
            gne.a(6, "vclib", "We thought BT had timed out, but it's actually off; updating state.");
            glt1.i();
        } else
        {
            glt1.h = gly.d;
        }
        glt1.d();
    }
}
