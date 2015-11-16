// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zj
{

    final ArrayList a = new ArrayList();
    ArrayList b;
    final ArrayList c = new ArrayList();
    final yr d;
    private final List e;
    private int f;
    private zi g;
    private zn h;

    public zj(yr yr1)
    {
        d = yr1;
        super();
        b = null;
        e = Collections.unmodifiableList(a);
        f = 2;
    }

    private zq a(int j, boolean flag)
    {
        boolean flag1 = false;
        int i1 = a.size();
        for (int k = 0; k < i1; k++)
        {
            zq zq1 = (zq)a.get(k);
            if (!zq1.g() && zq1.d() == j && !zq1.j() && (d.e.j || !zq1.n()))
            {
                zq1.a(32);
                return zq1;
            }
        }

        View view = d.c.a(j, -1);
        if (view != null)
        {
            d.d.c(d.a(view));
        }
        i1 = c.size();
        for (int l = ((flag1) ? 1 : 0); l < i1; l++)
        {
            zq zq2 = (zq)c.get(l);
            if (!zq2.j() && zq2.d() == j)
            {
                c.remove(l);
                return zq2;
            }
        }

        return null;
    }

    private zq a(long l, int j, boolean flag)
    {
        for (int k = a.size() - 1; k >= 0; k--)
        {
            zq zq1 = (zq)a.get(k);
            if (zq1.d != l || zq1.g())
            {
                continue;
            }
            if (j == zq1.e)
            {
                zq1.a(32);
                if (zq1.n() && !d.e.a())
                {
                    zq1.a(2, 14);
                }
                return zq1;
            }
            a.remove(k);
            d.removeDetachedView(zq1.a, false);
            b(zq1.a);
        }

        for (int i1 = c.size() - 1; i1 >= 0; i1--)
        {
            zq zq2 = (zq)c.get(i1);
            if (zq2.d != l)
            {
                continue;
            }
            if (j == zq2.e)
            {
                c.remove(i1);
                return zq2;
            }
            c(i1);
        }

        return null;
    }

    private void a(ViewGroup viewgroup, boolean flag)
    {
        for (int j = viewgroup.getChildCount() - 1; j >= 0; j--)
        {
            View view = viewgroup.getChildAt(j);
            if (view instanceof ViewGroup)
            {
                a((ViewGroup)view, true);
            }
        }

        if (!flag)
        {
            return;
        }
        if (viewgroup.getVisibility() == 4)
        {
            viewgroup.setVisibility(0);
            viewgroup.setVisibility(4);
            return;
        } else
        {
            int k = viewgroup.getVisibility();
            viewgroup.setVisibility(4);
            viewgroup.setVisibility(k);
            return;
        }
    }

    private void c(int j)
    {
        c((zq)c.get(j));
        c.remove(j);
    }

    private void c(zq zq1)
    {
        kb.a(zq1.a, null);
        if (yr.s(d) != null)
        {
            yr.s(d);
        }
        if (yr.g(d) != null)
        {
            yr.g(d);
        }
        if (d.e != null)
        {
            d.e.a(zq1);
        }
        zq1.k = null;
        i().a(zq1);
    }

    private zq d(int j)
    {
        boolean flag;
        int l;
label0:
        {
            flag = false;
            if (b != null)
            {
                l = b.size();
                if (l != 0)
                {
                    break label0;
                }
            }
            return null;
        }
        for (int k = 0; k < l; k++)
        {
            zq zq1 = (zq)b.get(k);
            if (!zq1.g() && zq1.d() == j)
            {
                zq1.a(32);
                return zq1;
            }
        }

        if (yr.g(d).b)
        {
            j = d.b.a(j);
            if (j > 0 && j < yr.g(d).a())
            {
                long l1 = yr.g(d).b(j);
                for (j = ((flag) ? 1 : 0); j < l; j++)
                {
                    zq zq2 = (zq)b.get(j);
                    if (!zq2.g() && zq2.d == l1)
                    {
                        zq2.a(32);
                        return zq2;
                    }
                }

            }
        }
        return null;
    }

    private void h()
    {
        for (int j = c.size() - 1; j >= 0; j--)
        {
            c(j);
        }

        c.clear();
    }

    private zi i()
    {
        if (g == null)
        {
            g = new zi();
        }
        return g;
    }

    public View a(int j)
    {
        boolean flag1 = true;
        if (j < 0 || j >= d.e.d())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Invalid item position ")).append(j).append("(").append(j).append("). Item count:").append(d.e.d()).toString());
        }
        Object obj;
        Object obj1;
        Object obj2;
        int k;
        boolean flag;
        int l;
        int i1;
        int j1;
        if (d.e.a())
        {
            obj1 = d(j);
            if (obj1 != null)
            {
                k = 1;
            } else
            {
                k = 0;
            }
        } else
        {
            obj1 = null;
            k = 0;
        }
        obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        obj1 = a(j, false);
        obj = obj1;
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        if (((zq) (obj1)).n()) goto _L5; else goto _L4
_L4:
        if (((zq) (obj1)).b < 0 || ((zq) (obj1)).b >= yr.g(d).a())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Inconsistency detected. Invalid view holder adapter position")).append(obj1).toString());
        }
        if (d.e.a() || yr.g(d).a(((zq) (obj1)).b) == ((zq) (obj1)).e) goto _L7; else goto _L6
