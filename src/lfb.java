// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class lfb extends lew
{

    private final ldh a;
    final long b;

    public lfb(lcz lcz1, long l)
    {
        super(lcz1);
        b = l;
        a = new lfc(this, lcz1.y());
    }

    public abstract long a(long l, int i);

    public abstract long a(long l, long l1);

    public final ldh d()
    {
        return a;
    }
}
