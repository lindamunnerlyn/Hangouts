// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;

public abstract class yz
{

    public final za a = new za();
    boolean b;

    public yz()
    {
        b = false;
    }

    public abstract int a();

    public int a(int i)
    {
        return 0;
    }

    public abstract zs a(ViewGroup viewgroup, int i);

    public final void a(int i, int j)
    {
        a.a(i, j);
    }

    public void a(zb zb)
    {
        a.registerObserver(zb);
    }

    public abstract void a(zs zs1, int i);

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

    public void b(zb zb)
    {
        a.unregisterObserver(zb);
    }

    public void b(zs zs1, int i)
    {
        a(zs1, i);
    }

    public final void c(zs zs1, int i)
    {
        zs1.b = i;
        if (b)
        {
            zs1.d = b(i);
        }
        zs1.a(1, 519);
        g.a("RV OnBindView");
        zs1.s();
        b(zs1, i);
        zs1.r();
        g.a();
    }
}
