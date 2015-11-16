// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bvf
    implements Comparable
{

    private static long c = 0L;
    public final long a;
    public final bux b;

    public bvf(bux bux1)
    {
        gbh.a();
        long l = c;
        c = 1L + l;
        a = l;
        b = bux1;
    }

    public int a(bvf bvf1)
    {
        int i = Integer.valueOf(b.a).compareTo(Integer.valueOf(bvf1.b.a));
        if (i != 0)
        {
            return i;
        } else
        {
            return Long.valueOf(a).compareTo(Long.valueOf(bvf1.a));
        }
    }

    public int compareTo(Object obj)
    {
        return a((bvf)obj);
    }

}
