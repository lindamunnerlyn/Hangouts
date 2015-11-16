// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

final class lgg
    implements Comparable
{

    final lcy a;
    final int b;
    final String c;
    final Locale d;

    lgg(lcy lcy1, int i)
    {
        a = lcy1;
        b = i;
        c = null;
        d = null;
    }

    lgg(lcy lcy1, String s, Locale locale)
    {
        a = lcy1;
        b = 0;
        c = s;
        d = locale;
    }

    public int a(lgg lgg1)
    {
        lgg1 = lgg1.a;
        int i = lgf.a(a.e(), lgg1.e());
        if (i != 0)
        {
            return i;
        } else
        {
            return lgf.a(a.d(), lgg1.d());
        }
    }

    long a(long l, boolean flag)
    {
        long l1;
        if (c == null)
        {
            l = a.b(l, b);
        } else
        {
            l = a.a(l, c, d);
        }
        l1 = l;
        if (flag)
        {
            l1 = a.d(l);
        }
        return l1;
    }

    public int compareTo(Object obj)
    {
        return a((lgg)obj);
    }
}
