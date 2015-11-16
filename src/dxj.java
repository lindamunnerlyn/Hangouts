// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.telecom.DisconnectCause;

final class dxj
{

    dys a;

    dxj(dys dys1)
    {
        a = dys1;
    }

    public void a()
    {
        eev.e("Babel_telephony", "TeleOutgoingCallRequest.DisconnectCallListener.onDisconnect");
        if (a != null)
        {
            dys dys1 = a;
            if (!dys1.d)
            {
                dys1.b.setDisconnected(new DisconnectCause(2));
                dys1.c();
            }
        }
    }

    void b()
    {
        a = null;
    }
}
