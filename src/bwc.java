// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class bwc
    implements bry
{

    public bwc()
    {
    }

    public brm a(Context context, gmt gmt1)
    {
        gdv.b("Expected non-null", gmt1);
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutparams.addRule(12);
        layoutparams.addRule(11);
        context = new brj(context, g.mi, layoutparams, gmt1.d());
        context.a(new bwd(this, context));
        return context;
    }
}
