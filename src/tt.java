// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class tt extends tr
    implements SubMenu
{

    public tt(Context context, ft ft1)
    {
        super(context, ft1);
    }

    public void clearHeader()
    {
        ((ft)d).clearHeader();
    }

    public MenuItem getItem()
    {
        return a(((ft)d).getItem());
    }

    public SubMenu setHeaderIcon(int i)
    {
        ((ft)d).setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable)
    {
        ((ft)d).setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i)
    {
        ((ft)d).setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charsequence)
    {
        ((ft)d).setHeaderTitle(charsequence);
        return this;
    }

    public SubMenu setHeaderView(View view)
    {
        ((ft)d).setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i)
    {
        ((ft)d).setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable)
    {
        ((ft)d).setIcon(drawable);
        return this;
    }
}
