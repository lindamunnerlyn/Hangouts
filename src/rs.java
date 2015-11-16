// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public final class rs extends po
{

    ut a;
    boolean b;
    android.view.Window.Callback c;
    sw d;
    private boolean e;
    private boolean f;
    private ArrayList g;
    private final Runnable h = new rt(this);
    private final wg i = new ru(this);

    public rs(Toolbar toolbar, CharSequence charsequence, android.view.Window.Callback callback)
    {
        g = new ArrayList();
        a = new vl(toolbar, false);
        c = new ry(this, callback);
        a.a(c);
        toolbar.a(i);
        a.a(charsequence);
    }

    private void a(int i1, int j1)
    {
        int k1 = a.l();
        a.a(k1 & ~j1 | i1 & j1);
    }

    private Menu m()
    {
        if (!e)
        {
            a.a(new rv(this), new rw(this));
            e = true;
        }
        return a.o();
    }

    public void a()
    {
        a(0, 8);
    }

    public void a(float f1)
    {
        kb.f(a.a(), f1);
    }

    public void a(int i1)
    {
        ut ut1 = a;
        CharSequence charsequence;
        if (i1 != 0)
        {
            charsequence = a.b().getText(i1);
        } else
        {
            charsequence = null;
        }
        ut1.b(charsequence);
    }

    public void a(Configuration configuration)
    {
        super.a(configuration);
    }

    public void a(Drawable drawable)
    {
        a.a(drawable);
    }

    public void a(View view)
    {
        pp pp1 = new pp(-2, -2);
        if (view != null)
        {
            view.setLayoutParams(pp1);
        }
        a.a(view);
    }

    public void a(CharSequence charsequence)
    {
        a.b(charsequence);
    }

    public void a(pq pq1)
    {
        g.add(pq1);
    }

    public void a(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        a(byte0, 4);
    }

    public boolean a(int i1, KeyEvent keyevent)
    {
        Menu menu = m();
        if (menu != null)
        {
            int j1;
            boolean flag;
            if (keyevent != null)
            {
                j1 = keyevent.getDeviceId();
            } else
            {
                j1 = -1;
            }
            if (KeyCharacterMap.load(j1).getKeyboardType() != 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            menu.setQwertyMode(flag);
            menu.performShortcut(i1, keyevent, 0);
        }
        return true;
    }

    public void b()
    {
        a(16, 16);
    }

    public void b(int i1)
    {
        a.b(i1);
    }

    public void b(CharSequence charsequence)
    {
        a.c(charsequence);
    }

    public void b(boolean flag)
    {
    }

    public View c()
    {
        return a.n();
    }

    public void c(int i1)
    {
        a.c(i1);
    }

    public void c(CharSequence charsequence)
    {
        a.a(charsequence);
    }

    public void c(boolean flag)
    {
    }

    public int d()
    {
        return a.l();
    }

    public void d(boolean flag)
    {
        if (flag != f)
        {
            f = flag;
            int j1 = g.size();
            int i1 = 0;
            while (i1 < j1) 
            {
                ((pq)g.get(i1)).a(flag);
                i1++;
            }
        }
    }

    public void e()
    {
        a.d(0);
    }

    public void f()
    {
        a.d(8);
    }

    public Context g()
    {
        return a.b();
    }

    public boolean i()
    {
        a.a().removeCallbacks(h);
        kb.a(a.a(), h);
        return true;
    }

    public boolean j()
    {
        if (a.c())
        {
            a.d();
            return true;
        } else
        {
            return false;
        }
    }

    public android.view.Window.Callback k()
    {
        return c;
    }

    void l()
    {
        sy sy1;
        Menu menu = m();
        if (menu instanceof sy)
        {
            sy1 = (sy)menu;
        } else
        {
            sy1 = null;
        }
        if (sy1 != null)
        {
            sy1.g();
        }
        menu.clear();
        if (!c.onCreatePanelMenu(0, menu) || !c.onPreparePanel(0, null, menu))
        {
            menu.clear();
        }
        if (sy1 != null)
        {
            sy1.h();
        }
        return;
        Exception exception;
        exception;
        if (sy1 != null)
        {
            sy1.h();
        }
        throw exception;
    }
}
