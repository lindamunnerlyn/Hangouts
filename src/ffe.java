// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

public final class ffe extends fmr
{

    final String a;
    final String b;
    final fly i;
    final flx j;

    public ffe(flx flx, ejx ejx, String s, String s1, fly fly1)
    {
        j = flx;
        a = s;
        b = s1;
        i = fly1;
        super(ejx);
    }

    protected ekg a(Status status)
    {
        return new fff(this, status);
    }

    protected void a(ejv ejv)
    {
        ((fpo)ejv).a(this, a, b, i.a(), i.b(), i.c(), i.e(), i.f(), i.g(), i.h(), i.i());
    }
}
