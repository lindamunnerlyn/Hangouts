// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

final class gen
{

    final gjm a;
    final gbs b;
    final geq c = new geq(this);
    final List d = new CopyOnWriteArrayList();
    final Object e = new Object();
    boolean f;
    public final Map g = new LinkedHashMap();
    final Set h = new LinkedHashSet();
    final Set i = new LinkedHashSet();
    final Set j = new LinkedHashSet();
    final gem k = new gem(this);
    gem l;
    gem m;
    gem n;
    boolean o;
    boolean p;
    private gem q;
    private final Runnable r = new geo(this);

    gen(gbs gbs1, gjm gjm)
    {
        f = false;
        a = gjm;
        b = gbs1;
        gbs1.a(c);
    }

    public gem a(String s)
    {
        return (gem)g.get(s);
    }

    public void a()
    {
        b.b(c);
    }

    void a(gem gem1)
    {
        boolean flag1 = true;
        if (gem1 != null)
        {
            gjr gjr1 = gem1.b();
            boolean flag;
            if (gem1 == m)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gjr1.c(flag);
            if (gem1 == q)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gjr1.d(flag);
            if (gem1 == l)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gjr1.e(flag);
            if (gem1 == n)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            gjr1.f(flag);
            gem1.f();
        }
    }

    public void a(ger ger1)
    {
        d.add(ger1);
    }

    public gem b()
    {
        return n;
    }

    void b(gem gem1)
    {
        synchronized (e)
        {
            i.add(gem1);
            e();
        }
        return;
        gem1;
        obj;
        JVM INSTR monitorexit ;
        throw gem1;
    }

    public void b(ger ger1)
    {
        d.remove(ger1);
    }

    public void b(String s)
    {
        gem gem1 = l;
        if (s == null)
        {
            s = null;
        } else
        {
            s = (gem)g.get(s);
        }
        l = s;
        if (gem1 != l)
        {
            a(gem1);
            a(l);
            d();
        }
    }

    public gem c()
    {
        return k;
    }

    public void d()
    {
        obj = n;
        n = null;
        if (l == null) goto _L2; else goto _L1
_L1:
        n = l;
_L4:
        if (n == null)
        {
            n = k;
        }
        if (obj != n)
        {
            a(((gem) (obj)));
            a(n);
            synchronized (e)
            {
                o = true;
                e();
            }
            for (obj = d.iterator(); ((Iterator) (obj)).hasNext(); ((ger)((Iterator) (obj)).next()).c(n)) { }
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (q != null && !q.e())
        {
            n = q;
            continue; /* Loop/switch isn't completed */
        }
        if (m != null && !m.e())
        {
            n = m;
            continue; /* Loop/switch isn't completed */
        }
        if (obj == null || ((gem) (obj)).e() || !g.containsKey(((gem) (obj)).a()))
        {
            break; /* Loop/switch isn't completed */
        }
        n = ((gem) (obj));
        if (true) goto _L4; else goto _L3
_L3:
        Iterator iterator = g.values().iterator();
        while (iterator.hasNext()) 
        {
            gem gem1 = (gem)iterator.next();
            if (!gem1.e())
            {
                n = gem1;
            }
        }
        if (true) goto _L4; else goto _L5
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L5:
    }

    void e()
    {
label0:
        {
            synchronized (e)
            {
                if (!p)
                {
                    break label0;
                }
            }
            return;
        }
        if (!f)
        {
            f = true;
            g.b(r);
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
