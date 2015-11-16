// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cdo
{

    private int a;
    private long b;
    private dcx c;

    public cdo()
    {
    }

    public int a()
    {
        return a;
    }

    public void a(int i)
    {
        a = i;
    }

    public void a(long l)
    {
        b = l;
    }

    public void a(dcx dcx1)
    {
        a = dcx1.c();
        c = dcx1;
    }

    public long b()
    {
        return b;
    }

    public dcx c()
    {
        return c;
    }
}
