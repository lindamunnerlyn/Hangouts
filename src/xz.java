// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.List;

final class xz
{

    boolean a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    boolean i;
    int j;
    List k;

    xz()
    {
        a = true;
        h = 0;
        i = false;
        k = null;
    }

    private void a(View view)
    {
        int k1 = k.size();
        View view1 = null;
        int l = 0x7fffffff;
        for (int i1 = 0; i1 < k1; i1++)
        {
            View view2 = ((zs)k.get(i1)).a;
            zh zh1 = (zh)view2.getLayoutParams();
            if (view2 == view || zh1.a())
            {
                continue;
            }
            int j1 = (zh1.c() - d) * e;
            if (j1 < 0 || j1 >= l)
            {
                continue;
            }
            view1 = view2;
            if (j1 == 0)
            {
                break;
            }
            view1 = view2;
            l = j1;
        }

        if (view1 == null)
        {
            d = -1;
            return;
        } else
        {
            d = ((zh)view1.getLayoutParams()).c();
            return;
        }
    }

    View a(zl zl1)
    {
        if (k != null)
        {
            int i1 = k.size();
            for (int l = 0; l < i1; l++)
            {
                zl1 = ((zs)k.get(l)).a;
                zh zh1 = (zh)zl1.getLayoutParams();
                if (!zh1.a() && d == zh1.c())
                {
                    a(((View) (zl1)));
                    return zl1;
                }
            }

            return null;
        } else
        {
            zl1 = zl1.a(d);
            d = d + e;
            return zl1;
        }
    }

    public void a()
    {
        a(((View) (null)));
    }

    boolean a(zq zq1)
    {
        return d >= 0 && d < zq1.d();
    }
}
