// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.drawable.Drawable;

final class qv
    implements pw
{

    final qu a;

    qv(qu qu1)
    {
        a = qu1;
        super();
    }

    public Drawable a()
    {
        vm vm1 = vm.a(b(), null, new int[] {
            g.H
        });
        Drawable drawable = vm1.a(0);
        vm1.b();
        return drawable;
    }

    public void a(int i)
    {
        pq pq1 = a.a();
        if (pq1 != null)
        {
            pq1.c(i);
        }
    }

    public void a(Drawable drawable, int i)
    {
        pq pq1 = a.a();
        if (pq1 != null)
        {
            pq1.a(drawable);
            pq1.c(i);
        }
    }

    public Context b()
    {
        return a.k();
    }

    public boolean c()
    {
        pq pq1 = a.a();
        return pq1 != null && (pq1.d() & 4) != 0;
    }
}
