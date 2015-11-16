// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class btc extends bmy
{

    private bot a;
    private final bnd b = bnd.a();
    private List c;

    public btc()
    {
        c = new ArrayList();
    }

    static bnd a(btc btc1)
    {
        return btc1.b;
    }

    private void a(bov bov1, bpd bpd1)
    {
        Object obj1 = null;
        Object obj;
        boolean flag;
        if (bpd1 == null)
        {
            bpd1 = null;
        } else
        {
            bpd1 = bpd1.r();
        }
        if (bpd1 == null)
        {
            obj = null;
        } else
        {
            obj = bpd1.m();
        }
        bpd1 = obj1;
        if (obj != null)
        {
            bpd1 = obj1;
            if (((Collection) (obj)).size() == 1)
            {
                obj = (gho)((Collection) (obj)).toArray()[0];
                bpd1 = obj1;
                if (obj instanceof ghv)
                {
                    bpd1 = ((bpd) (obj));
                }
            }
        }
        if (bpd1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bov1.a(flag);
        if (bpd1 != null)
        {
            bov1.setOnClickListener(new btk(this));
        }
    }

    static void a(btc btc1, bov bov1)
    {
        boolean flag1 = btc1.b.i();
        if (bov1.a() == flag1)
        {
            char c1;
            boolean flag;
            if (!flag1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            bov1.a(flag);
            if (flag1)
            {
                c1 = '\265';
            } else
            {
                c1 = '\267';
            }
            g.b(c1);
        }
    }

    static void a(btc btc1, bov bov1, bpd bpd1)
    {
        btc1.a(bov1, bpd1);
    }

    private boolean a(bpd bpd1)
    {
        boolean flag;
        if ((a.g() & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return !b(bpd1) && flag;
    }

    static boolean a(btc btc1, bpd bpd1)
    {
        return btc1.a(bpd1);
    }

    static bot b(btc btc1)
    {
        return btc1.a;
    }

    static void b(btc btc1, bov bov1)
    {
        boolean flag1 = bnd.j();
        if (bov1.a() == flag1)
        {
            char c1;
            boolean flag;
            if (!flag1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            bov1.a(flag);
            if (flag1)
            {
                c1 = '\266';
            } else
            {
                c1 = '\270';
            }
            g.b(c1);
        }
    }

    private boolean b(bpd bpd1)
    {
        Object obj = null;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (bpd1 == null)
        {
            bpd1 = null;
        } else
        {
            bpd1 = bpd1.r();
        }
        if (bpd1 == null)
        {
            bpd1 = obj;
        } else
        {
            bpd1 = bpd1.m();
        }
        if (bpd1 != null && bpd1.size() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (bpd1 == null || bpd1.isEmpty())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if ((a.g() & 1) != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        return flag2 && (flag || flag1);
    }

    static boolean b(btc btc1, bpd bpd1)
    {
        return btc1.b(bpd1);
    }

    public int a()
    {
        return 0;
    }

    public List a(Context context, bot bot1, gjr gjr1, bpd bpd1)
    {
        c.clear();
        a = bot1;
        if (gjr1.g())
        {
            Object obj;
            String s;
            String s2;
            int i;
            int k;
            int j1;
            int l1;
            int j2;
            boolean flag;
            boolean flag1;
            if (((btl)hgx.a(context, btl)).a())
            {
                bov bov1 = new bov(context, gjr1, h.s, l.uh, g.dP, true, false, context.getString(l.gn), new btd(this, context));
                c.add(bov1);
            } else
            {
                int j = g.dU;
                int i1 = g.dP;
                int k1 = h.s;
                int i2 = l.ui;
                int k2 = l.uh;
                Object obj1 = context.getString(l.eh);
                String s1 = context.getString(l.ei);
                if (!b.i())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj1 = new bsf(context, gjr1, j, i1, k1, i2, k2, ((String) (obj1)), s1, true, flag, null);
                ((bov) (obj1)).setOnClickListener(new bte(this, ((bov) (obj1))));
                ((bov) (obj1)).a(new btf(this, ((bov) (obj1))));
                c.add(obj1);
            }
            obj = new bsf(context, gjr1, g.dz, g.dz, h.s, l.uf, l.uf, context.getString(l.tz), context.getString(l.tz), true, true, new btg(this, bot1));
            c.add(obj);
            flag1 = a(bpd1);
            obj = bnd.l();
            i = g.dU;
            k = g.dP;
            j1 = h.s;
            l1 = l.uk;
            j2 = l.uj;
            s = context.getString(l.en);
            s2 = context.getString(l.eo);
            if (obj != null && ((gih) (obj)).h())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = new bsf(context, gjr1, i, k, j1, l1, j2, s, s2, flag1, flag, null);
            ((bov) (obj)).setOnClickListener(new bth(this, bot1, ((bov) (obj))));
            ((bov) (obj)).a(new bti(this, ((bov) (obj))));
            c.add(obj);
            flag = b(bpd1);
            context = new bov(context, gjr1, h.s, l.ug, g.dU, flag, false, context.getResources().getString(l.ej), null);
            if (flag)
            {
                a(((bov) (context)), bpd1);
            }
            context.a(new btj(this, context));
            c.add(context);
        }
        return c;
    }
}
