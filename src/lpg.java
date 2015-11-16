// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public abstract class lpg extends lni
{

    final lnj g;

    public lpg(lnj lnj1)
    {
        if (lnj1 == null)
        {
            throw new IllegalArgumentException("The type must not be null");
        } else
        {
            g = lnj1;
            return;
        }
    }

    public abstract int a(long l);

    public int a(String s, Locale locale)
    {
        int j;
        try
        {
            j = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (Locale locale)
        {
            throw new lnu(g, s);
        }
        return j;
    }

    public int a(Locale locale)
    {
        int j = h();
        if (j >= 0)
        {
            if (j < 10)
            {
                return 1;
            }
            if (j < 100)
            {
                return 2;
            }
            if (j < 1000)
            {
                return 3;
            }
        }
        return Integer.toString(j).length();
    }

    public long a(long l, int j)
    {
        return d().a(l, j);
    }

    public long a(long l, long l1)
    {
        return d().a(l, l1);
    }

    public long a(long l, String s, Locale locale)
    {
        return b(l, a(s, locale));
    }

    public String a(int j, Locale locale)
    {
        return Integer.toString(j);
    }

    public String a(long l, Locale locale)
    {
        return a(a(l), locale);
    }

    public final lnj a()
    {
        return g;
    }

    public abstract long b(long l, int j);

    public final String b()
    {
        return g.x();
    }

    public String b(int j, Locale locale)
    {
        return a(j, locale);
    }

    public String b(long l, Locale locale)
    {
        return b(a(l), locale);
    }

    public boolean b(long l)
    {
        return false;
    }

    public int c(long l)
    {
        return h();
    }

    public final boolean c()
    {
        return true;
    }

    public abstract long d(long l);

    public abstract lnr d();

    public long e(long l)
    {
        long l2 = d(l);
        long l1 = l;
        if (l2 != l)
        {
            l1 = a(l2, 1);
        }
        return l1;
    }

    public long f(long l)
    {
        long l1 = d(l);
        long l2 = e(l);
        if (l - l1 <= l2 - l)
        {
            return l1;
        } else
        {
            return l2;
        }
    }

    public lnr f()
    {
        return null;
    }

    public long g(long l)
    {
        long l1 = d(l);
        long l2 = e(l);
        if (l2 - l <= l - l1)
        {
            return l2;
        } else
        {
            return l1;
        }
    }

    public abstract int h();

    public long h(long l)
    {
        long l1 = d(l);
        long l2 = e(l);
        long l3 = l - l1;
        l = l2 - l;
        if (l3 >= l)
        {
            if (l < l3)
            {
                return l2;
            }
            if ((a(l2) & 1) == 0)
            {
                return l2;
            }
        }
        return l1;
    }

    public long i(long l)
    {
        return l - d(l);
    }

    public String toString()
    {
        String s = String.valueOf(g.x());
        return (new StringBuilder(String.valueOf(s).length() + 15)).append("DateTimeField[").append(s).append("]").toString();
    }
}
