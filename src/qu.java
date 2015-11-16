// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;

class qu extends sp
{

    final qs a;

    qu(qs qs1, android.view.Window.Callback callback)
    {
        a = qs1;
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
        if (i == 0 && !(menu instanceof sy))
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
        sy sy1;
        boolean flag;
        if (menu instanceof sy)
        {
            sy1 = (sy)menu;
        } else
        {
            sy1 = null;
        }
        if (i == 0 && sy1 == null)
        {
            flag = false;
        } else
        {
            if (sy1 != null)
            {
                sy1.c(true);
            }
            boolean flag1 = super.onPreparePanel(i, view, menu);
            flag = flag1;
            if (sy1 != null)
            {
                sy1.c(false);
                return flag1;
            }
        }
        return flag;
    }
}
