// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

final class bvw
    implements bvu, cpl
{

    private int a;

    bvw()
    {
    }

    static int a(bvw bvw1)
    {
        int i = bvw1.a + 1;
        bvw1.a = i;
        return i;
    }

    static int b(bvw bvw1)
    {
        int i = bvw1.a - 1;
        bvw1.a = i;
        return i;
    }

    public void a(Menu menu)
    {
        if (a > 0)
        {
            menu.removeItem(g.mw);
        }
    }

    public void a(MenuInflater menuinflater, Menu menu)
    {
        menuinflater.inflate(g.mz, menu);
    }

    public void a(hjm hjm1)
    {
        hjm1.a(new bvx(this));
    }

    public boolean a(Activity activity, MenuItem menuitem)
    {
        if (menuitem.getItemId() == g.mw)
        {
            bwa.a(activity);
            return true;
        } else
        {
            return false;
        }
    }
}
