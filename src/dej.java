// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dej extends die
{

    private final cuk b;

    public dej(cuk cuk1)
    {
        super(cuk1);
        b = cuk1;
    }

    protected ctp a(ani ani, int i, String s)
    {
        b.m();
        return new csi(ani, i, b, s);
    }

    public String a()
    {
        return b.a();
    }

    public boolean a(ccg ccg)
    {
        return false;
    }

    public boolean a(cci cci, dbo dbo)
    {
        return b.a(cci, dbo);
    }

    public boolean a(String s)
    {
        return b.a(s);
    }

    public long b()
    {
        return b.b();
    }

    protected void b(int i, dbo dbo)
    {
        ani ani = dbf.e(i);
        b.a(ani, dbo);
    }

    public boolean c()
    {
        return b.c();
    }

    public boolean d()
    {
        return b.d();
    }

    public String e()
    {
        return b.e();
    }
}
