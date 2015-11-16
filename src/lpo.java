// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lpo extends lpi
{

    private final int a;
    private final int c;
    private final int d;

    public lpo(lni lni1)
    {
        lnj lnj;
        if (lni1 == null)
        {
            lnj = null;
        } else
        {
            lnj = lni1.a();
        }
        this(lni1, lnj, 99);
    }

    public lpo(lni lni1, lnj lnj)
    {
        this(lni1, lnj, 1);
    }

    private lpo(lni lni1, lnj lnj, int j)
    {
        super(lni1, lnj);
        if (j == 0)
        {
            throw new IllegalArgumentException("The offset cannot be zero");
        }
        a = j;
        if (0x80000000 < lni1.g() + j)
        {
            c = lni1.g() + j;
        } else
        {
            c = 0x80000000;
        }
        if (0x7fffffff > lni1.h() + j)
        {
            d = lni1.h() + j;
            return;
        } else
        {
            d = 0x7fffffff;
            return;
        }
    }

    public int a(long l)
    {
        return super.a(l) + a;
    }

    public long a(long l, int j)
    {
        l = super.a(l, j);
        h.a(this, a(l), c, d);
        return l;
    }

    public long a(long l, long l1)
    {
        l = super.a(l, l1);
        h.a(this, a(l), c, d);
        return l;
    }

    public long b(long l, int j)
    {
        h.a(this, j, c, d);
        return super.b(l, j - a);
    }

    public boolean b(long l)
    {
        return super.b.b(l);
    }

    public long d(long l)
    {
        return super.b.d(l);
    }

    public long e(long l)
    {
        return super.b.e(l);
    }

    public long f(long l)
    {
        return super.b.f(l);
    }

    public lnr f()
    {
        return super.b.f();
    }

    public int g()
    {
        return c;
    }

    public long g(long l)
    {
        return super.b.g(l);
    }

    public int h()
    {
        return d;
    }

    public long h(long l)
    {
        return super.b.h(l);
    }

    public long i(long l)
    {
        return super.b.i(l);
    }
}
