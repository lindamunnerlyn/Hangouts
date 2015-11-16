// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gki
    implements gjs
{

    private final gjl a;

    gki(gjl gjl1)
    {
        a = gjl1;
    }

    public void a(kws kws, gds gds)
    {
        kws = (jjf)kws;
        a.a("media_sources/add", kws, jjg, gds);
    }

    public void b(kws kws, gds gds)
    {
        kws = (jjh)kws;
        a.a("media_sources/modify", kws, jji, gds);
    }

    public void c(kws kws, gds gds)
    {
        kws = (jjj)kws;
        a.a("media_sources/remove", kws, jjk, gds);
    }
}
