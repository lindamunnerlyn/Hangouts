// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dcq extends dfa
{

    private final String a;
    private final dqc d;

    public dcq(ani ani1, String s, dqc dqc)
    {
        super(ani1);
        a = s;
        d = dqc;
    }

    public void a()
    {
        aoe aoe1;
        aoe1 = new aoe(g.nS, b.h());
        aoe1.a();
        aoe1.a(a, d);
        aoe1.b();
        aoe1.c();
        return;
        Exception exception;
        exception;
        aoe1.c();
        throw exception;
    }
}
