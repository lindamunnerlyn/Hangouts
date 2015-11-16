// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

public final class blc extends aug
{

    public blc(View view, bld bld1, dsp dsp)
    {
        super(view, bld1, dsp);
    }

    protected boolean a()
    {
        if (g.a(g.nS, "babel_network_change_notification", false))
        {
            return ((bld)c).x() && !((bld)c).y();
        } else
        {
            return false;
        }
    }

    protected dsn b()
    {
        return e().a(b.getResources().getString(l.gR)).a();
    }
}
