// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;

final class bev
    implements android.view.MenuItem.OnMenuItemClickListener
{

    final ben a;

    bev(ben ben1)
    {
        a = ben1;
        super();
    }

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        if (menuitem == ben.b(a))
        {
            ben.s(a).onClick(ben.a(a));
            return true;
        }
        if (menuitem == ben.d(a))
        {
            ben.s(a).onClick(ben.c(a));
            return true;
        }
        if (menuitem == ben.f(a))
        {
            ben.s(a).onClick(ben.e(a));
            return true;
        }
        if (menuitem == ben.t(a))
        {
            ben.u(a).a(ben.r(a));
            return true;
        }
        if (menuitem == ben.v(a))
        {
            ben.w(a).a(ben.r(a));
            return true;
        }
        if (menuitem == ben.x(a))
        {
            ben.y(a).a(ben.r(a));
            return true;
        }
        if (menuitem == ben.z(a))
        {
            ben.A(a).a(ben.r(a));
            return true;
        }
        if (menuitem == ben.B(a))
        {
            ben.C(a).a(ben.r(a));
            return true;
        } else
        {
            return false;
        }
    }
}
