// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lpw extends lpi
{

    public lpw(lni lni1, lnj lnj)
    {
        super(lni1, lnj);
        if (lni1.g() != 0)
        {
            throw new IllegalArgumentException("Wrapped field's minumum value must be zero");
        } else
        {
            return;
        }
    }

    public int a(long l)
    {
        int k = super.b.a(l);
        int j = k;
        if (k == 0)
        {
            j = h();
        }
        return j;
    }

    public long a(long l, int j)
    {
        return super.b.a(l, j);
    }

    public long a(long l, long l1)
    {
        return super.b.a(l, l1);
    }

    public long b(long l, int j)
    {
        int i1 = h();
        h.a(this, j, 1, i1);
        int k = j;
        if (j == i1)
        {
            k = 0;
        }
        return super.b.b(l, k);
    }

    public boolean b(long l)
    {
        return super.b.b(l);
    }

    public int c(long l)
    {
        return super.b.c(l) + 1;
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
        return 1;
    }

    public long g(long l)
    {
        return super.b.g(l);
    }

    public int h()
    {
        return super.b.h() + 1;
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
