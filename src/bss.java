// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class bss extends bmy
{

    private final bnd a = bnd.a();
    private List b;

    public bss()
    {
        b = new ArrayList();
    }

    static bnd a(bss bss1)
    {
        return bss1.a;
    }

    static void a(bot bot1, String s)
    {
        bpq.a(s).a(bot1.e(), null);
    }

    static void b(bot bot1, String s)
    {
        bnx.a(s).a(bot1.e(), null);
    }

    public int a()
    {
        return 1000;
    }

    public List a(Context context, bot bot1, gjr gjr1, bpd bpd)
    {
        b.clear();
        if (!gjr1.g())
        {
            boolean flag2 = a.d().p();
            boolean flag4 = gjr1.l();
            boolean flag;
            int i;
            int j;
            boolean flag1;
            if (!gjr1.l())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!flag4)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (!flag4 && !flag2)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (!flag4 && flag2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (j != 0)
            {
                j = h.s;
                int k = com.google.android.apps.hangouts.R.drawable.cg;
                int i1 = g.dU;
                boolean flag3;
                if (!gjr1.n())
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                bpd = new bov(context, gjr1, j, k, i1, true, flag3, context.getString(l.cN, new Object[] {
                    gjr1.b()
                }), new bst(this, bot1, gjr1));
                bpd.a(new bsu(this, flag1, bpd));
                b.add(bpd);
            }
            if (i != 0)
            {
                i = h.s;
                j = g.mc;
                k = g.dU;
                if (!gjr1.d())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                bpd = new bov(context, gjr1, i, j, k, true, flag1, context.getString(l.cP, new Object[] {
                    gjr1.b()
                }), new bsv(this, gjr1));
                bpd.a(new bsw(this, bpd));
                b.add(bpd);
            }
            if (flag4)
            {
                bpd = b;
                i = h.s;
                j = g.ma;
                k = g.dU;
                if (!gjr1.d())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                bpd.add(new bov(context, gjr1, i, j, k, true, flag1, context.getString(l.cM, new Object[] {
                    gjr1.b()
                }), new bsx(this, bot1, gjr1)));
            }
            if (flag)
            {
                context = new bov(context, gjr1, h.s, g.mb, g.dU, true, true, context.getString(l.cO, new Object[] {
                    gjr1.b()
                }), new bsy(this, bot1, gjr1));
                context.a(new bsz(this));
                b.add(context);
            }
        }
        return b;
    }
}
