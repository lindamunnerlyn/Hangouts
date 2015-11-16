// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hnm
    implements hmw
{

    public int c;
    public final int d;
    public final double e;
    public final double f;
    public final int g;
    long h;
    public final int i;
    private final hny j;

    public hnm()
    {
        this(new hnn());
    }

    protected hnm(hnn hnn1)
    {
        boolean flag1 = true;
        super();
        d = hnn1.a;
        e = hnn1.b;
        f = hnn1.c;
        g = hnn1.d;
        i = hnn1.e;
        j = hnn1.f;
        boolean flag;
        if (d > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.a(flag);
        if (0.0D <= e && e < 1.0D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.a(flag);
        if (f >= 1.0D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.a(flag);
        if (g >= d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.a(flag);
        if (i > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        l.a(flag);
        b();
    }

    public long a()
    {
        if (c() > (long)i)
        {
            return -1L;
        }
        double d2 = e;
        double d1 = Math.random();
        int k = c;
        d2 *= k;
        double d3 = (double)k - d2;
        k = (int)((((d2 + (double)k) - d3) + 1.0D) * d1 + d3);
        if ((double)c >= (double)g / f)
        {
            c = g;
        } else
        {
            c = (int)((double)c * f);
        }
        return (long)k;
    }

    public final void b()
    {
        c = d;
        h = j.a();
    }

    public final long c()
    {
        return (j.a() - h) / 0xf4240L;
    }
}
