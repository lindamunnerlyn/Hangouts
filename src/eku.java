// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;

final class eku extends elk
{

    final ekp a;
    final ResolveAccountResponse b;
    final ekt c;

    eku(ekt ekt, elo elo, ekp ekp1, ResolveAccountResponse resolveaccountresponse)
    {
        c = ekt;
        a = ekp1;
        b = resolveaccountresponse;
        super(elo);
    }

    public void a()
    {
        ekp ekp1;
        ConnectionResult connectionresult;
label0:
        {
            ekp1 = a;
            ResolveAccountResponse resolveaccountresponse = b;
            if (ekp1.b(0))
            {
                connectionresult = resolveaccountresponse.b();
                if (!connectionresult.b())
                {
                    break label0;
                }
                ekp1.g = resolveaccountresponse.a();
                ekp1.f = true;
                ekp1.h = resolveaccountresponse.c();
                ekp1.i = resolveaccountresponse.d();
                ekp1.f();
            }
            return;
        }
        if (ekp1.a(connectionresult))
        {
            ekp1.i();
            ekp1.f();
            return;
        } else
        {
            ekp1.b(connectionresult);
            return;
        }
    }
}
