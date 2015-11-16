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

final class sm
{

    hz a;
    final sk b;
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

    public sm(sk sk1, Menu menu)
    {
        b = sk1;
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
            s1 = sk.a(b).getClassLoader().loadClass(s1).getConstructor(aclass);
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
            if (sk.a(b).isRestricted())
            {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            menuitem.setOnMenuItemClickListener(new sl(sk.c(b), z));
        }
        if (r >= 2)
        {
            if (menuitem instanceof tc)
            {
                ((tc)menuitem).a(true);
            } else
            if (menuitem instanceof te)
            {
                ((te)menuitem).a();
            }
        }
        if (x != null)
        {
            ja.a(menuitem, (View)a(x, sk.b(), sk.d(b)));
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
        attributeset = sk.a(b).obtainStyledAttributes(attributeset, ro.aC);
        d = attributeset.getResourceId(ro.aF, 0);
        e = attributeset.getInt(ro.aG, 0);
        f = attributeset.getInt(ro.aH, 0);
        g = attributeset.getInt(ro.aD, 0);
        h = attributeset.getBoolean(ro.aI, true);
        i = attributeset.getBoolean(ro.aE, true);
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
        attributeset = sk.a(b).obtainStyledAttributes(attributeset, ro.aJ);
        k = attributeset.getResourceId(ro.aS, 0);
        l = attributeset.getInt(ro.aT, e) & 0xffff0000 | attributeset.getInt(ro.aW, f) & 0xffff;
        m = attributeset.getText(ro.aX);
        n = attributeset.getText(ro.aY);
        o = attributeset.getResourceId(ro.aR, 0);
        p = a(attributeset.getString(ro.aN));
        q = a(attributeset.getString(ro.aU));
        int i1;
        if (attributeset.hasValue(ro.aO))
        {
            if (attributeset.getBoolean(ro.aO, false))
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
        s = attributeset.getBoolean(ro.aP, false);
        t = attributeset.getBoolean(ro.aZ, h);
        u = attributeset.getBoolean(ro.aQ, i);
        v = attributeset.getInt(ro.ba, -1);
        z = attributeset.getString(ro.aV);
        w = attributeset.getResourceId(ro.aK, 0);
        x = attributeset.getString(ro.aM);
        y = attributeset.getString(ro.aL);
        if (y != null)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        if (i1 != 0 && w == 0 && x == null)
        {
            a = (hz)a(y, sk.a(), sk.b(b));
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
