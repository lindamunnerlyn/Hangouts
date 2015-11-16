// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.ArrayList;
import java.util.List;

final class xd
{

    final xf a;
    final xe b = new xe();
    final List c = new ArrayList();

    xd(xf xf1)
    {
        a = xf1;
    }

    private int e(int i)
    {
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        i = -1;
        return i;
        int j;
        int k;
        int l;
        k = a.a();
        j = i;
          goto _L1
        continue; /* Loop/switch isn't completed */
        j += l;
    }

    private void g(View view)
    {
        c.add(view);
        a.c(view);
    }

    private boolean h(View view)
    {
        if (c.remove(view))
        {
            a.d(view);
            return true;
        } else
        {
            return false;
        }
    }

    View a(int i, int j)
    {
        int k = c.size();
        for (j = 0; j < k; j++)
        {
            View view = (View)c.get(j);
            zq zq1 = a.b(view);
            if (zq1.d() == i && !zq1.j())
            {
                return view;
            }
        }

        return null;
    }

    void a()
    {
        b.a();
        for (int i = c.size() - 1; i >= 0; i--)
        {
            a.d((View)c.get(i));
            c.remove(i);
        }

        a.b();
    }

    void a(int i)
    {
        i = e(i);
        View view = a.b(i);
        if (view == null)
        {
            return;
        }
        if (b.c(i))
        {
            h(view);
        }
        a.a(i);
    }

    void a(View view)
    {
        a(view, -1, true);
    }

    void a(View view, int i, android.view.ViewGroup.LayoutParams layoutparams, boolean flag)
    {
        if (i < 0)
        {
            i = a.a();
        } else
        {
            i = e(i);
        }
        b.a(i, flag);
        if (flag)
        {
            g(view);
        }
        a.a(view, i, layoutparams);
    }

    void a(View view, int i, boolean flag)
    {
        if (i < 0)
        {
            i = a.a();
        } else
        {
            i = e(i);
        }
        b.a(i, flag);
        if (flag)
        {
            g(view);
        }
        a.a(view, i);
    }

    int b()
    {
        return a.a() - c.size();
    }

    View b(int i)
    {
        i = e(i);
        return a.b(i);
    }

    void b(View view)
    {
        int i = a.a(view);
        if (i < 0)
        {
            return;
        }
        if (b.c(i))
        {
            h(view);
        }
        a.a(i);
    }

    int c()
    {
        return a.a();
    }

    int c(View view)
    {
        int i;
        for (i = a.a(view); i == -1 || b.b(i);)
        {
            return -1;
        }

        return i - b.d(i);
    }

    View c(int i)
    {
        return a.b(i);
    }

    void d(int i)
    {
        i = e(i);
        b.c(i);
        a.c(i);
    }

    boolean d(View view)
    {
        return c.contains(view);
    }

    void e(View view)
    {
        int i = a.a(view);
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("view is not a child, cannot hide ")).append(view).toString());
        } else
        {
            b.a(i);
            g(view);
            return;
        }
    }

    boolean f(View view)
    {
        int i = a.a(view);
        if (i == -1)
        {
            h(view);
            return true;
        }
        if (b.b(i))
        {
            b.c(i);
            h(view);
            a.a(i);
            return true;
        } else
        {
            return false;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(b.toString()).append(", hidden list:").append(c.size()).toString();
    }
}
