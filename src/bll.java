// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

public final class bll extends aux
{

    public bll(View view, blm blm1, dvi dvi)
    {
        super(view, blm1, dvi);
    }

    protected boolean a()
    {
        if (g.a(g.nU, "babel_network_change_notification", false))
        {
            return ((blm)c).y() && !((blm)c).z();
        } else
        {
            return false;
        }
    }

    protected dvg b()
    {
        return e().a(b.getResources().getString(l.gA)).a();
    }
}
