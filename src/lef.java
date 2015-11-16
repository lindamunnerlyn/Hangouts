// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


class lef extends lfb
{

    private final ldz a;
    private final int c;
    private final int d = 2;

    lef(ldz ldz1)
    {
        super(lcz.r(), ldz1.S());
        a = ldz1;
        c = a.Q();
    }

    public int a(long l)
    {
        return a.b(l);
    }

    public long a(long l, int j)
    {
        int k;
        int i2;
        int j2;
        long l2;
        if (j == 0)
        {
            return l;
        }
        l2 = a.h(l);
        i2 = a.a(l);
        j2 = a.a(l, i2);
        k = (j2 - 1) + j;
        if (k < 0) goto _L2; else goto _L1
_L1:
        j = k / c + i2;
        k = k % c + 1;
_L4:
        int i1 = a.a(l, i2, j2);
        int k1 = a.b(j, k);
        if (i1 > k1)
        {
            i1 = k1;
        }
        return a.a(j, k, i1) + l2;
_L2:
        int j1 = (k / c + i2) - 1;
        k = Math.abs(k) % c;
        j = k;
        if (k == 0)
        {
            j = c;
        }
        int l1 = (c - j) + 1;
        k = l1;
        j = j1;
        if (l1 == 1)
        {
            j = j1 + 1;
            k = l1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public long a(long l, long l1)
    {
        int k2;
        int l2;
        long l4;
        long l7;
        int j = (int)l1;
        if ((long)j == l1)
        {
            return a(l, j);
        }
        l7 = a.h(l);
        k2 = a.a(l);
        l2 = a.a(l, k2);
        l4 = (long)(l2 - 1) + l1;
        if (l4 < 0L) goto _L2; else goto _L1
_L1:
        long l3;
        l3 = (long)k2 + l4 / (long)c;
        l4 = l4 % (long)c + 1L;
_L4:
        a.O();
        if (l3 >= 0xffffffffee943c92L)
        {
            a.P();
            if (l3 <= 0x116bd2d1L)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        throw new IllegalArgumentException((new StringBuilder(58)).append("Magnitude of add amount is too large: ").append(l1).toString());
_L2:
        long l5 = ((long)k2 + l4 / (long)c) - 1L;
        int j1 = (int)(Math.abs(l4) % (long)c);
        int k = j1;
        if (j1 == 0)
        {
            k = c;
        }
        long l6 = (c - k) + 1;
        l4 = l6;
        l3 = l5;
        if (l6 == 1L)
        {
            l3 = l5 + 1L;
            l4 = l6;
        }
        if (true) goto _L4; else goto _L3
_L3:
        int i2 = (int)l3;
        int j2 = (int)l4;
        int i1 = a.a(l, k2, l2);
        int k1 = a.b(i2, j2);
        if (i1 > k1)
        {
            i1 = k1;
        }
        return a.a(i2, j2, i1) + l7;
    }

    public long b(long l, int j)
    {
        h.a(this, j, 1, c);
        int j1 = a.a(l);
        int k = a.b(l, j1);
        int i1 = a.b(j1, j);
        if (k > i1)
        {
            k = i1;
        }
        return a.a(j1, j, k) + (long)a.h(l);
    }

    public boolean b(long l)
    {
        boolean flag1 = false;
        int j = a.a(l);
        boolean flag = flag1;
        if (a.e(j))
        {
            flag = flag1;
            if (a.a(l, j) == d)
            {
                flag = true;
            }
        }
        return flag;
    }

    public long d(long l)
    {
        int j = a.a(l);
        int k = a.a(l, j);
        return a.a(j, k);
    }

    public ldh e()
    {
        return ((ldw) (a)).g;
    }

    public ldh f()
    {
        return ((ldw) (a)).c;
    }

    public int g()
    {
        return 1;
    }

    public int h()
    {
        return c;
    }

    public long i(long l)
    {
        return l - d(l);
    }
}
