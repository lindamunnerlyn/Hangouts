// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

public final class fij extends fpm
{

    final String a;
    final String b;
    final long i;
    final boolean j = false;
    final boolean k = false;
    final fpn l;

    public fij(fpn fpn, emy emy, String s, String s1, long l1, boolean flag, 
            boolean flag1)
    {
        l = fpn;
        a = s;
        b = s1;
        i = l1;
        super(emy);
    }

    protected void a(emw emw)
    {
        ((fsj)emw).a(a, b, i, j, k);
        a(((enh) (Status.a)));
    }
}
