// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public final class fwq extends fwh
{

    final fst a;

    public fwq(fst fst, ejx ejx)
    {
        a = fst;
        super(ejx);
    }

    protected ekg a(Status status)
    {
        return new ftb(DataHolder.b(status.f()));
    }

    protected void a(ejv ejv)
    {
        ((fwb)ejv).a(this);
    }
}
