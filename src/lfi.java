// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lfi extends ley
{

    final int a;
    final ldh c;

    public lfi(lcy lcy1, lcz lcz1)
    {
        super(lcy1, lcz1);
        lcy1 = lcy1.d();
        if (lcy1 == null)
        {
            c = null;
        } else
        {
            c = new lfj(lcy1, lcz1.z(), 100);
        }
        a = 100;
    }

    public lfi(lfa lfa1)
    {
        this(lfa1, ((lew) (lfa1)).g);
    }

    public lfi(lfa lfa1, lcz lcz1)
    {
        super(((ley) (lfa1)).b, lcz1);
        a = lfa1.a;
        c = lfa1.c;
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

    public ldh e()
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
