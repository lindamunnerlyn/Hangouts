// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class arg
    implements Comparable
{

    private static long e;
    public final long a;
    public final long b;
    public final cey c;
    public final czn d;

    public arg(long l)
    {
        a = l;
        c = null;
        b = -1L;
        d = null;
    }

    public arg(czn czn1)
    {
        d = czn1;
        a = czn1.e;
        c = czn1.d;
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
        obj = (arg)obj;
        long l = a - ((arg) (obj)).a;
        if (l == 0L)
        {
            l = b - ((arg) (obj)).b;
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
