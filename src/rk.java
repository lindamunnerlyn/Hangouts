// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

final class rk
    implements vu
{

    final rc a;
    private vu b;

    public rk(rc rc1, vu vu1)
    {
        a = rc1;
        super();
        b = vu1;
    }

    public void a(vt vt)
    {
        b.a(vt);
        if (a.q != null)
        {
            a.b.getDecorView().removeCallbacks(a.r);
        }
        if (a.p != null)
        {
            a.m();
            a.s = kb.p(a.p).a(0.0F);
            a.s.a(new rl(this));
        }
        if (a.e != null)
        {
            a.e.b(a.o);
        }
        a.o = null;
    }

    public boolean a(vt vt, Menu menu)
    {
        return b.a(vt, menu);
    }

    public boolean a(vt vt, MenuItem menuitem)
    {
        return b.a(vt, menuitem);
    }

    public boolean b(vt vt, Menu menu)
    {
        return b.b(vt, menu);
    }
}
