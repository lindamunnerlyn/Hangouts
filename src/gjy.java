// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gjy
    implements gjr
{

    gjy()
    {
    }

    private static jko a(jjy jjy1)
    {
        jko jko1 = new jko();
        jko1.i = jjy1;
        return jko1;
    }

    public jko a(kws kws)
    {
        jgx jgx1 = (jgx)kws;
        jjy jjy1 = new jjy();
        jjy1.a = jgx1.b;
        if (jgx1.a == null)
        {
            kws = jgx1.c;
        } else
        {
            kws = new jgv[1];
            kws[0] = jgx1.a;
        }
        jjy1.b = kws;
        return a(jjy1);
    }

    public jko a(kws kws, kws kws1)
    {
        kws = (jgy)kws;
        jgz jgz1 = (jgz)kws1;
        kws1 = new jjy();
        kws1.a = jgz1.a;
        jjx ajjx[] = new jjx[((jgy) (kws)).d.length];
        for (int i = 0; i < ((jgy) (kws)).d.length; i++)
        {
            ajjx[i] = new jjx();
            ajjx[i].a = ((jgy) (kws)).a;
            ajjx[i].b = ((jgy) (kws)).d[i];
        }

        kws1.c = ajjx;
        return a(((jjy) (kws1)));
    }

    public jko b(kws kws)
    {
        gdv.a("Common announcement modification operation is not supported");
        return null;
    }
}
