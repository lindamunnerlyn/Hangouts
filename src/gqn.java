// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

public final class gqn
    implements gqk
{

    private final int a;
    private String b;
    private ColorStateList c;
    private Drawable d;
    private Drawable e;

    public gqn(int i, String s)
    {
        a = i;
        b = s;
        c = null;
        d = null;
        e = null;
    }

    public gqn a(int i)
    {
        return a(ColorStateList.valueOf(i));
    }

    public gqn a(ColorStateList colorstatelist)
    {
        c = colorstatelist;
        return this;
    }

    public gqn a(Drawable drawable)
    {
        d = drawable;
        return this;
    }

    public boolean a()
    {
        return true;
    }

    public int b()
    {
        return g.sl;
    }

    public gqn b(Drawable drawable)
    {
        e = drawable;
        return this;
    }

    public int c()
    {
        return a;
    }

    public String d()
    {
        return b;
    }

    public ColorStateList e()
    {
        return c;
    }

    public Drawable f()
    {
        return d;
    }

    public Drawable g()
    {
        return e;
    }
}
