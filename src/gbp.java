// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gbp
    implements gbe
{

    final gbn a;

    gbp(gbn gbn)
    {
        a = gbn;
        super();
    }

    public void a(kop kop)
    {
        gkc.b("vclib", "Successfully set presenter on hangout");
    }

    public void b(kop kop)
    {
        kop = String.valueOf((jaz)kop);
        gkc.b("vclib", (new StringBuilder(String.valueOf(kop).length() + 36)).append("Failed to set presenter on hangout: ").append(kop).toString());
    }
}
