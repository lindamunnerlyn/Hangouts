// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

final class awp
    implements ayi
{

    final avv a;

    awp(avv avv1)
    {
        a = avv1;
        super();
    }

    public void a()
    {
    }

    public void a(String s, ayc ayc1)
    {
        if (!TextUtils.equals(avv.ab(a), s) && !aow.a(s))
        {
            int i = g.a(avv.ac(a), "babel_focustimeoutsecs", 300);
            avv.ad(a).b(baq.a(ayc1.a));
            avv.ad(a).a(new baq(avv.ae(a), avv.h(a), ayc1.a, true, i));
            if (avv.h(a) != null && dcz.t(avv.h(a).h()))
            {
                avv.ad(a).a(new azv(avv.af(a), ayc1.a, avv.h(a).h()));
            }
            if (ayc1.b == 1)
            {
                avv.b(a, s);
                return;
            }
        }
    }
}
