// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ghd
    implements ggq
{

    ghd()
    {
    }

    private static jec a(jbw jbw, jba ajba[])
    {
        jdr jdr1 = new jdr();
        jdr1.a = jbw;
        jdr1.b = (jba[])ajba.clone();
        jbw = new jec();
        jbw.a = jdr1;
        return jbw;
    }

    public jec a(kop kop)
    {
        kop = (jbe)kop;
        return a(((jbe) (kop)).b, ((jbe) (kop)).d);
    }

    public jec b(kop kop)
    {
        kop = (jbg)kop;
        return a(((jbg) (kop)).b, ((jbg) (kop)).c);
    }
}
