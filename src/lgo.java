// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lgo
{

    final char a;
    final int b;
    final int c;
    final int d;
    final boolean e;
    final int f;

    lgo(char c1, int i, int j, int k, boolean flag, int l)
    {
        if (c1 != 'u' && c1 != 'w' && c1 != 's')
        {
            throw new IllegalArgumentException((new StringBuilder(15)).append("Unknown mode: ").append(c1).toString());
        } else
        {
            a = c1;
            b = i;
            c = j;
            d = k;
            e = flag;
            f = l;
            return;
        }
    }

    private long a(lcw lcw1, long l)
    {
        long l1;
        try
        {
            l1 = c(lcw1, l);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            if (b == 2 && c == 29)
            {
                for (; !lcw1.E().b(l); l = lcw1.E().a(l, 1)) { }
                return c(lcw1, l);
            } else
            {
                throw illegalargumentexception;
            }
        }
        return l1;
    }

    private long b(lcw lcw1, long l)
    {
        long l1;
        try
        {
            l1 = c(lcw1, l);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            if (b == 2 && c == 29)
            {
                for (; !lcw1.E().b(l); l = lcw1.E().a(l, -1)) { }
                return c(lcw1, l);
            } else
            {
                throw illegalargumentexception;
            }
        }
        return l1;
    }

    private long c(lcw lcw1, long l)
    {
        if (c >= 0)
        {
            return lcw1.u().b(l, c);
        } else
        {
            l = lcw1.u().b(l, 1);
            l = lcw1.C().a(l, 1);
            return lcw1.u().a(l, c);
        }
    }

    private long d(lcw lcw1, long l)
    {
        int k;
        long l1;
        int i = lcw1.t().a(l);
        k = d - i;
        l1 = l;
        if (k == 0) goto _L2; else goto _L1
_L1:
        if (!e) goto _L4; else goto _L3
_L3:
        int j;
        j = k;
        if (k < 0)
        {
            j = k + 7;
        }
_L6:
        l1 = lcw1.t().a(l, j);
_L2:
        return l1;
_L4:
        j = k;
        if (k > 0)
        {
            j = k - 7;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public long a(long l, int i, int j)
    {
        lep lep1;
        long l1;
        long l2;
        if (a == 'w')
        {
            i += j;
        } else
        if (a != 's')
        {
            i = 0;
        }
        l2 = (long)i + l;
        lep1 = lep.L();
        l = lep1.C().b(l2, b);
        l = lep1.e().b(l, 0);
        l1 = a(((lcw) (lep1)), lep1.e().a(l, f));
        if (d == 0)
        {
            l = l1;
            if (l1 <= l2)
            {
                l = a(((lcw) (lep1)), lep1.E().a(l1, 1));
            }
        } else
        {
            l1 = d(lep1, l1);
            l = l1;
            if (l1 <= l2)
            {
                l = lep1.E().a(l1, 1);
                l = d(lep1, a(((lcw) (lep1)), lep1.C().b(l, b)));
            }
        }
        return l - (long)i;
    }

    public long b(long l, int i, int j)
    {
        lep lep1;
        long l1;
        long l2;
        if (a == 'w')
        {
            i += j;
        } else
        if (a != 's')
        {
            i = 0;
        }
        l2 = (long)i + l;
        lep1 = lep.L();
        l = lep1.C().b(l2, b);
        l = lep1.e().b(l, 0);
        l1 = b(((lcw) (lep1)), lep1.e().a(l, f));
        if (d == 0)
        {
            l = l1;
            if (l1 >= l2)
            {
                l = b(((lcw) (lep1)), lep1.E().a(l1, -1));
            }
        } else
        {
            l1 = d(lep1, l1);
            l = l1;
            if (l1 >= l2)
            {
                l = lep1.E().a(l1, -1);
                l = d(lep1, b(((lcw) (lep1)), lep1.C().b(l, b)));
            }
        }
        return l - (long)i;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof lgo)
            {
                if (a != ((lgo) (obj = (lgo)obj)).a || b != ((lgo) (obj)).b || c != ((lgo) (obj)).c || d != ((lgo) (obj)).d || e != ((lgo) (obj)).e || f != ((lgo) (obj)).f)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }
}
