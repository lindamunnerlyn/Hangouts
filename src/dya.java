// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.telecom.PhoneAccountHandle;

final class dya
    implements dxc
{

    final PhoneAccountHandle a;
    final dxz b;

    dya(dxz dxz1, PhoneAccountHandle phoneaccounthandle)
    {
        b = dxz1;
        a = phoneaccounthandle;
        super();
    }

    public void a(dxd dxd1)
    {
        if (dxd1.a())
        {
            dxd1 = String.valueOf(dxd1);
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(dxd1).length() + 61)).append("TeleHandoffWifiToCellular.startHandoff, no cellular service, ").append(dxd1).toString());
            b.b.a(false, 210);
            return;
        }
        if (dzg.a(b.a) == 2)
        {
            dxz.a(b, a);
            return;
        } else
        {
            dxz.b(b, a);
            return;
        }
    }
}
