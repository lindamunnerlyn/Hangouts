// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.PutDataRequest;

public final class fwp extends fwh
{

    final PutDataRequest a;
    final fst b;

    public fwp(fst fst, ejx ejx, PutDataRequest putdatarequest)
    {
        b = fst;
        a = putdatarequest;
        super(ejx);
    }

    public ekg a(Status status)
    {
        return new fsu(status, null);
    }

    protected void a(ejv ejv)
    {
        ((fwb)ejv).a(this, a);
    }
}
