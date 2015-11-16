// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lqv extends lnn
{

    private static final int c;
    private static final long serialVersionUID = 0x4bf18272d9b4ccbdL;
    private final lnn d;
    private final lqw e[];

    private lqv(lnn lnn1)
    {
        super(lnn1.b);
        e = new lqw[c + 1];
        d = lnn1;
    }

    public static lqv a(lnn lnn1)
    {
        if (lnn1 instanceof lqv)
        {
            return (lqv)lnn1;
        } else
        {
            return new lqv(lnn1);
        }
    }

    private lqw g(long l)
    {
        lqw lqw1;
label0:
        {
            int i = (int)(l >> 32);
            lqw alqw[] = e;
            int j = i & c;
            lqw lqw2 = alqw[j];
            if (lqw2 != null)
            {
                lqw1 = lqw2;
                if ((int)(lqw2.a >> 32) == i)
                {
                    break label0;
                }
            }
            long l1 = l & 0xffffffff00000000L;
            lqw1 = new lqw(d, l1);
            lqw2 = lqw1;
            l = l1;
            do
            {
                long l2 = d.e(l);
                if (l2 == l || l2 > (l1 | 0xffffffffL))
                {
                    break;
                }
                lqw lqw3 = new lqw(d, l2);
                lqw2.c = lqw3;
                lqw2 = lqw3;
                l = l2;
            } while (true);
            alqw[j] = lqw1;
        }
        return lqw1;
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
        if (obj instanceof lqv)
        {
            return d.equals(((lqv)obj).d);
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
