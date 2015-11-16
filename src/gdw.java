// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gdw
{

    private ggi a;
    private int b;
    private boolean c;
    private int d;

    public gdw()
    {
        b = 0;
        d = 8;
    }

    ggi a()
    {
        return a;
    }

    void a(int i)
    {
        gbh.a(i, 0, 3);
        b = i;
        if (i == 0)
        {
            a = null;
        }
    }

    void a(ggi ggi1)
    {
        gbh.a(a);
        gbh.a(g.x(ggi1.a()), ggi1.a());
        a = ggi1;
    }

    int b()
    {
        return b;
    }

    int c()
    {
        return d;
    }

    void d()
    {
        boolean flag = false;
        gbh.a(8, 0, 9);
        if (b == 3)
        {
            flag = true;
        }
        gbh.a(flag);
        d = 8;
    }

    boolean e()
    {
        return c;
    }

    void f()
    {
        c = true;
    }
}
