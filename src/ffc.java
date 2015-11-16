// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

public final class ffc extends fmr
{

    final String a;
    final String b;
    final fme i;
    final flx j;

    public ffc(flx flx, ejx ejx, String s, String s1, fme fme)
    {
        j = flx;
        a = s;
        b = s1;
        i = fme;
        super(ejx);
    }

    protected ekg a(Status status)
    {
        return new ffd(this, status);
    }

    protected void a(ejv ejv)
    {
        ((fpo)ejv).a(this, a, b, i);
    }
}
