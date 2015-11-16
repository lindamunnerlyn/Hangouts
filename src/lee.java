// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


abstract class lee extends ldz
{

    private static final int k[] = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 
        30, 31
    };
    private static final int l[] = {
        31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 
        30, 31
    };
    private static final long m[];
    private static final long n[];
    private static final long serialVersionUID = 0x7d53cd7eccL;

    lee(lcw lcw, Object obj, int i)
    {
        super(lcw, null, i);
    }

    int a(long l1, int i)
    {
        int j = (int)(l1 - d(i) >> 10);
        if (!e(i)) goto _L2; else goto _L1
_L1:
        if (j >= 0xea515a) goto _L4; else goto _L3
_L3:
        if (j >= 0x7528ad) goto _L6; else goto _L5
_L5:
        if (j >= 0x27e949) goto _L8; else goto _L7
_L7:
        return 1;
_L8:
        return j >= 0x4d3f64 ? 3 : 2;
_L6:
        if (j < 0x9bc85f)
        {
            return 4;
        }
        return j >= 0xc3b1a8 ? 6 : 5;
_L4:
        if (j < 0x160c39e)
        {
            if (j < 0x1123aa3)
            {
                return 7;
            }
            return j >= 0x13a23ec ? 9 : 8;
        }
        if (j < 0x188ace7)
        {
            return 10;
        }
        return j >= 0x1af4c99 ? 12 : 11;
_L2:
        if (j < 0xe907c3)
        {
            if (j < 0x73df16)
            {
                if (j >= 0x27e949)
                {
                    return j >= 0x4bf5cd ? 3 : 2;
                }
            } else
            {
                if (j < 0x9a7ec8)
                {
                    return 4;
                }
                return j >= 0xc26811 ? 6 : 5;
            }
        } else
        {
            if (j < 0x15f7a07)
            {
                if (j < 0x110f10c)
                {
                    return 7;
                }
                return j >= 0x138da55 ? 9 : 8;
            }
            if (j < 0x1876350)
            {
                return 10;
            }
            return j >= 0x1ae0302 ? 12 : 11;
        }
        if (true) goto _L7; else goto _L9
_L9:
    }

    int b(int i, int j)
    {
        if (e(i))
        {
            return l[j - 1];
        } else
        {
            return k[j - 1];
        }
    }

    long c(int i, int j)
    {
        if (e(i))
        {
            return n[j - 1];
        } else
        {
            return m[j - 1];
        }
    }

    int e(long l1, int i)
    {
        int j = 28;
        if (i > 28 || i <= 0)
        {
            j = i(l1);
        }
        return j;
    }

    long f(long l1, int i)
    {
        int j;
        int i1;
        int j1;
        int k1;
        k1 = a(l1);
        i1 = c(l1, k1);
        j1 = h(l1);
        j = i1;
        if (i1 <= 59) goto _L2; else goto _L1
_L1:
        if (!e(k1)) goto _L4; else goto _L3
_L3:
        j = i1;
        if (!e(i))
        {
            j = i1 - 1;
        }
_L2:
        return a(i, 1, j) + (long)j1;
_L4:
        j = i1;
        if (e(i))
        {
            j = i1 + 1;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    static 
    {
        long l1 = 0L;
        m = new long[12];
        n = new long[12];
        int i = 0;
        long l2 = 0L;
        for (; i < 11; i++)
        {
            l2 += (long)k[i] * 0x5265c00L;
            m[i + 1] = l2;
            l1 += (long)l[i] * 0x5265c00L;
            n[i + 1] = l1;
        }

    }
}
