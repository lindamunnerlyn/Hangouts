// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.telecom.DisconnectCause;

final class dub
{

    dvj a;

    dub(dvj dvj1)
    {
        a = dvj1;
    }

    public void a()
    {
        ebw.e("Babel_telephony", "TeleOutgoingCallRequest.DisconnectCallListener.onDisconnect");
        if (a != null)
        {
            dvj dvj1 = a;
            if (!dvj1.d)
            {
                dvj1.b.setDisconnected(new DisconnectCause(2));
                dvj1.c();
            }
        }
    }

    void b()
    {
        a = null;
    }
}
