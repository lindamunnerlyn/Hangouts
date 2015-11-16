// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

public final class fer extends ejf
{

    final fbt a;

    public fer(fbt fbt, ejw ejw, ejx ejx)
    {
        a = fbt;
        super(ejw, ejx);
    }

    public ekg a(Status status)
    {
        return new fet(status, null);
    }

    protected void a(ejv ejv)
    {
        ((fev)((fcc)ejv).n()).a(new fes(this, this));
    }
}
