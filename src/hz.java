// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class hz
{

    private final Context a;
    private ia b;
    private ib c;

    public hz(Context context)
    {
        a = context;
    }

    public abstract View a();

    public View a(MenuItem menuitem)
    {
        return a();
    }

    public void a(SubMenu submenu)
    {
    }

    public void a(ia ia1)
    {
        b = ia1;
    }

    public void a(ib ib)
    {
        if (c != null)
        {
            (new StringBuilder("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ")).append(getClass().getSimpleName()).append(" instance while it is still in use somewhere else?");
        }
        c = ib;
    }

    public void a(boolean flag)
    {
        if (b != null)
        {
            b.a(flag);
        }
    }

    public boolean b()
    {
        return false;
    }

    public boolean c()
    {
        return true;
    }

    public boolean d()
    {
        return false;
    }

    public boolean e()
    {
        return false;
    }

    public void f()
    {
        c = null;
        b = null;
    }
}
