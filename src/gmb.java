// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import java.util.Set;

final class gmb
    implements android.bluetooth.BluetoothProfile.ServiceListener
{

    final glt a;

    gmb(glt glt1)
    {
        a = glt1;
        super();
    }

    public void onServiceConnected(int i, BluetoothProfile bluetoothprofile)
    {
        if (i == 1)
        {
            gne.a(3, "vclib", "BluetoothProfile.ServiceListener : onServiceConnected");
            a.l = (BluetoothHeadset)bluetoothprofile;
            if (a.h == gly.e)
            {
                a.e();
            }
        }
    }

    public void onServiceDisconnected(int i)
    {
        if (i == 1)
        {
            gne.a(3, "vclib", "BluetoothProfile.ServiceListener : onServiceDisconnected");
            a.f();
            a.n = null;
            a.l = null;
            if (a.i.remove(glx.c))
            {
                a.d();
            }
        }
    }
}
