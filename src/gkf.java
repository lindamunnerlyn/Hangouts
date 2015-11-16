// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gkf
    implements gjs
{

    private final gjl a;

    gkf(gjl gjl1)
    {
        a = gjl1;
    }

    public void a(kws kws, gds gds)
    {
        kws = (jhk)kws;
        a.a("hangout_participants/add", kws, jhl, gds);
    }

    public void b(kws kws, gds gds)
    {
        kws = (jhm)kws;
        a.a("hangout_participants/modify", kws, jhn, gds);
    }

    public void c(kws kws, gds gds)
    {
        kws = (jho)kws;
        a.a("hangout_participants/remove", kws, jhp, gds);
    }
}
