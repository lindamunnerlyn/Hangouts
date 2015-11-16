// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public final class zv
    implements wg
{

    final Toolbar a;

    public zv(Toolbar toolbar)
    {
        a = toolbar;
        super();
    }

    public boolean a(MenuItem menuitem)
    {
        if (Toolbar.a(a) != null)
        {
            return Toolbar.a(a).a(menuitem);
        } else
        {
            return false;
        }
    }
}
