// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class btf extends bnd
{

    final bnk a = bnk.a();
    private List b;

    public btf()
    {
        b = new ArrayList();
    }

    public int a()
    {
        return 1000;
    }

    public List a(Context context, bpc bpc, gmt gmt1, bpm bpm)
    {
        b.clear();
        if (!gmt1.g())
        {
            boolean flag2 = a.d().p();
            boolean flag4 = gmt1.l();
            boolean flag;
            int i;
            int j;
            boolean flag1;
            if (!gmt1.l())
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
                int k = com.google.android.apps.hangouts.R.drawable.bY;
                int i1 = g.dS;
                boolean flag3;
                if (!gmt1.n())
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                bpm = new bpe(context, gmt1, j, k, i1, true, flag3, context.getString(l.cw, new Object[] {
                    gmt1.b()
                }), new btg(this, bpc, gmt1));
                bpm.a(new bth(this, flag1, bpm));
                b.add(bpm);
            }
            if (i != 0)
            {
                i = h.s;
                j = g.lQ;
                k = g.dS;
                if (!gmt1.d())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                bpm = new bpe(context, gmt1, i, j, k, true, flag1, context.getString(l.cy, new Object[] {
                    gmt1.b()
                }), new bti(this, gmt1));
                bpm.a(new btj(this, bpm));
                b.add(bpm);
            }
            if (flag4)
            {
                bpm = b;
                i = h.s;
                j = g.lO;
                k = g.dS;
                if (!gmt1.d())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                bpm.add(new bpe(context, gmt1, i, j, k, true, flag1, context.getString(l.cv, new Object[] {
                    gmt1.b()
                }), new btk(this, bpc, gmt1)));
            }
            if (flag)
            {
                context = new bpe(context, gmt1, h.s, g.lP, g.dS, true, true, context.getString(l.cx, new Object[] {
                    gmt1.b()
                }), new btl(this, bpc, gmt1));
                context.a(new btm(this));
                b.add(context);
            }
        }
        return b;
    }
}