_L6:
        flag = false;
_L15:
        if (!flag)
        {
            ((zq) (obj1)).a(4);
            if (((zq) (obj1)).e())
            {
                d.removeDetachedView(((zq) (obj1)).a, false);
                ((zq) (obj1)).f();
            } else
            if (((zq) (obj1)).g())
            {
                ((zq) (obj1)).h();
            }
            a(((zq) (obj1)));
            obj = null;
        } else
        {
            k = 1;
            obj = obj1;
        }
_L2:
        obj2 = obj;
        i1 = k;
        if (obj != null) goto _L9; else goto _L8
_L8:
        i1 = d.b.a(j);
        if (i1 < 0 || i1 >= yr.g(d).a())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Inconsistency detected. Invalid item position ")).append(j).append("(offset:").append(i1).append(").state:").append(d.e.d()).toString());
        }
        j1 = yr.g(d).a(i1);
        obj1 = obj;
        flag = k;
        if (yr.g(d).b)
        {
            obj = a(yr.g(d).b(i1), j1, false);
            obj1 = obj;
            flag = k;
            if (obj != null)
            {
                obj.b = i1;
                flag = true;
                obj1 = obj;
            }
        }
        obj = obj1;
        if (obj1 == null)
        {
            obj = obj1;
            if (h != null)
            {
                obj2 = h.e();
                obj = obj1;
                if (obj2 != null)
                {
                    obj1 = d.a(((View) (obj2)));
                    if (obj1 == null)
                    {
                        throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
                    }
                    obj = obj1;
                    if (((zq) (obj1)).c())
                    {
                        throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                    }
                }
            }
        }
        obj1 = obj;
        if (obj == null)
        {
            obj1 = i().a(j1);
            if (obj1 != null)
            {
                ((zq) (obj1)).t();
                if (yr.z() && (((zq) (obj1)).a instanceof ViewGroup))
                {
                    a((ViewGroup)((zq) (obj1)).a, false);
                }
            }
        }
        obj2 = obj1;
        i1 = ((flag) ? 1 : 0);
          goto _L10
_L7:
        if (yr.g(d).b && ((zq) (obj1)).d != yr.g(d).b(((zq) (obj1)).b))
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = true;
        continue; /* Loop/switch isn't completed */
_L10:
        if (obj1 != null) goto _L9; else goto _L11
_L11:
        obj = yr.g(d);
        obj1 = d;
        g.a("RV CreateView");
        obj1 = ((yx) (obj)).a(((ViewGroup) (obj1)), j1);
        obj1.e = j1;
        g.a();
        k = ((flag) ? 1 : 0);
