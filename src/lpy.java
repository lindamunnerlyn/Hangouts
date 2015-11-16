// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public final class lpy
{

    private final lqs a;
    private final lqo b;
    private final Locale c;
    private final boolean d;
    private final lng e;
    private final lnn f;
    private final Integer g;
    private final int h;

    public lpy(lqs lqs1, lqo lqo1)
    {
        a = lqs1;
        b = lqo1;
        c = null;
        d = false;
        e = null;
        f = null;
        g = null;
        h = 2000;
    }

    private lpy(lqs lqs1, lqo lqo1, Locale locale, boolean flag, lng lng1, lnn lnn1, Integer integer, 
            int i)
    {
        a = lqs1;
        b = lqo1;
        c = locale;
        d = flag;
        e = lng1;
        f = lnn1;
        g = integer;
        h = i;
    }

    private lng b(lng lng1)
    {
        lng1 = lnl.a(lng1);
        if (e != null)
        {
            lng1 = e;
        }
        lng lng2 = lng1;
        if (f != null)
        {
            lng2 = lng1.a(f);
        }
        return lng2;
    }

    private lqs d()
    {
        lqs lqs1 = a;
        if (lqs1 == null)
        {
            throw new UnsupportedOperationException("Printing not supported");
        } else
        {
            return lqs1;
        }
    }

    public long a(String s)
    {
        lqo lqo1 = b;
        if (lqo1 == null)
        {
            throw new UnsupportedOperationException("Parsing not supported");
        }
        lqp lqp1 = new lqp(b(e), c, g, h);
        int j = lqo1.a(lqp1, s, 0);
        int i;
        if (j >= 0)
        {
            i = j;
            if (j >= s.length())
            {
                return lqp1.a(true, s);
            }
        } else
        {
            i = ~j;
        }
        throw new IllegalArgumentException(lqt.b(s, i));
    }

    public String a(loa loa)
    {
        StringBuffer stringbuffer = new StringBuffer(d().a());
        long l = lnl.a(loa);
        loa = lnl.b(loa);
        lqs lqs1 = d();
        lng lng1 = b(loa);
        loa = lng1.a();
        int i = loa.b(l);
        long l1 = (long)i + l;
        if ((l ^ l1) < 0L && ((long)i ^ l) >= 0L)
        {
            loa = lnn.a;
            i = 0;
        } else
        {
            l = l1;
        }
        lqs1.a(stringbuffer, l, lng1.b(), i, loa, c);
        return stringbuffer.toString();
    }

    public lpy a(lng lng1)
    {
        if (e == lng1)
        {
            return this;
        } else
        {
            return new lpy(a, b, c, d, lng1, f, g, h);
        }
    }

    public lqs a()
    {
        return a;
    }

    public lqo b()
    {
        return b;
    }

    public lpy c()
    {
        lnn lnn1 = lnn.a;
        if (f == lnn1)
        {
            return this;
        } else
        {
            return new lpy(a, b, c, false, e, lnn1, g, h);
        }
    }
}
