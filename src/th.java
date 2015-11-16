// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;

final class th extends sv
    implements jf
{

    final te a;

    th(te te1, android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        a = te1;
        super(onactionexpandlistener);
    }

    public boolean a(MenuItem menuitem)
    {
        return ((android.view.MenuItem.OnActionExpandListener)d).onMenuItemActionExpand(a.a(menuitem));
    }

    public boolean b(MenuItem menuitem)
    {
        return ((android.view.MenuItem.OnActionExpandListener)d).onMenuItemActionCollapse(a.a(menuitem));
    }
}
