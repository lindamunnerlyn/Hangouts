// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.widget.DrawerLayout;
import android.view.View;

public final class oo extends pp
{

    final int a;
    pm b;
    final DrawerLayout c;
    private final Runnable d = new op(this);

    public oo(DrawerLayout drawerlayout, int i)
    {
        c = drawerlayout;
        super();
        a = i;
    }

    public void a()
    {
        c.removeCallbacks(d);
    }

    public void a(int i)
    {
        c.a(i, b.c());
    }

    public void a(int i, int j)
    {
        View view;
        if ((i & 1) == 1)
        {
            view = c.b(3);
        } else
        {
            view = c.b(5);
        }
        if (view != null && c.a(view) == 0)
        {
            b.a(view, j);
        }
    }

    public void a(View view, float f)
    {
        float f1;
        int k;
        f1 = c.d(view);
        k = view.getWidth();
        if (!c.a(view, 3)) goto _L2; else goto _L1
_L1:
        int i;
        if (f > 0.0F || f == 0.0F && f1 > 0.5F)
        {
            i = 0;
        } else
        {
            i = -k;
        }
_L4:
        b.a(i, view.getTop());
        c.invalidate();
        return;
_L2:
        int j = c.getWidth();
        if (f >= 0.0F)
        {
            i = j;
            if (f != 0.0F)
            {
                continue; /* Loop/switch isn't completed */
            }
            i = j;
            if (f1 <= 0.5F)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        i = j - k;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(View view, int i)
    {
        int j = view.getWidth();
        float f;
        if (c.a(view, 3))
        {
            f = (float)(j + i) / (float)j;
        } else
        {
            f = (float)(c.getWidth() - i) / (float)j;
        }
        c.b(view, f);
        if (f == 0.0F)
        {
            i = 4;
        } else
        {
            i = 0;
        }
        view.setVisibility(i);
        c.invalidate();
    }

    public void a(pm pm1)
    {
        b = pm1;
    }

    public boolean a(View view)
    {
        return c.g(view) && c.a(view, a) && c.a(view) == 0;
    }

    public int b(View view, int i)
    {
        if (c.a(view, 3))
        {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        } else
        {
            int j = c.getWidth();
            return Math.max(j - view.getWidth(), Math.min(i, j));
        }
    }

    void b()
    {
        byte byte0 = 3;
        if (a == 3)
        {
            byte0 = 5;
        }
        View view = c.b(byte0);
        if (view != null)
        {
            c.i(view);
        }
    }

    public void b(View view)
    {
        ((ol)view.getLayoutParams()).c = false;
        b();
    }

    public int c(View view)
    {
        if (c.g(view))
        {
            return view.getWidth();
        } else
        {
            return 0;
        }
    }

    public void c()
    {
        c.postDelayed(d, 160L);
    }

    public int d(View view)
    {
        return view.getTop();
    }
}
