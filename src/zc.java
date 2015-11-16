// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public abstract class zc
{

    private zd a;
    private ArrayList b;
    private long c;
    private long d;
    private long e;
    private long f;
    private boolean g;

    public zc()
    {
        a = null;
        b = new ArrayList();
        c = 120L;
        d = 120L;
        e = 250L;
        f = 250L;
        g = true;
    }

    public abstract void a();

    void a(zd zd1)
    {
        a = zd1;
    }

    public abstract boolean a(zs zs);

    public abstract boolean a(zs zs, int k, int l, int i1, int j1);

    public abstract boolean a(zs zs, zs zs1, int k, int l, int i1, int j1);

    public abstract boolean b();

    public abstract boolean b(zs zs);

    public abstract void c(zs zs);

    public abstract void d();

    public final void d(zs zs)
    {
        if (a != null)
        {
            a.a(zs);
        }
    }

    public long e()
    {
        return e;
    }

    public final void e(zs zs)
    {
        if (a != null)
        {
            a.c(zs);
        }
    }

    public long f()
    {
        return c;
    }

    public final void f(zs zs)
    {
        if (a != null)
        {
            a.b(zs);
        }
    }

    public long g()
    {
        return d;
    }

    public final void g(zs zs)
    {
        if (a != null)
        {
            a.d(zs);
        }
    }

    public long h()
    {
        return f;
    }

    public boolean i()
    {
        return g;
    }

    public final void j()
    {
        int l = b.size();
        for (int k = 0; k < l; k++)
        {
            b.get(k);
        }

        b.clear();
    }
}
