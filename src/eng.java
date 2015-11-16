// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;

public final class eng
    implements ekb
{

    final ena a;

    public eng(ena ena1)
    {
        a = ena1;
        super();
    }

    public void a(ConnectionResult connectionresult)
    {
        if (connectionresult.b())
        {
            a.a(null, ena.d(a));
        } else
        if (ena.e(a) != null)
        {
            ena.e(a).a(connectionresult);
            return;
        }
    }

    public void b(ConnectionResult connectionresult)
    {
        throw new IllegalStateException("Legacy GmsClient received onReportAccountValidation callback.");
    }
}
