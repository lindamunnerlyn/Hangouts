// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class yp extends yo
{

    yp(ze ze1)
    {
        super(ze1, (byte)0);
    }

    public int a(View view)
    {
        zf zf1 = (zf)view.getLayoutParams();
        return a.h(view) - zf1.leftMargin;
    }

    public void a(int i)
    {
        a.f(i);
    }

    public int b(View view)
    {
        zf zf1 = (zf)view.getLayoutParams();
        int i = a.j(view);
        return zf1.rightMargin + i;
    }

    public int c()
    {
        return a.n();
    }

    public int c(View view)
    {
        zf zf1 = (zf)view.getLayoutParams();
        int i = a.f(view);
        int j = zf1.leftMargin;
        return zf1.rightMargin + (i + j);
    }

    public int d()
    {
        return a.l() - a.p();
    }

    public int d(View view)
    {
        zf zf1 = (zf)view.getLayoutParams();
        int i = a.g(view);
        int j = zf1.topMargin;
        return zf1.bottomMargin + (i + j);
    }

    public int e()
    {
        return a.l();
    }

    public int f()
    {
        return a.l() - a.n() - a.p();
    }

    public int g()
    {
        return a.p();
    }
}
