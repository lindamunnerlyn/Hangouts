// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class buc extends bnk
{

    final btz a;

    buc(btz btz1)
    {
        a = btz1;
        super();
    }

    public void a(int i)
    {
        btz.i(a).b(btz.h(a));
        if (btz.l(a) != null)
        {
            btz.m(a);
            btz.n(a);
        }
        if (btz.b(a) != null)
        {
            btz.b(a).b(btz.k(a));
            btz.a(a, null);
        }
        btz.c(a).clear();
        btz.a(a, null);
        btz.o(a);
        btz.a(a, false);
        btz.p(a);
    }

    public void a(gjq gjq)
    {
        btz.i(a).a(btz.h(a));
        btz.a(a, (gaw)btz.j(a).p().a(gaw));
        btz.b(a).a(btz.k(a));
    }
}
