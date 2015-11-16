// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;

public abstract class yx
{

    public final yy a = new yy();
    boolean b;

    public yx()
    {
        b = false;
    }

    public abstract int a();

    public int a(int i)
    {
        return 0;
    }

    public abstract zq a(ViewGroup viewgroup, int i);

    public final void a(int i, int j)
    {
        a.a(i, j);
    }

    public void a(yz yz)
    {
        a.registerObserver(yz);
    }

    public abstract void a(zq zq1, int i);

    public void a(boolean flag)
    {
        if (a.a())
        {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else
        {
            b = flag;
            return;
        }
    }

    public long b(int i)
    {
        return -1L;
    }

    public final void b(int i, int j)
    {
        a.b(i, j);
    }

    public void b(yz yz)
    {
        a.unregisterObserver(yz);
    }

    public void b(zq zq1, int i)
    {
        a(zq1, i);
    }

    public final void c(zq zq1, int i)
    {
        zq1.b = i;
        if (b)
        {
            zq1.d = b(i);
        }
        zq1.a(1, 519);
        g.a("RV OnBindView");
        zq1.s();
        b(zq1, i);
        zq1.r();
        g.a();
    }
}
