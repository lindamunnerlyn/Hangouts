// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;

final class ry
    implements tb
{

    final ru a;

    ry(ru ru1)
    {
        a = ru1;
        super();
    }

    public void a(ta ta)
    {
        if (a.c != null)
        {
            if (a.a.f())
            {
                a.c.onPanelClosed(108, ta);
            } else
            if (a.c.onPreparePanel(0, null, ta))
            {
                a.c.onMenuOpened(108, ta);
                return;
            }
        }
    }

    public boolean a(ta ta, MenuItem menuitem)
    {
        return false;
    }
}
