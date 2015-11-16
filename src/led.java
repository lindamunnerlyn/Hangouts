// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class led extends lfg
{

    private final ldz b;

    led(ldz ldz1, ldh ldh)
    {
        super(lcz.n(), ldh);
        b = ldz1;
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

    public ldh e()
    {
        return ((ldw) (b)).g;
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
