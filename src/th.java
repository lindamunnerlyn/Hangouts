// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

class th extends hz
{

    final ActionProvider a;
    final tg b;

    public th(tg tg1, Context context, ActionProvider actionprovider)
    {
        b = tg1;
        super(context);
        a = actionprovider;
    }

    public View a()
    {
        return a.onCreateActionView();
    }

    public void a(SubMenu submenu)
    {
        a.onPrepareSubMenu(b.a(submenu));
    }

    public boolean d()
    {
        return a.onPerformDefaultAction();
    }

    public boolean e()
    {
        return a.hasSubMenu();
    }
}
