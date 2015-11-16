// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lei extends lfb
{

    public final ldz a;

    lei(ldz ldz1)
    {
        super(lcz.s(), ldz1.R());
        a = ldz1;
    }

    public int a(long l)
    {
        return a.a(l);
    }

    public long a(long l, int j)
    {
        if (j == 0)
        {
            return l;
        }
        int k = a(l);
        int i1 = k + j;
        if ((k ^ i1) < 0 && (k ^ j) >= 0)
        {
            throw new ArithmeticException((new StringBuilder(61)).append("The calculation caused an overflow: ").append(k).append(" + ").append(j).toString());
        } else
        {
            return b(l, i1);
        }
    }

    public long a(long l, long l1)
    {
        return a(l, h.b(l1));
    }

    public long b(long l, int j)
    {
        h.a(this, j, a.O(), a.P());
        return a.f(l, j);
    }

    public boolean b(long l)
    {
        return a.e(a(l));
    }

    public long d(long l)
    {
        return a.d(a(l));
    }

    public long e(long l)
    {
        int j = a(l);
        long l1 = l;
        if (l != a.d(j))
        {
            l1 = a.d(j + 1);
        }
        return l1;
    }

    public ldh e()
    {
        return null;
    }

    public ldh f()
    {
        return ((ldw) (a)).c;
    }

    public int g()
    {
        return a.O();
    }

    public int h()
    {
        return a.P();
    }

    public long i(long l)
    {
        return l - d(l);
    }
}
