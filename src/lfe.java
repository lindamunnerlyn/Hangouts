// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lfe extends ley
{

    private final int a;
    private final int c;
    private final int d;

    public lfe(lcy lcy1)
    {
        lcz lcz;
        if (lcy1 == null)
        {
            lcz = null;
        } else
        {
            lcz = lcy1.a();
        }
        this(lcy1, lcz, 99);
    }

    public lfe(lcy lcy1, lcz lcz)
    {
        this(lcy1, lcz, 1);
    }

    private lfe(lcy lcy1, lcz lcz, int j)
    {
        super(lcy1, lcz);
        if (j == 0)
        {
            throw new IllegalArgumentException("The offset cannot be zero");
        }
        a = j;
        if (0x80000000 < lcy1.g() + j)
        {
            c = lcy1.g() + j;
        } else
        {
            c = 0x80000000;
        }
        if (0x7fffffff > lcy1.h() + j)
        {
            d = lcy1.h() + j;
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

    public ldh f()
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
