// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hsj
{

    public int a;
    public double b;
    public double c;
    public int d;
    public int e;
    public hsu f;

    public hsj()
    {
        a = 500;
        b = 0.5D;
        c = 1.5D;
        d = 60000;
        e = 0xdbba0;
        f = hsu.a;
    }

    public hsi a()
    {
        return new hsi(this);
    }

    public hsj a(double d1)
    {
        b = d1;
        return this;
    }

    public hsj a(int i)
    {
        a = i;
        return this;
    }

    public hsj a(hsu hsu1)
    {
        f = (hsu)h.a(hsu1);
        return this;
    }

    public hsj b(double d1)
    {
        c = d1;
        return this;
    }

    public hsj b(int i)
    {
        d = i;
        return this;
    }

    public hsj c(int i)
    {
        e = i;
        return this;
    }
}
