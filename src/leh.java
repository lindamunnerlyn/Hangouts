// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class leh extends lfb
{

    private final ldz a;

    leh(ldz ldz1)
    {
        super(lcz.p(), ldz1.R());
        a = ldz1;
    }

    public int a(long l)
    {
        return a.e(l);
    }

    public long a(long l, int j)
    {
        if (j == 0)
        {
            return l;
        } else
        {
            return b(l, a(l) + j);
        }
    }

    public long a(long l, long l1)
    {
        return a(l, h.b(l1));
    }

    public long b(long l, int j)
    {
        h.a(this, Math.abs(j), a.O(), a.P());
        int k = a(l);
        if (k == j)
        {
            return l;
        }
        int j1 = a.g(l);
        k = a.b(k);
        int i1 = a.b(j);
        if (i1 < k)
        {
            k = i1;
        }
        i1 = a.f(l);
        long l1;
        if (i1 <= k)
        {
            k = i1;
        }
        l1 = a.f(l, j);
        i1 = a(l1);
        if (i1 >= j) goto _L2; else goto _L1
_L1:
        l = l1 + 0x240c8400L;
_L4:
        l1 = k - a.f(l);
        return ((ldw) (a)).h.b(l1 * 0x240c8400L + l, j1);
_L2:
        l = l1;
        if (i1 > j)
        {
            l = l1 - 0x240c8400L;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean b(long l)
    {
        return a.b(a.e(l)) > 52;
    }

    public long d(long l)
    {
        long l1 = ((ldw) (a)).i.d(l);
        int j = a.f(l1);
        l = l1;
        if (j > 1)
        {
            l = l1 - (long)(j - 1) * 0x240c8400L;
        }
        return l;
    }

    public ldh e()
    {
        return null;
    }

    public ldh f()
    {
        return ((ldw) (a)).d;
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
