// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class akz extends ea
{

    private Context f;
    private int g;
    private ajr h;

    public akz(Context context, ajr ajr)
    {
        super(context);
        f = context;
        g = ((gmo)hgx.a(context, gmo)).a();
        h = ajr;
    }

    public Object d()
    {
        if (g.a(f, g))
        {
            return ajq.a(f, g, h);
        } else
        {
            return null;
        }
    }
}
