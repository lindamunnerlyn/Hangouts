// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.animation.Interpolator;

public final class pe
{

    Object a;
    pf b;

    private pe(int i, Context context, Interpolator interpolator)
    {
        if (i >= 14)
        {
            b = new pi();
        } else
        if (i >= 9)
        {
            b = new ph();
        } else
        {
            b = new pg();
        }
        a = b.a(context, interpolator);
    }

    private pe(Context context, Interpolator interpolator)
    {
        this(android.os.Build.VERSION.SDK_INT, context, interpolator);
    }

    public static pe a(Context context, Interpolator interpolator)
    {
        return new pe(context, interpolator);
    }

    public void a(int i, int j, int k, int l)
    {
        b.a(a, 0, 0, i, j, k, l, 0x80000000, 0x7fffffff);
    }

    public void a(int i, int j, int k, int l, int i1)
    {
        b.a(a, i, j, k, l, i1);
    }

    public boolean a()
    {
        return b.a(a);
    }

    public int b()
    {
        return b.b(a);
    }

    public int c()
    {
        return b.c(a);
    }

    public int d()
    {
        return b.g(a);
    }

    public int e()
    {
        return b.h(a);
    }

    public float f()
    {
        return b.d(a);
    }

    public boolean g()
    {
        return b.e(a);
    }

    public void h()
    {
        b.f(a);
    }
}
