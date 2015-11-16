// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.widget.DrawerLayout;
import android.util.AttributeSet;

public final class ol extends android.view.ViewGroup.MarginLayoutParams
{

    public int a;
    public float b;
    public boolean c;
    public boolean d;

    public ol()
    {
        super(-1, -1);
        a = 0;
    }

    public ol(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0;
        context = context.obtainStyledAttributes(attributeset, DrawerLayout.h());
        a = context.getInt(0, 0);
        context.recycle();
    }

    public ol(android.view.ViewGroup.LayoutParams layoutparams)
    {
        super(layoutparams);
        a = 0;
    }

    public ol(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
        super(marginlayoutparams);
        a = 0;
    }

    public ol(ol ol1)
    {
        super(ol1);
        a = 0;
        a = ol1.a;
    }
}
