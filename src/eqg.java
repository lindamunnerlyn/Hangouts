// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;

public final class eqg
    implements enc
{

    final eqa a;

    public eqg(eqa eqa1)
    {
        a = eqa1;
        super();
    }

    public void a(ConnectionResult connectionresult)
    {
        if (connectionresult.b())
        {
            a.a(null, eqa.d(a));
        } else
        if (eqa.e(a) != null)
        {
            eqa.e(a).a(connectionresult);
            return;
        }
    }

    public void b(ConnectionResult connectionresult)
    {
        throw new IllegalStateException("Legacy GmsClient received onReportAccountValidation callback.");
    }
}
