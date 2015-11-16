// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gkh
    implements gjr
{

    gkh()
    {
    }

    private static jko a(jif jif, jiz ajiz[])
    {
        jkl jkl1 = new jkl();
        jkl1.a = jif;
        jkl1.b = ajiz;
        return a(jkl1);
    }

    private static jko a(jkl jkl1)
    {
        jko jko1 = new jko();
        jko1.e = jkl1;
        return jko1;
    }

    public jko a(kws kws)
    {
        jjg jjg1 = (jjg)kws;
        jif jif = jjg1.b;
        if (jjg1.a == null)
        {
            kws = jjg1.c;
        } else
        {
            kws = new jiz[1];
            kws[0] = jjg1.a;
        }
        return a(jif, ((jiz []) (kws)));
    }

    public jko a(kws kws, kws kws1)
    {
        kws = (jjj)kws;
        jjk jjk1 = (jjk)kws1;
        kws1 = new jkl();
        kws1.a = jjk1.a;
        jie ajie[] = new jie[((jjj) (kws)).e.length];
        for (int i = 0; i < ((jjj) (kws)).e.length; i++)
        {
            ajie[i] = new jie();
            ajie[i].a = ((jjj) (kws)).a;
            ajie[i].b = ((jjj) (kws)).b;
            ajie[i].c = ((jjj) (kws)).e[i];
        }

        kws1.c = ajie;
        return a(((jkl) (kws1)));
    }

    public jko b(kws kws)
    {
        jji jji1 = (jji)kws;
        jif jif = jji1.b;
        if (jji1.a == null)
        {
            kws = jji1.c;
        } else
        {
            kws = new jiz[1];
            kws[0] = jji1.a;
        }
        return a(jif, kws);
    }
}
