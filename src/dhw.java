// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dhw
{

    public final long a;
    final String b;
    final String c;
    String d[];
    String e;
    String f;
    String g;
    String h;
    int i;
    int j;
    int k;
    String l;
    int m;
    long n;

    public dhw(String s, String s1, long l1)
    {
        n = -1L;
        c = s;
        b = s1;
        a = l1;
    }

    public dhv a()
    {
        g.c(d, "must specify recipients");
        return new dhv(this);
    }

    public dhw a(int i1)
    {
        i = i1;
        return this;
    }

    public dhw a(long l1)
    {
        n = l1;
        return this;
    }

    public dhw a(String s)
    {
        e = s;
        return this;
    }

    public dhw a(String as[])
    {
        d = as;
        return this;
    }

    public dhw b(int i1)
    {
        j = i1;
        return this;
    }

    public dhw b(String s)
    {
        f = s;
        return this;
    }

    public dhw c(int i1)
    {
        k = i1;
        return this;
    }

    public dhw c(String s)
    {
        g = s;
        return this;
    }

    public dhw d(int i1)
    {
        m = i1;
        return this;
    }

    public dhw d(String s)
    {
        h = s;
        return this;
    }

    public dhw e(String s)
    {
        l = s;
        return this;
    }
}
