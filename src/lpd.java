// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

final class lpd extends lpg
{

    final lni a;
    final lnn b;
    final lnr c;
    final boolean d;
    final lnr e;
    final lnr f;

    lpd(lni lni1, lnn lnn1, lnr lnr, lnr lnr1, lnr lnr2)
    {
        super(lni1.a());
        if (!lni1.c())
        {
            throw new IllegalArgumentException();
        } else
        {
            a = lni1;
            b = lnn1;
            c = lnr;
            d = lpc.a(lnr);
            e = lnr1;
            f = lnr2;
            return;
        }
    }

    private int j(long l)
    {
        int k = b.b(l);
        if (((long)k + l ^ l) < 0L && ((long)k ^ l) >= 0L)
        {
            throw new ArithmeticException("Adding time zone offset caused overflow");
        } else
        {
            return k;
        }
    }

    public int a(long l)
    {
        l = b.d(l);
        return a.a(l);
    }

    public int a(Locale locale)
    {
        return a.a(locale);
    }

    public long a(long l, int k)
    {
        if (d)
        {
            int i1 = j(l);
            return a.a((long)i1 + l, k) - (long)i1;
        } else
        {
            long l1 = b.d(l);
            l1 = a.a(l1, k);
            return b.a(l1, l);
        }
    }

    public long a(long l, long l1)
    {
        if (d)
        {
            int k = j(l);
            return a.a((long)k + l, l1) - (long)k;
        } else
        {
            long l2 = b.d(l);
            l1 = a.a(l2, l1);
            return b.a(l1, l);
        }
    }

    public long a(long l, String s, Locale locale)
    {
        long l1 = b.d(l);
        l1 = a.a(l1, s, locale);
        return b.a(l1, l);
    }

    public String a(int k, Locale locale)
    {
        return a.a(k, locale);
    }

    public String a(long l, Locale locale)
    {
        l = b.d(l);
        return a.a(l, locale);
    }

    public long b(long l, int k)
    {
        long l1 = b.d(l);
        l1 = a.b(l1, k);
        l = b.a(l1, l);
        if (a(l) != k)
        {
            lnv lnv1 = new lnv(l1, b.b);
            lnu lnu1 = new lnu(a.a(), Integer.valueOf(k), lnv1.getMessage());
            lnu1.initCause(lnv1);
            throw lnu1;
        } else
        {
            return l;
        }
    }

    public String b(int k, Locale locale)
    {
        return a.b(k, locale);
    }

    public String b(long l, Locale locale)
    {
        l = b.d(l);
        return a.b(l, locale);
    }

    public boolean b(long l)
    {
        l = b.d(l);
        return a.b(l);
    }

    public int c(long l)
    {
        l = b.d(l);
        return a.c(l);
    }

    public long d(long l)
    {
        if (d)
        {
            int k = j(l);
            return a.d((long)k + l) - (long)k;
        } else
        {
            long l1 = b.d(l);
            l1 = a.d(l1);
            return b.a(l1, l);
        }
    }

    public final lnr d()
    {
        return c;
    }

    public long e(long l)
    {
        if (d)
        {
            int k = j(l);
            return a.e((long)k + l) - (long)k;
        } else
        {
            long l1 = b.d(l);
            l1 = a.e(l1);
            return b.a(l1, l);
        }
    }

    public final lnr e()
    {
        return e;
    }

    public final lnr f()
    {
        return f;
    }

    public int g()
    {
        return a.g();
    }

    public int h()
    {
        return a.h();
    }

    public long i(long l)
    {
        l = b.d(l);
        return a.i(l);
    }
}
