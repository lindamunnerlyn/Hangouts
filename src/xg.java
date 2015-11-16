// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class xg extends za
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

    public xg()
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
            kb.o(((zq)list.get(l)).a).b();
        }

    }

    private void a(List list, zq zq1)
    {
        for (int l = list.size() - 1; l >= 0; l--)
        {
            xp xp1 = (xp)list.get(l);
            if (a(xp1, zq1) && xp1.a == null && xp1.b == null)
            {
                list.remove(xp1);
            }
        }

    }

    private void a(xp xp1)
    {
        if (xp1.a != null)
        {
            a(xp1, xp1.a);
        }
        if (xp1.b != null)
        {
            a(xp1, xp1.b);
        }
    }

    private boolean a(xp xp1, zq zq1)
    {
        if (xp1.b == zq1)
        {
            xp1.b = null;
        } else
        if (xp1.a == zq1)
        {
            xp1.a = null;
        } else
        {
            return false;
        }
        kb.c(zq1.a, 1.0F);
        kb.a(zq1.a, 0.0F);
        kb.b(zq1.a, 0.0F);
        g(zq1);
        return true;
    }

    private void h(zq zq1)
    {
        m.a(zq1.a);
        c(zq1);
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
            zq zq1;
            lr lr1;
            for (Iterator iterator = h.iterator(); iterator.hasNext(); lr1.a(g()).a(0.0F).a(new xk(this, zq1, lr1)).c())
            {
                zq1 = (zq)iterator.next();
                lr1 = kb.o(zq1.a);
                f.add(zq1);
            }

            h.clear();
            Object obj;
            if (flag1)
            {
                ArrayList arraylist = new ArrayList();
                arraylist.addAll(j);
                b.add(arraylist);
                j.clear();
                obj = new xh(this, arraylist);
                if (flag)
                {
                    kb.a(((xq)arraylist.get(0)).a.a, ((Runnable) (obj)), g());
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
                obj = new xi(this, arraylist);
                if (flag)
                {
                    kb.a(((xp)arraylist.get(0)).a.a, ((Runnable) (obj)), g());
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
                obj = new xj(this, arraylist);
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
                    kb.a(((zq)arraylist.get(0)).a, ((Runnable) (obj)), l + l1);
                    return;
                } else
                {
                    ((Runnable) (obj)).run();
                    return;
                }
            }
        }
    }

    public boolean a(zq zq1)
    {
        h(zq1);
        h.add(zq1);
        return true;
    }

    public boolean a(zq zq1, int l, int i1, int j1, int k1)
    {
        android.view.View view = zq1.a;
        l = (int)((float)l + kb.k(zq1.a));
        i1 = (int)((float)i1 + kb.l(zq1.a));
        h(zq1);
        int l1 = j1 - l;
        int i2 = k1 - i1;
        if (l1 == 0 && i2 == 0)
        {
            e(zq1);
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
        j.add(new xq(zq1, l, i1, j1, k1));
        return true;
    }

    public boolean a(zq zq1, zq zq2, int l, int i1, int j1, int k1)
    {
        float f1 = kb.k(zq1.a);
        float f2 = kb.l(zq1.a);
        float f3 = kb.f(zq1.a);
        h(zq1);
        int l1 = (int)((float)(j1 - l) - f1);
        int i2 = (int)((float)(k1 - i1) - f2);
        kb.a(zq1.a, f1);
        kb.b(zq1.a, f2);
        kb.c(zq1.a, f3);
        if (zq2 != null && zq2.a != null)
        {
            h(zq2);
            kb.a(zq2.a, -l1);
            kb.b(zq2.a, -i2);
            kb.c(zq2.a, 0.0F);
        }
        k.add(new xp(zq1, zq2, l, i1, j1, k1));
        return true;
    }

    public boolean b()
    {
        return !i.isEmpty() || !k.isEmpty() || !j.isEmpty() || !h.isEmpty() || !e.isEmpty() || !f.isEmpty() || !d.isEmpty() || !g.isEmpty() || !b.isEmpty() || !a.isEmpty() || !c.isEmpty();
    }

    public boolean b(zq zq1)
    {
        h(zq1);
        kb.c(zq1.a, 0.0F);
        i.add(zq1);
        return true;
    }

    void c()
    {
        if (!b())
        {
            j();
        }
    }

    public void c(zq zq1)
    {
        android.view.View view = zq1.a;
        kb.o(view).b();
        for (int l = j.size() - 1; l >= 0; l--)
        {
            if (((xq)j.get(l)).a == zq1)
            {
                kb.b(view, 0.0F);
                kb.a(view, 0.0F);
                e(zq1);
                j.remove(l);
            }
        }

        a(k, zq1);
        if (h.remove(zq1))
        {
            kb.c(view, 1.0F);
            d(zq1);
        }
        if (i.remove(zq1))
        {
            kb.c(view, 1.0F);
            f(zq1);
        }
        for (int i1 = c.size() - 1; i1 >= 0; i1--)
        {
            ArrayList arraylist = (ArrayList)c.get(i1);
            a(arraylist, zq1);
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
                            if (((xq)arraylist1.get(l1)).a != zq1)
                            {
                                break label1;
                            }
                            kb.b(view, 0.0F);
                            kb.a(view, 0.0F);
                            e(zq1);
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
                if (!arraylist2.remove(zq1))
                {
                    continue;
                }
                kb.c(view, 1.0F);
                f(zq1);
                if (arraylist2.isEmpty())
                {
                    a.remove(k1);
                }
            }

            f.remove(zq1);
            d.remove(zq1);
            g.remove(zq1);
            e.remove(zq1);
            c();
            return;
        } while (true);
    }

    public void d()
    {
        for (int l = j.size() - 1; l >= 0; l--)
        {
            xq xq1 = (xq)j.get(l);
            android.view.View view = xq1.a.a;
            kb.b(view, 0.0F);
            kb.a(view, 0.0F);
            e(xq1.a);
            j.remove(l);
        }

        for (int i1 = h.size() - 1; i1 >= 0; i1--)
        {
            d((zq)h.get(i1));
            h.remove(i1);
        }

        for (int j1 = i.size() - 1; j1 >= 0; j1--)
        {
            zq zq1 = (zq)i.get(j1);
            kb.c(zq1.a, 1.0F);
            f(zq1);
            i.remove(j1);
        }

        for (int k1 = k.size() - 1; k1 >= 0; k1--)
        {
            a((xp)k.get(k1));
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
                xq xq2 = (xq)arraylist.get(k2);
                android.view.View view1 = xq2.a.a;
                kb.b(view1, 0.0F);
                kb.a(view1, 0.0F);
                e(xq2.a);
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
                zq zq2 = (zq)arraylist1.get(l2);
                kb.c(zq2.a, 1.0F);
                f(zq2);
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
                a((xp)arraylist2.get(i3));
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
