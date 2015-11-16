// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

final class axe
    implements ayi
{

    final int a;
    final axc b;

    axe(axc axc1, int i)
    {
        b = axc1;
        a = i;
        super();
    }

    public void a()
    {
    }

    public void a(String s, ayc ayc1)
    {
        if (!TextUtils.isEmpty(s) && !aow.a(s))
        {
            avv.b(b.a, a);
            avv.ad(b.a).b(bar.a(ayc1.a));
            avv.ad(b.a).a(new bar(avv.aU(b.a), avv.h(b.a), ayc1.a, a));
            if (avv.h(b.a) != null && dcz.t(avv.h(b.a).h()))
            {
                avv.ad(b.a).a(new azv(avv.aV(b.a), ayc1.a, avv.h(b.a).h()));
            }
        }
    }
}
