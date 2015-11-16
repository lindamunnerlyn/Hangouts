// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gke
    implements gjr
{

    gke()
    {
    }

    private static jko a(jif jif, jhh ajhh[])
    {
        jkd jkd1 = new jkd();
        jkd1.a = jif;
        jkd1.b = ajhh;
        return a(jkd1);
    }

    private static jko a(jkd jkd1)
    {
        jko jko1 = new jko();
        jko1.a = jkd1;
        return jko1;
    }

    public jko a(kws kws)
    {
        jhl jhl1 = (jhl)kws;
        jif jif = jhl1.b;
        if (jhl1.a == null)
        {
            kws = jhl1.d;
        } else
        {
            kws = new jhh[1];
            kws[0] = jhl1.a;
        }
        return a(jif, ((jhh []) (kws)));
    }

    public jko a(kws kws, kws kws1)
    {
        kws = (jho)kws;
        jhp jhp1 = (jhp)kws1;
        kws1 = new jkd();
        kws1.a = jhp1.a;
        kws1.f = Integer.valueOf(g.a(jhp1.b, 1));
        jid ajid[] = new jid[((jho) (kws)).e.length];
        for (int i = 0; i < ((jho) (kws)).e.length; i++)
        {
            ajid[i] = new jid();
            ajid[i].a = ((jho) (kws)).a;
            ajid[i].b = ((jho) (kws)).e[i];
        }

        kws1.c = ajid;
        return a(((jkd) (kws1)));
    }

    public jko b(kws kws)
    {
        jhn jhn1 = (jhn)kws;
        jif jif = jhn1.b;
        if (jhn1.a == null)
        {
            kws = jhn1.c;
        } else
        {
            kws = new jhh[1];
            kws[0] = jhn1.a;
        }
        return a(jif, kws);
    }
}
