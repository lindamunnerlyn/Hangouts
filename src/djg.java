// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class djg extends dje
{

    private final int l;
    private final int m;
    private final int n;
    private final long o;

    public djg(czg czg1)
    {
        super(czg1.c, czg1.d, czg1.e, czg1.n, czg1.m, czg1.l, czg1.f, czg1.h, czg1.i, dqb.e, czg1.u);
        l = czg1.a;
        m = czg1.b;
        n = czg1.w;
        o = g.a(Long.valueOf(czg1.n), 0L);
    }

    public djg(String s, cey cey, long l1, long l2, String s1, 
            String s2, int i, dqb dqb1)
    {
        super(s, cey, l1, l2, s1, s2, -1, 1, 0L, dqb1, null);
        l = -1;
        m = i;
        n = -1;
        o = g.a(Long.valueOf(l2), 0L);
    }

    private void e(aoe aoe1)
    {
        dqc dqc1;
        if (m == 1)
        {
            dqc1 = dqc.j;
        } else
        {
            dqc1 = dqc.k;
        }
        aoe1.a(f, a, k, g, dqc1, h, o, c, null, null);
    }

    public void c(aoe aoe1)
    {
        aoe1.a();
        e(aoe1);
        a(aoe1);
        if (o > 0L)
        {
            aoe1.a(m, n, h, f);
        }
        aoe1.b();
        aoe1.c();
        any.d(aoe1, f);
        return;
        Exception exception;
        exception;
        aoe1.c();
        throw exception;
    }

    public void d(aoe aoe1)
    {
        e(aoe1);
        b(aoe1);
    }
}
