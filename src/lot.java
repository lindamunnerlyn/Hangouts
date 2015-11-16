// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

final class lot extends lpq
{

    private final loj b;

    lot(loj loj1, lnr lnr)
    {
        super(lnj.l(), lnr);
        b = loj1;
    }

    public int a(long l)
    {
        return b.g(l);
    }

    protected int a(String s, Locale locale)
    {
        return lov.a(locale).c(s);
    }

    public int a(Locale locale)
    {
        return lov.a(locale).c();
    }

    public String a(int i, Locale locale)
    {
        return lov.a(locale).d(i);
    }

    public String b(int i, Locale locale)
    {
        return lov.a(locale).e(i);
    }

    public lnr e()
    {
        return ((log) (b)).d;
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
