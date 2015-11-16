// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ccj
{

    private int a;
    private long b;
    private dbo c;

    public ccj()
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

    public void a(dbo dbo1)
    {
        a = dbo1.c();
        c = dbo1;
    }

    public long b()
    {
        return b;
    }

    public dbo c()
    {
        return c;
    }
}
