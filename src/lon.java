// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lon extends lpq
{

    private final loj b;

    lon(loj loj1, lnr lnr)
    {
        super(lnj.n(), lnr);
        b = loj1;
    }

    public int a(long l)
    {
        return b.d(l);
    }

    public int c(long l)
    {
        int i = b.a(l);
        return b.a(i);
    }

    protected int c(long l, int i)
    {
        int j = 365;
        b.M();
        if (i > 365 || i <= 0)
        {
            j = c(l);
        }
        return j;
    }

    public lnr e()
    {
        return ((log) (b)).g;
    }

    public int g()
    {
        return 1;
    }

    public int h()
    {
        return b.M();
    }
}
