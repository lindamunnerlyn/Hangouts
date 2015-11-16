// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class bvp
    implements brp
{

    public bvp()
    {
    }

    public brd a(Context context, gjr gjr1)
    {
        gbh.b(gjr1);
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutparams.addRule(12);
        layoutparams.addRule(11);
        context = new bra(context, g.mu, layoutparams, gjr1.d());
        context.a(new bvq(this, context));
        return context;
    }
}
