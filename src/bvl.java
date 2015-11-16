// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.ColorStateList;

public final class bvl
{

    private int a;
    private boolean b;
    private String c;
    private String d;
    private ColorStateList e;
    private ColorStateList f;
    private android.view.View.OnClickListener g;
    private int h;

    public bvl()
    {
        a = 2;
        b = true;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = -1;
    }

    public bvl a()
    {
        b = false;
        return this;
    }

    public bvl a(int i)
    {
        a = i;
        return this;
    }

    public bvl a(android.view.View.OnClickListener onclicklistener)
    {
        g = onclicklistener;
        return this;
    }

    public bvl a(String s)
    {
        c = s;
        return this;
    }

    public bvk b()
    {
        return new bvk(a, b, c, d, e, f, g, h);
    }

    public bvl b(int i)
    {
        f = ColorStateList.valueOf(i);
        return this;
    }

    public bvl b(String s)
    {
        d = s;
        return this;
    }

    public bvl c(int i)
    {
        h = i;
        return this;
    }
}
