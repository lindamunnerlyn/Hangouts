// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class yr extends yq
{

    yr(zg zg1)
    {
        super(zg1, (byte)0);
    }

    public int a(View view)
    {
        zh zh1 = (zh)view.getLayoutParams();
        return a.h(view) - zh1.leftMargin;
    }

    public void a(int i)
    {
        a.f(i);
    }

    public int b(View view)
    {
        zh zh1 = (zh)view.getLayoutParams();
        int i = a.j(view);
        return zh1.rightMargin + i;
    }

    public int c()
    {
        return a.n();
    }

    public int c(View view)
    {
        zh zh1 = (zh)view.getLayoutParams();
        int i = a.f(view);
        int j = zh1.leftMargin;
        return zh1.rightMargin + (i + j);
    }

    public int d()
    {
        return a.l() - a.p();
    }

    public int d(View view)
    {
        zh zh1 = (zh)view.getLayoutParams();
        int i = a.g(view);
        int j = zh1.topMargin;
        return zh1.bottomMargin + (i + j);
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
