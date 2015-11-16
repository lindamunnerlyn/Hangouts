// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ggk
{

    private gji a;
    private int b;
    private boolean c;
    private int d;

    public ggk()
    {
        b = 0;
        d = 0;
    }

    gji a()
    {
        return a;
    }

    void a(int i)
    {
        gdv.a(i, 0, 3);
        b = i;
        if (i == 0)
        {
            a = null;
        }
    }

    void a(gji gji1)
    {
        gdv.a("Expected null", a);
        gdv.a(g.A(gji1.a()), gji1.a());
        a = gji1;
    }

    int b()
    {
        return b;
    }

    void c()
    {
        boolean flag;
        if (b == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.a("Expected condition to be true", flag);
        d = 0;
    }

    boolean d()
    {
        return c;
    }

    void e()
    {
        c = true;
    }
}
