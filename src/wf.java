// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.ActionMenuView;
import android.view.MenuItem;

public final class wf
    implements sz
{

    final ActionMenuView a;

    public wf(ActionMenuView actionmenuview)
    {
        a = actionmenuview;
        super();
    }

    public void a(sy sy)
    {
        if (ActionMenuView.b(a) != null)
        {
            ActionMenuView.b(a).a(sy);
        }
    }

    public boolean a(sy sy, MenuItem menuitem)
    {
        return ActionMenuView.a(a) != null && ActionMenuView.a(a).a(menuitem);
    }
}
