// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;

public final class eqi extends eqb
{

    final eqa e;

    public eqi(eqa eqa1)
    {
        e = eqa1;
        super(eqa1, 0, null);
    }

    protected void a(ConnectionResult connectionresult)
    {
        eqa.a(e).a(connectionresult);
        e.g();
    }

    protected boolean a()
    {
        eqa.a(e).a(ConnectionResult.a);
        return true;
    }
}
