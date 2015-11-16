// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

public final class sj
    implements vs
{

    final android.view.ActionMode.Callback a;
    final Context b;
    final ArrayList c = new ArrayList();
    final hm d = new hm();

    public sj(Context context, android.view.ActionMode.Callback callback)
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

    public void a(vr vr)
    {
        a.onDestroyActionMode(b(vr));
    }

    public boolean a(vr vr, Menu menu)
    {
        return a.onCreateActionMode(b(vr), a(menu));
    }

    public boolean a(vr vr, MenuItem menuitem)
    {
        return a.onActionItemClicked(b(vr), g.a(b, (fs)menuitem));
    }

    public ActionMode b(vr vr)
    {
        int j = c.size();
        for (int i = 0; i < j; i++)
        {
            si si1 = (si)c.get(i);
            if (si1 != null && si1.b == vr)
            {
                return si1;
            }
        }

        vr = new si(b, vr);
        c.add(vr);
        return vr;
    }

    public boolean b(vr vr, Menu menu)
    {
        return a.onPrepareActionMode(b(vr), a(menu));
    }
}
