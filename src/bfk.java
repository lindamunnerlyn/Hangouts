// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;

final class bfk
    implements android.view.MenuItem.OnMenuItemClickListener
{

    final bfd a;

    bfk(bfd bfd1)
    {
        a = bfd1;
        super();
    }

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        if (menuitem == a.t)
        {
            a.o.a(a.f);
            return true;
        }
        if (menuitem == a.v)
        {
            a.p.a(a.f);
            return true;
        }
        if (menuitem == a.u)
        {
            a.q.a(a.f);
            return true;
        }
        if (menuitem == a.w)
        {
            a.r.a(a.f);
            return true;
        }
        if (menuitem == a.x)
        {
            a.s.a(a.f);
            return true;
        } else
        {
            return false;
        }
    }
}
