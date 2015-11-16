// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lgm
{

    public final long a;
    public final ldd b;
    lgm c;
    private String d;
    private int e;
    private int f;

    lgm(ldd ldd1, long l)
    {
        e = 0x80000000;
        f = 0x80000000;
        a = l;
        b = ldd1;
    }

    public String a(long l)
    {
        if (c == null || l < c.a)
        {
            if (d == null)
            {
                d = b.a(a);
            }
            return d;
        } else
        {
            return c.a(l);
        }
    }

    public int b(long l)
    {
        if (c == null || l < c.a)
        {
            if (e == 0x80000000)
            {
                e = b.b(a);
            }
            return e;
        } else
        {
            return c.b(l);
        }
    }
}
