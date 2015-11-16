// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.view.View;

public abstract class zn
{

    private int a;
    private yr b;
    private ze c;
    private boolean d;
    private boolean e;
    private View f;
    private final qb g;

    static void a(zn zn1, int i, int j)
    {
label0:
        {
            yr yr1 = zn1.b;
            if (!zn1.e || zn1.a == -1 || yr1 == null)
            {
                zn1.a();
            }
            zn1.d = false;
            if (zn1.f != null)
            {
                if (zn1.a(zn1.f) == zn1.a)
                {
                    zo zo1 = yr1.e;
                    zn1.g.a(yr1);
                    zn1.a();
                } else
                {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    zn1.f = null;
                }
            }
            if (zn1.e)
            {
                zo zo2 = yr1.e;
                boolean flag = zn1.g.d();
                zn1.g.a(yr1);
                if (flag)
                {
                    if (!zn1.e)
                    {
                        break label0;
                    }
                    zn1.d = true;
                    yr.t(yr1).a();
                }
            }
            return;
        }
        zn1.a();
    }

    public int a(View view)
    {
        return b.c(view);
    }

    public jsj a(Object obj, Object obj1)
    {
        n.b(obj);
        n.b(obj1);
        return jsa.a(f());
    }

    protected final void a()
    {
        if (!e)
        {
            return;
        } else
        {
            b.e.a = -1;
            f = null;
            a = -1;
            d = false;
            e = false;
            ze.a(c, this);
            c = null;
            b = null;
            return;
        }
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
