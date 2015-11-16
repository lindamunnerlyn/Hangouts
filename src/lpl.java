// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class lpl extends lpg
{

    private final lnr a;
    final long b;

    public lpl(lnj lnj1, long l)
    {
        super(lnj1);
        b = l;
        a = new lpm(this, lnj1.y());
    }

    public abstract long a(long l, int i);

    public abstract long a(long l, long l1);

    public final lnr d()
    {
        return a;
    }
}
