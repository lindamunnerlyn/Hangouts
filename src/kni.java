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

class kni extends AbstractMap
{

    private final int a;
    private List b;
    private Map c;
    private boolean d;
    private volatile knp e;

    private kni(int i)
    {
        a = i;
        b = Collections.emptyList();
        c = Collections.emptyMap();
    }

    kni(int i, byte byte0)
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
            int i1 = comparable.compareTo(((knn)b.get(l)).a());
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
        int i = b.size() - 1;
        if (i >= 0)
        {
            int j = comparable.compareTo(((knn)b.get(i)).a());
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

    static Object a(kni kni1, int i)
    {
        return kni1.c(i);
    }

    static kni a(int i)
    {
        return new knj(i);
    }

    static void a(kni kni1)
    {
        kni1.e();
    }

    static List b(kni kni1)
    {
        return kni1.b;
    }

    private Object c(int i)
    {
        e();
        Object obj = ((knn)b.remove(i)).getValue();
        if (!c.isEmpty())
        {
            Iterator iterator = f().entrySet().iterator();
            b.add(new knn(this, (java.util.Map.Entry)iterator.next()));
            iterator.remove();
        }
        return obj;
    }

    static Map c(kni kni1)
    {
        return kni1.c;
    }

    private void e()
    {
        if (d)
        {
            throw new UnsupportedOperationException();
        } else
        {
            return;
        }
    }

    private SortedMap f()
    {
        e();
        if (c.isEmpty() && !(c instanceof TreeMap))
        {
            c = new TreeMap();
        }
        return (SortedMap)c;
    }

    public Object a(Comparable comparable, Object obj)
    {
        e();
        int i = a(comparable);
        if (i >= 0)
        {
            return ((knn)b.get(i)).setValue(obj);
        }
        e();
        if (b.isEmpty() && !(b instanceof ArrayList))
        {
            b = new ArrayList(a);
        }
        i = -(i + 1);
        if (i >= a)
        {
            return f().put(comparable, obj);
        }
        if (b.size() == a)
        {
            knn knn1 = (knn)b.remove(a - 1);
            f().put(knn1.a(), knn1.getValue());
        }
        b.add(i, new knn(this, comparable, obj));
        return null;
    }

    public void a()
    {
        if (!d)
        {
            Map map;
            if (c.isEmpty())
            {
                map = Collections.emptyMap();
            } else
            {
                map = Collections.unmodifiableMap(c);
            }
            c = map;
            d = true;
        }
    }

    public java.util.Map.Entry b(int i)
    {
        return (java.util.Map.Entry)b.get(i);
    }

    public boolean b()
    {
        return d;
    }

    public int c()
    {
        return b.size();
    }

    public void clear()
    {
        e();
        if (!b.isEmpty())
        {
            b.clear();
        }
        if (!c.isEmpty())
        {
            c.clear();
        }
    }

    public boolean containsKey(Object obj)
    {
        obj = (Comparable)obj;
        return a(((Comparable) (obj))) >= 0 || c.containsKey(obj);
    }

    public Iterable d()
    {
        if (c.isEmpty())
        {
            return knk.a();
        } else
        {
            return c.entrySet();
        }
    }

    public Set entrySet()
    {
        if (e == null)
        {
            e = new knp(this);
        }
        return e;
    }

    public Object get(Object obj)
    {
        obj = (Comparable)obj;
        int i = a(((Comparable) (obj)));
        if (i >= 0)
        {
            return ((knn)b.get(i)).getValue();
        } else
        {
            return c.get(obj);
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
        if (c.isEmpty())
        {
            return null;
        } else
        {
            return c.remove(obj);
        }
    }

    public int size()
    {
        return b.size() + c.size();
    }
}
