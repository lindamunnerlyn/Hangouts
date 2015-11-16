// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

public final class bfq extends aug
{

    dsu d;

    public bfq(View view, bfs bfs1, dsp dsp)
    {
        super(view, bfs1, dsp);
        d = new bfr(this);
    }

    protected boolean a()
    {
        return ((bfs)c).f() > 0;
    }

    protected dsn b()
    {
        g.a(dbf.e(((gmo)hgx.a(b.getContext(), gmo)).a()), 1814);
        dso dso1 = e();
        Resources resources = b.getResources();
        if (((bfs)c).f() == 1)
        {
            dso1.a(resources.getString(l.J, new Object[] {
                ((bfs)c).q().e
            }));
            dso1.c(resources.getString(l.jw));
            dso1.a(d);
        } else
        {
            dso1.a(resources.getString(l.H, new Object[] {
                Integer.valueOf(((bfs)c).f())
            }));
        }
        return dso1.a();
    }
}
