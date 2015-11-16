// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class xv extends android.view.ViewGroup.MarginLayoutParams
{

    public float g;
    public int h;

    public xv(int i, int j)
    {
        super(i, j);
        h = -1;
        g = 0.0F;
    }

    public xv(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        h = -1;
        context = context.obtainStyledAttributes(attributeset, rq.au);
        g = context.getFloat(rq.aw, 0.0F);
        h = context.getInt(rq.av, -1);
        context.recycle();
    }

    public xv(android.view.ViewGroup.LayoutParams layoutparams)
    {
        super(layoutparams);
        h = -1;
    }
}
