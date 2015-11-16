// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class arx
    implements Comparable
{

    private static long e;
    public final long a;
    public final long b;
    public final cgd c;
    public final dnt d;

    public arx(long l)
    {
        a = l;
        c = null;
        b = -1L;
        d = null;
    }

    public arx(dnt dnt1)
    {
        d = dnt1;
        a = dnt1.e;
        c = dnt1.d;
        long l1 = System.currentTimeMillis() * 100L;
        long l = l1;
        if (l1 <= e)
        {
            l = e + 1L;
        }
        e = l;
        b = l;
    }

    public int compareTo(Object obj)
    {
        obj = (arx)obj;
        long l = a - ((arx) (obj)).a;
        if (l == 0L)
        {
            l = b - ((arx) (obj)).b;
            if (l == 0L)
            {
                return 0;
            } else
            {
                return (int)(l / Math.abs(l));
            }
        } else
        {
            return (int)(l / Math.abs(l));
        }
    }
}
