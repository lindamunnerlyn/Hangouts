// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

final class lfx
    implements lge, lgi
{

    private final String a;

    lfx(String s)
    {
        a = s;
    }

    public int a()
    {
        return a.length();
    }

    public int a(lgf lgf, String s, int i)
    {
        if (s.regionMatches(true, i, a, 0, a.length()))
        {
            return a.length() + i;
        } else
        {
            return ~i;
        }
    }

    public void a(StringBuffer stringbuffer, long l, lcw lcw, int i, ldd ldd, Locale locale)
    {
        stringbuffer.append(a);
    }

    public int b()
    {
        return a.length();
    }
}
