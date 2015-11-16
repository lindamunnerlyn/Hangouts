// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.MapMakerInternalMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

public final class jtz extends jru
{

    boolean b;
    int c;
    int d;
    public int e;
    jvl f;
    jvl g;
    long h;
    long i;
    jub j;
    jnk k;
    jol l;

    public jtz()
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

    jru a(fuu fuu1)
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
        super.a = (fuu)n.b(fuu1);
        b = true;
        return this;
    }

    public jtz a(int i1)
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

    jtz a(long l1, TimeUnit timeunit)
    {
        c(l1, timeunit);
        h = timeunit.toNanos(l1);
        if (l1 == 0L && j == null)
        {
            j = jub.d;
        }
        b = true;
        return this;
    }

    jtz a(jnk jnk1)
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
        k = (jnk)n.b(jnk1);
        b = true;
        return this;
    }

    jtz a(jvl jvl1)
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
        f = (jvl)n.b(jvl1);
        flag = flag1;
        if (f != jvl.b)
        {
            flag = true;
        }
        n.a(flag, "Soft keys are not supported");
        if (jvl1 != jvl.a)
        {
            b = true;
        }
        return this;
    }

    public jnk b()
    {
        return (jnk)g.e(k, e().a());
    }

    jtz b(int i1)
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
            j = jub.e;
        }
        return this;
    }

    jtz b(long l1, TimeUnit timeunit)
    {
        c(l1, timeunit);
        i = timeunit.toNanos(l1);
        if (l1 == 0L && j == null)
        {
            j = jub.d;
        }
        b = true;
        return this;
    }

    jtz b(jvl jvl1)
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
        g = (jvl)n.b(jvl1);
        if (jvl1 != jvl.a)
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

    public jtz c(int i1)
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

    public jvl e()
    {
        return (jvl)g.e(f, jvl.a);
    }

    public jvl f()
    {
        return (jvl)g.e(g, jvl.a);
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

    public jol i()
    {
        return (jol)g.e(l, jol.b());
    }

    public ConcurrentMap j()
    {
        if (!b)
        {
            return new ConcurrentHashMap(c(), 0.75F, d());
        }
        if (j == null)
        {
            return new MapMakerInternalMap(this);
        } else
        {
            return new jua(this);
        }
    }

    public String toString()
    {
        jnr jnr1 = g.g(this);
        if (c != -1)
        {
            jnr1.a("initialCapacity", c);
        }
        if (d != -1)
        {
            jnr1.a("concurrencyLevel", d);
        }
        if (e != -1)
        {
            jnr1.a("maximumSize", e);
        }
        if (h != -1L)
        {
            long l1 = h;
            jnr1.a("expireAfterWrite", (new StringBuilder(22)).append(l1).append("ns").toString());
        }
        if (i != -1L)
        {
            long l2 = i;
            jnr1.a("expireAfterAccess", (new StringBuilder(22)).append(l2).append("ns").toString());
        }
        if (f != null)
        {
            jnr1.a("keyStrength", g.G(f.toString()));
        }
        if (g != null)
        {
            jnr1.a("valueStrength", g.G(g.toString()));
        }
        if (k != null)
        {
            jnr1.a("keyEquivalence");
        }
        if (a != null)
        {
            jnr1.a("removalListener");
        }
        return jnr1.toString();
    }
}
