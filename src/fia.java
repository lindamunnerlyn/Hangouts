// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

public final class fia extends fpl
{

    final String a;
    final String b;
    final fou i;
    final fot j;

    public fia(fot fot, emy emy, String s, String s1, fou fou1)
    {
        j = fot;
        a = s;
        b = s1;
        i = fou1;
        super(emy);
    }

    protected enh a(Status status)
    {
        return new fib(this, status);
    }

    protected void a(emw emw)
    {
        ((fsj)emw).a(this, a, b, i.a(), i.b(), i.c(), i.e(), i.f(), i.g(), i.h(), i.i());
    }
}
