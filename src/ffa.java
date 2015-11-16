// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

public final class ffa extends fmr
{

    final String a;
    final String b;
    final fma i;
    final flx j;

    public ffa(flx flx, ejx ejx, String s, String s1, fma fma1)
    {
        j = flx;
        a = s;
        b = s1;
        i = fma1;
        super(ejx);
    }

    protected ekg a(Status status)
    {
        return new ffb(this, status);
    }

    protected void a(ejv ejv)
    {
        ((fpo)ejv).a(this, a, b, i.a(), i.d(), i.b(), i.c());
    }
}
