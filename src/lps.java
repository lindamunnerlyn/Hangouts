// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lps extends lpi
{

    final int a;
    final lnr c;

    public lps(lni lni1, lnj lnj1)
    {
        super(lni1, lnj1);
        lni1 = lni1.d();
        if (lni1 == null)
        {
            c = null;
        } else
        {
            c = new lpt(lni1, lnj1.z(), 100);
        }
        a = 100;
    }

    public lps(lpk lpk1)
    {
        this(lpk1, ((lpg) (lpk1)).g);
    }

    public lps(lpk lpk1, lnj lnj1)
    {
        super(((lpi) (lpk1)).b, lnj1);
        a = lpk1.a;
        c = lpk1.c;
    }

    public int a(long l)
    {
        int j = super.b.a(l);
        if (j >= 0)
        {
            return j % a;
        } else
        {
            int k = a;
            return (j + 1) % a + (k - 1);
        }
    }

    public long b(long l, int j)
    {
        h.a(this, j, 0, a - 1);
        int k = super.b.a(l);
        if (k >= 0)
        {
            k /= a;
        } else
        {
            k = (k + 1) / a - 1;
        }
        return super.b.b(l, k * a + j);
    }

    public long d(long l)
    {
        return super.b.d(l);
    }

    public long e(long l)
    {
        return super.b.e(l);
    }

    public lnr e()
    {
        return c;
    }

    public long f(long l)
    {
        return super.b.f(l);
    }

    public int g()
    {
        return 0;
    }

    public long g(long l)
    {
        return super.b.g(l);
    }

    public int h()
    {
        return a - 1;
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
