// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

final class lej extends lfg
{

    private final ldz b;

    lej(ldz ldz1, ldh ldh)
    {
        super(lcz.l(), ldh);
        b = ldz1;
    }

    public int a(long l)
    {
        return b.g(l);
    }

    protected int a(String s, Locale locale)
    {
        return lel.a(locale).c(s);
    }

    public int a(Locale locale)
    {
        return lel.a(locale).c();
    }

    public String a(int i, Locale locale)
    {
        return lel.a(locale).d(i);
    }

    public String b(int i, Locale locale)
    {
        return lel.a(locale).e(i);
    }

    public ldh e()
    {
        return ((ldw) (b)).d;
    }

    public int g()
    {
        return 1;
    }

    public int h()
    {
        return 7;
    }
}
