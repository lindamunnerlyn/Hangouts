// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class yx
    implements xh
{

    final yt a;

    yx(yt yt1)
    {
        a = yt1;
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
            yt.b(a, view);
        }
        a.removeViewAt(i);
    }

    public void a(View view, int i)
    {
        a.addView(view, i);
        yt.a(a, view);
    }

    public void a(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
        zs zs1 = yt.b(view);
        if (zs1 != null)
        {
            if (!zs1.p() && !zs1.c())
            {
                throw new IllegalArgumentException((new StringBuilder("Called attach on a child which is not detached: ")).append(zs1).toString());
            }
            zs1.i();
        }
        yt.a(a, view, i, layoutparams);
    }

    public View b(int i)
    {
        return a.getChildAt(i);
    }

    public zs b(View view)
    {
        return yt.b(view);
    }

    public void b()
    {
        int j = a();
        for (int i = 0; i < j; i++)
        {
            yt.b(a, b(i));
        }

        a.removeAllViews();
    }

    public void c(int i)
    {
        Object obj = b(i);
        if (obj != null)
        {
            obj = yt.b(((View) (obj)));
            if (obj != null)
            {
                if (((zs) (obj)).p() && !((zs) (obj)).c())
                {
                    throw new IllegalArgumentException((new StringBuilder("called detach on an already detached child ")).append(obj).toString());
                }
                ((zs) (obj)).a(256);
            }
        }
        yt.a(a, i);
    }

    public void c(View view)
    {
        view = yt.b(view);
        if (view != null)
        {
            zs.a(view);
        }
    }

    public void d(View view)
    {
        view = yt.b(view);
        if (view != null)
        {
            zs.b(view);
        }
    }
}
