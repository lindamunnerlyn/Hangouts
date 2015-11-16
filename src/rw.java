// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;

final class rw
    implements sz
{

    final rs a;

    rw(rs rs1)
    {
        a = rs1;
        super();
    }

    public void a(sy sy)
    {
        if (a.c != null)
        {
            if (a.a.f())
            {
                a.c.onPanelClosed(108, sy);
            } else
            if (a.c.onPreparePanel(0, null, sy))
            {
                a.c.onMenuOpened(108, sy);
                return;
            }
        }
    }

    public boolean a(sy sy, MenuItem menuitem)
    {
        return false;
    }
}
