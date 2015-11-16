// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.telephony.PhoneStateListener;
import com.google.android.apps.hangouts.hangout.IncomingRing;

final class bnq extends PhoneStateListener
{

    final bnk a;

    bnq(bnk bnk1)
    {
        a = bnk1;
        super();
    }

    public void onCallStateChanged(int i, String s)
    {
        if (i == 2)
        {
            if (a.r != null)
            {
                a.r.c(1006);
            }
            s = IncomingRing.a();
            if (s != null)
            {
                s.n();
            }
        }
    }
}
