// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

class su extends sv
{

    final Context a;
    Map b;
    Map c;

    su(Context context, Object obj)
    {
        super(obj);
        a = context;
    }

    final MenuItem a(MenuItem menuitem)
    {
        if (menuitem instanceof fs)
        {
            fs fs1 = (fs)menuitem;
            if (b == null)
            {
                b = new gz();
            }
            MenuItem menuitem1 = (MenuItem)b.get(menuitem);
            menuitem = menuitem1;
            if (menuitem1 == null)
            {
                menuitem = g.a(a, fs1);
                b.put(fs1, menuitem);
            }
            return menuitem;
        } else
        {
            return menuitem;
        }
    }

    final SubMenu a(SubMenu submenu)
    {
label0:
        {
label1:
            {
                if (!(submenu instanceof ft))
                {
                    break label0;
                }
                ft ft1 = (ft)submenu;
                if (c == null)
                {
                    c = new gz();
                }
                SubMenu submenu1 = (SubMenu)c.get(ft1);
                submenu = submenu1;
                if (submenu1 == null)
                {
                    submenu = a;
                    if (android.os.Build.VERSION.SDK_INT < 14)
                    {
                        break label1;
                    }
                    submenu = new tt(submenu, ft1);
                    c.put(ft1, submenu);
                }
                return submenu;
            }
            throw new UnsupportedOperationException();
        }
        return submenu;
    }
}
