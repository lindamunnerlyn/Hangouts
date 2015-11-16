// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;

final class rw
    implements wi
{

    final ru a;

    rw(ru ru1)
    {
        a = ru1;
        super();
    }

    public boolean a(MenuItem menuitem)
    {
        return a.c.onMenuItemSelected(0, menuitem);
    }
}
