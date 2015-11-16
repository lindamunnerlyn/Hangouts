// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

public final class fhy extends fpl
{

    final String a;
    final String b;
    final foy i;
    final fot j;

    public fhy(fot fot, emy emy, String s, String s1, foy foy)
    {
        j = fot;
        a = s;
        b = s1;
        i = foy;
        super(emy);
    }

    protected enh a(Status status)
    {
        return new fhz(this, status);
    }

    protected void a(emw emw)
    {
        ((fsj)emw).a(this, a, b, i);
    }
}
