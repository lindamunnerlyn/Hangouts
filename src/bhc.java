// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

public final class bhc extends aug
{

    public bhc(View view, dsp dsp)
    {
        super(view, null, dsp);
    }

    protected boolean a()
    {
        if (g.a(g.nS, "babel_network_change_notification", false))
        {
            ccm ccm1 = (ccm)hgx.a(b.getContext(), ccm);
            return ccm1 != null && ccm1.a() == ccl.c;
        } else
        {
            return false;
        }
    }

    protected dsn b()
    {
        return e().a(b.getResources().getString(l.V)).a();
    }
}
