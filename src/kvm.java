// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kvm extends kmc
    implements kna
{

    kvm()
    {
        super(kvl.p());
    }

    public kvm a(double d)
    {
        b();
        kvl.a((kvl)a, d);
        return this;
    }

    public kvm a(long l)
    {
        b();
        kvl.a((kvl)a, l);
        return this;
    }

    public kvm a(String s)
    {
        b();
        kvl.a((kvl)a, s);
        return this;
    }

    public kvm b(long l)
    {
        b();
        kvl.b((kvl)a, l);
        return this;
    }

    public kvm j()
    {
        b();
        kvl.c((kvl)a, 0L);
        return this;
    }

    public String k()
    {
        return ((kvl)a).l();
    }
}
