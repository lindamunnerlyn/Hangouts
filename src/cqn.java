// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


abstract class cqn
{

    boolean b;
    final cqf c;

    private cqn(cqf cqf1)
    {
        c = cqf1;
        super();
        b = false;
    }

    cqn(cqf cqf1, byte byte0)
    {
        this(cqf1);
    }

    abstract boolean a();

    abstract dvg b();

    void c()
    {
        cqf.d(c).a(b());
    }

    void d()
    {
        cqf.d(c).b(b());
    }
}
