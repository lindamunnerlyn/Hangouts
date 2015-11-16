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

final class ghn
{

    final gmo a;
    final geg b;
    final ghq c = new ghq(this);
    final List d = new CopyOnWriteArrayList();
    final Object e = new Object();
    boolean f;
    public final Map g = new LinkedHashMap();
    final Set h = new LinkedHashSet();
    final Set i = new LinkedHashSet();
    final Set j = new LinkedHashSet();
    final ghm k = new ghm(this);
    ghm l;
    ghm m;
    ghm n;
    boolean o;
    boolean p;
    private ghm q;
    private final Runnable r = new gho(this);

    ghn(geg geg1, gmo gmo)
    {
        f = false;
        a = gmo;
        b = geg1;
        geg1.a(c);
    }

    public ghm a(String s)
    {
        return (ghm)g.get(s);
    }

    public void a()
    {
        b.b(c);
    }

    void a(ghm ghm1)
    {
        boolean flag1 = true;
        if (ghm1 != null)
        {
            gmt gmt1 = ghm1.b();
            boolean flag;
            if (ghm1 == m)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gmt1.c(flag);
            if (ghm1 == q)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gmt1.d(flag);
            if (ghm1 == l)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gmt1.e(flag);
            if (ghm1 == n)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            gmt1.f(flag);
            ghm1.f();
        }
    }

    public void a(ghr ghr1)
    {
        d.add(ghr1);
    }

    public ghm b()
    {
        return n;
    }

    void b(ghm ghm1)
    {
        synchronized (e)
        {
            i.add(ghm1);
            e();
        }
        return;
        ghm1;
        obj;
        JVM INSTR monitorexit ;
        throw ghm1;
    }

    public void b(ghr ghr1)
    {
        d.remove(ghr1);
    }

    public void b(String s)
    {
        ghm ghm1 = l;
        if (s == null)
        {
            s = null;
        } else
        {
            s = (ghm)g.get(s);
        }
        l = s;
        if (ghm1 != l)
        {
            a(ghm1);
            a(l);
            d();
        }
    }

    public ghm c()
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
            a(((ghm) (obj)));
            a(n);
            synchronized (e)
            {
                o = true;
                e();
            }
            for (obj = d.iterator(); ((Iterator) (obj)).hasNext(); ((ghr)((Iterator) (obj)).next()).c(n)) { }
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
        if (obj == null || ((ghm) (obj)).e() || !g.containsKey(((ghm) (obj)).a()))
        {
            break; /* Loop/switch isn't completed */
        }
        n = ((ghm) (obj));
        if (true) goto _L4; else goto _L3
_L3:
        Iterator iterator = g.values().iterator();
        while (iterator.hasNext()) 
        {
            ghm ghm1 = (ghm)iterator.next();
            if (!ghm1.e())
            {
                n = ghm1;
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
