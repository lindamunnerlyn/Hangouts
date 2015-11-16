// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;

final class bhe extends PhoneStateListener
{

    final bhf a;
    final bhd b;

    bhe(bhd bhd1, bhf bhf1)
    {
        b = bhd1;
        a = bhf1;
        super();
    }

    public void onServiceStateChanged(ServiceState servicestate)
    {
        bhd bhd1 = b;
        boolean flag;
        if (servicestate.getState() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bhd1.a = flag;
        a.a();
    }
}
