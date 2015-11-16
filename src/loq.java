// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class loq extends lpq
{

    private final loj b;

    loq(loj loj1, lnr lnr)
    {
        super(lnj.o(), lnr);
        b = loj1;
    }

    public int a(long l)
    {
        return b.f(l);
    }

    public int c(long l)
    {
        int j = b.e(l);
        return b.b(j);
    }

    protected int c(long l, int j)
    {
        int k = 52;
        if (j > 52)
        {
            k = c(l);
        }
        return k;
    }

    public long d(long l)
    {
        return super.d(l + 0xf731400L) - 0xf731400L;
    }

    public long e(long l)
    {
        return super.e(l + 0xf731400L) - 0xf731400L;
    }

    public lnr e()
    {
        return ((log) (b)).e;
    }

    public int g()
    {
        return 1;
    }

    public int h()
    {
        return 53;
    }

    public long i(long l)
    {
        return super.i(0xf731400L + l);
    }
}
