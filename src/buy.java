// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.ColorStateList;

public final class buy
{

    private int a;
    private boolean b;
    private String c;
    private String d;
    private ColorStateList e;
    private ColorStateList f;
    private android.view.View.OnClickListener g;
    private int h;

    public buy()
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

    public buy a()
    {
        b = false;
        return this;
    }

    public buy a(int i)
    {
        a = i;
        return this;
    }

    public buy a(android.view.View.OnClickListener onclicklistener)
    {
        g = onclicklistener;
        return this;
    }

    public buy a(String s)
    {
        c = s;
        return this;
    }

    public bux b()
    {
        return new bux(a, b, c, d, e, f, g, h);
    }

    public buy b(int i)
    {
        f = ColorStateList.valueOf(i);
        return this;
    }

    public buy b(String s)
    {
        d = s;
        return this;
    }

    public buy c(int i)
    {
        h = i;
        return this;
    }
}
