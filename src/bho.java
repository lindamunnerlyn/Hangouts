// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

public final class bho extends aux
{

    public bho(View view, dvi dvi)
    {
        super(view, null, dvi);
    }

    protected boolean a()
    {
        if (g.a(g.nU, "babel_network_change_notification", false))
        {
            cdr cdr1 = (cdr)hlp.a(b.getContext(), cdr);
            return cdr1 != null && cdr1.a() == cdq.c;
        } else
        {
            return false;
        }
    }

    protected dvg b()
    {
        return e().a(b.getResources().getString(l.S)).a();
    }
}
