// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.drawable.Drawable;

final class qt
    implements pu
{

    final qs a;

    qt(qs qs1)
    {
        a = qs1;
        super();
    }

    public Drawable a()
    {
        vk vk1 = vk.a(b(), null, new int[] {
            g.H
        });
        Drawable drawable = vk1.a(0);
        vk1.b();
        return drawable;
    }

    public void a(int i)
    {
        po po1 = a.a();
        if (po1 != null)
        {
            po1.c(i);
        }
    }

    public void a(Drawable drawable, int i)
    {
        po po1 = a.a();
        if (po1 != null)
        {
            po1.a(drawable);
            po1.c(i);
        }
    }

    public Context b()
    {
        return a.k();
    }

    public boolean c()
    {
        po po1 = a.a();
        return po1 != null && (po1.d() & 4) != 0;
    }
}
