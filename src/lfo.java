// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public final class lfo
{

    private final lgi a;
    private final lge b;
    private final Locale c;
    private final boolean d;
    private final lcw e;
    private final ldd f;
    private final Integer g;
    private final int h;

    public lfo(lgi lgi1, lge lge1)
    {
        a = lgi1;
        b = lge1;
        c = null;
        d = false;
        e = null;
        f = null;
        g = null;
        h = 2000;
    }

    private lfo(lgi lgi1, lge lge1, Locale locale, boolean flag, lcw lcw1, ldd ldd1, Integer integer, 
            int i)
    {
        a = lgi1;
        b = lge1;
        c = locale;
        d = flag;
        e = lcw1;
        f = ldd1;
        g = integer;
        h = i;
    }

    private lcw b(lcw lcw1)
    {
        lcw1 = ldb.a(lcw1);
        if (e != null)
        {
            lcw1 = e;
        }
        lcw lcw2 = lcw1;
        if (f != null)
        {
            lcw2 = lcw1.a(f);
        }
        return lcw2;
    }

    private lgi d()
    {
        lgi lgi1 = a;
        if (lgi1 == null)
        {
            throw new UnsupportedOperationException("Printing not supported");
        } else
        {
            return lgi1;
        }
    }

    public long a(String s)
    {
        lge lge1 = b;
        if (lge1 == null)
        {
            throw new UnsupportedOperationException("Parsing not supported");
        }
        lgf lgf1 = new lgf(b(e), c, g, h);
        int j = lge1.a(lgf1, s, 0);
        int i;
        if (j >= 0)
        {
            i = j;
            if (j >= s.length())
            {
                return lgf1.a(true, s);
            }
        } else
        {
            i = ~j;
        }
        throw new IllegalArgumentException(lgj.b(s, i));
    }

    public String a(ldq ldq)
    {
        StringBuffer stringbuffer = new StringBuffer(d().a());
        long l = ldb.a(ldq);
        ldq = ldb.b(ldq);
        lgi lgi1 = d();
        lcw lcw1 = b(ldq);
        ldq = lcw1.a();
        int i = ldq.b(l);
        long l1 = (long)i + l;
        if ((l ^ l1) < 0L && ((long)i ^ l) >= 0L)
        {
            ldq = ldd.a;
            i = 0;
        } else
        {
            l = l1;
        }
        lgi1.a(stringbuffer, l, lcw1.b(), i, ldq, c);
        return stringbuffer.toString();
    }

    public lfo a(lcw lcw1)
    {
        if (e == lcw1)
        {
            return this;
        } else
        {
            return new lfo(a, b, c, d, lcw1, f, g, h);
        }
    }

    public lgi a()
    {
        return a;
    }

    public lge b()
    {
        return b;
    }

    public lfo c()
    {
        ldd ldd1 = ldd.a;
        if (f == ldd1)
        {
            return this;
        } else
        {
            return new lfo(a, b, c, false, e, ldd1, g, h);
        }
    }
}
