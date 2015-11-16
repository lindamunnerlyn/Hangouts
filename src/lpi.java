// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class lpi extends lpg
{

    public final lni b;

    public lpi(lni lni1, lnj lnj)
    {
        super(lnj);
        if (lni1 == null)
        {
            throw new IllegalArgumentException("The field must not be null");
        }
        if (!lni1.c())
        {
            throw new IllegalArgumentException("The field must be supported");
        } else
        {
            b = lni1;
            return;
        }
    }

    public int a(long l)
    {
        return b.a(l);
    }

    public long b(long l, int i)
    {
        return b.b(l, i);
    }

    public long d(long l)
    {
        return b.d(l);
    }

    public lnr d()
    {
        return b.d();
    }

    public lnr e()
    {
        return b.e();
    }

    public int g()
    {
        return b.g();
    }

    public int h()
    {
        return b.h();
    }
}
