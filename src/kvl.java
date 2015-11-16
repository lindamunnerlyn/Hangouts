// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class kvl extends AbstractMap
{

    List a;
    Map b;
    private final int c;
    private boolean d;
    private volatile kvs e;

    private kvl(int i)
    {
        c = i;
        a = Collections.emptyList();
        b = Collections.emptyMap();
    }

    kvl(int i, byte byte0)
    {
        this(i);
    }

    private int a(Comparable comparable)
    {
_L2:
        int k;
        while (k <= i) 
        {
            int l = (k + i) / 2;
            int i1 = comparable.compareTo(((kvq)a.get(l)).a());
            if (i1 < 0)
            {
                i = l - 1;
            } else
            if (i1 > 0)
            {
                k = l + 1;
            } else
            {
                return l;
            }
        }
        return -(k + 1);
        int i = a.size() - 1;
        if (i >= 0)
        {
            int j = comparable.compareTo(((kvq)a.get(i)).a());
            if (j > 0)
            {
                return -(i + 2);
            }
            if (j == 0)
            {
                return i;
            }
        }
        k = 0;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static kvl a(int i)
    {
        return new kvm(i);
    }

    private SortedMap f()
    {
        e();
        if (b.isEmpty() && !(b instanceof TreeMap))
        {
            b = new TreeMap();
        }
        return (SortedMap)b;
    }

    public Object a(Comparable comparable, Object obj)
    {
        e();
        int i = a(comparable);
        if (i >= 0)
        {
            return ((kvq)a.get(i)).setValue(obj);
        }
        e();
        if (a.isEmpty() && !(a instanceof ArrayList))
        {
            a = new ArrayList(c);
        }
        i = -(i + 1);
        if (i >= c)
        {
            return f().put(comparable, obj);
        }
        if (a.size() == c)
        {
            kvq kvq1 = (kvq)a.remove(c - 1);
            f().put(kvq1.a(), kvq1.getValue());
        }
        a.add(i, new kvq(this, comparable, obj));
        return null;
    }

    public void a()
    {
        if (!d)
        {
            Map map;
            if (b.isEmpty())
            {
                map = Collections.emptyMap();
            } else
            {
                map = Collections.unmodifiableMap(b);
            }
            b = map;
            d = true;
        }
    }

    public java.util.Map.Entry b(int i)
    {
        return (java.util.Map.Entry)a.get(i);
    }

    public boolean b()
    {
        return d;
    }

    public int c()
    {
        return a.size();
    }

    Object c(int i)
    {
        e();
        Object obj = ((kvq)a.remove(i)).getValue();
        if (!b.isEmpty())
        {
            Iterator iterator = f().entrySet().iterator();
            a.add(new kvq(this, (java.util.Map.Entry)iterator.next()));
            iterator.remove();
        }
        return obj;
    }

    public void clear()
    {
        e();
        if (!a.isEmpty())
        {
            a.clear();
        }
        if (!b.isEmpty())
        {
            b.clear();
        }
    }

    public boolean containsKey(Object obj)
    {
        obj = (Comparable)obj;
        return a(((Comparable) (obj))) >= 0 || b.containsKey(obj);
    }

    public Iterable d()
    {
        if (b.isEmpty())
        {
            return kvn.a();
        } else
        {
            return b.entrySet();
        }
    }

    void e()
    {
        if (d)
        {
            throw new UnsupportedOperationException();
        } else
        {
            return;
        }
    }

    public Set entrySet()
    {
        if (e == null)
        {
            e = new kvs(this);
        }
        return e;
    }

    public Object get(Object obj)
    {
        obj = (Comparable)obj;
        int i = a(((Comparable) (obj)));
        if (i >= 0)
        {
            return ((kvq)a.get(i)).getValue();
        } else
        {
            return b.get(obj);
        }
    }

    public Object put(Object obj, Object obj1)
    {
        return a((Comparable)obj, obj1);
    }

    public Object remove(Object obj)
    {
        e();
        obj = (Comparable)obj;
        int i = a(((Comparable) (obj)));
        if (i >= 0)
        {
            return c(i);
        }
        if (b.isEmpty())
        {
            return null;
        } else
        {
            return b.remove(obj);
        }
    }

    public int size()
    {
        return a.size() + b.size();
    }
}
