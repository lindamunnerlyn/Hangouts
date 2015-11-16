// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gkc
    implements gjs
{

    private final gjl a;

    gkc(gjl gjl1)
    {
        a = gjl1;
    }

    public void a(kws kws, gds gds)
    {
        kws = (jhd)kws;
        a.a("hangouts/add", kws, jhe, gds);
    }

    public void b(kws kws, gds gds)
    {
        kws = (jhf)kws;
        a.a("hangouts/modify", kws, jhg, gds);
    }

    public void c(kws kws, gds gds)
    {
        kws = (jhu)kws;
        a.a("hangouts/remove", kws, jhv, gds);
    }
}
