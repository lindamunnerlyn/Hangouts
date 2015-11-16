// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;

final class ti extends sv
    implements android.view.MenuItem.OnMenuItemClickListener
{

    final te a;

    ti(te te1, android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        a = te1;
        super(onmenuitemclicklistener);
    }

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        return ((android.view.MenuItem.OnMenuItemClickListener)d).onMenuItemClick(a.a(menuitem));
    }
}
