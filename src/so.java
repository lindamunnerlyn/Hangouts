// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

final class so
{

    hz a;
    final sm b;
    private Menu c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private CharSequence m;
    private CharSequence n;
    private int o;
    private char p;
    private char q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private String x;
    private String y;
    private String z;

    public so(sm sm1, Menu menu)
    {
        b = sm1;
        super();
        c = menu;
        a();
    }

    private static char a(String s1)
    {
        if (s1 == null)
        {
            return '\0';
        } else
        {
            return s1.charAt(0);
        }
    }

    private Object a(String s1, Class aclass[], Object aobj[])
    {
        try
        {
            s1 = sm.a(b).getClassLoader().loadClass(s1).getConstructor(aclass);
            s1.setAccessible(true);
            s1 = ((String) (s1.newInstance(aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        return s1;
    }

    private void a(MenuItem menuitem)
    {
        boolean flag = true;
        MenuItem menuitem1 = menuitem.setChecked(s).setVisible(t).setEnabled(u);
        boolean flag1;
        if (r > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        menuitem1.setCheckable(flag1).setTitleCondensed(n).setIcon(o).setAlphabeticShortcut(p).setNumericShortcut(q);
        if (v >= 0)
        {
            ja.a(menuitem, v);
        }
        if (z != null)
        {
            if (sm.a(b).isRestricted())
            {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            menuitem.setOnMenuItemClickListener(new sn(sm.c(b), z));
        }
        if (r >= 2)
        {
            if (menuitem instanceof te)
            {
                ((te)menuitem).a(true);
            } else
            if (menuitem instanceof tg)
            {
                ((tg)menuitem).a();
            }
        }
        if (x != null)
        {
            ja.a(menuitem, (View)a(x, sm.b(), sm.d(b)));
        } else
        {
            flag = false;
        }
        if (w > 0 && !flag)
        {
            ja.b(menuitem, w);
        }
        if (a != null)
        {
            ja.a(menuitem, a);
        }
    }

    public void a()
    {
        d = 0;
        e = 0;
        f = 0;
        g = 0;
        h = true;
        i = true;
    }

    public void a(AttributeSet attributeset)
    {
        attributeset = sm.a(b).obtainStyledAttributes(attributeset, rq.aC);
        d = attributeset.getResourceId(rq.aF, 0);
        e = attributeset.getInt(rq.aG, 0);
        f = attributeset.getInt(rq.aH, 0);
        g = attributeset.getInt(rq.aD, 0);
        h = attributeset.getBoolean(rq.aI, true);
        i = attributeset.getBoolean(rq.aE, true);
        attributeset.recycle();
    }

    public void b()
    {
        j = true;
        a(c.add(d, k, l, m));
    }

    public void b(AttributeSet attributeset)
    {
        boolean flag = true;
        attributeset = sm.a(b).obtainStyledAttributes(attributeset, rq.aJ);
        k = attributeset.getResourceId(rq.aS, 0);
        l = attributeset.getInt(rq.aT, e) & 0xffff0000 | attributeset.getInt(rq.aW, f) & 0xffff;
        m = attributeset.getText(rq.aX);
        n = attributeset.getText(rq.aY);
        o = attributeset.getResourceId(rq.aR, 0);
        p = a(attributeset.getString(rq.aN));
        q = a(attributeset.getString(rq.aU));
        int i1;
        if (attributeset.hasValue(rq.aO))
        {
            if (attributeset.getBoolean(rq.aO, false))
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            r = i1;
        } else
        {
            r = g;
        }
        s = attributeset.getBoolean(rq.aP, false);
        t = attributeset.getBoolean(rq.aZ, h);
        u = attributeset.getBoolean(rq.aQ, i);
        v = attributeset.getInt(rq.ba, -1);
        z = attributeset.getString(rq.aV);
        w = attributeset.getResourceId(rq.aK, 0);
        x = attributeset.getString(rq.aM);
        y = attributeset.getString(rq.aL);
        if (y != null)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        if (i1 != 0 && w == 0 && x == null)
        {
            a = (hz)a(y, sm.a(), sm.b(b));
        } else
        {
            a = null;
        }
        attributeset.recycle();
        j = false;
    }

    public SubMenu c()
    {
        j = true;
        SubMenu submenu = c.addSubMenu(d, k, l, m);
        a(submenu.getItem());
        return submenu;
    }

    public boolean d()
    {
        return j;
    }
}
