// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

public final class bgc extends aux
{

    dvn d;

    public bgc(View view, bge bge1, dvi dvi)
    {
        super(view, bge1, dvi);
        d = new bgd(this);
    }

    protected boolean a()
    {
        return ((bge)c).f() > 0;
    }

    protected dvg b()
    {
        g.a(dcn.e(((gqu)hlp.a(b.getContext(), gqu)).a()), 1814);
        dvh dvh1 = e();
        Resources resources = b.getResources();
        if (((bge)c).f() == 1)
        {
            dvh1.a(resources.getString(l.G, new Object[] {
                ((bge)c).q().e
            }));
            dvh1.c(resources.getString(l.iP));
            dvh1.a(d);
        } else
        {
            dvh1.a(resources.getString(l.E, new Object[] {
                Integer.valueOf(((bge)c).f())
            }));
        }
        return dvh1.a();
    }
}
