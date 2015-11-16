// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.AnimationUtils;

final class ns
{

    private int a;
    private int b;
    private float c;
    private float d;
    private long e;
    private long f;
    private int g;
    private int h;
    private long i;
    private float j;
    private int k;

    public ns()
    {
        e = 0x8000000000000000L;
        i = -1L;
        f = 0L;
        g = 0;
        h = 0;
    }

    private float a(long l)
    {
        if (l < e)
        {
            return 0.0F;
        }
        if (i < 0L || l < i)
        {
            return nr.a((float)(l - e) / (float)a) * 0.5F;
        } else
        {
            long l1 = i;
            float f1 = j;
            float f2 = j;
            return nr.a((float)(l - l1) / (float)k) * f2 + (1.0F - f1);
        }
    }

    public void a()
    {
        e = AnimationUtils.currentAnimationTimeMillis();
        i = -1L;
        f = e;
        j = 0.5F;
        g = 0;
        h = 0;
    }

    public void a(float f1, float f2)
    {
        c = f1;
        d = f2;
    }

    public void a(int l)
    {
        a = 500;
    }

    public void b()
    {
        long l = AnimationUtils.currentAnimationTimeMillis();
        k = nr.a((int)(l - e), b);
        j = a(l);
        i = l;
    }

    public void b(int l)
    {
        b = 500;
    }

    public boolean c()
    {
        return i > 0L && AnimationUtils.currentAnimationTimeMillis() > i + (long)k;
    }

    public void d()
    {
        if (f == 0L)
        {
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        } else
        {
            long l = AnimationUtils.currentAnimationTimeMillis();
            float f1 = a(l);
            f1 = f1 * 4F + -4F * f1 * f1;
            long l1 = l - f;
            f = l;
            g = (int)((float)l1 * f1 * c);
            h = (int)((float)l1 * f1 * d);
            return;
        }
    }

    public int e()
    {
        return (int)(c / Math.abs(c));
    }

    public int f()
    {
        return (int)(d / Math.abs(d));
    }

    public int g()
    {
        return h;
    }
}
