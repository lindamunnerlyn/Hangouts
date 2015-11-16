// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

final class lqq
    implements Comparable
{

    final lni a;
    final int b;
    final String c;
    final Locale d;

    lqq(lni lni1, int i)
    {
        a = lni1;
        b = i;
        c = null;
        d = null;
    }

    lqq(lni lni1, String s, Locale locale)
    {
        a = lni1;
        b = 0;
        c = s;
        d = locale;
    }

    public int a(lqq lqq1)
    {
        lqq1 = lqq1.a;
        int i = lqp.a(a.e(), lqq1.e());
        if (i != 0)
        {
            return i;
        } else
        {
            return lqp.a(a.d(), lqq1.d());
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
        return a((lqq)obj);
    }
}
