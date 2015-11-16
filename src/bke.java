// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

public final class bke extends aug
{

    public bke(View view, bkf bkf1, dsp dsp)
    {
        super(view, bkf1, dsp);
    }

    protected boolean a()
    {
        boolean flag = false;
        if (g.a(g.nS, "babel_gcm_change_notification", false))
        {
            flag = ((bkf)c).w();
        }
        return flag;
    }

    protected dsn b()
    {
        return e().a(b.getResources().getString(l.cl)).a();
    }
}
