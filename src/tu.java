// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class tu extends ta
    implements SubMenu
{

    private ta d;
    private te e;

    public tu(Context context, ta ta1, te te1)
    {
        super(context);
        d = ta1;
        e = te1;
    }

    public void a(tb tb)
    {
        d.a(tb);
    }

    boolean a(ta ta1, MenuItem menuitem)
    {
        return super.a(ta1, menuitem) || d.a(ta1, menuitem);
    }

    public boolean a(te te1)
    {
        return d.a(te1);
    }

    public String b()
    {
        int i;
        if (e != null)
        {
            i = e.getItemId();
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            return null;
        } else
        {
            return (new StringBuilder()).append(super.b()).append(":").append(i).toString();
        }
    }

    public boolean b(te te1)
    {
        return d.b(te1);
    }

    public boolean c()
    {
        return d.c();
    }

    public boolean d()
    {
        return d.d();
    }

    public MenuItem getItem()
    {
        return e;
    }

    public ta r()
    {
        return d;
    }

    public SubMenu setHeaderIcon(int i)
    {
        super.a(ef.a(e(), i));
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable)
    {
        super.a(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i)
    {
        super.a(e().getResources().getString(i));
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charsequence)
    {
        super.a(charsequence);
        return this;
    }

    public SubMenu setHeaderView(View view)
    {
        super.a(view);
        return this;
    }

    public SubMenu setIcon(int i)
    {
        e.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable)
    {
        e.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean flag)
    {
        d.setQwertyMode(flag);
    }

    public Menu u()
    {
        return d;
    }
}
