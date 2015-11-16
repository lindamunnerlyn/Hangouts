// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lec extends lfg
{

    private final ldz b;

    lec(ldz ldz1, ldh ldh)
    {
        super(lcz.m(), ldh);
        b = ldz1;
    }

    public int a(long l)
    {
        return b.c(l);
    }

    public int c(long l)
    {
        return b.i(l);
    }

    protected int c(long l, int i)
    {
        return b.e(l, i);
    }

    public ldh e()
    {
        return ((ldw) (b)).f;
    }

    public int g()
    {
        return 1;
    }

    public int h()
    {
        return b.N();
    }
}
