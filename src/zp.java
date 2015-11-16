// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.view.View;

public abstract class zp
{

    private int a;
    private yt b;
    private zg c;
    private boolean d;
    private boolean e;
    private View f;
    private final qd g;

    static void a(zp zp1, int i, int j)
    {
label0:
        {
            yt yt1 = zp1.b;
            if (!zp1.e || zp1.a == -1 || yt1 == null)
            {
                zp1.a();
            }
            zp1.d = false;
            if (zp1.f != null)
            {
                if (zp1.a(zp1.f) == zp1.a)
                {
                    zq zq1 = yt1.e;
                    zp1.g.a(yt1);
                    zp1.a();
                } else
                {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    zp1.f = null;
                }
            }
            if (zp1.e)
            {
                zq zq2 = yt1.e;
                boolean flag = zp1.g.d();
                zp1.g.a(yt1);
                if (flag)
                {
                    if (!zp1.e)
                    {
                        break label0;
                    }
                    zp1.d = true;
                    yt.t(yt1).a();
                }
            }
            return;
        }
        zp1.a();
    }

    public int a(View view)
    {
        return b.c(view);
    }

    public kak a(Object obj, Object obj1)
    {
        n.b(obj);
        n.b(obj1);
        return kaf.c(f());
    }

    protected final void a()
    {
        if (!e)
        {
            return;
        }
        b.e.a = -1;
        f = null;
        a = -1;
        d = false;
        e = false;
        zg zg1 = c;
        if (zg1.j == this)
        {
            zg1.j = null;
        }
        c = null;
        b = null;
    }

    public void a(int i)
    {
        a = i;
    }

    protected void b(View view)
    {
        if (a(view) == d())
        {
            f = view;
        }
    }

    public boolean b()
    {
        return d;
    }

    public boolean c()
    {
        return e;
    }

    public int d()
    {
        return a;
    }

    public abstract View e();

    public abstract Object f();
}
