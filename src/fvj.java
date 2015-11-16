// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

public final class fvj extends fwh
{

    final String a;
    final String b;
    final byte i[];
    final fte j;

    public fvj(fte fte, ejx ejx, String s, String s1, byte abyte0[])
    {
        j = fte;
        a = s;
        b = s1;
        i = abyte0;
        super(ejx);
    }

    protected ekg a(Status status)
    {
        return new ftg(status, -1);
    }

    protected void a(ejv ejv)
    {
        ((fwb)ejv).a(this, a, b, i);
    }
}
