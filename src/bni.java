// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.telephony.PhoneStateListener;
import com.google.android.apps.hangouts.hangout.IncomingRing;

final class bni extends PhoneStateListener
{

    final bnd a;

    bni(bnd bnd1)
    {
        a = bnd1;
        super();
    }

    public void onCallStateChanged(int i, String s)
    {
        if (i == 2)
        {
            if (a.q != null)
            {
                a.q.c(1006);
            }
            s = IncomingRing.a();
            if (s != null)
            {
                s.m();
            }
        }
    }
}
