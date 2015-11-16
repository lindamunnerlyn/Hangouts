// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import java.util.Set;

final class giz
    implements android.bluetooth.BluetoothProfile.ServiceListener
{

    final gir a;

    giz(gir gir1)
    {
        a = gir1;
        super();
    }

    public void onServiceConnected(int i, BluetoothProfile bluetoothprofile)
    {
        if (i == 1)
        {
            gkc.b("vclib", "BluetoothProfile.ServiceListener : onServiceConnected");
            a.l = (BluetoothHeadset)bluetoothprofile;
            if (a.h == giw.e)
            {
                a.e();
            }
        }
    }

    public void onServiceDisconnected(int i)
    {
        if (i == 1)
        {
            gkc.b("vclib", "BluetoothProfile.ServiceListener : onServiceDisconnected");
            a.f();
            a.n = null;
            a.l = null;
            if (a.i.remove(giv.c))
            {
                a.d();
            }
        }
    }
}
