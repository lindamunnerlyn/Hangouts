// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class nt
    implements Runnable
{

    final nr a;

    nt(nr nr1)
    {
        a = nr1;
        super();
    }

    public void run()
    {
        if (!nr.a(a))
        {
            return;
        }
        if (nr.b(a))
        {
            nr.c(a);
            nr.d(a).a();
        }
        ns ns1 = nr.d(a);
        if (ns1.c() || !nr.e(a))
        {
            nr.f(a);
            return;
        }
        if (nr.g(a))
        {
            nr.h(a);
            nr.i(a);
        }
        ns1.d();
        int i = ns1.g();
        a.b(i);
        kb.a(nr.j(a), this);
    }
}
