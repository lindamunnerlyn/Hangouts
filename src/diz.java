// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class diz extends djp
{

    private final cwx b;

    public diz(cwx cwx1)
    {
        super(cwx1);
        b = cwx1;
    }

    protected cvt a(aoa aoa, int i, String s)
    {
        b.l();
        if (b.q())
        {
            return new cvs(aoa, i, b, s);
        } else
        {
            return new cvq(aoa, i, b, s);
        }
    }

    public String a()
    {
        return b.a();
    }

    public boolean a(cdl cdl)
    {
        return false;
    }

    public boolean a(cdn cdn, dcx dcx)
    {
        return b.a(cdn, dcx);
    }

    public boolean a(String s)
    {
        return b.a(s);
    }

    public long b()
    {
        return b.b();
    }

    protected void b(int i, dcx dcx)
    {
        aoa aoa = dcn.e(i);
        b.a(aoa, dcx);
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
