// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

final class tm extends th
    implements android.view.ActionProvider.VisibilityListener
{

    ib c;
    final tl d;

    public tm(tl tl, Context context, ActionProvider actionprovider)
    {
        d = tl;
        super(tl, context, actionprovider);
    }

    public View a(MenuItem menuitem)
    {
        return a.onCreateActionView(menuitem);
    }

    public void a(ib ib1)
    {
        c = ib1;
        a.setVisibilityListener(this);
    }

    public boolean b()
    {
        return a.overridesItemVisibility();
    }

    public boolean c()
    {
        return a.isVisible();
    }

    public void onActionProviderVisibilityChanged(boolean flag)
    {
        if (c != null)
        {
            c.a();
        }
    }
}
