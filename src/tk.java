// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;

final class tk extends sx
    implements android.view.MenuItem.OnMenuItemClickListener
{

    final tg a;

    tk(tg tg1, android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        a = tg1;
        super(onmenuitemclicklistener);
    }

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        return ((android.view.MenuItem.OnMenuItemClickListener)d).onMenuItemClick(a.a(menuitem));
    }
}
