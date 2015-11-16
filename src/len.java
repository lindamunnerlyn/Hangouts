// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class len extends ley
{

    private final ldz a;

    len(lcy lcy1, ldz ldz1)
    {
        super(lcy1, lcz.t());
        a = ldz1;
    }

    public int a(long l)
    {
        int k = super.b.a(l);
        int j = k;
        if (k <= 0)
        {
            j = 1 - k;
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
        h.a(this, j, 1, h());
        int k = j;
        if (a.a(l) <= 0)
        {
            k = 1 - j;
        }
        return super.b(l, k);
    }

    public long d(long l)
    {
        return super.b.d(l);
    }

    public long e(long l)
    {
        return super.b.e(l);
    }

    public int g()
    {
        return 1;
    }

    public int h()
    {
        return super.b.h();
    }

    public long i(long l)
    {
        return super.b.i(l);
    }
}
