// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class eqj extends eqb
{

    final eqa e;

    public eqj(eqa eqa1, int i, Bundle bundle)
    {
        e = eqa1;
        super(eqa1, i, bundle);
    }

    protected void a(ConnectionResult connectionresult)
    {
        eqa.a(e).b(connectionresult);
        e.g();
    }

    protected boolean a()
    {
        eqa.a(e).b(ConnectionResult.a);
        return true;
    }
}
