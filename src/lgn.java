// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lgn extends ldd
{

    private static final long serialVersionUID = 0x605522c6413e57d1L;
    final int c;
    final lgq d;
    final lgq e;

    lgn(String s, int i, lgq lgq1, lgq lgq2)
    {
        super(s);
        c = i;
        d = lgq1;
        e = lgq2;
    }

    private lgq g(long l)
    {
        lgq lgq2;
        int i = c;
        lgq lgq1 = d;
        lgq2 = e;
        long l1;
        long l2;
        try
        {
            l1 = lgq1.a(l, i, lgq2.b());
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            l1 = l;
        }
        catch (ArithmeticException arithmeticexception)
        {
            l1 = l;
        }
        l2 = lgq2.a(l, i, lgq1.b());
        l = l2;
_L2:
        if (l1 > l)
        {
            return lgq1;
        } else
        {
            return lgq2;
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
        lgq lgq1;
        lgq lgq2;
        int i;
        i = c;
        lgq1 = d;
        lgq2 = e;
        long l2 = lgq1.a(l, i, lgq2.b());
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
                l3 = lgq2.a(l, i, lgq1.b());
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
            if (obj instanceof lgn)
            {
                if (!super.b.equals(((ldd) (obj = (lgn)obj)).b) || c != ((lgn) (obj)).c || !d.equals(((lgn) (obj)).d) || !e.equals(((lgn) (obj)).e))
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
        lgq lgq1;
        lgq lgq2;
        int i;
        l++;
        i = c;
        lgq1 = d;
        lgq2 = e;
        long l2 = lgq1.b(l, i, lgq2.b());
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
                l3 = lgq2.b(l, i, lgq1.b());
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
