// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class kmc extends klj
{

    public kma a;
    public boolean b;
    private final kma c;

    public kmc(kma kma1)
    {
        c = kma1;
        a = (kma)kma1.a(kmj.e);
        b = false;
    }

    public final boolean C_()
    {
        return kma.a(a);
    }

    public klj a()
    {
        return c();
    }

    public klj a(klr klr, klv klv)
    {
        return c(klr, klv);
    }

    public kmc a(kma kma1)
    {
        b();
        a.a(kmj.c, kma1);
        return this;
    }

    public kmz b(klr klr, klv klv)
    {
        return c(klr, klv);
    }

    public void b()
    {
        if (b)
        {
            kma kma1 = (kma)a.a(kmj.e);
            kma1.a(kmj.c, a);
            a = kma1;
            b = false;
        }
    }

    public kmc c()
    {
        kmc kmc1 = g().e();
        kmc1.a(d());
        return kmc1;
    }

    public kmc c(klr klr, klv klv)
    {
        klr = (kma)g().c().a(klr, klv);
        if (klr != null)
        {
            a(klr);
        }
        return this;
        klv;
        klr = (kma)klv.a();
        throw klv;
        klv;
_L2:
        if (klr != null)
        {
            a(klr);
        }
        throw klv;
        klv;
        klr = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public Object clone()
    {
        return c();
    }

    public kma d()
    {
        a.a(kmj.d);
        b = true;
        return a;
    }

    public final kma e()
    {
        kma kma1 = d();
        if (!kma1.C_())
        {
            throw new knq();
        } else
        {
            return kma1;
        }
    }

    public kma g()
    {
        return c;
    }

    public kmy h()
    {
        return d();
    }

    public kmy i()
    {
        return e();
    }
}
