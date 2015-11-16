// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ta
    implements fr
{

    private static final int d[] = {
        1, 4, 5, 3, 2, 0
    };
    CharSequence a;
    Drawable b;
    View c;
    private final Context e;
    private final Resources f;
    private boolean g;
    private boolean h;
    private tb i;
    private ArrayList j;
    private ArrayList k;
    private boolean l;
    private ArrayList m;
    private ArrayList n;
    private boolean o;
    private int p;
    private android.view.ContextMenu.ContextMenuInfo q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private ArrayList v;
    private CopyOnWriteArrayList w;
    private te x;
    private boolean y;

    public ta(Context context)
    {
        boolean flag = true;
        super();
        p = 0;
        r = false;
        s = false;
        t = false;
        u = false;
        v = new ArrayList();
        w = new CopyOnWriteArrayList();
        e = context;
        f = context.getResources();
        j = new ArrayList();
        k = new ArrayList();
        l = true;
        m = new ArrayList();
        n = new ArrayList();
        o = true;
        if (f.getConfiguration().keyboard == 1 || !f.getBoolean(g.U))
        {
            flag = false;
        }
        h = flag;
    }

    private static int a(ArrayList arraylist, int i1)
    {
        for (int j1 = arraylist.size() - 1; j1 >= 0; j1--)
        {
            if (((te)arraylist.get(j1)).c() <= i1)
            {
                return j1 + 1;
            }
        }

        return 0;
    }

    private void a(int i1, boolean flag)
    {
        if (i1 >= 0 && i1 < j.size())
        {
            j.remove(i1);
            if (flag)
            {
                b(true);
                return;
            }
        }
    }

    private void a(CharSequence charsequence, Drawable drawable, View view)
    {
        if (view != null)
        {
            c = view;
            a = null;
            b = null;
        } else
        {
            if (charsequence != null)
            {
                a = charsequence;
            }
            if (drawable != null)
            {
                b = drawable;
            }
            c = null;
        }
        b(false);
    }

    public int a(int i1)
    {
        int k1 = size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            if (((te)j.get(j1)).getItemId() == i1)
            {
                return j1;
            }
        }

        return -1;
    }

    protected MenuItem a(int i1, int j1, int k1, CharSequence charsequence)
    {
        int l1 = k1 >> 16;
        if (l1 < 0 || l1 >= d.length)
        {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        l1 = d[l1] << 16 | 0xffff & k1;
        charsequence = new te(this, i1, j1, k1, l1, charsequence, p);
        if (q != null)
        {
            charsequence.a(q);
        }
        j.add(a(j, l1), charsequence);
        b(true);
        return charsequence;
    }

    public ta a()
    {
        p = 1;
        return this;
    }

    protected ta a(Drawable drawable)
    {
        a(((CharSequence) (null)), drawable, ((View) (null)));
        return this;
    }

    protected ta a(View view)
    {
        a(((CharSequence) (null)), ((Drawable) (null)), view);
        return this;
    }

    protected ta a(CharSequence charsequence)
    {
        a(charsequence, ((Drawable) (null)), ((View) (null)));
        return this;
    }

    te a(int i1, KeyEvent keyevent)
    {
        ArrayList arraylist;
        arraylist = v;
        arraylist.clear();
        a(((List) (arraylist)), i1, keyevent);
        if (!arraylist.isEmpty()) goto _L2; else goto _L1
_L1:
        keyevent = null;
_L6:
        return keyevent;
_L2:
        android.view.KeyCharacterMap.KeyData keydata;
        int j1;
        int k1;
        int l1;
        boolean flag;
        k1 = keyevent.getMetaState();
        keydata = new android.view.KeyCharacterMap.KeyData();
        keyevent.getKeyData(keydata);
        l1 = arraylist.size();
        if (l1 == 1)
        {
            return (te)arraylist.get(0);
        }
        flag = c();
        j1 = 0;
_L9:
        if (j1 >= l1) goto _L4; else goto _L3
_L3:
        te te1 = (te)arraylist.get(j1);
        char c1;
        if (flag)
        {
            c1 = te1.getAlphabeticShortcut();
        } else
        {
            c1 = te1.getNumericShortcut();
        }
        if (c1 != keydata.meta[0])
        {
            break; /* Loop/switch isn't completed */
        }
        keyevent = te1;
        if ((k1 & 2) == 0) goto _L6; else goto _L5
_L5:
        if (c1 != keydata.meta[2])
        {
            break; /* Loop/switch isn't completed */
        }
        keyevent = te1;
        if ((k1 & 2) != 0) goto _L6; else goto _L7
_L7:
        if (!flag || c1 != '\b')
        {
            continue; /* Loop/switch isn't completed */
        }
        keyevent = te1;
        if (i1 == 67) goto _L6; else goto _L8
_L8:
        j1++;
          goto _L9
_L4:
        return null;
    }

    public void a(Bundle bundle)
    {
        int j1 = size();
        int i1 = 0;
        SparseArray sparsearray;
        SparseArray sparsearray2;
        for (sparsearray = null; i1 < j1; sparsearray = sparsearray2)
        {
            MenuItem menuitem = getItem(i1);
            View view = ja.a(menuitem);
            sparsearray2 = sparsearray;
            if (view != null)
            {
                sparsearray2 = sparsearray;
                if (view.getId() != -1)
                {
                    SparseArray sparsearray1 = sparsearray;
                    if (sparsearray == null)
                    {
                        sparsearray1 = new SparseArray();
                    }
                    view.saveHierarchyState(sparsearray1);
                    sparsearray2 = sparsearray1;
                    if (ja.c(menuitem))
                    {
                        bundle.putInt("android:menu:expandedactionview", menuitem.getItemId());
                        sparsearray2 = sparsearray1;
                    }
                }
            }
            if (menuitem.hasSubMenu())
            {
                ((tu)menuitem.getSubMenu()).a(bundle);
            }
            i1++;
        }

        if (sparsearray != null)
        {
            bundle.putSparseParcelableArray(b(), sparsearray);
        }
    }

    void a(MenuItem menuitem)
    {
        int j1 = menuitem.getGroupId();
        int k1 = j.size();
        int i1 = 0;
        while (i1 < k1) 
        {
            te te1 = (te)j.get(i1);
            if (te1.getGroupId() == j1 && te1.g() && te1.isCheckable())
            {
                boolean flag;
                if (te1 == menuitem)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                te1.b(flag);
            }
            i1++;
        }
    }

    void a(List list, int i1, KeyEvent keyevent)
    {
        boolean flag = c();
        int k1 = keyevent.getMetaState();
        android.view.KeyCharacterMap.KeyData keydata = new android.view.KeyCharacterMap.KeyData();
        if (keyevent.getKeyData(keydata) || i1 == 67)
        {
            int l1 = j.size();
            int j1 = 0;
            while (j1 < l1) 
            {
                te te1 = (te)j.get(j1);
                if (te1.hasSubMenu())
                {
                    ((ta)te1.getSubMenu()).a(list, i1, keyevent);
                }
                char c1;
                if (flag)
                {
                    c1 = te1.getAlphabeticShortcut();
                } else
                {
                    c1 = te1.getNumericShortcut();
                }
                if ((k1 & 5) == 0 && c1 != 0 && (c1 == keydata.meta[0] || c1 == keydata.meta[2] || flag && c1 == '\b' && i1 == 67) && te1.isEnabled())
                {
                    list.add(te1);
                }
                j1++;
            }
        }
    }

    public void a(tb tb1)
    {
        i = tb1;
    }

    public void a(tp tp1)
    {
        a(tp1, e);
    }

    public void a(tp tp1, Context context)
    {
        w.add(new WeakReference(tp1));
        tp1.a(context, this);
        o = true;
    }

    public final void a(boolean flag)
    {
        if (u)
        {
            return;
        }
        u = true;
        for (Iterator iterator = w.iterator(); iterator.hasNext();)
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            tp tp1 = (tp)weakreference.get();
            if (tp1 == null)
            {
                w.remove(weakreference);
            } else
            {
                tp1.a(this, flag);
            }
        }

        u = false;
    }

    public boolean a(MenuItem menuitem, int i1)
    {
        return a(menuitem, ((tp) (null)), i1);
    }

    public boolean a(MenuItem menuitem, tp tp1, int i1)
    {
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = false;
        menuitem = (te)menuitem;
        if (menuitem != null && menuitem.isEnabled()) goto _L2; else goto _L1
_L1:
        flag1 = false;
_L4:
        return flag1;
_L2:
        hz hz1;
        boolean flag;
        boolean flag3;
        flag3 = menuitem.b();
        hz1 = menuitem.a();
        if (hz1 != null && hz1.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!menuitem.m())
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = menuitem.expandActionView() | flag3;
        flag1 = flag2;
        if (flag2)
        {
            a(true);
            return flag2;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (menuitem.hasSubMenu() || flag)
        {
            a(false);
            if (!menuitem.hasSubMenu())
            {
                menuitem.a(new tu(e(), this, menuitem));
            }
            menuitem = (tu)menuitem.getSubMenu();
            if (flag)
            {
                hz1.a(menuitem);
            }
            if (!w.isEmpty())
            {
                flag1 = flag2;
                if (tp1 != null)
                {
                    flag1 = tp1.a(menuitem);
                }
                tp1 = w.iterator();
                while (tp1.hasNext()) 
                {
                    WeakReference weakreference = (WeakReference)tp1.next();
                    tp tp2 = (tp)weakreference.get();
                    if (tp2 == null)
                    {
                        w.remove(weakreference);
                    } else
                    if (!flag1)
                    {
                        flag1 = tp2.a(menuitem);
                    }
                }
            }
            flag2 = flag3 | flag1;
            flag1 = flag2;
            if (!flag2)
            {
                a(true);
                return flag2;
            }
        } else
        {
            if ((i1 & 1) == 0)
            {
                a(true);
            }
            return flag3;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    boolean a(ta ta1, MenuItem menuitem)
    {
        return i != null && i.a(ta1, menuitem);
    }

    public boolean a(te te1)
    {
        boolean flag1 = false;
        if (!w.isEmpty())
        {
            g();
            Iterator iterator = w.iterator();
            boolean flag = false;
label0:
            do
            {
                tp tp1;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    WeakReference weakreference = (WeakReference)iterator.next();
                    tp1 = (tp)weakreference.get();
                    if (tp1 != null)
                    {
                        break;
                    }
                    w.remove(weakreference);
                } while (true);
                flag = tp1.b(te1);
            } while (!flag);
            h();
            flag1 = flag;
            if (flag)
            {
                x = te1;
                return flag;
            }
        }
        return flag1;
    }

    public MenuItem add(int i1)
    {
        return a(0, 0, 0, f.getString(i1));
    }

    public MenuItem add(int i1, int j1, int k1, int l1)
    {
        return a(i1, j1, k1, f.getString(l1));
    }

    public MenuItem add(int i1, int j1, int k1, CharSequence charsequence)
    {
        return a(i1, j1, k1, charsequence);
    }

    public MenuItem add(CharSequence charsequence)
    {
        return a(0, 0, 0, charsequence);
    }

    public int addIntentOptions(int i1, int j1, int k1, ComponentName componentname, Intent aintent[], Intent intent, int l1, 
            MenuItem amenuitem[])
    {
        PackageManager packagemanager = e.getPackageManager();
        List list = packagemanager.queryIntentActivityOptions(componentname, aintent, intent, 0);
        int i2;
        if (list != null)
        {
            i2 = list.size();
        } else
        {
            i2 = 0;
        }
        if ((l1 & 1) == 0)
        {
            removeGroup(i1);
        }
        l1 = 0;
        while (l1 < i2) 
        {
            ResolveInfo resolveinfo = (ResolveInfo)list.get(l1);
            if (resolveinfo.specificIndex < 0)
            {
                componentname = intent;
            } else
            {
                componentname = aintent[resolveinfo.specificIndex];
            }
            componentname = new Intent(componentname);
            componentname.setComponent(new ComponentName(resolveinfo.activityInfo.applicationInfo.packageName, resolveinfo.activityInfo.name));
            componentname = add(i1, j1, k1, resolveinfo.loadLabel(packagemanager)).setIcon(resolveinfo.loadIcon(packagemanager)).setIntent(componentname);
            if (amenuitem != null && resolveinfo.specificIndex >= 0)
            {
                amenuitem[resolveinfo.specificIndex] = componentname;
            }
            l1++;
        }
        return i2;
    }

    public SubMenu addSubMenu(int i1)
    {
        return addSubMenu(0, 0, 0, ((CharSequence) (f.getString(i1))));
    }

    public SubMenu addSubMenu(int i1, int j1, int k1, int l1)
    {
        return addSubMenu(i1, j1, k1, ((CharSequence) (f.getString(l1))));
    }

    public SubMenu addSubMenu(int i1, int j1, int k1, CharSequence charsequence)
    {
        charsequence = (te)a(i1, j1, k1, charsequence);
        tu tu1 = new tu(e, this, charsequence);
        charsequence.a(tu1);
        return tu1;
    }

    public SubMenu addSubMenu(CharSequence charsequence)
    {
        return addSubMenu(0, 0, 0, charsequence);
    }

    public int b(int i1)
    {
        return c(i1);
    }

    protected String b()
    {
        return "android:menu:actionviewstates";
    }

    public void b(Bundle bundle)
    {
        if (bundle != null)
        {
            SparseArray sparsearray = bundle.getSparseParcelableArray(b());
            int k1 = size();
            for (int i1 = 0; i1 < k1; i1++)
            {
                MenuItem menuitem = getItem(i1);
                View view = ja.a(menuitem);
                if (view != null && view.getId() != -1)
                {
                    view.restoreHierarchyState(sparsearray);
                }
                if (menuitem.hasSubMenu())
                {
                    ((tu)menuitem.getSubMenu()).b(bundle);
                }
            }

            int j1 = bundle.getInt("android:menu:expandedactionview");
            if (j1 > 0)
            {
                bundle = findItem(j1);
                if (bundle != null)
                {
                    ja.b(bundle);
                    return;
                }
            }
        }
    }

    public void b(tp tp1)
    {
        Iterator iterator = w.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WeakReference weakreference = (WeakReference)iterator.next();
            tp tp2 = (tp)weakreference.get();
            if (tp2 == null || tp2 == tp1)
            {
                w.remove(weakreference);
            }
        } while (true);
    }

    public void b(boolean flag)
    {
        if (!r)
        {
            if (flag)
            {
                l = true;
                o = true;
            }
            if (!w.isEmpty())
            {
                g();
                for (Iterator iterator = w.iterator(); iterator.hasNext();)
                {
                    WeakReference weakreference = (WeakReference)iterator.next();
                    tp tp1 = (tp)weakreference.get();
                    if (tp1 == null)
                    {
                        w.remove(weakreference);
                    } else
                    {
                        tp1.b(flag);
                    }
                }

                h();
            }
            return;
        } else
        {
            s = true;
            return;
        }
    }

    public boolean b(te te1)
    {
        boolean flag = false;
        boolean flag2 = flag;
        if (!w.isEmpty())
        {
            if (x != te1)
            {
                flag2 = flag;
            } else
            {
                g();
                Iterator iterator = w.iterator();
                boolean flag1 = false;
label0:
                do
                {
                    tp tp1;
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break label0;
                        }
                        WeakReference weakreference = (WeakReference)iterator.next();
                        tp1 = (tp)weakreference.get();
                        if (tp1 != null)
                        {
                            break;
                        }
                        w.remove(weakreference);
                    } while (true);
                    flag1 = tp1.c(te1);
                } while (!flag1);
                h();
                flag2 = flag1;
                if (flag1)
                {
                    x = null;
                    return flag1;
                }
            }
        }
        return flag2;
    }

    public int c(int i1)
    {
        int k1 = size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            if (((te)j.get(j1)).getGroupId() == i1)
            {
                return j1;
            }
        }

        return -1;
    }

    public void c(boolean flag)
    {
        y = flag;
    }

    boolean c()
    {
        return g;
    }

    public void clear()
    {
        if (x != null)
        {
            b(x);
        }
        j.clear();
        b(true);
    }

    public void clearHeader()
    {
        b = null;
        a = null;
        c = null;
        b(false);
    }

    public void close()
    {
        a(true);
    }

    public boolean d()
    {
        return h;
    }

    public Context e()
    {
        return e;
    }

    public void f()
    {
        if (i != null)
        {
            i.a(this);
        }
    }

    public MenuItem findItem(int i1)
    {
        int j1;
        int k1;
        k1 = size();
        j1 = 0;
_L6:
        if (j1 >= k1) goto _L2; else goto _L1
_L1:
        Object obj = (te)j.get(j1);
        if (((te) (obj)).getItemId() != i1) goto _L4; else goto _L3
_L3:
        return ((MenuItem) (obj));
_L4:
        MenuItem menuitem;
        if (!((te) (obj)).hasSubMenu())
        {
            continue; /* Loop/switch isn't completed */
        }
        menuitem = ((te) (obj)).getSubMenu().findItem(i1);
        obj = menuitem;
        if (menuitem != null) goto _L3; else goto _L5
_L5:
        j1++;
          goto _L6
_L2:
        return null;
    }

    public void g()
    {
        if (!r)
        {
            r = true;
            s = false;
        }
    }

    public MenuItem getItem(int i1)
    {
        return (MenuItem)j.get(i1);
    }

    public void h()
    {
        r = false;
        if (s)
        {
            s = false;
            b(true);
        }
    }

    public boolean hasVisibleItems()
    {
        if (y)
        {
            return true;
        }
        int j1 = size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((te)j.get(i1)).isVisible())
            {
                return true;
            }
        }

        return false;
    }

    void i()
    {
        l = true;
        b(true);
    }

    public boolean isShortcutKey(int i1, KeyEvent keyevent)
    {
        return a(i1, keyevent) != null;
    }

    void j()
    {
        o = true;
        b(true);
    }

    public ArrayList k()
    {
        if (!l)
        {
            return k;
        }
        k.clear();
        int j1 = j.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            te te1 = (te)j.get(i1);
            if (te1.isVisible())
            {
                k.add(te1);
            }
        }

        l = false;
        o = true;
        return k;
    }

    public void l()
    {
        ArrayList arraylist = k();
        if (!o)
        {
            return;
        }
        Iterator iterator = w.iterator();
        boolean flag = false;
        while (iterator.hasNext()) 
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            tp tp1 = (tp)weakreference.get();
            if (tp1 == null)
            {
                w.remove(weakreference);
            } else
            {
                flag = tp1.b() | flag;
            }
        }
        if (flag)
        {
            m.clear();
            n.clear();
            int j1 = arraylist.size();
            int i1 = 0;
            while (i1 < j1) 
            {
                te te1 = (te)arraylist.get(i1);
                if (te1.i())
                {
                    m.add(te1);
                } else
                {
                    n.add(te1);
                }
                i1++;
            }
        } else
        {
            m.clear();
            n.clear();
            n.addAll(k());
        }
        o = false;
    }

    public ArrayList m()
    {
        l();
        return m;
    }

    public ArrayList n()
    {
        l();
        return n;
    }

    public CharSequence o()
    {
        return a;
    }

    public Drawable p()
    {
        return b;
    }

    public boolean performIdentifierAction(int i1, int j1)
    {
        return a(findItem(i1), j1);
    }

    public boolean performShortcut(int i1, KeyEvent keyevent, int j1)
    {
        keyevent = a(i1, keyevent);
        boolean flag = false;
        if (keyevent != null)
        {
            flag = a(keyevent, j1);
        }
        if ((j1 & 2) != 0)
        {
            a(true);
        }
        return flag;
    }

    public View q()
    {
        return c;
    }

    public ta r()
    {
        return this;
    }

    public void removeGroup(int i1)
    {
        int k1 = b(i1);
        if (k1 >= 0)
        {
            int l1 = j.size();
            for (int j1 = 0; j1 < l1 - k1 && ((te)j.get(k1)).getGroupId() == i1; j1++)
            {
                a(k1, false);
            }

            b(true);
        }
    }

    public void removeItem(int i1)
    {
        a(a(i1), true);
    }

    boolean s()
    {
        return t;
    }

    public void setGroupCheckable(int i1, boolean flag, boolean flag1)
    {
        int k1 = j.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            te te1 = (te)j.get(j1);
            if (te1.getGroupId() == i1)
            {
                te1.a(flag1);
                te1.setCheckable(flag);
            }
        }

    }

    public void setGroupEnabled(int i1, boolean flag)
    {
        int k1 = j.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            te te1 = (te)j.get(j1);
            if (te1.getGroupId() == i1)
            {
                te1.setEnabled(flag);
            }
        }

    }

    public void setGroupVisible(int i1, boolean flag)
    {
        int k1 = j.size();
        int j1 = 0;
        boolean flag1 = false;
        for (; j1 < k1; j1++)
        {
            te te1 = (te)j.get(j1);
            if (te1.getGroupId() == i1 && te1.c(flag))
            {
                flag1 = true;
            }
        }

        if (flag1)
        {
            b(true);
        }
    }

    public void setQwertyMode(boolean flag)
    {
        g = flag;
        b(false);
    }

    public int size()
    {
        return j.size();
    }

    public te t()
    {
        return x;
    }

}
