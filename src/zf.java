// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;

public final class zf extends android.view.ViewGroup.MarginLayoutParams
{

    zq a;
    final Rect b;
    boolean c;
    boolean d;

    public zf()
    {
        super(-2, -2);
        b = new Rect();
        c = true;
        d = false;
    }

    public zf(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new Rect();
        c = true;
        d = false;
    }

    public zf(android.view.ViewGroup.LayoutParams layoutparams)
    {
        super(layoutparams);
        b = new Rect();
        c = true;
        d = false;
    }

    public zf(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
        super(marginlayoutparams);
        b = new Rect();
        c = true;
        d = false;
    }

    public zf(zf zf1)
    {
        super(zf1);
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
