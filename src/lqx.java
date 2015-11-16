// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lqx extends lnn
{

    private static final long serialVersionUID = 0x605522c6413e57d1L;
    final int c;
    final lra d;
    final lra e;

    lqx(String s, int i, lra lra1, lra lra2)
    {
        super(s);
        c = i;
        d = lra1;
        e = lra2;
    }

    private lra g(long l)
    {
        lra lra2;
        int i = c;
        lra lra1 = d;
        lra2 = e;
        long l1;
        long l2;
        try
        {
            l1 = lra1.a(l, i, lra2.b());
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            l1 = l;
        }
        catch (ArithmeticException arithmeticexception)
        {
            l1 = l;
        }
        l2 = lra2.a(l, i, lra1.b());
        l = l2;
_L2:
        if (l1 > l)
        {
            return lra1;
        } else
        {
            return lra2;
        }
        Object obj;
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public String a(long l)
    {
        return g(l).a();
    }

    public int b(long l)
    {
        return c + g(l).b();
    }

    public boolean c()
    {
        return false;
    }

    public long e(long l)
    {
        lra lra1;
        lra lra2;
        int i;
        i = c;
        lra1 = d;
        lra2 = e;
        long l2 = lra1.a(l, i, lra2.b());
        long l1;
        l1 = l2;
        if (l > 0L)
        {
            l1 = l2;
            if (l2 < 0L)
            {
                l1 = l;
            }
        }
_L1:
label0:
        {
            Object obj;
            long l3;
            try
            {
                l3 = lra2.a(l, i, lra1.b());
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                break label0;
            }
            catch (ArithmeticException arithmeticexception)
            {
                break label0;
            }
            if (l <= 0L || l3 >= 0L)
            {
                l = l3;
            }
        }
        if (l1 > l)
        {
            return l;
        } else
        {
            return l1;
        }
        obj;
        l1 = l;
          goto _L1
        obj;
        l1 = l;
          goto _L1
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof lqx)
            {
                if (!super.b.equals(((lnn) (obj = (lqx)obj)).b) || c != ((lqx) (obj)).c || !d.equals(((lqx) (obj)).d) || !e.equals(((lqx) (obj)).e))
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

    public long f(long l)
    {
        lra lra1;
        lra lra2;
        int i;
        l++;
        i = c;
        lra1 = d;
        lra2 = e;
        long l2 = lra1.b(l, i, lra2.b());
        long l1;
        l1 = l2;
        if (l < 0L)
        {
            l1 = l2;
            if (l2 > 0L)
            {
                l1 = l;
            }
        }
_L1:
label0:
        {
            Object obj;
            long l3;
            try
            {
                l3 = lra2.b(l, i, lra1.b());
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                break label0;
            }
            catch (ArithmeticException arithmeticexception)
            {
                break label0;
            }
            if (l >= 0L || l3 <= 0L)
            {
                l = l3;
            }
        }
        l3 = l;
        if (l1 > l)
        {
            l3 = l1;
        }
        return l3 - 1L;
        obj;
        l1 = l;
          goto _L1
        obj;
        l1 = l;
          goto _L1
    }
}
