// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public final class vu extends st
    implements ia
{

    private vw A;
    vy g;
    wa h;
    vv i;
    vx j;
    final wb k = new wb(this);
    int l;
    private Drawable m;
    private boolean n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;
    private final SparseBooleanArray y = new SparseBooleanArray();
    private View z;

    public vu(Context context)
    {
        super(context, g.bq, g.bp);
    }

    public View a(tc tc1, View view, ViewGroup viewgroup)
    {
        View view1 = tc1.getActionView();
        if (view1 == null || tc1.m())
        {
            view1 = super.a(tc1, view, viewgroup);
        }
        byte byte0;
        if (tc1.isActionViewExpanded())
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view1.setVisibility(byte0);
        tc1 = (ActionMenuView)viewgroup;
        view = view1.getLayoutParams();
        if (!tc1.checkLayoutParams(view))
        {
            view1.setLayoutParams(tc1.a(view));
        }
        return view1;
    }

    public tp a(ViewGroup viewgroup)
    {
        viewgroup = super.a(viewgroup);
        ((ActionMenuView)viewgroup).a(this);
        return viewgroup;
    }

    public void a(Context context, sy sy1)
    {
        super.a(context, sy1);
        sy1 = context.getResources();
        context = sf.a(context);
        if (!p)
        {
            o = context.b();
        }
        if (!v)
        {
            q = context.c();
        }
        if (!t)
        {
            s = context.a();
        }
        int i1 = q;
        if (o)
        {
            if (g == null)
            {
                g = new vy(this, a);
                if (n)
                {
                    g.setImageDrawable(m);
                    m = null;
                    n = false;
                }
                int j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                g.measure(j1, j1);
            }
            i1 -= g.getMeasuredWidth();
        } else
        {
            g = null;
        }
        r = i1;
        x = (int)(56F * sy1.getDisplayMetrics().density);
        z = null;
    }

    public void a(ActionMenuView actionmenuview)
    {
        f = actionmenuview;
        actionmenuview.a(c);
    }

    public void a(sy sy1, boolean flag)
    {
        g();
        super.a(sy1, flag);
    }

    public void a(tc tc1, tq tq1)
    {
        tq1.a(tc1);
        tc1 = (ActionMenuView)f;
        tq1 = (ActionMenuItemView)tq1;
        tq1.a(tc1);
        if (A == null)
        {
            A = new vw(this);
        }
        tq1.a(A);
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            super.a(null);
            return;
        } else
        {
            c.a(false);
            return;
        }
    }

    public boolean a(ViewGroup viewgroup, int i1)
    {
        if (viewgroup.getChildAt(i1) == g)
        {
            return false;
        } else
        {
            return super.a(viewgroup, i1);
        }
    }

    public boolean a(tc tc1)
    {
        return tc1.i();
    }

    public boolean a(ts ts1)
    {
        MenuItem menuitem;
        ViewGroup viewgroup;
        if (!ts1.hasVisibleItems())
        {
            return false;
        }
        ts ts2;
        for (ts2 = ts1; ts2.u() != c; ts2 = (ts)ts2.u()) { }
        menuitem = ts2.getItem();
        viewgroup = (ViewGroup)f;
        if (viewgroup == null) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        j1 = viewgroup.getChildCount();
        i1 = 0;
_L7:
        if (i1 >= j1) goto _L2; else goto _L3
_L3:
        View view = viewgroup.getChildAt(i1);
        if (!(view instanceof tq) || ((tq)view).a() != menuitem) goto _L5; else goto _L4
_L5:
        i1++;
        continue; /* Loop/switch isn't completed */
_L2:
        view = null;
_L4:
        Object obj = view;
        if (view == null)
        {
            if (g == null)
            {
                return false;
            }
            obj = g;
        }
        l = ts1.getItem().getItemId();
        i = new vv(this, b, ts1);
        i.a(((View) (obj)));
        i.c();
        super.a(ts1);
        return true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void b(boolean flag)
    {
        boolean flag1 = true;
        boolean flag2 = false;
        ((View)f).getParent();
        super.b(flag);
        ((View)f).requestLayout();
        if (c != null)
        {
            ArrayList arraylist = c.m();
            int k1 = arraylist.size();
            for (int i1 = 0; i1 < k1; i1++)
            {
                hz hz1 = ((tc)arraylist.get(i1)).a();
                if (hz1 != null)
                {
                    hz1.a(this);
                }
            }

        }
        Object obj;
        int j1;
        if (c != null)
        {
            obj = c.n();
        } else
        {
            obj = null;
        }
        j1 = ((flag2) ? 1 : 0);
        if (o)
        {
            j1 = ((flag2) ? 1 : 0);
            if (obj != null)
            {
                j1 = ((ArrayList) (obj)).size();
                if (j1 == 1)
                {
                    if (!((tc)((ArrayList) (obj)).get(0)).isActionViewExpanded())
                    {
                        j1 = 1;
                    } else
                    {
                        j1 = 0;
                    }
                } else
                if (j1 > 0)
                {
                    j1 = ((flag1) ? 1 : 0);
                } else
                {
                    j1 = 0;
                }
            }
        }
        if (j1 == 0) goto _L2; else goto _L1
_L1:
        if (g == null)
        {
            g = new vy(this, a);
        }
        obj = (ViewGroup)g.getParent();
        if (obj != f)
        {
            if (obj != null)
            {
                ((ViewGroup) (obj)).removeView(g);
            }
            obj = (ActionMenuView)f;
            ((ActionMenuView) (obj)).addView(g, ((ActionMenuView) (obj)).c());
        }
_L4:
        ((ActionMenuView)f).a(o);
        return;
_L2:
        if (g != null && g.getParent() == f)
        {
            ((ViewGroup)f).removeView(g);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean b()
    {
        ArrayList arraylist;
        ViewGroup viewgroup;
        int k1;
        int l1;
        int l3;
        int l4;
        int i5;
label0:
        {
            arraylist = c.k();
            l4 = arraylist.size();
            int i1 = s;
            l3 = r;
            i5 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            viewgroup = (ViewGroup)f;
            l1 = 0;
            int i2 = 0;
            boolean flag = false;
            k1 = 0;
            while (k1 < l4) 
            {
                tc tc1 = (tc)arraylist.get(k1);
                if (tc1.k())
                {
                    l1++;
                } else
                if (tc1.j())
                {
                    i2++;
                } else
                {
                    flag = true;
                }
                if (w && tc1.isActionViewExpanded())
                {
                    i1 = 0;
                }
                k1++;
            }
            k1 = i1;
            if (!o)
            {
                break label0;
            }
            if (!flag)
            {
                k1 = i1;
                if (l1 + i2 <= i1)
                {
                    break label0;
                }
            }
            k1 = i1 - 1;
        }
        k1 -= l1;
        SparseBooleanArray sparsebooleanarray = y;
        sparsebooleanarray.clear();
        int j1 = 0;
        int k2;
        boolean flag1;
        int j3;
        int k3;
        if (u)
        {
            j1 = l3 / x;
            l1 = x;
            int j2 = x;
            j3 = (l3 % l1) / j1 + j2;
        } else
        {
            j3 = 0;
        }
        k3 = 0;
        flag1 = false;
        l1 = j1;
        j1 = k1;
        k2 = l3;
        k1 = ((flag1) ? 1 : 0);
        while (k3 < l4) 
        {
            tc tc2 = (tc)arraylist.get(k3);
            int l2;
            if (tc2.k())
            {
                View view = a(tc2, z, viewgroup);
                if (z == null)
                {
                    z = view;
                }
                int i4;
                if (u)
                {
                    l2 = l1 - ActionMenuView.a(view, j3, l1, i5, 0);
                } else
                {
                    view.measure(i5, i5);
                    l2 = l1;
                }
                l1 = view.getMeasuredWidth();
                if (k1 == 0)
                {
                    k1 = l1;
                }
                i4 = tc2.getGroupId();
                if (i4 != 0)
                {
                    sparsebooleanarray.put(i4, true);
                }
                tc2.d(true);
                k2 -= l1;
                l1 = j1;
                j1 = k2;
            } else
            if (tc2.j())
            {
                int j5 = tc2.getGroupId();
                boolean flag3 = sparsebooleanarray.get(j5);
                boolean flag2;
                if ((j1 > 0 || flag3) && k2 > 0 && (!u || l1 > 0))
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                if (flag2)
                {
                    View view1 = a(tc2, z, viewgroup);
                    if (z == null)
                    {
                        z = view1;
                    }
                    int j4;
                    if (u)
                    {
                        l2 = ActionMenuView.a(view1, j3, l1, i5, 0);
                        if (l2 == 0)
                        {
                            flag2 = false;
                        }
                        l1 -= l2;
                    } else
                    {
                        view1.measure(i5, i5);
                    }
                    l2 = view1.getMeasuredWidth();
                    j4 = k2 - l2;
                    k2 = k1;
                    if (k1 == 0)
                    {
                        k2 = l2;
                    }
                    if (u)
                    {
                        if (j4 >= 0)
                        {
                            k1 = 1;
                        } else
                        {
                            k1 = 0;
                        }
                        flag2 &= k1;
                        k1 = k2;
                        l2 = l1;
                        k2 = j4;
                        l1 = k1;
                        k1 = l2;
                    } else
                    {
                        if (j4 + k2 > 0)
                        {
                            k1 = 1;
                        } else
                        {
                            k1 = 0;
                        }
                        flag2 &= k1;
                        k1 = l1;
                        l1 = k2;
                        k2 = j4;
                    }
                } else
                {
                    int i3 = k1;
                    k1 = l1;
                    l1 = i3;
                }
                if (flag2 && j5 != 0)
                {
                    sparsebooleanarray.put(j5, true);
                } else
                if (flag3)
                {
                    sparsebooleanarray.put(j5, false);
                    int k4 = 0;
                    while (k4 < k3) 
                    {
                        tc tc3 = (tc)arraylist.get(k4);
                        l2 = j1;
                        if (tc3.getGroupId() == j5)
                        {
                            l2 = j1;
                            if (tc3.i())
                            {
                                l2 = j1 + 1;
                            }
                            tc3.d(false);
                        }
                        k4++;
                        j1 = l2;
                    }
                }
                l2 = j1;
                if (flag2)
                {
                    l2 = j1 - 1;
                }
                tc2.d(flag2);
                j1 = k2;
                k2 = l2;
                l2 = k1;
                k1 = l1;
                l1 = k2;
            } else
            {
                tc2.d(false);
                l2 = k2;
                k2 = j1;
                j1 = l2;
                l2 = l1;
                l1 = k2;
            }
            i4 = k3 + 1;
            k3 = l1;
            l1 = l2;
            k2 = j1;
            j1 = k3;
            k3 = i4;
        }
        return true;
    }

    public void c()
    {
        if (!t)
        {
            s = b.getResources().getInteger(g.bn);
        }
        if (c != null)
        {
            c.b(true);
        }
    }

    public void c(boolean flag)
    {
        w = true;
    }

    public void d()
    {
        o = true;
        p = true;
    }

    public boolean e()
    {
        if (o && !i() && c != null && f != null && j == null && !c.n().isEmpty())
        {
            j = new vx(this, new wa(this, b, c, g));
            ((View)f).post(j);
            super.a(null);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean f()
    {
        if (j != null && f != null)
        {
            ((View)f).removeCallbacks(j);
            j = null;
            return true;
        }
        wa wa1 = h;
        if (wa1 != null)
        {
            wa1.f();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean g()
    {
        return f() | h();
    }

    public boolean h()
    {
        if (i != null)
        {
            i.f();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean i()
    {
        return h != null && h.g();
    }

    public boolean j()
    {
        return j != null || i();
    }
}
