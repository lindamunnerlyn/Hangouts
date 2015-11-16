// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.ActionMenuView;
import android.view.MenuItem;

public final class wh
    implements tb
{

    final ActionMenuView a;

    public wh(ActionMenuView actionmenuview)
    {
        a = actionmenuview;
        super();
    }

    public void a(ta ta)
    {
        if (a.a != null)
        {
            a.a.a(ta);
        }
    }

    public boolean a(ta ta, MenuItem menuitem)
    {
        return a.b != null && a.b.a(menuitem);
    }
}
