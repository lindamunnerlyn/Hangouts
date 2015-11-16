// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ghg
    implements ggq
{

    ghg()
    {
    }

    private static jec a(jbw jbw, jcp ajcp[])
    {
        jdz jdz1 = new jdz();
        jdz1.a = jbw;
        jdz1.b = (jcp[])ajcp.clone();
        jbw = new jec();
        jbw.e = jdz1;
        return jbw;
    }

    public jec a(kop kop)
    {
        kop = (jcw)kop;
        return a(((jcw) (kop)).b, ((jcw) (kop)).c);
    }

    public jec b(kop kop)
    {
        kop = (jcy)kop;
        return a(((jcy) (kop)).b, ((jcy) (kop)).c);
    }
}
