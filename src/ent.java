// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;

final class ent extends eol
{

    final enq a;
    final ConnectionResult b;
    final ens c;

    ent(ens ens, eop eop, enq enq1, ConnectionResult connectionresult)
    {
        c = ens;
        a = enq1;
        b = connectionresult;
        super(eop);
    }

    public void a()
    {
        enq enq1;
        ConnectionResult connectionresult;
label0:
        {
            enq1 = a;
            connectionresult = b;
            if (enq1.b(2))
            {
                if (!connectionresult.b())
                {
                    break label0;
                }
                enq1.h();
            }
            return;
        }
        if (enq1.a(connectionresult))
        {
            enq1.i();
            enq1.h();
            return;
        } else
        {
            enq1.b(connectionresult);
            return;
        }
    }
}
