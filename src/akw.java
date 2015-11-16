// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class akw extends ea
{

    private Context f;
    private int g;
    private ajo h;

    public akw(Context context, ajo ajo)
    {
        super(context);
        f = context;
        g = ((gqu)hlp.a(context, gqu)).a();
        h = ajo;
    }

    public Object d()
    {
        if (g.a(f, g))
        {
            return ajn.a(f, g, h);
        } else
        {
            return null;
        }
    }
}
