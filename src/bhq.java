// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;

final class bhq extends PhoneStateListener
{

    final bhr a;
    final bhp b;

    bhq(bhp bhp1, bhr bhr1)
    {
        b = bhp1;
        a = bhr1;
        super();
    }

    public void onServiceStateChanged(ServiceState servicestate)
    {
        bhp bhp1 = b;
        boolean flag;
        if (servicestate.getState() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bhp1.a = flag;
        a.a();
    }
}
