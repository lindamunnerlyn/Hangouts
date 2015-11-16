// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gjv
    implements gjs
{

    private final gjl a;

    gjv(gjl gjl1)
    {
        a = gjl1;
    }

    public void a(kws kws, gds gds)
    {
        kws = (jgm)kws;
        a.a("broadcasts/add", kws, jgn, gds);
    }

    public void b(kws kws, gds gds)
    {
        kws = (jgo)kws;
        a.a("broadcasts/modify", kws, jgp, gds);
    }

    public void c(kws kws, gds gds)
    {
        kws = (jgs)kws;
        a.a("broadcasts/remove", kws, jgt, gds);
    }
}
