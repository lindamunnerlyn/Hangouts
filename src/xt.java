// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class xt extends android.view.ViewGroup.MarginLayoutParams
{

    public float g;
    public int h;

    public xt(int i, int j)
    {
        super(i, j);
        h = -1;
        g = 0.0F;
    }

    public xt(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        h = -1;
        context = context.obtainStyledAttributes(attributeset, ro.au);
        g = context.getFloat(ro.aw, 0.0F);
        h = context.getInt(ro.av, -1);
        context.recycle();
    }

    public xt(android.view.ViewGroup.LayoutParams layoutparams)
    {
        super(layoutparams);
        h = -1;
    }
}
