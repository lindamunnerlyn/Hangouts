// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

public final class bfh extends aug
{

    private int d;

    public bfh(View view, bfi bfi1, dsp dsp)
    {
        super(view, bfi1, dsp);
    }

    protected boolean a()
    {
        return ((bfi)c).t() && !g.a(coy.b);
    }

    protected dsn b()
    {
        if (g.e(((bfi)c).d()))
        {
            d = l.D;
        } else
        {
            d = l.C;
        }
        g.b(coy.b);
        return e().a(b.getResources().getString(d)).a();
    }
}
