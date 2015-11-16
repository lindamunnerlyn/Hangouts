// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bxa extends ebd
    implements ebq
{

    final bwz a;

    public bxa(bwz bwz1, hjm hjm, int i)
    {
        a = bwz1;
        super(hjm, i, csz.f.j);
    }

    public void a(csw csw1)
    {
        bwz.a(a, csw1.d());
    }

    protected void a(boolean flag)
    {
        if (flag)
        {
            bwz.a().a(this);
            return;
        } else
        {
            bwz.a().b(this);
            return;
        }
    }

    protected void c()
    {
        bwz.a(a, 0L);
    }

    public void d()
    {
        bwz.a(a);
    }
}
