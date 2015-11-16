// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

public final class sl
    implements vu
{

    final android.view.ActionMode.Callback a;
    final Context b;
    final ArrayList c = new ArrayList();
    final hm d = new hm();

    public sl(Context context, android.view.ActionMode.Callback callback)
    {
        b = context;
        a = callback;
    }

    private Menu a(Menu menu)
    {
        Menu menu2 = (Menu)d.get(menu);
        Menu menu1 = menu2;
        if (menu2 == null)
        {
            menu1 = g.a(b, (fr)menu);
            d.put(menu, menu1);
        }
        return menu1;
    }

    public void a(vt vt)
    {
        a.onDestroyActionMode(b(vt));
    }

    public boolean a(vt vt, Menu menu)
    {
        return a.onCreateActionMode(b(vt), a(menu));
    }

    public boolean a(vt vt, MenuItem menuitem)
    {
        return a.onActionItemClicked(b(vt), g.a(b, (fs)menuitem));
    }

    public ActionMode b(vt vt)
    {
        int j = c.size();
        for (int i = 0; i < j; i++)
        {
            sk sk1 = (sk)c.get(i);
            if (sk1 != null && sk1.b == vt)
            {
                return sk1;
            }
        }

        vt = new sk(b, vt);
        c.add(vt);
        return vt;
    }

    public boolean b(vt vt, Menu menu)
    {
        return a.onPrepareActionMode(b(vt), a(menu));
    }
}
