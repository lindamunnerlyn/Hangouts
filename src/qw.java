// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;

class qw extends sr
{

    final qu a;

    qw(qu qu1, android.view.Window.Callback callback)
    {
        a = qu1;
        super(callback);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return a.a(keyevent) || super.dispatchKeyEvent(keyevent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyevent)
    {
        return super.dispatchKeyShortcutEvent(keyevent) || a.a(keyevent.getKeyCode(), keyevent);
    }

    public void onContentChanged()
    {
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        if (i == 0 && !(menu instanceof ta))
        {
            return false;
        } else
        {
            return super.onCreatePanelMenu(i, menu);
        }
    }

    public boolean onMenuOpened(int i, Menu menu)
    {
        return super.onMenuOpened(i, menu) || a.d(i);
    }

    public void onPanelClosed(int i, Menu menu)
    {
        super.onPanelClosed(i, menu);
        a.c(i);
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        ta ta1;
        boolean flag;
        if (menu instanceof ta)
        {
            ta1 = (ta)menu;
        } else
        {
            ta1 = null;
        }
        if (i == 0 && ta1 == null)
        {
            flag = false;
        } else
        {
            if (ta1 != null)
            {
                ta1.c(true);
            }
            boolean flag1 = super.onPreparePanel(i, view, menu);
            flag = flag1;
            if (ta1 != null)
            {
                ta1.c(false);
                return flag1;
            }
        }
        return flag;
    }
}
