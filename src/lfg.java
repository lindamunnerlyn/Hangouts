// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class lfg extends lew
{

    final long a;
    private final ldh b;

    public lfg(lcz lcz, ldh ldh1)
    {
        super(lcz);
        if (!ldh1.c())
        {
            throw new IllegalArgumentException("Unit duration field must be precise");
        }
        a = ldh1.d();
        if (a < 1L)
        {
            throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        } else
        {
            b = ldh1;
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

    public ldh d()
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
