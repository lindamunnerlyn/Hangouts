// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;
import android.view.View;

public final class ja
{

    static final je a;

    public static MenuItem a(MenuItem menuitem, View view)
    {
        if (menuitem instanceof fs)
        {
            return ((fs)menuitem).setActionView(view);
        } else
        {
            return a.a(menuitem, view);
        }
    }

    public static MenuItem a(MenuItem menuitem, hz hz)
    {
        Object obj = menuitem;
        if (menuitem instanceof fs)
        {
            obj = ((fs)menuitem).a(hz);
        }
        return ((MenuItem) (obj));
    }

    public static View a(MenuItem menuitem)
    {
        if (menuitem instanceof fs)
        {
            return ((fs)menuitem).getActionView();
        } else
        {
            return a.a(menuitem);
        }
    }

    public static void a(MenuItem menuitem, int i)
    {
        if (menuitem instanceof fs)
        {
            ((fs)menuitem).setShowAsAction(i);
            return;
        } else
        {
            a.a(menuitem, i);
            return;
        }
    }

    public static MenuItem b(MenuItem menuitem, int i)
    {
        if (menuitem instanceof fs)
        {
            return ((fs)menuitem).setActionView(i);
        } else
        {
            return a.b(menuitem, i);
        }
    }

    public static boolean b(MenuItem menuitem)
    {
        if (menuitem instanceof fs)
        {
            return ((fs)menuitem).expandActionView();
        } else
        {
            return a.b(menuitem);
        }
    }

    public static boolean c(MenuItem menuitem)
    {
        if (menuitem instanceof fs)
        {
            return ((fs)menuitem).isActionViewExpanded();
        } else
        {
            return a.c(menuitem);
        }
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 14)
        {
            a = new jd();
        } else
        if (i >= 11)
        {
            a = new jc();
        } else
        {
            a = new jb();
        }
    }
}
