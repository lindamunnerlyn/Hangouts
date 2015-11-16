// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.Set;

final class bqo extends bnk
{

    final bqf a;

    bqo(bqf bqf1)
    {
        a = bqf1;
        super();
    }

    public void a(giw giw1, Set set)
    {
        bqf.g(a).k();
        if (giw1 == giw.b)
        {
            g.a(bqf.h(a), bqf.k());
        } else
        {
            giw1 = bqf.h(a);
            g.y().removeCallbacks(giw1);
        }
        bqf.c(a);
    }

    public void c(gjr gjr1)
    {
        if (gjr1.g() && !gjr1.e() && bqf.d(a).t() != null && bqf.d(a).t().N())
        {
            g.b(1536);
            bqf.d(a).t().z();
        }
    }
}
