// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

public final class fey extends fmr
{

    final fmc a;
    final flx b;

    public fey(flx flx, ejx ejx, fmc fmc1)
    {
        b = flx;
        a = fmc1;
        super(ejx);
    }

    protected ekg a(Status status)
    {
        return new fez(this, status);
    }

    protected void a(ejv ejv)
    {
        ((fpo)ejv).a(this, a.a(), a.b());
    }
}
