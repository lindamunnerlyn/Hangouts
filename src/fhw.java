// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

public final class fhw extends fpl
{

    final fow a;
    final fot b;

    public fhw(fot fot, emy emy, fow fow1)
    {
        b = fot;
        a = fow1;
        super(emy);
    }

    protected enh a(Status status)
    {
        return new fhx(this, status);
    }

    protected void a(emw emw)
    {
        ((fsj)emw).a(this, a.a(), a.c());
    }
}
