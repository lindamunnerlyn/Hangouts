// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lgl extends ldd
{

    private static final int c;
    private static final long serialVersionUID = 0x4bf18272d9b4ccbdL;
    private final ldd d;
    private final lgm e[];

    private lgl(ldd ldd1)
    {
        super(ldd1.b);
        e = new lgm[c + 1];
        d = ldd1;
    }

    public static lgl a(ldd ldd1)
    {
        if (ldd1 instanceof lgl)
        {
            return (lgl)ldd1;
        } else
        {
            return new lgl(ldd1);
        }
    }

    private lgm g(long l)
    {
        lgm lgm1;
label0:
        {
            int i = (int)(l >> 32);
            lgm algm[] = e;
            int j = i & c;
            lgm lgm2 = algm[j];
            if (lgm2 != null)
            {
                lgm1 = lgm2;
                if ((int)(lgm2.a >> 32) == i)
                {
                    break label0;
                }
            }
            long l1 = l & 0xffffffff00000000L;
            lgm1 = new lgm(d, l1);
            lgm2 = lgm1;
            l = l1;
            do
            {
                long l2 = d.e(l);
                if (l2 == l || l2 > (l1 | 0xffffffffL))
                {
                    break;
                }
                lgm lgm3 = new lgm(d, l2);
                lgm2.c = lgm3;
                lgm2 = lgm3;
                l = l2;
            } while (true);
            algm[j] = lgm1;
        }
        return lgm1;
    }

    public String a(long l)
    {
        return g(l).a(l);
    }

    public int b(long l)
    {
        return g(l).b(l);
    }

    public boolean c()
    {
        return d.c();
    }

    public long e(long l)
    {
        return d.e(l);
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof lgl)
        {
            return d.equals(((lgl)obj).d);
        } else
        {
            return false;
        }
    }

    public long f(long l)
    {
        return d.f(l);
    }

    public int hashCode()
    {
        return d.hashCode();
    }

    static 
    {
        Object obj;
        int i;
        try
        {
            obj = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
        }
        if (obj == null)
        {
            i = 512;
        } else
        {
            i = ((Integer) (obj)).intValue() - 1;
            int j = 0;
            for (; i > 0; i >>= 1)
            {
                j++;
            }

            i = 1 << j;
        }
        c = i - 1;
    }
}
