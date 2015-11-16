// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dkt extends dkr
{

    private final int l;
    private final int m;
    private final int n;
    private final long o;

    public dkt(dnm dnm1)
    {
        super(dnm1.c, dnm1.d, dnm1.e, dnm1.n, dnm1.m, dnm1.l, dnm1.f, dnm1.h, dnm1.i, dsu.e, dnm1.u);
        l = dnm1.a;
        m = dnm1.b;
        n = dnm1.w;
        o = g.a(Long.valueOf(dnm1.n), 0L);
    }

    public dkt(String s, cgd cgd, long l1, long l2, String s1, 
            String s2, int i, dsu dsu1)
    {
        super(s, cgd, l1, l2, s1, s2, -1, 1, 0L, dsu1, null);
        l = -1;
        m = i;
        n = -1;
        o = g.a(Long.valueOf(l2), 0L);
    }

    private void e(aow aow1)
    {
        dsv dsv1;
        if (m == 1)
        {
            dsv1 = dsv.j;
        } else
        {
            dsv1 = dsv.k;
        }
        aow1.a(f, a, k, g, dsv1, h, o, c, null, null);
    }

    public void c(aow aow1)
    {
        aow1.a();
        e(aow1);
        a(aow1);
        if (o > 0L)
        {
            aow1.a(m, n, h, f);
        }
        aow1.b();
        aow1.c();
        aoq.d(aow1, f);
        return;
        Exception exception;
        exception;
        aow1.c();
        throw exception;
    }

    public void d(aow aow1)
    {
        e(aow1);
        b(aow1);
    }
}
