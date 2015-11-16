// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

public class tg extends sw
    implements MenuItem
{

    private Method e;

    public tg(Context context, fs fs1)
    {
        super(context, fs1);
    }

    th a(ActionProvider actionprovider)
    {
        return new th(this, a, actionprovider);
    }

    public void a()
    {
        try
        {
            if (e == null)
            {
                e = ((fs)d).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] {
                    Boolean.TYPE
                });
            }
            e.invoke(d, new Object[] {
                Boolean.valueOf(true)
            });
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public boolean collapseActionView()
    {
        return ((fs)d).collapseActionView();
    }

    public boolean expandActionView()
    {
        return ((fs)d).expandActionView();
    }

    public ActionProvider getActionProvider()
    {
        hz hz = ((fs)d).a();
        if (hz instanceof th)
        {
            return ((th)hz).a;
        } else
        {
            return null;
        }
    }

    public View getActionView()
    {
        View view1 = ((fs)d).getActionView();
        View view = view1;
        if (view1 instanceof ti)
        {
            view = ((ti)view1).c();
        }
        return view;
    }

    public char getAlphabeticShortcut()
    {
        return ((fs)d).getAlphabeticShortcut();
    }

    public int getGroupId()
    {
        return ((fs)d).getGroupId();
    }

    public Drawable getIcon()
    {
        return ((fs)d).getIcon();
    }

    public Intent getIntent()
    {
        return ((fs)d).getIntent();
    }

    public int getItemId()
    {
        return ((fs)d).getItemId();
    }

    public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
        return ((fs)d).getMenuInfo();
    }

    public char getNumericShortcut()
    {
        return ((fs)d).getNumericShortcut();
    }

    public int getOrder()
    {
        return ((fs)d).getOrder();
    }

    public SubMenu getSubMenu()
    {
        return a(((fs)d).getSubMenu());
    }

    public CharSequence getTitle()
    {
        return ((fs)d).getTitle();
    }

    public CharSequence getTitleCondensed()
    {
        return ((fs)d).getTitleCondensed();
    }

    public boolean hasSubMenu()
    {
        return ((fs)d).hasSubMenu();
    }

    public boolean isActionViewExpanded()
    {
        return ((fs)d).isActionViewExpanded();
    }

    public boolean isCheckable()
    {
        return ((fs)d).isCheckable();
    }

    public boolean isChecked()
    {
        return ((fs)d).isChecked();
    }

    public boolean isEnabled()
    {
        return ((fs)d).isEnabled();
    }

    public boolean isVisible()
    {
        return ((fs)d).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionprovider)
    {
        fs fs1 = (fs)d;
        if (actionprovider != null)
        {
            actionprovider = a(actionprovider);
        } else
        {
            actionprovider = null;
        }
        fs1.a(actionprovider);
        return this;
    }

    public MenuItem setActionView(int i)
    {
        ((fs)d).setActionView(i);
        View view = ((fs)d).getActionView();
        if (view instanceof CollapsibleActionView)
        {
            ((fs)d).setActionView(new ti(view));
        }
        return this;
    }

    public MenuItem setActionView(View view)
    {
        Object obj = view;
        if (view instanceof CollapsibleActionView)
        {
            obj = new ti(view);
        }
        ((fs)d).setActionView(((View) (obj)));
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c)
    {
        ((fs)d).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean flag)
    {
        ((fs)d).setCheckable(flag);
        return this;
    }

    public MenuItem setChecked(boolean flag)
    {
        ((fs)d).setChecked(flag);
        return this;
    }

    public MenuItem setEnabled(boolean flag)
    {
        ((fs)d).setEnabled(flag);
        return this;
    }

    public MenuItem setIcon(int i)
    {
        ((fs)d).setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable)
    {
        ((fs)d).setIcon(drawable);
        return this;
    }

    public MenuItem setIntent(Intent intent)
    {
        ((fs)d).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c)
    {
        ((fs)d).setNumericShortcut(c);
        return this;
    }

    public MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        fs fs1 = (fs)d;
        if (onactionexpandlistener != null)
        {
            onactionexpandlistener = new tj(this, onactionexpandlistener);
        } else
        {
            onactionexpandlistener = null;
        }
        fs1.a(onactionexpandlistener);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        fs fs1 = (fs)d;
        if (onmenuitemclicklistener != null)
        {
            onmenuitemclicklistener = new tk(this, onmenuitemclicklistener);
        } else
        {
            onmenuitemclicklistener = null;
        }
        fs1.setOnMenuItemClickListener(onmenuitemclicklistener);
        return this;
    }

    public MenuItem setShortcut(char c, char c1)
    {
        ((fs)d).setShortcut(c, c1);
        return this;
    }

    public void setShowAsAction(int i)
    {
        ((fs)d).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i)
    {
        ((fs)d).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i)
    {
        ((fs)d).setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charsequence)
    {
        ((fs)d).setTitle(charsequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charsequence)
    {
        ((fs)d).setTitleCondensed(charsequence);
        return this;
    }

    public MenuItem setVisible(boolean flag)
    {
        return ((fs)d).setVisible(flag);
    }
}
