// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hil
{

    private long a;
    private long b;
    private int c;
    private String d;
    private long e;
    private hm f;

    public hil()
    {
        a = -1L;
        b = -1L;
        c = 0;
        e = 0L;
        f = new hm();
    }

    public long a()
    {
        return b;
    }

    public void a(long l)
    {
        a = l;
    }

    public void a(String s)
    {
        d = s;
    }

    public long b()
    {
        return a;
    }

    public void b(long l)
    {
        b = l;
    }

    public String c()
    {
        return d;
    }

    public void d()
    {
        c = c + 1;
    }

    public int e()
    {
        return c;
    }

    public long f()
    {
        return e;
    }

    public hm g()
    {
        return f;
    }

    public void h()
    {
        a = -1L;
        b = -1L;
        c = 0;
        e = 0L;
        f.clear();
    }
}
