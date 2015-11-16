// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class lpp extends lpq
{

    private final int b;
    private final lnr c;

    public lpp(lnj lnj, lnr lnr1, lnr lnr2)
    {
        super(lnj, lnr1);
        if (!lnr2.c())
        {
            throw new IllegalArgumentException("Range duration field must be precise");
        }
        b = (int)(lnr2.d() / super.a);
        if (b < 2)
        {
            throw new IllegalArgumentException("The effective range must be at least 2");
        } else
        {
            c = lnr2;
            return;
        }
    }

    public int a(long l)
    {
        if (l >= 0L)
        {
            return (int)((l / super.a) % (long)b);
        } else
        {
            return (b - 1) + (int)(((1L + l) / super.a) % (long)b);
        }
    }

    public long b(long l, int i)
    {
        h.a(this, i, g(), h());
        return (long)(i - a(l)) * a + l;
    }

    public lnr e()
    {
        return c;
    }

    public int h()
    {
        return b - 1;
    }
}
