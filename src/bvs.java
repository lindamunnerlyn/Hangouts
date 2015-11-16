// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bvs
    implements Comparable
{

    private static long c = 0L;
    public final long a;
    public final bvk b;

    public bvs(bvk bvk1)
    {
        gdv.a();
        long l = c;
        c = 1L + l;
        a = l;
        b = bvk1;
    }

    public int a(bvs bvs1)
    {
        int i = Integer.valueOf(b.a).compareTo(Integer.valueOf(bvs1.b.a));
        if (i != 0)
        {
            return i;
        } else
        {
            return Long.valueOf(a).compareTo(Long.valueOf(bvs1.a));
        }
    }

    public int compareTo(Object obj)
    {
        return a((bvs)obj);
    }

}
