// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lfa extends ley
{

    final int a = 100;
    final ldh c;
    private final int d;
    private final int e;

    public lfa(lcy lcy1, lcz lcz1)
    {
        super(lcy1, lcz1);
        ldh ldh = lcy1.d();
        int j;
        int k;
        if (ldh == null)
        {
            c = null;
        } else
        {
            c = new lfj(ldh, lcz1.y(), 100);
        }
        j = lcy1.g();
        if (j >= 0)
        {
            j /= 100;
        } else
        {
            j = (j + 1) / 100 - 1;
        }
        k = lcy1.h();
        if (k >= 0)
        {
            k /= 100;
        } else
        {
            k = (k + 1) / 100 - 1;
        }
        d = j;
        e = k;
    }

    public int a(long l)
    {
        int j = super.b.a(l);
        if (j >= 0)
        {
            return j / a;
        } else
        {
            return (j + 1) / a - 1;
        }
    }

    public long a(long l, int j)
    {
        return super.b.a(l, a * j);
    }

    public long a(long l, long l1)
    {
        return super.b.a(l, (long)a * l1);
    }

    public long b(long l, int j)
    {
        h.a(this, j, d, e);
        int k = super.b.a(l);
        if (k >= 0)
        {
            k %= a;
        } else
        {
            int i1 = a;
            k = (k + 1) % a + (i1 - 1);
        }
        return super.b.b(l, k + a * j);
    }

    public long d(long l)
    {
        lcy lcy1 = super.b;
        return lcy1.d(lcy1.b(l, a(l) * a));
    }

    public ldh d()
    {
        return c;
    }

    public int g()
    {
        return d;
    }

    public int h()
    {
        return e;
    }

    public long i(long l)
    {
        return b(l, a(super.b.i(l)));
    }
}
