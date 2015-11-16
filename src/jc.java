// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;
import android.view.View;

class jc
    implements je
{

    jc()
    {
    }

    public MenuItem a(MenuItem menuitem, View view)
    {
        return menuitem.setActionView(view);
    }

    public View a(MenuItem menuitem)
    {
        return menuitem.getActionView();
    }

    public void a(MenuItem menuitem, int i)
    {
        menuitem.setShowAsAction(i);
    }

    public MenuItem b(MenuItem menuitem, int i)
    {
        return menuitem.setActionView(i);
    }

    public boolean b(MenuItem menuitem)
    {
        return false;
    }

    public boolean c(MenuItem menuitem)
    {
        return false;
    }
}
