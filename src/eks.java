// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;

final class eks extends elk
{

    final ekp a;
    final ConnectionResult b;
    final ekr c;

    eks(ekr ekr, elo elo, ekp ekp1, ConnectionResult connectionresult)
    {
        c = ekr;
        a = ekp1;
        b = connectionresult;
        super(elo);
    }

    public void a()
    {
        ekp ekp1;
        ConnectionResult connectionresult;
label0:
        {
            ekp1 = a;
            connectionresult = b;
            if (ekp1.b(2))
            {
                if (!connectionresult.b())
                {
                    break label0;
                }
                ekp1.h();
            }
            return;
        }
        if (ekp1.a(connectionresult))
        {
            ekp1.i();
            ekp1.h();
            return;
        } else
        {
            ekp1.b(connectionresult);
            return;
        }
    }
}
