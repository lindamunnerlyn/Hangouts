// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;

public final class eni extends enb
{

    final ena e;

    public eni(ena ena1)
    {
        e = ena1;
        super(ena1, 0, null);
    }

    protected void a(ConnectionResult connectionresult)
    {
        ena.a(e).a(connectionresult);
        e.g();
    }

    protected boolean a()
    {
        ena.a(e).a(ConnectionResult.a);
        return true;
    }
}
