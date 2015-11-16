// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class agh extends Exception
{

    public final aft a;
    private long b;

    public agh()
    {
        a = null;
    }

    public agh(aft aft)
    {
        a = aft;
    }

    public agh(Throwable throwable)
    {
        super(throwable);
        a = null;
    }

    void a(long l)
    {
        b = l;
    }
}
