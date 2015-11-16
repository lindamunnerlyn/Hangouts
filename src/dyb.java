// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.telecom.PhoneAccountHandle;

final class dyb
    implements gds
{

    final PhoneAccountHandle a;
    final dxz b;

    dyb(dxz dxz1, PhoneAccountHandle phoneaccounthandle)
    {
        b = dxz1;
        a = phoneaccounthandle;
        super();
    }

    public void a(kws kws)
    {
        if (!b.b.g())
        {
            dxz.a(b, a);
        }
    }

    public void b(kws kws)
    {
        eev.f("Babel_telephony", "TeleHandoffWifiToCellular.prepareForHandoff, failed to prepare server. Trying handoff anyway.");
        if (!b.b.g())
        {
            dxz.a(b, a);
        }
    }
}
