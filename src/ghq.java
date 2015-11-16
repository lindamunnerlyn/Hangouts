// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class ghq extends gex
{

    final ghn a;

    ghq(ghn ghn1)
    {
        a = ghn1;
        super();
    }

    public void a(gkq gkq1, gap gap)
    {
        ghn ghn1 = a;
        boolean flag;
        if ((gap instanceof gks) || (gap instanceof gkp))
        {
            if (gkq1.j() && !ghn1.g.containsKey(gkq1.a()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (gkq1.k())
            {
                gap = a.k;
                gmt gmt1 = gap.b();
                gmt1.f();
                gmt1.i(gkq1.t());
                gmt1.j(gkq1.v());
            } else
            {
                gap = new ghm(a);
            }
            gap.a(gkq1);
            a.a(gap);
            gne.a(3, "vclib", "Participant joined: %s", new Object[] {
                gap.a()
            });
            synchronized (a.e)
            {
                a.g.put(gap.a(), gap);
                a.h.add(gap);
                a.e();
            }
            for (gkq1 = a.d.iterator(); gkq1.hasNext(); ((ghr)gkq1.next()).a(gap)) { }
            break MISSING_BLOCK_LABEL_443;
        }
        break MISSING_BLOCK_LABEL_248;
        gap;
        gkq1;
        JVM INSTR monitorexit ;
        throw gap;
        if (!(gap instanceof gkt))
        {
            break MISSING_BLOCK_LABEL_379;
        }
        gap = ((gap) (a.e));
        gap;
        JVM INSTR monitorenter ;
        gkq1 = (ghm)a.g.remove(gkq1.a());
        if (gkq1 != null)
        {
            break MISSING_BLOCK_LABEL_292;
        }
        gap;
        JVM INSTR monitorexit ;
        return;
        a.j.add(gkq1);
        a.e();
        gap;
        JVM INSTR monitorexit ;
        if (gkq1 == a.l)
        {
            a.b(null);
        }
        for (gap = a.d.iterator(); gap.hasNext(); ((ghr)gap.next()).b(gkq1)) { }
        break MISSING_BLOCK_LABEL_443;
        gkq1;
        gap;
        JVM INSTR monitorexit ;
        throw gkq1;
        boolean flag1;
        if ((gap instanceof gko) || (gap instanceof gkv) || (gap instanceof gkw) || (gap instanceof gky))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            gkq1 = (ghm)a.g.get(gkq1.a());
            if (gkq1 != null)
            {
                gkq1.f();
            }
        }
        a.d();
        return;
    }

    public void a(String s, int i)
    {
        s = a.m;
        a.m = null;
        Iterator iterator = a.b.a().m().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            gkq gkq1 = (gkq)iterator.next();
            if (!gkq1.l().contains(Integer.valueOf(i)))
            {
                continue;
            }
            a.m = (ghm)a.g.get(gkq1.a());
            break;
        } while (true);
        if (a.m != s)
        {
            a.a(s);
            a.a(a.m);
            a.d();
        }
    }

    public void b(geu geu1)
    {
        a.b.b(a.c);
        synchronized (a.e)
        {
            a.p = true;
            a.f = false;
        }
        return;
        exception;
        geu1;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
