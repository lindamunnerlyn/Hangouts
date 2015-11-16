// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

public final class ffl extends fms
{

    final ejx a;
    final fmm b;
    final String i;
    final String j;
    final int k;
    final fml l;

    public ffl(fml fml, ejx ejx, ejx ejx1, fmm fmm, String s, String s1, int i1)
    {
        l = fml;
        a = ejx1;
        b = fmm;
        i = s;
        j = s1;
        k = i1;
        super(ejx);
    }

    protected void a(ejv ejv)
    {
        ((fpo)ejv).a(a, b, i, j, k);
        a(((ekg) (Status.a)));
    }
}
