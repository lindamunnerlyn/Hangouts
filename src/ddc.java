// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class ddc extends dfa
{

    private final List a;
    private final String d;
    private final boolean e;

    public ddc(ani ani, List list, String s, boolean flag)
    {
        super(ani);
        a = list;
        d = s;
        e = flag;
    }

    public void a()
    {
        cud cud1 = new cud(a, d, e, false);
        c.a(cud1);
    }
}
