// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

public final class bkq extends aux
{

    public bkq(View view, bkr bkr1, dvi dvi)
    {
        super(view, bkr1, dvi);
    }

    protected boolean a()
    {
        boolean flag = false;
        if (g.a(g.nU, "babel_gcm_change_notification", false))
        {
            flag = ((bkr)c).x();
        }
        return flag;
    }

    protected dvg b()
    {
        return e().a(b.getResources().getString(l.cc)).a();
    }
}
