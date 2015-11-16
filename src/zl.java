// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zl
{

    final ArrayList a = new ArrayList();
    ArrayList b;
    final ArrayList c = new ArrayList();
    final yt d;
    private final List e;
    private int f;
    private zk g;
    private zp h;

    public zl(yt yt1)
    {
        d = yt1;
        super();
        b = null;
        e = Collections.unmodifiableList(a);
        f = 2;
    }

    private zs a(int j, boolean flag)
    {
        boolean flag1 = false;
        int i1 = a.size();
        for (int k = 0; k < i1; k++)
        {
            zs zs1 = (zs)a.get(k);
            if (!zs1.g() && zs1.d() == j && !zs1.j() && (d.e.j || !zs1.n()))
            {
                zs1.a(32);
                return zs1;
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
            zs zs2 = (zs)c.get(l);
            if (!zs2.j() && zs2.d() == j)
            {
                c.remove(l);
                return zs2;
            }
        }

        return null;
    }

    private zs a(long l, int j, boolean flag)
    {
        for (int k = a.size() - 1; k >= 0; k--)
        {
            zs zs1 = (zs)a.get(k);
            if (zs1.d != l || zs1.g())
            {
                continue;
            }
            if (j == zs1.e)
            {
                zs1.a(32);
                if (zs1.n() && !d.e.a())
                {
                    zs1.a(2, 14);
                }
                return zs1;
            }
            a.remove(k);
            d.removeDetachedView(zs1.a, false);
            b(zs1.a);
        }

        for (int i1 = c.size() - 1; i1 >= 0; i1--)
        {
            zs zs2 = (zs)c.get(i1);
            if (zs2.d != l)
            {
                continue;
            }
            if (j == zs2.e)
            {
                c.remove(i1);
                return zs2;
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
        c((zs)c.get(j));
        c.remove(j);
    }

    private void c(zs zs1)
    {
        kb.a(zs1.a, null);
        if (yt.s(d) != null)
        {
            yt.s(d);
        }
        if (yt.g(d) != null)
        {
            yt.g(d);
        }
        if (d.e != null)
        {
            d.e.a(zs1);
        }
        zs1.k = null;
        i().a(zs1);
    }

    private zs d(int j)
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
            zs zs1 = (zs)b.get(k);
            if (!zs1.g() && zs1.d() == j)
            {
                zs1.a(32);
                return zs1;
            }
        }

        if (yt.g(d).b)
        {
            j = d.b.a(j);
            if (j > 0 && j < yt.g(d).a())
            {
                long l1 = yt.g(d).b(j);
                for (j = ((flag) ? 1 : 0); j < l; j++)
                {
                    zs zs2 = (zs)b.get(j);
                    if (!zs2.g() && zs2.d == l1)
                    {
                        zs2.a(32);
                        return zs2;
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

    private zk i()
    {
        if (g == null)
        {
            g = new zk();
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
        if (((zs) (obj1)).n()) goto _L5; else goto _L4
_L4:
        if (((zs) (obj1)).b < 0 || ((zs) (obj1)).b >= yt.g(d).a())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Inconsistency detected. Invalid view holder adapter position")).append(obj1).toString());
        }
        if (d.e.a() || yt.g(d).a(((zs) (obj1)).b) == ((zs) (obj1)).e) goto _L7; else goto _L6
_L6:
        flag = false;
_L15:
        if (!flag)
        {
            ((zs) (obj1)).a(4);
            if (((zs) (obj1)).e())
            {
                d.removeDetachedView(((zs) (obj1)).a, false);
                ((zs) (obj1)).f();
            } else
            if (((zs) (obj1)).g())
            {
                ((zs) (obj1)).h();
            }
            a(((zs) (obj1)));
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
        if (i1 < 0 || i1 >= yt.g(d).a())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Inconsistency detected. Invalid item position ")).append(j).append("(offset:").append(i1).append(").state:").append(d.e.d()).toString());
        }
        j1 = yt.g(d).a(i1);
        obj1 = obj;
        flag = k;
        if (yt.g(d).b)
        {
            obj = a(yt.g(d).b(i1), j1, false);
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
                    if (((zs) (obj1)).c())
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
                ((zs) (obj1)).t();
                if (yt.z() && (((zs) (obj1)).a instanceof ViewGroup))
                {
                    a((ViewGroup)((zs) (obj1)).a, false);
                }
            }
        }
        obj2 = obj1;
        i1 = ((flag) ? 1 : 0);
          goto _L10
_L7:
        if (yt.g(d).b && ((zs) (obj1)).d != yt.g(d).b(((zs) (obj1)).b))
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
        obj = yt.g(d);
        obj1 = d;
        g.a("RV CreateView");
        obj1 = ((yz) (obj)).a(((ViewGroup) (obj1)), j1);
        obj1.e = j1;
        g.a();
        k = ((flag) ? 1 : 0);
_L13:
        if (d.e.a() && ((zs) (obj1)).m())
        {
            obj1.f = j;
            j = 0;
        } else
        if (!((zs) (obj1)).m() || ((zs) (obj1)).k() || ((zs) (obj1)).j())
        {
            l = d.b.a(j);
            obj1.k = d;
            yt.g(d).c(((zs) (obj1)), l);
            obj = ((zs) (obj1)).a;
            if (d.n())
            {
                if (kb.f(((View) (obj))) == 0)
                {
                    kb.c(((View) (obj)), 1);
                }
                if (!kb.b(((View) (obj))))
                {
                    kb.a(((View) (obj)), yt.r(d).b());
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
        obj = ((zs) (obj1)).a.getLayoutParams();
        if (obj == null)
        {
            obj = (zh)d.generateDefaultLayoutParams();
            ((zs) (obj1)).a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        } else
        if (!d.checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
        {
            obj = (zh)d.generateLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            ((zs) (obj1)).a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        } else
        {
            obj = (zh)obj;
        }
        obj.a = ((zs) (obj1));
        if (k == 0 || j == 0)
        {
            flag1 = false;
        }
        obj.d = flag1;
        return ((zs) (obj1)).a;
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
            zs zs1 = (zs)c.get(j1);
            if (zs1 != null && zs1.b >= i1 && zs1.b <= l)
            {
                if (zs1.b == j)
                {
                    zs1.a(k - j, false);
                } else
                {
                    zs1.a(byte0, false);
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
            zs zs1 = (zs)c.get(l);
            if (zs1 != null)
            {
                if (zs1.d() >= j + k)
                {
                    zs1.a(-k, flag);
                } else
                if (zs1.d() >= j)
                {
                    zs1.a(8);
                    c(l);
                }
            }
            l--;
        }
    }

    public void a(View view)
    {
        zs zs1;
        zs1 = yt.b(view);
        if (zs1.p())
        {
            d.removeDetachedView(view, false);
        }
        if (!zs1.e()) goto _L2; else goto _L1
_L1:
        zs1.f();
_L4:
        a(zs1);
        return;
_L2:
        if (zs1.g())
        {
            zs1.h();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    void a(yz yz1, yz yz2, boolean flag)
    {
        a();
        i().a(yz1, yz2, false);
    }

    void a(zs zs1)
    {
        boolean flag1;
        boolean flag2;
        flag2 = true;
        flag1 = false;
        if (zs1.e() || zs1.a.getParent() != null)
        {
            StringBuilder stringbuilder = (new StringBuilder("Scrapped or attached views may not be recycled. isScrap:")).append(zs1.e()).append(" isAttached:");
            if (zs1.a.getParent() == null)
            {
                flag2 = false;
            }
            throw new IllegalArgumentException(stringbuilder.append(flag2).toString());
        }
        if (zs1.p())
        {
            throw new IllegalArgumentException((new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ")).append(zs1).toString());
        }
        if (zs1.c())
        {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
        }
        flag2 = zs.c(zs1);
        if (yt.g(d) != null && flag2)
        {
            yt.g(d);
        }
        if (!zs1.u())
        {
            break MISSING_BLOCK_LABEL_268;
        }
        if (zs1.o()) goto _L2; else goto _L1
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
        c.add(zs1);
        flag = true;
_L4:
        if (!flag)
        {
            c(zs1);
            flag1 = true;
        }
_L5:
        d.e.a(zs1);
        if (!flag && !flag1 && flag2)
        {
            zs1.k = null;
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
        return ((zs)a.get(j)).a;
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
            zs zs1 = (zs)c.get(l);
            if (zs1 != null && zs1.d() >= j)
            {
                zs1.a(k, true);
            }
        }

    }

    void b(View view)
    {
        view = yt.b(view);
        zs.d(view);
        view.h();
        a(view);
    }

    void b(zs zs1)
    {
        if (!zs1.l() || !yt.i(d) || b == null)
        {
            a.remove(zs1);
        } else
        {
            b.remove(zs1);
        }
        zs.d(zs1);
        zs1.h();
    }

    int c()
    {
        return a.size();
    }

    void c(int j, int k)
    {
        for (int l = c.size() - 1; l >= 0; l--)
        {
            zs zs1 = (zs)c.get(l);
            if (zs1 == null)
            {
                continue;
            }
            int i1 = zs1.d();
            if (i1 >= j && i1 < j + k)
            {
                zs1.a(2);
                c(l);
            }
        }

    }

    void c(View view)
    {
        view = yt.b(view);
        view.a(this);
        if (!view.l() || !yt.i(d))
        {
            if (view.j() && !view.n() && !yt.g(d).b)
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
        if (yt.g(d) != null && yt.g(d).b)
        {
            int k = c.size();
            for (int j = 0; j < k; j++)
            {
                zs zs1 = (zs)c.get(j);
                if (zs1 != null)
                {
                    zs1.a(6);
                    zs1.a(null);
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
            ((zs)c.get(j)).a();
        }

        i1 = a.size();
        for (int k = 0; k < i1; k++)
        {
            ((zs)a.get(k)).a();
        }

        if (b != null)
        {
            int j1 = b.size();
            for (int l = ((flag) ? 1 : 0); l < j1; l++)
            {
                ((zs)b.get(l)).a();
            }

        }
    }

    void g()
    {
        int k = c.size();
        for (int j = 0; j < k; j++)
        {
            zh zh1 = (zh)((zs)c.get(j)).a.getLayoutParams();
            if (zh1 != null)
            {
                zh1.c = true;
            }
        }

    }
}
