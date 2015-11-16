// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lfc extends lex
{

    private static final long serialVersionUID = 0xfd2be8b98605f64aL;
    final lfb a;

    lfc(lfb lfb1, ldi ldi)
    {
        a = lfb1;
        super(ldi);
    }

    public long a(long l, int i)
    {
        return a.a(l, i);
    }

    public long a(long l, long l1)
    {
        return a.a(l, l1);
    }

    public boolean c()
    {
        return false;
    }

    public long d()
    {
        return a.b;
    }
}
