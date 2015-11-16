// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gju
    implements gjr
{

    gju()
    {
    }

    private static jko a(jif jif, jgc jgc1)
    {
        jju jju1 = new jju();
        jju1.a = jif;
        jju1.b = (new jgc[] {
            jgc1
        });
        return a(jju1);
    }

    private static jko a(jju jju1)
    {
        jko jko1 = new jko();
        jko1.g = jju1;
        return jko1;
    }

    public jko a(kws kws)
    {
        kws = (jgn)kws;
        return a(((jgn) (kws)).b, ((jgn) (kws)).a);
    }

    public jko a(kws kws, kws kws1)
    {
        kws = (jgs)kws;
        Object obj = (jgt)kws1;
        kws1 = new jju();
        kws1.a = ((jgt) (obj)).a;
        obj = new jic();
        obj.a = ((jgs) (kws)).a;
        obj.b = ((jgs) (kws)).b;
        kws1.c = (new jic[] {
            obj
        });
        return a(((jju) (kws1)));
    }

    public jko b(kws kws)
    {
        kws = (jgp)kws;
        return a(((jgp) (kws)).b, ((jgp) (kws)).a);
    }
}
