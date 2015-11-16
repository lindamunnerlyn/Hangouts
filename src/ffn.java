// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

public final class ffn extends fms
{

    final String a;
    final String b;
    final long i;
    final boolean j = false;
    final boolean k = false;
    final fmt l;

    public ffn(fmt fmt, ejx ejx, String s, String s1, long l1, boolean flag, 
            boolean flag1)
    {
        l = fmt;
        a = s;
        b = s1;
        i = l1;
        super(ejx);
    }

    protected void a(ejv ejv)
    {
        ((fpo)ejv).a(a, b, i, j, k);
        a(((ekg) (Status.a)));
    }
}
