// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;

public final class zh extends android.view.ViewGroup.MarginLayoutParams
{

    zs a;
    final Rect b;
    boolean c;
    boolean d;

    public zh()
    {
        super(-2, -2);
        b = new Rect();
        c = true;
        d = false;
    }

    public zh(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new Rect();
        c = true;
        d = false;
    }

    public zh(android.view.ViewGroup.LayoutParams layoutparams)
    {
        super(layoutparams);
        b = new Rect();
        c = true;
        d = false;
    }

    public zh(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
        super(marginlayoutparams);
        b = new Rect();
        c = true;
        d = false;
    }

    public zh(zh zh1)
    {
        super(zh1);
        b = new Rect();
        c = true;
        d = false;
    }

    public boolean a()
    {
        return a.n();
    }

    public boolean b()
    {
        return a.l();
    }

    public int c()
    {
        return a.d();
    }
}
