// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class pp extends android.view.ViewGroup.MarginLayoutParams
{

    public int a;

    public pp(int i, int j)
    {
        super(-2, -2);
        a = 0;
        a = 0x800013;
    }

    public pp(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0;
        context = context.obtainStyledAttributes(attributeset, ro.t);
        a = context.getInt(ro.u, 0);
        context.recycle();
    }

    public pp(android.view.ViewGroup.LayoutParams layoutparams)
    {
        super(layoutparams);
        a = 0;
    }

    public pp(pp pp1)
    {
        super(pp1);
        a = 0;
        a = pp1.a;
    }
}
