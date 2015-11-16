// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;

final class env extends eol
{

    final enq a;
    final ResolveAccountResponse b;
    final enu c;

    env(enu enu, eop eop, enq enq1, ResolveAccountResponse resolveaccountresponse)
    {
        c = enu;
        a = enq1;
        b = resolveaccountresponse;
        super(eop);
    }

    public void a()
    {
        enq enq1;
        ConnectionResult connectionresult;
label0:
        {
            enq1 = a;
            ResolveAccountResponse resolveaccountresponse = b;
            if (enq1.b(0))
            {
                connectionresult = resolveaccountresponse.b();
                if (!connectionresult.b())
                {
                    break label0;
                }
                enq1.g = resolveaccountresponse.a();
                enq1.f = true;
                enq1.h = resolveaccountresponse.c();
                enq1.i = resolveaccountresponse.d();
                enq1.f();
            }
            return;
        }
        if (enq1.a(connectionresult))
        {
            enq1.i();
            enq1.f();
            return;
        } else
        {
            enq1.b(connectionresult);
            return;
        }
    }
}
