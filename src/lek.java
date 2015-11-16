// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

final class lek extends lew
{

    private final ldz a;

    lek(ldz ldz1)
    {
        super(lcz.w());
        a = ldz1;
    }

    public int a(long l)
    {
        return a.a(l) > 0 ? 1 : 0;
    }

    public int a(Locale locale)
    {
        return lel.a(locale).a();
    }

    public long a(long l, String s, Locale locale)
    {
        return b(l, lel.a(locale).a(s));
    }

    public String a(int i, Locale locale)
    {
        return lel.a(locale).a(i);
    }

    public long b(long l, int i)
    {
        h.a(this, i, 0, 1);
        long l1 = l;
        if (a(l) != i)
        {
            i = a.a(l);
            l1 = a.f(l, -i);
        }
        return l1;
    }

    public long d(long l)
    {
        if (a(l) == 1)
        {
            return a.f(0L, 1);
        } else
        {
            return 0x8000000000000000L;
        }
    }

    public ldh d()
    {
        return lfl.a(ldi.l());
    }

    public long e(long l)
    {
        if (a(l) == 0)
        {
            return a.f(0L, 1);
        } else
        {
            return 0x7fffffffffffffffL;
        }
    }

    public ldh e()
    {
        return null;
    }

    public long f(long l)
    {
        return d(l);
    }

    public int g()
    {
        return 0;
    }

    public long g(long l)
    {
        return d(l);
    }

    public int h()
    {
        return 1;
    }

    public long h(long l)
    {
        return d(l);
    }
}
