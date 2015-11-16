// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public abstract class za
{

    private zb a;
    private ArrayList b;
    private long c;
    private long d;
    private long e;
    private long f;
    private boolean g;

    public za()
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

    void a(zb zb1)
    {
        a = zb1;
    }

    public abstract boolean a(zq zq);

    public abstract boolean a(zq zq, int k, int l, int i1, int j1);

    public abstract boolean a(zq zq, zq zq1, int k, int l, int i1, int j1);

    public abstract boolean b();

    public abstract boolean b(zq zq);

    public abstract void c(zq zq);

    public abstract void d();

    public final void d(zq zq)
    {
        if (a != null)
        {
            a.a(zq);
        }
    }

    public long e()
    {
        return e;
    }

    public final void e(zq zq)
    {
        if (a != null)
        {
            a.c(zq);
        }
    }

    public long f()
    {
        return c;
    }

    public final void f(zq zq)
    {
        if (a != null)
        {
            a.b(zq);
        }
    }

    public long g()
    {
        return d;
    }

    public final void g(zq zq)
    {
        if (a != null)
        {
            a.d(zq);
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
