// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;
import com.google.android.apps.hangouts.floatingactionbutton.impl.QuickContactView;

final class beo
    implements android.view.MenuItem.OnMenuItemClickListener
{

    final ben a;

    beo(ben ben1)
    {
        a = ben1;
        super();
    }

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        boolean flag1 = true;
        menuitem = ben.b(a);
        boolean flag;
        if (ben.a(a).getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menuitem.setVisible(flag);
        ben.b(a).setTitle(ben.a(a).a());
        menuitem = ben.d(a);
        if (ben.c(a).getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menuitem.setVisible(flag);
        ben.d(a).setTitle(ben.c(a).a());
        menuitem = ben.f(a);
        if (ben.e(a).getVisibility() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        menuitem.setVisible(flag);
        ben.f(a).setTitle(ben.e(a).a());
        return false;
    }
}
