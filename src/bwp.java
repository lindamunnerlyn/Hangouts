// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

final class bwp
    implements bwn, crc
{

    int a;

    bwp()
    {
    }

    public void a(Menu menu)
    {
        if (a > 0)
        {
            menu.removeItem(g.mk);
        }
    }

    public void a(MenuInflater menuinflater, Menu menu)
    {
        menuinflater.inflate(g.mn, menu);
    }

    public void a(hof hof1)
    {
        hof1.a(new bwq(this));
    }

    public boolean a(Activity activity, MenuItem menuitem)
    {
        if (menuitem.getItemId() == g.mk)
        {
            bwt.a(activity);
            return true;
        } else
        {
            return false;
        }
    }
}
