// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.MapMakerInternalMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

public final class jmz extends jkw
{

    boolean b;
    int c;
    int d;
    public int e;
    jok f;
    jok g;
    long h;
    long i;
    jnb j;
    jgq k;
    jhp l;

    public jmz()
    {
        c = -1;
        d = -1;
        e = -1;
        h = -1L;
        i = -1L;
    }

    private void c(long l1, TimeUnit timeunit)
    {
        boolean flag;
        if (h == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "expireAfterWrite was already set to %s ns", new Object[] {
            Long.valueOf(h)
        });
        if (i == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "expireAfterAccess was already set to %s ns", new Object[] {
            Long.valueOf(i)
        });
        if (l1 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.a(flag, "duration cannot be negative: %s %s", new Object[] {
            Long.valueOf(l1), timeunit
        });
    }

    jkw a(fsn fsn1)
    {
        boolean flag;
        if (a == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag);
        super.a = (fsn)n.b(fsn1);
        b = true;
        return this;
    }

    public jmz a(int i1)
    {
        boolean flag1 = true;
        boolean flag;
        if (c == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "initial capacity was already set to %s", new Object[] {
            Integer.valueOf(c)
        });
        if (i1 >= 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        n.a(flag);
        c = i1;
        return this;
    }

    jmz a(long l1, TimeUnit timeunit)
    {
        c(l1, timeunit);
        h = timeunit.toNanos(l1);
        if (l1 == 0L && j == null)
        {
            j = jnb.d;
        }
        b = true;
        return this;
    }

    jmz a(jgq jgq1)
    {
        boolean flag;
        if (k == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "key equivalence was already set to %s", new Object[] {
            k
        });
        k = (jgq)n.b(jgq1);
        b = true;
        return this;
    }

    jmz a(jok jok1)
    {
        boolean flag1 = false;
        boolean flag;
        if (f == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "Key strength was already set to %s", new Object[] {
            f
        });
        f = (jok)n.b(jok1);
        flag = flag1;
        if (f != jok.b)
        {
            flag = true;
        }
        n.a(flag, "Soft keys are not supported");
        if (jok1 != jok.a)
        {
            b = true;
        }
        return this;
    }

    public jgq b()
    {
        return (jgq)h.b(k, e().a());
    }

    jmz b(int i1)
    {
        boolean flag1 = false;
        boolean flag;
        if (e == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "maximum size was already set to %s", new Object[] {
            Integer.valueOf(e)
        });
        flag = flag1;
        if (i1 >= 0)
        {
            flag = true;
        }
        n.a(flag, "maximum size must not be negative");
        e = i1;
        b = true;
        if (e == 0)
        {
            j = jnb.e;
        }
        return this;
    }

    jmz b(long l1, TimeUnit timeunit)
    {
        c(l1, timeunit);
        i = timeunit.toNanos(l1);
        if (l1 == 0L && j == null)
        {
            j = jnb.d;
        }
        b = true;
        return this;
    }

    jmz b(jok jok1)
    {
        boolean flag;
        if (g == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "Value strength was already set to %s", new Object[] {
            g
        });
        g = (jok)n.b(jok1);
        if (jok1 != jok.a)
        {
            b = true;
        }
        return this;
    }

    public int c()
    {
        if (c == -1)
        {
            return 16;
        } else
        {
            return c;
        }
    }

    public jmz c(int i1)
    {
        boolean flag1 = true;
        boolean flag;
        if (d == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "concurrency level was already set to %s", new Object[] {
            Integer.valueOf(d)
        });
        if (i1 > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        n.a(flag);
        d = i1;
        return this;
    }

    public int d()
    {
        if (d == -1)
        {
            return 4;
        } else
        {
            return d;
        }
    }

    public jok e()
    {
        return (jok)h.b(f, jok.a);
    }

    public jok f()
    {
        return (jok)h.b(g, jok.a);
    }

    public long g()
    {
        if (h == -1L)
        {
            return 0L;
        } else
        {
            return h;
        }
    }

    public long h()
    {
        if (i == -1L)
        {
            return 0L;
        } else
        {
            return i;
        }
    }

    public jhp i()
    {
        return (jhp)h.b(l, jhp.b());
    }

    public ConcurrentMap j()
    {
        if (!b)
        {
            return new ConcurrentHashMap(c(), 0.75F, d());
        }
        Object obj;
        if (j == null)
        {
            obj = new MapMakerInternalMap(this);
        } else
        {
            obj = new jna(this);
        }
        return (ConcurrentMap)obj;
    }

    public String toString()
    {
        jgx jgx1 = h.c(this);
        if (c != -1)
        {
            jgx1.a("initialCapacity", c);
        }
        if (d != -1)
        {
            jgx1.a("concurrencyLevel", d);
        }
        if (e != -1)
        {
            jgx1.a("maximumSize", e);
        }
        if (h != -1L)
        {
            jgx1.a("expireAfterWrite", (new StringBuilder()).append(h).append("ns").toString());
        }
        if (i != -1L)
        {
            jgx1.a("expireAfterAccess", (new StringBuilder()).append(i).append("ns").toString());
        }
        if (f != null)
        {
            jgx1.a("keyStrength", g.D(f.toString()));
        }
        if (g != null)
        {
            jgx1.a("valueStrength", g.D(g.toString()));
        }
        if (k != null)
        {
            jgx1.a("keyEquivalence");
        }
        if (a != null)
        {
            jgx1.a("removalListener");
        }
        return jgx1.toString();
    }
}
