// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gkb
    implements gjr
{

    gkb()
    {
    }

    private static jko a(jif jif, jhc ajhc[])
    {
        jkf jkf1 = new jkf();
        jkf1.a = jif;
        jkf1.b = ajhc;
        return a(jkf1);
    }

    private static jko a(jkf jkf1)
    {
        jko jko1 = new jko();
        jko1.h = jkf1;
        return jko1;
    }

    public jko a(kws kws)
    {
        jhe jhe1 = (jhe)kws;
        jif jif = jhe1.c;
        if (jhe1.a == null)
        {
            kws = jhe1.d;
        } else
        {
            kws = new jhc[1];
            kws[0] = jhe1.a;
        }
        return a(jif, ((jhc []) (kws)));
    }

    public jko a(kws kws, kws kws1)
    {
        kws = (jhu)kws;
        jhv jhv1 = (jhv)kws1;
        kws1 = new jkf();
        kws1.a = jhv1.a;
        jkc ajkc[] = new jkc[((jhu) (kws)).c.length];
        for (int i = 0; i < ((jhu) (kws)).c.length; i++)
        {
            ajkc[i] = new jkc();
            ajkc[i].a = ((jhu) (kws)).a;
        }

        kws1.c = ajkc;
        return a(((jkf) (kws1)));
    }

    public jko b(kws kws)
    {
        jhg jhg1 = (jhg)kws;
        jif jif = jhg1.b;
        if (jhg1.a == null)
        {
            kws = jhg1.c;
        } else
        {
            kws = new jhc[1];
            kws[0] = jhg1.a;
        }
        return a(jif, kws);
    }
}
