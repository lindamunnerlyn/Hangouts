// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

final class ri
    implements vs
{

    final ra a;
    private vs b;

    public ri(ra ra1, vs vs1)
    {
        a = ra1;
        super();
        b = vs1;
    }

    public void a(vr vr)
    {
        b.a(vr);
        if (a.q != null)
        {
            a.b.getDecorView().removeCallbacks(a.r);
        }
        if (a.p != null)
        {
            a.m();
            a.s = kb.o(a.p).a(0.0F);
            a.s.a(new rj(this));
        }
        if (a.e != null)
        {
            a.e.b(a.o);
        }
        a.o = null;
    }

    public boolean a(vr vr, Menu menu)
    {
        return b.a(vr, menu);
    }

    public boolean a(vr vr, MenuItem menuitem)
    {
        return b.a(vr, menuitem);
    }

    public boolean b(vr vr, Menu menu)
    {
        return b.b(vr, menu);
    }
}
