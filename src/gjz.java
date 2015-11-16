// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gjz
    implements gjs
{

    private final gjl a;

    gjz(gjl gjl1)
    {
        a = gjl1;
    }

    public void a(kws kws, gds gds)
    {
        kws = (jgw)kws;
        a.a("common_announcements/add", kws, jgx, gds);
    }

    public void b(kws kws, gds gds)
    {
        gdv.a("Common announcement modification operation is not supported");
    }

    public void c(kws kws, gds gds)
    {
        kws = (jgy)kws;
        a.a("common_announcements/remove", kws, jgz, gds);
    }
}
