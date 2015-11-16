// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dhc extends dfa
{

    String a;
    private final String d;

    public dhc(ani ani1, String s, String s1)
    {
        super(ani1);
        a = s;
        d = s1;
    }

    public void a()
    {
        aoe aoe1;
        aoe1 = new aoe(g.nS, b.h());
        aoe1.a();
        Long long1 = aoe1.g(a, d);
        if (long1 == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        any.a(aoe1, g.a(long1, 0L));
        aoe1.b();
        aoe1.c();
        return;
        Exception exception;
        exception;
        aoe1.c();
        throw exception;
    }
}
