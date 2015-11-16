// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lpe extends lph
{

    private static final long serialVersionUID = 0xf943b502d87d9ea2L;
    final lnr a;
    final boolean b;
    final lnn c;

    lpe(lnr lnr1, lnn lnn1)
    {
        super(lnr1.a());
        if (!lnr1.b())
        {
            throw new IllegalArgumentException();
        } else
        {
            a = lnr1;
            b = lpc.a(lnr1);
            c = lnn1;
            return;
        }
    }

    private int a(long l)
    {
        int i = c.b(l);
        if (((long)i + l ^ l) < 0L && ((long)i ^ l) >= 0L)
        {
            throw new ArithmeticException("Adding time zone offset caused overflow");
        } else
        {
            return i;
        }
    }

    private int b(long l)
    {
        int i = c.c(l);
        if ((l - (long)i ^ l) < 0L && ((long)i ^ l) < 0L)
        {
            throw new ArithmeticException("Subtracting time zone offset caused overflow");
        } else
        {
            return i;
        }
    }

    public long a(long l, int i)
    {
        int j = a(l);
        l = a.a((long)j + l, i);
        if (b)
        {
            i = j;
        } else
        {
            i = b(l);
        }
        return l - (long)i;
    }

    public long a(long l, long l1)
    {
        int i = a(l);
        l = a.a((long)i + l, l1);
        if (!b)
        {
            i = b(l);
        }
        return l - (long)i;
    }

    public boolean c()
    {
        if (b)
        {
            return a.c();
        }
        return a.c() && c.c();
    }

    public long d()
    {
        return a.d();
    }
}
