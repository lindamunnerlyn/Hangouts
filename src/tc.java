// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.LinearLayout;

public final class tc
    implements fs
{

    private static String w;
    private static String x;
    private static String y;
    private static String z;
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private CharSequence e;
    private CharSequence f;
    private Intent g;
    private char h;
    private char i;
    private Drawable j;
    private int k;
    private sy l;
    private ts m;
    private Runnable n;
    private android.view.MenuItem.OnMenuItemClickListener o;
    private int p;
    private int q;
    private View r;
    private hz s;
    private jf t;
    private boolean u;
    private android.view.ContextMenu.ContextMenuInfo v;

    tc(sy sy1, int i1, int j1, int k1, int l1, CharSequence charsequence, int i2)
    {
        k = 0;
        p = 16;
        q = 0;
        u = false;
        l = sy1;
        a = j1;
        b = i1;
        c = k1;
        d = l1;
        e = charsequence;
        q = i2;
    }

    private fs a(View view)
    {
        r = view;
        s = null;
        if (view != null && view.getId() == -1 && a > 0)
        {
            view.setId(a);
        }
        l.j();
        return this;
    }

    static sy a(tc tc1)
    {
        return tc1.l;
    }

    public fs a(hz hz1)
    {
        if (s != null)
        {
            s.f();
        }
        r = null;
        s = hz1;
        l.b(true);
        if (s != null)
        {
            s.a(new td(this));
        }
        return this;
    }

    public fs a(jf jf1)
    {
        t = jf1;
        return this;
    }

    public hz a()
    {
        return s;
    }

    public CharSequence a(tq tq1)
    {
        if (tq1 != null && tq1.b())
        {
            return getTitleCondensed();
        } else
        {
            return getTitle();
        }
    }

    void a(android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        v = contextmenuinfo;
    }

    public void a(ts ts1)
    {
        m = ts1;
        ts1.setHeaderTitle(getTitle());
    }

    public void a(boolean flag)
    {
        int i1 = p;
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        p = byte0 | i1 & -5;
    }

    void b(boolean flag)
    {
        int i1 = p;
        int j1 = p;
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        p = byte0 | j1 & -3;
        if (i1 != p)
        {
            l.b(false);
        }
    }

    public boolean b()
    {
_L2:
        return true;
        if (o != null && o.onMenuItemClick(this) || l.a(l.r(), this)) goto _L2; else goto _L1
_L1:
        if (n != null)
        {
            n.run();
            return true;
        }
        if (g == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        l.e().startActivity(g);
        return true;
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", activitynotfoundexception);
        if (s != null && s.d()) goto _L2; else goto _L3
_L3:
        return false;
    }

    public int c()
    {
        return d;
    }

    boolean c(boolean flag)
    {
        boolean flag1 = false;
        int i1 = p;
        int j1 = p;
        byte byte0;
        if (flag)
        {
            byte0 = 0;
        } else
        {
            byte0 = 8;
        }
        p = byte0 | j1 & -9;
        flag = flag1;
        if (i1 != p)
        {
            flag = true;
        }
        return flag;
    }

    public boolean collapseActionView()
    {
        if ((q & 8) != 0)
        {
            if (r == null)
            {
                return true;
            }
            if (t == null || t.b(this))
            {
                return l.b(this);
            }
        }
        return false;
    }

    public char d()
    {
        if (l.c())
        {
            return i;
        } else
        {
            return h;
        }
    }

    public void d(boolean flag)
    {
        if (flag)
        {
            p = p | 0x20;
            return;
        } else
        {
            p = p & 0xffffffdf;
            return;
        }
    }

    public String e()
    {
        char c1;
        StringBuilder stringbuilder;
        c1 = d();
        if (c1 == 0)
        {
            return "";
        }
        stringbuilder = new StringBuilder(w);
        c1;
        JVM INSTR lookupswitch 3: default 60
    //                   8: 82
    //                   10: 71
    //                   32: 93;
           goto _L1 _L2 _L3 _L4
_L1:
        stringbuilder.append(c1);
_L6:
        return stringbuilder.toString();
_L3:
        stringbuilder.append(x);
        continue; /* Loop/switch isn't completed */
_L2:
        stringbuilder.append(y);
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuilder.append(z);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void e(boolean flag)
    {
        u = flag;
        l.b(false);
    }

    public boolean expandActionView()
    {
        while (!m() || t != null && !t.a(this)) 
        {
            return false;
        }
        return l.a(this);
    }

    public boolean f()
    {
        return l.d() && d() != 0;
    }

    public boolean g()
    {
        return (p & 4) != 0;
    }

    public ActionProvider getActionProvider()
    {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView()
    {
        if (r != null)
        {
            return r;
        }
        if (s != null)
        {
            r = s.a(this);
            return r;
        } else
        {
            return null;
        }
    }

    public char getAlphabeticShortcut()
    {
        return i;
    }

    public int getGroupId()
    {
        return b;
    }

    public Drawable getIcon()
    {
        if (j != null)
        {
            return j;
        }
        if (k != 0)
        {
            Drawable drawable = vi.a(l.e(), k);
            k = 0;
            j = drawable;
            return drawable;
        } else
        {
            return null;
        }
    }

    public Intent getIntent()
    {
        return g;
    }

    public int getItemId()
    {
        return a;
    }

    public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
        return v;
    }

    public char getNumericShortcut()
    {
        return h;
    }

    public int getOrder()
    {
        return c;
    }

    public SubMenu getSubMenu()
    {
        return m;
    }

    public CharSequence getTitle()
    {
        return e;
    }

    public CharSequence getTitleCondensed()
    {
        CharSequence charsequence;
        Object obj;
        if (f != null)
        {
            charsequence = f;
        } else
        {
            charsequence = e;
        }
        obj = charsequence;
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            obj = charsequence;
            if (charsequence != null)
            {
                obj = charsequence;
                if (!(charsequence instanceof String))
                {
                    obj = charsequence.toString();
                }
            }
        }
        return ((CharSequence) (obj));
    }

    public boolean h()
    {
        return l.s();
    }

    public boolean hasSubMenu()
    {
        return m != null;
    }

    public boolean i()
    {
        return (p & 0x20) == 32;
    }

    public boolean isActionViewExpanded()
    {
        return u;
    }

    public boolean isCheckable()
    {
        return (p & 1) == 1;
    }

    public boolean isChecked()
    {
        return (p & 2) == 2;
    }

    public boolean isEnabled()
    {
        return (p & 0x10) != 0;
    }

    public boolean isVisible()
    {
        if (s == null || !s.b()) goto _L2; else goto _L1
_L1:
        if ((p & 8) != 0 || !s.c()) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if ((p & 8) != 0)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean j()
    {
        return (q & 1) == 1;
    }

    public boolean k()
    {
        return (q & 2) == 2;
    }

    public boolean l()
    {
        return (q & 4) == 4;
    }

    public boolean m()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if ((q & 8) != 0)
        {
            if (r == null && s != null)
            {
                r = s.a(this);
            }
            flag = flag1;
            if (r != null)
            {
                flag = true;
            }
        }
        return flag;
    }

    public MenuItem setActionProvider(ActionProvider actionprovider)
    {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setActionView(int i1)
    {
        Context context = l.e();
        a(LayoutInflater.from(context).inflate(i1, new LinearLayout(context), false));
        return this;
    }

    public MenuItem setActionView(View view)
    {
        return a(view);
    }

    public MenuItem setAlphabeticShortcut(char c1)
    {
        if (i == c1)
        {
            return this;
        } else
        {
            i = Character.toLowerCase(c1);
            l.b(false);
            return this;
        }
    }

    public MenuItem setCheckable(boolean flag)
    {
        int i1 = p;
        int j1 = p;
        boolean flag1;
        if (flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p = flag1 | j1 & -2;
        if (i1 != p)
        {
            l.b(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean flag)
    {
        if ((p & 4) != 0)
        {
            l.a(this);
            return this;
        } else
        {
            b(flag);
            return this;
        }
    }

    public MenuItem setEnabled(boolean flag)
    {
        if (flag)
        {
            p = p | 0x10;
        } else
        {
            p = p & 0xffffffef;
        }
        l.b(false);
        return this;
    }

    public MenuItem setIcon(int i1)
    {
        j = null;
        k = i1;
        l.b(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable)
    {
        k = 0;
        j = drawable;
        l.b(false);
        return this;
    }

    public MenuItem setIntent(Intent intent)
    {
        g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c1)
    {
        if (h == c1)
        {
            return this;
        } else
        {
            h = c1;
            l.b(false);
            return this;
        }
    }

    public MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
    }

    public MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        o = onmenuitemclicklistener;
        return this;
    }

    public MenuItem setShortcut(char c1, char c2)
    {
        h = c1;
        i = Character.toLowerCase(c2);
        l.b(false);
        return this;
    }

    public void setShowAsAction(int i1)
    {
        switch (i1 & 3)
        {
        default:
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            q = i1;
            break;
        }
        l.j();
    }

    public MenuItem setShowAsActionFlags(int i1)
    {
        setShowAsAction(i1);
        return this;
    }

    public MenuItem setTitle(int i1)
    {
        return setTitle(((CharSequence) (l.e().getString(i1))));
    }

    public MenuItem setTitle(CharSequence charsequence)
    {
        e = charsequence;
        l.b(false);
        if (m != null)
        {
            m.setHeaderTitle(charsequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charsequence)
    {
        f = charsequence;
        l.b(false);
        return this;
    }

    public MenuItem setVisible(boolean flag)
    {
        if (c(flag))
        {
            l.i();
        }
        return this;
    }

    public String toString()
    {
        return e.toString();
    }
}
