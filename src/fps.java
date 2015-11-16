// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ImageView;

final class fps extends fpy
{

    public final int a;
    public final String b;
    public final ftl c;
    final fpr d;

    public fps(fpr fpr1, ImageView imageview, ftl ftl1, int i)
    {
        Object obj = null;
        d = fpr1;
        super(fpr1);
        boolean flag = g.a(ftl1);
        f = imageview;
        c = ftl1;
        if (flag)
        {
            fpr1 = ftl1.a();
        } else
        {
            fpr1 = null;
        }
        g = fpr1;
        fpr1 = obj;
        if (flag)
        {
            fpr1 = ftl1.d();
        }
        b = fpr1;
        a = i;
    }

    public void a()
    {
        fph.g.a(d.c, g, b, a).a(new fpt(this));
    }

    public void a(fpc fpc1)
    {
        fpr.a(d, fpc1.D_(), fpc1.c(), this);
    }
}
