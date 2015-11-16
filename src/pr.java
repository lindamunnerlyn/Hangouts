// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class pr extends android.view.ViewGroup.MarginLayoutParams
{

    public int a;

    public pr(int i, int j)
    {
        super(-2, -2);
        a = 0;
        a = 0x800013;
    }

    public pr(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0;
        context = context.obtainStyledAttributes(attributeset, rq.t);
        a = context.getInt(rq.u, 0);
        context.recycle();
    }

    public pr(android.view.ViewGroup.LayoutParams layoutparams)
    {
        super(layoutparams);
        a = 0;
    }

    public pr(pr pr1)
    {
        super(pr1);
        a = 0;
        a = pr1.a;
    }
}
