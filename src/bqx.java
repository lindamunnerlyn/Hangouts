// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.Set;

final class bqx extends bns
{

    final bqo a;

    bqx(bqo bqo1)
    {
        a = bqo1;
        super();
    }

    public void a(gly gly1, Set set)
    {
        bqo.g(a).k();
        if (gly1 == gly.b)
        {
            g.a(bqo.h(a), bqo.k());
        } else
        {
            gly1 = bqo.h(a);
            g.x().removeCallbacks(gly1);
        }
        bqo.c(a);
    }

    public void c(gmt gmt1)
    {
        if (gmt1.g() && !gmt1.e() && bqo.d(a).s() != null && bqo.d(a).s().M())
        {
            g.b(1536);
            bqo.d(a).s().y();
        }
    }
}
