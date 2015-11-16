// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.WindowInsets;

public final class mi extends mh
{

    private final WindowInsets a;

    public mi(WindowInsets windowinsets)
    {
        a = windowinsets;
    }

    public int a()
    {
        return a.getSystemWindowInsetLeft();
    }

    public mh a(int i, int j, int k, int l)
    {
        return new mi(a.replaceSystemWindowInsets(i, j, k, l));
    }

    public int b()
    {
        return a.getSystemWindowInsetTop();
    }

    public int c()
    {
        return a.getSystemWindowInsetRight();
    }

    public int d()
    {
        return a.getSystemWindowInsetBottom();
    }

    public WindowInsets e()
    {
        return a;
    }
}
