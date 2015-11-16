// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gem
{

    private final gen a;
    private final gjr b = new gjr();
    private gfo c;
    private gho d;

    gem(gen gen1)
    {
        a = gen1;
    }

    public String a()
    {
        return b.a();
    }

    void a(gfo gfo1)
    {
        c = gfo1;
    }

    void a(gho gho1)
    {
        d = gho1;
    }

    public gjr b()
    {
        return b;
    }

    public gfo c()
    {
        return c;
    }

    public gho d()
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
            return d.l();
        }
    }

    public void f()
    {
        if (d != null)
        {
            b.a(d.a());
            b.b(d.c());
            b.c(d.d());
            b.a(d.h());
            b.a(d.o());
            if (d instanceof ghs)
            {
                b.d(((ghs)d).x());
            }
            b.g(d instanceof ghv);
            b.h(d.q());
        }
        boolean flag;
        boolean flag1;
        if (d == null)
        {
            flag = true;
        } else
        {
            flag = d.p();
        }
        if (c == null)
        {
            flag1 = false;
        } else
        {
            flag1 = c.p();
        }
        b.b(flag);
        b.k(flag1);
        a.b(this);
    }
}
