// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class xi extends zc
{

    ArrayList a;
    ArrayList b;
    ArrayList c;
    ArrayList d;
    ArrayList e;
    ArrayList f;
    ArrayList g;
    private ArrayList h;
    private ArrayList i;
    private ArrayList j;
    private ArrayList k;

    public xi()
    {
        h = new ArrayList();
        i = new ArrayList();
        j = new ArrayList();
        k = new ArrayList();
        a = new ArrayList();
        b = new ArrayList();
        c = new ArrayList();
        d = new ArrayList();
        e = new ArrayList();
        f = new ArrayList();
        g = new ArrayList();
    }

    private static void a(List list)
    {
        for (int l = list.size() - 1; l >= 0; l--)
        {
            kb.p(((zs)list.get(l)).a).b();
        }

    }

    private void a(List list, zs zs1)
    {
        for (int l = list.size() - 1; l >= 0; l--)
        {
            xr xr1 = (xr)list.get(l);
            if (a(xr1, zs1) && xr1.a == null && xr1.b == null)
            {
                list.remove(xr1);
            }
        }

    }

    private void a(xr xr1)
    {
        if (xr1.a != null)
        {
            a(xr1, xr1.a);
        }
        if (xr1.b != null)
        {
            a(xr1, xr1.b);
        }
    }

    private boolean a(xr xr1, zs zs1)
    {
        if (xr1.b == zs1)
        {
            xr1.b = null;
        } else
        if (xr1.a == zs1)
        {
            xr1.a = null;
        } else
        {
            return false;
        }
        kb.c(zs1.a, 1.0F);
        kb.a(zs1.a, 0.0F);
        kb.b(zs1.a, 0.0F);
        g(zs1);
        return true;
    }

    private void h(zs zs1)
    {
        m.a(zs1.a);
        c(zs1);
    }

    public void a()
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (!h.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!j.isEmpty())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!k.isEmpty())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (!i.isEmpty())
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (flag || flag1 || flag3 || flag2)
        {
            zs zs1;
            lr lr1;
            for (Iterator iterator = h.iterator(); iterator.hasNext(); lr1.a(g()).a(0.0F).a(new xm(this, zs1, lr1)).c())
            {
                zs1 = (zs)iterator.next();
                lr1 = kb.p(zs1.a);
                f.add(zs1);
            }

            h.clear();
            Object obj;
            if (flag1)
            {
                ArrayList arraylist = new ArrayList();
                arraylist.addAll(j);
                b.add(arraylist);
                j.clear();
                obj = new xj(this, arraylist);
                if (flag)
                {
                    kb.a(((xs)arraylist.get(0)).a.a, ((Runnable) (obj)), g());
                } else
                {
                    ((Runnable) (obj)).run();
                }
            }
            if (flag2)
            {
                arraylist = new ArrayList();
                arraylist.addAll(k);
                c.add(arraylist);
                k.clear();
                obj = new xk(this, arraylist);
                if (flag)
                {
                    kb.a(((xr)arraylist.get(0)).a.a, ((Runnable) (obj)), g());
                } else
                {
                    ((Runnable) (obj)).run();
                }
            }
            if (flag3)
            {
                arraylist = new ArrayList();
                arraylist.addAll(i);
                a.add(arraylist);
                i.clear();
                obj = new xl(this, arraylist);
                if (flag || flag1 || flag2)
                {
                    long l;
                    long l1;
                    long l2;
                    if (flag)
                    {
                        l = g();
                    } else
                    {
                        l = 0L;
                    }
                    if (flag1)
                    {
                        l1 = e();
                    } else
                    {
                        l1 = 0L;
                    }
                    if (flag2)
                    {
                        l2 = h();
                    } else
                    {
                        l2 = 0L;
                    }
                    l1 = Math.max(l1, l2);
                    kb.a(((zs)arraylist.get(0)).a, ((Runnable) (obj)), l + l1);
                    return;
                } else
                {
                    ((Runnable) (obj)).run();
                    return;
                }
            }
        }
    }

    public boolean a(zs zs1)
    {
        h(zs1);
        h.add(zs1);
        return true;
    }

    public boolean a(zs zs1, int l, int i1, int j1, int k1)
    {
        android.view.View view = zs1.a;
        l = (int)((float)l + kb.l(zs1.a));
        i1 = (int)((float)i1 + kb.m(zs1.a));
        h(zs1);
        int l1 = j1 - l;
        int i2 = k1 - i1;
        if (l1 == 0 && i2 == 0)
        {
            e(zs1);
            return false;
        }
        if (l1 != 0)
        {
            kb.a(view, -l1);
        }
        if (i2 != 0)
        {
            kb.b(view, -i2);
        }
        j.add(new xs(zs1, l, i1, j1, k1));
        return true;
    }

    public boolean a(zs zs1, zs zs2, int l, int i1, int j1, int k1)
    {
        float f1 = kb.l(zs1.a);
        float f2 = kb.m(zs1.a);
        float f3 = kb.g(zs1.a);
        h(zs1);
        int l1 = (int)((float)(j1 - l) - f1);
        int i2 = (int)((float)(k1 - i1) - f2);
        kb.a(zs1.a, f1);
        kb.b(zs1.a, f2);
        kb.c(zs1.a, f3);
        if (zs2 != null && zs2.a != null)
        {
            h(zs2);
            kb.a(zs2.a, -l1);
            kb.b(zs2.a, -i2);
            kb.c(zs2.a, 0.0F);
        }
        k.add(new xr(zs1, zs2, l, i1, j1, k1));
        return true;
    }

    public boolean b()
    {
        return !i.isEmpty() || !k.isEmpty() || !j.isEmpty() || !h.isEmpty() || !e.isEmpty() || !f.isEmpty() || !d.isEmpty() || !g.isEmpty() || !b.isEmpty() || !a.isEmpty() || !c.isEmpty();
    }

    public boolean b(zs zs1)
    {
        h(zs1);
        kb.c(zs1.a, 0.0F);
        i.add(zs1);
        return true;
    }

    void c()
    {
        if (!b())
        {
            j();
        }
    }

    public void c(zs zs1)
    {
        android.view.View view = zs1.a;
        kb.p(view).b();
        for (int l = j.size() - 1; l >= 0; l--)
        {
            if (((xs)j.get(l)).a == zs1)
            {
                kb.b(view, 0.0F);
                kb.a(view, 0.0F);
                e(zs1);
                j.remove(l);
            }
        }

        a(k, zs1);
        if (h.remove(zs1))
        {
            kb.c(view, 1.0F);
            d(zs1);
        }
        if (i.remove(zs1))
        {
            kb.c(view, 1.0F);
            f(zs1);
        }
        for (int i1 = c.size() - 1; i1 >= 0; i1--)
        {
            ArrayList arraylist = (ArrayList)c.get(i1);
            a(arraylist, zs1);
            if (arraylist.isEmpty())
            {
                c.remove(i1);
            }
        }

        int j1 = b.size() - 1;
label0:
        do
        {
            if (j1 >= 0)
            {
                ArrayList arraylist1 = (ArrayList)b.get(j1);
                int l1 = arraylist1.size() - 1;
                do
                {
label1:
                    {
                        if (l1 >= 0)
                        {
                            if (((xs)arraylist1.get(l1)).a != zs1)
                            {
                                break label1;
                            }
                            kb.b(view, 0.0F);
                            kb.a(view, 0.0F);
                            e(zs1);
                            arraylist1.remove(l1);
                            if (arraylist1.isEmpty())
                            {
                                b.remove(j1);
                            }
                        }
                        j1--;
                        continue label0;
                    }
                    l1--;
                } while (true);
            }
            for (int k1 = a.size() - 1; k1 >= 0; k1--)
            {
                ArrayList arraylist2 = (ArrayList)a.get(k1);
                if (!arraylist2.remove(zs1))
                {
                    continue;
                }
                kb.c(view, 1.0F);
                f(zs1);
                if (arraylist2.isEmpty())
                {
                    a.remove(k1);
                }
            }

            f.remove(zs1);
            d.remove(zs1);
            g.remove(zs1);
            e.remove(zs1);
            c();
            return;
        } while (true);
    }

    public void d()
    {
        for (int l = j.size() - 1; l >= 0; l--)
        {
            xs xs1 = (xs)j.get(l);
            android.view.View view = xs1.a.a;
            kb.b(view, 0.0F);
            kb.a(view, 0.0F);
            e(xs1.a);
            j.remove(l);
        }

        for (int i1 = h.size() - 1; i1 >= 0; i1--)
        {
            d((zs)h.get(i1));
            h.remove(i1);
        }

        for (int j1 = i.size() - 1; j1 >= 0; j1--)
        {
            zs zs1 = (zs)i.get(j1);
            kb.c(zs1.a, 1.0F);
            f(zs1);
            i.remove(j1);
        }

        for (int k1 = k.size() - 1; k1 >= 0; k1--)
        {
            a((xr)k.get(k1));
        }

        k.clear();
        if (!b())
        {
            return;
        }
        for (int l1 = b.size() - 1; l1 >= 0; l1--)
        {
            ArrayList arraylist = (ArrayList)b.get(l1);
            for (int k2 = arraylist.size() - 1; k2 >= 0; k2--)
            {
                xs xs2 = (xs)arraylist.get(k2);
                android.view.View view1 = xs2.a.a;
                kb.b(view1, 0.0F);
                kb.a(view1, 0.0F);
                e(xs2.a);
                arraylist.remove(k2);
                if (arraylist.isEmpty())
                {
                    b.remove(arraylist);
                }
            }

        }

        for (int i2 = a.size() - 1; i2 >= 0; i2--)
        {
            ArrayList arraylist1 = (ArrayList)a.get(i2);
            for (int l2 = arraylist1.size() - 1; l2 >= 0; l2--)
            {
                zs zs2 = (zs)arraylist1.get(l2);
                kb.c(zs2.a, 1.0F);
                f(zs2);
                arraylist1.remove(l2);
                if (arraylist1.isEmpty())
                {
                    a.remove(arraylist1);
                }
            }

        }

        for (int j2 = c.size() - 1; j2 >= 0; j2--)
        {
            ArrayList arraylist2 = (ArrayList)c.get(j2);
            for (int i3 = arraylist2.size() - 1; i3 >= 0; i3--)
            {
                a((xr)arraylist2.get(i3));
                if (arraylist2.isEmpty())
                {
                    c.remove(arraylist2);
                }
            }

        }

        a(f);
        a(e);
        a(d);
        a(g);
        j();
    }
}
