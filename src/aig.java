// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aig
{

    String a;
    String b;
    int c;
    aih d;

    aig()
    {
    }

    public aif a()
    {
        return new aif(this);
    }

    public aig a(aif aif1)
    {
        if (aif1.a())
        {
            a(aif1.b());
        }
        if (aif1.c())
        {
            b = aif1.d();
        }
        if (aif1.e() > 0)
        {
            c = aif1.e();
        }
        if (aif1.f())
        {
            d = aif1.g();
        }
        return this;
    }

    public aig a(String s)
    {
        a = s;
        return this;
    }
}