_L13:
        if (d.e.a() && ((zq) (obj1)).m())
        {
            obj1.f = j;
            j = 0;
        } else
        if (!((zq) (obj1)).m() || ((zq) (obj1)).k() || ((zq) (obj1)).j())
        {
            l = d.b.a(j);
            obj1.k = d;
            yr.g(d).c(((zq) (obj1)), l);
            obj = ((zq) (obj1)).a;
            if (d.n())
            {
                if (kb.e(((View) (obj))) == 0)
                {
                    kb.c(((View) (obj)), 1);
                }
                if (!kb.b(((View) (obj))))
                {
                    kb.a(((View) (obj)), yr.r(d).b());
                }
            }
            if (d.e.a())
            {
                obj1.f = j;
            }
            j = 1;
        } else
        {
            j = 0;
        }
        obj = ((zq) (obj1)).a.getLayoutParams();
        if (obj == null)
        {
            obj = (zf)d.generateDefaultLayoutParams();
            ((zq) (obj1)).a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        } else
        if (!d.checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
        {
            obj = (zf)d.generateLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            ((zq) (obj1)).a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        } else
        {
            obj = (zf)obj;
        }
        obj.a = ((zq) (obj1));
        if (k == 0 || j == 0)
        {
            flag1 = false;
        }
        obj.d = flag1;
        return ((zq) (obj1)).a;
_L9:
        k = i1;
        obj1 = obj2;
        if (true) goto _L13; else goto _L12
_L12:
        if (true) goto _L15; else goto _L14
_L14:
    }

    public void a()
    {
        a.clear();
        h();
    }

    void a(int j, int k)
    {
        byte byte0;
        int l;
        int i1;
        int j1;
        int k1;
        if (j < k)
        {
            byte0 = -1;
            l = k;
            i1 = j;
        } else
        {
            byte0 = 1;
            l = j;
            i1 = k;
        }
        k1 = c.size();
        j1 = 0;
        while (j1 < k1) 
        {
            zq zq1 = (zq)c.get(j1);
            if (zq1 != null && zq1.b >= i1 && zq1.b <= l)
            {
                if (zq1.b == j)
                {
                    zq1.a(k - j, false);
                } else
                {
                    zq1.a(byte0, false);
                }
            }
            j1++;
        }
    }

    void a(int j, int k, boolean flag)
    {
        int l = c.size() - 1;
        while (l >= 0) 
        {
            zq zq1 = (zq)c.get(l);
            if (zq1 != null)
            {
                if (zq1.d() >= j + k)
                {
                    zq1.a(-k, flag);
                } else
                if (zq1.d() >= j)
                {
                    zq1.a(8);
                    c(l);
                }
            }
            l--;
        }
    }

    public void a(View view)
    {
        zq zq1;
        zq1 = yr.b(view);
        if (zq1.p())
        {
            d.removeDetachedView(view, false);
        }
        if (!zq1.e()) goto _L2; else goto _L1
_L1:
        zq1.f();
_L4:
        a(zq1);
        return;
_L2:
        if (zq1.g())
        {
            zq1.h();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    void a(yx yx1, yx yx2, boolean flag)
    {
        a();
        i().a(yx1, yx2, false);
    }

    void a(zq zq1)
    {
        boolean flag1;
        boolean flag2;
        flag2 = true;
        flag1 = false;
        if (zq1.e() || zq1.a.getParent() != null)
        {
            StringBuilder stringbuilder = (new StringBuilder("Scrapped or attached views may not be recycled. isScrap:")).append(zq1.e()).append(" isAttached:");
            if (zq1.a.getParent() == null)
            {
                flag2 = false;
            }
            throw new IllegalArgumentException(stringbuilder.append(flag2).toString());
        }
        if (zq1.p())
        {
            throw new IllegalArgumentException((new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ")).append(zq1).toString());
        }
        if (zq1.c())
        {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
        }
        flag2 = zq.c(zq1);
        if (yr.g(d) != null && flag2)
        {
            yr.g(d);
        }
        if (!zq1.u())
        {
            break MISSING_BLOCK_LABEL_268;
        }
        if (zq1.o()) goto _L2; else goto _L1
_L1:
        int j;
        j = c.size();
        if (j == f && j > 0)
        {
            c(0);
        }
        if (j >= f) goto _L2; else goto _L3
_L3:
        boolean flag;
        c.add(zq1);
        flag = true;
_L4:
        if (!flag)
        {
            c(zq1);
            flag1 = true;
        }
_L5:
        d.e.a(zq1);
        if (!flag && !flag1 && flag2)
        {
            zq1.k = null;
        }
        return;
_L2:
        flag = false;
          goto _L4
        flag = false;
          goto _L5
    }

    View b(int j)
    {
        return ((zq)a.get(j)).a;
    }

    public List b()
    {
        return e;
    }

    void b(int j, int k)
    {
        int i1 = c.size();
        for (int l = 0; l < i1; l++)
        {
            zq zq1 = (zq)c.get(l);
            if (zq1 != null && zq1.d() >= j)
            {
                zq1.a(k, true);
            }
        }

    }

    void b(View view)
    {
        view = yr.b(view);
        zq.d(view);
        view.h();
        a(view);
    }

    void b(zq zq1)
    {
        if (!zq1.l() || !yr.i(d) || b == null)
        {
            a.remove(zq1);
        } else
        {
            b.remove(zq1);
        }
        zq.d(zq1);
        zq1.h();
    }

    int c()
    {
        return a.size();
    }

    void c(int j, int k)
    {
        for (int l = c.size() - 1; l >= 0; l--)
        {
            zq zq1 = (zq)c.get(l);
            if (zq1 == null)
            {
                continue;
            }
            int i1 = zq1.d();
            if (i1 >= j && i1 < j + k)
            {
                zq1.a(2);
                c(l);
            }
        }

    }

    void c(View view)
    {
        view = yr.b(view);
        view.a(this);
        if (!view.l() || !yr.i(d))
        {
            if (view.j() && !view.n() && !yr.g(d).b)
            {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
            } else
            {
                a.add(view);
                return;
            }
        }
        if (b == null)
        {
            b = new ArrayList();
        }
        b.add(view);
    }

    void d()
    {
        a.clear();
    }

    void e()
    {
        if (yr.g(d) != null && yr.g(d).b)
        {
            int k = c.size();
            for (int j = 0; j < k; j++)
            {
                zq zq1 = (zq)c.get(j);
                if (zq1 != null)
                {
                    zq1.a(6);
                    zq1.a(null);
                }
            }

        } else
        {
            h();
        }
    }

    void f()
    {
        boolean flag = false;
        int i1 = c.size();
        for (int j = 0; j < i1; j++)
        {
            ((zq)c.get(j)).a();
        }

        i1 = a.size();
        for (int k = 0; k < i1; k++)
        {
            ((zq)a.get(k)).a();
        }

        if (b != null)
        {
            int j1 = b.size();
            for (int l = ((flag) ? 1 : 0); l < j1; l++)
            {
                ((zq)b.get(l)).a();
            }

        }
    }

    void g()
    {
        int k = c.size();
        for (int j = 0; j < k; j++)
        {
            zf zf1 = (zf)((zq)c.get(j)).a.getLayoutParams();
            if (zf1 != null)
            {
                zf1.c = true;
            }
        }

    }
}
