// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class kuf extends ktm
{

    public kud a;
    public boolean b;
    private final kud c;

    public kuf(kud kud1)
    {
        c = kud1;
        a = (kud)kud1.a(kum.e);
        b = false;
    }

    public final boolean E_()
    {
        return kud.a(a);
    }

    public ktm a()
    {
        return c();
    }

    public ktm a(ktu ktu, kty kty)
    {
        return c(ktu, kty);
    }

    public kuf a(kud kud1)
    {
        b();
        a.a(kum.c, kud1);
        return this;
    }

    public kvc b(ktu ktu, kty kty)
    {
        return c(ktu, kty);
    }

    public void b()
    {
        if (b)
        {
            kud kud1 = (kud)a.a(kum.e);
            kud1.a(kum.c, a);
            a = kud1;
            b = false;
        }
    }

    public kuf c()
    {
        kuf kuf1 = f().e();
        kuf1.a(d());
        return kuf1;
    }

    public kuf c(ktu ktu, kty kty)
    {
        ktu = (kud)f().c().a(ktu, kty);
        if (ktu != null)
        {
            a(ktu);
        }
        return this;
        kty;
        ktu = (kud)kty.a();
        throw kty;
        kty;
_L2:
        if (ktu != null)
        {
            a(ktu);
        }
        throw kty;
        kty;
        ktu = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public Object clone()
    {
        return c();
    }

    public kud d()
    {
        if (b)
        {
            return a;
        } else
        {
            a.a(kum.d);
            a.b.c();
            b = true;
            return a;
        }
    }

    public final kud e()
    {
        kud kud1 = d();
        if (!kud1.E_())
        {
            throw new kvt();
        } else
        {
            return kud1;
        }
    }

    public kud f()
    {
        return c;
    }

    public kvb h()
    {
        return d();
    }

    public kvb i()
    {
        return e();
    }
}
