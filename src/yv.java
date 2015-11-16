// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class yv
    implements xf
{

    final yr a;

    yv(yr yr1)
    {
        a = yr1;
        super();
    }

    public int a()
    {
        return a.getChildCount();
    }

    public int a(View view)
    {
        return a.indexOfChild(view);
    }

    public void a(int i)
    {
        View view = a.getChildAt(i);
        if (view != null)
        {
            yr.b(a, view);
        }
        a.removeViewAt(i);
    }

    public void a(View view, int i)
    {
        a.addView(view, i);
        yr.a(a, view);
    }

    public void a(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
        zq zq1 = yr.b(view);
        if (zq1 != null)
        {
            if (!zq1.p() && !zq1.c())
            {
                throw new IllegalArgumentException((new StringBuilder("Called attach on a child which is not detached: ")).append(zq1).toString());
            }
            zq1.i();
        }
        yr.a(a, view, i, layoutparams);
    }

    public View b(int i)
    {
        return a.getChildAt(i);
    }

    public zq b(View view)
    {
        return yr.b(view);
    }

    public void b()
    {
        int j = a();
        for (int i = 0; i < j; i++)
        {
            yr.b(a, b(i));
        }

        a.removeAllViews();
    }

    public void c(int i)
    {
        Object obj = b(i);
        if (obj != null)
        {
            obj = yr.b(((View) (obj)));
            if (obj != null)
            {
                if (((zq) (obj)).p() && !((zq) (obj)).c())
                {
                    throw new IllegalArgumentException((new StringBuilder("called detach on an already detached child ")).append(obj).toString());
                }
                ((zq) (obj)).a(256);
            }
        }
        yr.a(a, i);
    }

    public void c(View view)
    {
        view = yr.b(view);
        if (view != null)
        {
            zq.a(view);
        }
    }

    public void d(View view)
    {
        view = yr.b(view);
        if (view != null)
        {
            zq.b(view);
        }
    }
}
