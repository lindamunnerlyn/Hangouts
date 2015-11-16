// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class yq extends yo
{

    yq(ze ze1)
    {
        super(ze1, (byte)0);
    }

    public int a(View view)
    {
        zf zf1 = (zf)view.getLayoutParams();
        return a.i(view) - zf1.topMargin;
    }

    public void a(int i)
    {
        a.g(i);
    }

    public int b(View view)
    {
        zf zf1 = (zf)view.getLayoutParams();
        int i = a.k(view);
        return zf1.bottomMargin + i;
    }

    public int c()
    {
        return a.o();
    }

    public int c(View view)
    {
        zf zf1 = (zf)view.getLayoutParams();
        int i = a.g(view);
        int j = zf1.topMargin;
        return zf1.bottomMargin + (i + j);
    }

    public int d()
    {
        return a.m() - a.q();
    }

    public int d(View view)
    {
        zf zf1 = (zf)view.getLayoutParams();
        int i = a.f(view);
        int j = zf1.leftMargin;
        return zf1.rightMargin + (i + j);
    }

    public int e()
    {
        return a.m();
    }

    public int f()
    {
        return a.m() - a.o() - a.q();
    }

    public int g()
    {
        return a.q();
    }
}
