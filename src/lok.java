// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

final class lok extends lpp
{

    lok()
    {
        super(lnj.k(), loj.T(), loj.U());
    }

    public int a(Locale locale)
    {
        return lov.a(locale).d();
    }

    public long a(long l, String s, Locale locale)
    {
        return b(l, lov.a(locale).d(s));
    }

    public String a(int i, Locale locale)
    {
        return lov.a(locale).f(i);
    }
}
