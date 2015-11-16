// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class lpq extends lpg
{

    final long a;
    private final lnr b;

    public lpq(lnj lnj, lnr lnr1)
    {
        super(lnj);
        if (!lnr1.c())
        {
            throw new IllegalArgumentException("Unit duration field must be precise");
        }
        a = lnr1.d();
        if (a < 1L)
        {
            throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        } else
        {
            b = lnr1;
            return;
        }
    }

    public long b(long l, int j)
    {
        h.a(this, j, g(), c(l, j));
        return (long)(j - a(l)) * a + l;
    }

    public int c(long l, int j)
    {
        return c(l);
    }

    public long d(long l)
    {
        if (l >= 0L)
        {
            return l - l % a;
        } else
        {
            l = 1L + l;
            return l - l % a - a;
        }
    }

    public lnr d()
    {
        return b;
    }

    public long e(long l)
    {
        if (l > 0L)
        {
            l--;
            return (l - l % a) + a;
        } else
        {
            return l - l % a;
        }
    }

    public int g()
    {
        return 0;
    }

    public long i(long l)
    {
        if (l >= 0L)
        {
            return l % a;
        } else
        {
            return ((l + 1L) % a + a) - 1L;
        }
    }
}
