// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.telecom.PhoneAccountHandle;

final class dut
    implements gbe
{

    final PhoneAccountHandle a;
    final dur b;

    dut(dur dur1, PhoneAccountHandle phoneaccounthandle)
    {
        b = dur1;
        a = phoneaccounthandle;
        super();
    }

    public void a(kop kop)
    {
        if (!b.b.g())
        {
            dur.a(b, a);
        }
    }

    public void b(kop kop)
    {
        ebw.f("Babel_telephony", "TeleHandoffWifiToCellular.prepareForHandoff, failed to prepare server. Trying handoff anyway.");
        if (!b.b.g())
        {
            dur.a(b, a);
        }
    }
}
