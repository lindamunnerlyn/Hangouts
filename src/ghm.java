// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ghm
{

    private final ghn a;
    private final gmt b = new gmt();
    private gio c;
    private gkq d;

    ghm(ghn ghn1)
    {
        a = ghn1;
    }

    public String a()
    {
        return b.a();
    }

    void a(gio gio1)
    {
        c = gio1;
    }

    void a(gkq gkq1)
    {
        d = gkq1;
        b.a(gkq1.a());
        b.b(gkq1.b());
        b.c(gkq1.c());
        b.a(gkq1.g());
        if (gkq1 instanceof gku)
        {
            b.d(((gku)gkq1).w());
        }
        b.g(gkq1 instanceof gkx);
    }

    public gmt b()
    {
        return b;
    }

    public gio c()
    {
        return c;
    }

    public gkq d()
    {
        return d;
    }

    public boolean e()
    {
        if (d == null)
        {
            return true;
        } else
        {
            return d.k();
        }
    }

    public void f()
    {
        if (d != null)
        {
            b.a(d.n());
            b.h(d.p());
            b.b(d.o());
        }
        boolean flag;
        boolean flag1;
        if (d == null)
        {
            flag = true;
        } else
        {
            flag = d.o();
        }
        if (c == null)
        {
            flag1 = false;
        } else
        {
            flag1 = c.q();
        }
        b.b(flag);
        b.k(flag1);
        a.b(this);
    }
}
