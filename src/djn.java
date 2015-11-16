// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class djn
{

    public final long a;
    final String b;
    final String c;
    String d;
    String e;
    long f;
    String g;
    long h;

    public djn(String s, String s1, long l)
    {
        c = s;
        b = s1;
        a = l;
    }

    public djm a()
    {
        return new djm(this);
    }

    public djn a(long l)
    {
        f = l;
        return this;
    }

    public djn a(String s)
    {
        d = s;
        return this;
    }

    public djn b(long l)
    {
        h = l;
        return this;
    }

    public djn b(String s)
    {
        e = s;
        return this;
    }

    public djn c(String s)
    {
        g = s;
        return this;
    }
}
