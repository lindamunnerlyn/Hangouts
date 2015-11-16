// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.telecom.PhoneAccountHandle;

final class dus
    implements dtu
{

    final PhoneAccountHandle a;
    final dur b;

    dus(dur dur1, PhoneAccountHandle phoneaccounthandle)
    {
        b = dur1;
        a = phoneaccounthandle;
        super();
    }

    public void a(dtv dtv1)
    {
        if (dtv1.a())
        {
            dtv1 = String.valueOf(dtv1);
            ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(dtv1).length() + 61)).append("TeleHandoffWifiToCellular.startHandoff, no cellular service, ").append(dtv1).toString());
            b.b.a(false, 210);
            return;
        }
        if (dvx.a(b.a) == 2)
        {
            dur.a(b, a);
            return;
        } else
        {
            dur.b(b, a);
            return;
        }
    }
}
