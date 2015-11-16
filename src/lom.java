// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lom extends lpq
{

    private final loj b;

    lom(loj loj1, lnr lnr)
    {
        super(lnj.m(), lnr);
        b = loj1;
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

    public lnr e()
    {
        return ((log) (b)).f;
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
