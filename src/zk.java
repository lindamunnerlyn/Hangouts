// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class zk extends yz
{

    final yr a;

    zk(yr yr1)
    {
        a = yr1;
        super();
    }

    private void a()
    {
        if (yr.m(a) && yr.n(a) && yr.o(a))
        {
            kb.a(a, yr.p(a));
            return;
        } else
        {
            yr.q(a);
            a.requestLayout();
            return;
        }
    }

    public void a(int i, int j)
    {
        a.a(null);
        if (a.b.a(i, j))
        {
            a();
        }
    }

    public void a(int i, int j, Object obj)
    {
        a.a(null);
        if (a.b.a(i, j, null))
        {
            a();
        }
    }

    public void b(int i, int j)
    {
        a.a(null);
        if (a.b.b(i, j))
        {
            a();
        }
    }
}
