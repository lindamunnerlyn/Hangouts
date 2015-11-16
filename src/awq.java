// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class awq
    implements ayi
{

    final avv a;

    awq(avv avv1)
    {
        a = avv1;
        super();
    }

    public void a()
    {
    }

    public void a(String s, ayc ayc1)
    {
        if (!aow.a(s))
        {
            s = ayc1.a;
            avv.ad(a).b(baq.a(s));
            avv.ad(a).a(new baq(avv.ag(a), avv.h(a), s, false, 0));
            if (avv.h(a) != null && dcz.t(avv.h(a).h()))
            {
                avv.ad(a).a(new azv(avv.ah(a), s, avv.h(a).h()));
            }
            if (avv.ai(a) != 3)
            {
                avv.ad(a).b(bar.a(s));
                avv.ad(a).a(new bar(avv.aj(a), avv.h(a), s, 3));
                return;
            }
        }
    }
}
