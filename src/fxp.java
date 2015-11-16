// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

public final class fxp extends fym
{

    final String a;
    final String b;
    final byte i[];
    final fvk j;

    public fxp(fvk fvk, emy emy, String s, String s1, byte abyte0[])
    {
        j = fvk;
        a = s;
        b = s1;
        i = abyte0;
        super(emy);
    }

    protected enh a(Status status)
    {
        return new fvm(status, -1);
    }

    protected void a(emw emw)
    {
        ((fyg)emw).a(this, a, b, i);
    }
}
