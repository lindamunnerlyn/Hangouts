// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.List;

final class xx
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

    xx()
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
            View view2 = ((zq)k.get(i1)).a;
            zf zf1 = (zf)view2.getLayoutParams();
            if (view2 == view || zf1.a())
            {
                continue;
            }
            int j1 = (zf1.c() - d) * e;
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
            d = ((zf)view1.getLayoutParams()).c();
            return;
        }
    }

    View a(zj zj1)
    {
        if (k != null)
        {
            int i1 = k.size();
            for (int l = 0; l < i1; l++)
            {
                zj1 = ((zq)k.get(l)).a;
                zf zf1 = (zf)zj1.getLayoutParams();
                if (!zf1.a() && d == zf1.c())
                {
                    a(((View) (zj1)));
                    return zj1;
                }
            }

            return null;
        } else
        {
            zj1 = zj1.a(d);
            d = d + e;
            return zj1;
        }
    }

    public void a()
    {
        a(((View) (null)));
    }

    boolean a(zo zo1)
    {
        return d >= 0 && d < zo1.d();
    }
}
