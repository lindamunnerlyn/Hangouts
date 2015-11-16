// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class btp extends bnd
{

    bpc a;
    final bnk b = bnk.a();
    private List c;

    public btp()
    {
        c = new ArrayList();
    }

    static void a(btp btp1, bpe bpe1)
    {
        boolean flag1 = btp1.b.h();
        if (bpe1.a() == flag1)
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
            bpe1.a(flag);
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

    static void b(btp btp1, bpe bpe1)
    {
        boolean flag1 = bnk.i();
        if (bpe1.a() == flag1)
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
            bpe1.a(flag);
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

    public int a()
    {
        return 0;
    }

    public List a(Context context, bpc bpc1, gmt gmt1, bpm bpm1)
    {
        c.clear();
        a = bpc1;
        if (gmt1.g())
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
            if (((bty)hlp.a(context, bty)).a())
            {
                bpe bpe1 = new bpe(context, gmt1, h.s, l.ty, g.di, true, true, context.getString(l.fW), new btq(this, context));
                c.add(bpe1);
            } else
            {
                int j = g.dS;
                int i1 = g.dO;
                int k1 = h.s;
                int i2 = l.tz;
                int k2 = l.ty;
                Object obj1 = context.getString(l.dQ);
                String s1 = context.getString(l.dR);
                if (!b.h())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj1 = new bso(context, gmt1, j, i1, k1, i2, k2, ((String) (obj1)), s1, true, flag, null);
                ((bpe) (obj1)).setOnClickListener(new btr(this, ((bpe) (obj1))));
                ((bpe) (obj1)).a(new bts(this, ((bpe) (obj1))));
                c.add(obj1);
            }
            obj = new bso(context, gmt1, g.dy, g.dy, h.s, l.tw, l.tw, context.getString(l.sR), context.getString(l.sR), true, true, new btt(this, bpc1));
            c.add(obj);
            flag1 = a(bpm1);
            obj = bnk.k();
            i = g.dS;
            k = g.dO;
            j1 = h.s;
            l1 = l.tB;
            j2 = l.tA;
            s = context.getString(l.dW);
            s2 = context.getString(l.dX);
            if (obj != null && ((glj) (obj)).h())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = new bso(context, gmt1, i, k, j1, l1, j2, s, s2, flag1, flag, null);
            ((bpe) (obj)).setOnClickListener(new btu(this, bpc1, ((bpe) (obj))));
            ((bpe) (obj)).a(new btv(this, ((bpe) (obj))));
            c.add(obj);
            flag = b(bpm1);
            context = new bpe(context, gmt1, h.s, l.tx, g.dS, flag, false, context.getResources().getString(l.dS), null);
            if (flag)
            {
                a(((bpe) (context)), bpm1);
            }
            context.a(new btw(this, context));
            c.add(context);
        }
        return c;
    }

    void a(bpe bpe1, bpm bpm1)
    {
        Object obj1 = null;
        Object obj;
        boolean flag;
        if (bpm1 == null)
        {
            bpm1 = null;
        } else
        {
            bpm1 = bpm1.q();
        }
        if (bpm1 == null)
        {
            obj = null;
        } else
        {
            obj = bpm1.m();
        }
        bpm1 = obj1;
        if (obj != null)
        {
            bpm1 = obj1;
            if (((Collection) (obj)).size() == 1)
            {
                obj = (gkq)((Collection) (obj)).toArray()[0];
                bpm1 = obj1;
                if (obj instanceof gkx)
                {
                    bpm1 = ((bpm) (obj));
                }
            }
        }
        if (bpm1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bpe1.a(flag);
        if (bpm1 != null)
        {
            bpe1.setOnClickListener(new btx(this));
        }
    }

    boolean a(bpm bpm1)
    {
        boolean flag;
        if ((a.g() & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return !b(bpm1) && flag;
    }

    boolean b(bpm bpm1)
    {
        Object obj = null;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (bpm1 == null)
        {
            bpm1 = null;
        } else
        {
            bpm1 = bpm1.q();
        }
        if (bpm1 == null)
        {
            bpm1 = obj;
        } else
        {
            bpm1 = bpm1.m();
        }
        if (bpm1 != null && bpm1.size() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (bpm1 == null || bpm1.isEmpty())
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
}
