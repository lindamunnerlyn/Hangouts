// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class geq extends gcj
{

    final gen a;

    geq(gen gen1)
    {
        a = gen1;
        super();
    }

    public void a(gho gho1, fyb fyb)
    {
        boolean flag2;
        flag2 = false;
        gen gen1 = a;
        boolean flag;
        if ((fyb instanceof ghq) || (fyb instanceof ghn))
        {
            if (gho1.k() && !gen1.g.containsKey(gho1.a()))
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
            if (gho1.l())
            {
                fyb = a.k;
                gjr gjr1 = fyb.b();
                gjr1.f();
                gjr1.i(gho1.u());
                gjr1.j(gho1.w());
            } else
            {
                fyb = new gem(a);
            }
            fyb.a(gho1);
            a.a(fyb);
            synchronized (a.e)
            {
                a.g.put(fyb.a(), fyb);
                a.h.add(fyb);
                a.e();
            }
            for (gho1 = a.d.iterator(); gho1.hasNext(); ((ger)gho1.next()).a(fyb)) { }
            break MISSING_BLOCK_LABEL_431;
        }
        break MISSING_BLOCK_LABEL_232;
        fyb;
        gho1;
        JVM INSTR monitorexit ;
        throw fyb;
        if (!(fyb instanceof ghr))
        {
            break MISSING_BLOCK_LABEL_363;
        }
        fyb = ((fyb) (a.e));
        fyb;
        JVM INSTR monitorenter ;
        gho1 = (gem)a.g.remove(gho1.a());
        if (gho1 != null)
        {
            break MISSING_BLOCK_LABEL_276;
        }
        fyb;
        JVM INSTR monitorexit ;
        return;
        a.j.add(gho1);
        a.e();
        fyb;
        JVM INSTR monitorexit ;
        if (gho1 == a.l)
        {
            a.b(null);
        }
        for (fyb = a.d.iterator(); fyb.hasNext(); ((ger)fyb.next()).b(gho1)) { }
        break MISSING_BLOCK_LABEL_431;
        gho1;
        fyb;
        JVM INSTR monitorexit ;
        throw gho1;
        boolean flag1;
label0:
        {
            if (!(fyb instanceof ghm) && !(fyb instanceof ght) && !(fyb instanceof ghu))
            {
                flag1 = flag2;
                if (!(fyb instanceof ghw))
                {
                    break label0;
                }
            }
            flag1 = true;
        }
        if (flag1)
        {
            gho1 = (gem)a.g.get(gho1.a());
            if (gho1 != null)
            {
                gho1.f();
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
            gho gho1 = (gho)iterator.next();
            if (!gho1.m().contains(Integer.valueOf(i)))
            {
                continue;
            }
            a.m = (gem)a.g.get(gho1.a());
            break;
        } while (true);
        if (a.m != s)
        {
            a.a(s);
            a.a(a.m);
            a.d();
        }
    }

    public void b(gcg gcg1)
    {
        a.b.b(a.c);
        synchronized (a.e)
        {
            a.p = true;
            a.f = false;
        }
        return;
        exception;
        gcg1;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
