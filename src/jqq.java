// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

abstract class jqq extends jrg
    implements Serializable
{

    private static final long serialVersionUID = 0x21f766b1f568c81dL;
    transient Map a;
    transient int b;

    protected jqq(Map map)
    {
        n.a(map.isEmpty());
        a = map;
    }

    static int a(jqq jqq1)
    {
        int j = jqq1.b;
        jqq1.b = j - 1;
        return j;
    }

    static int b(jqq jqq1)
    {
        int j = jqq1.b;
        jqq1.b = j + 1;
        return j;
    }

    Collection a(Object obj, Collection collection)
    {
        if (collection instanceof SortedSet)
        {
            return new jre(this, obj, (SortedSet)collection, null);
        }
        if (collection instanceof Set)
        {
            return new jrd(this, obj, (Set)collection);
        }
        if (collection instanceof List)
        {
            return a(obj, (List)collection, null);
        } else
        {
            return new jqz(this, obj, collection, null);
        }
    }

    List a(Object obj, List list, jqz jqz1)
    {
        if (list instanceof RandomAccess)
        {
            return new jqw(this, obj, list, jqz1);
        } else
        {
            return new jrb(this, obj, list, jqz1);
        }
    }

    final void a(Map map)
    {
        a = map;
        b = 0;
        map = map.values().iterator();
        while (map.hasNext()) 
        {
            Collection collection = (Collection)map.next();
            int j;
            boolean flag;
            if (!collection.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            n.a(flag);
            j = b;
            b = collection.size() + j;
        }
    }

    public boolean a(Object obj, Object obj1)
    {
        Collection collection = (Collection)a.get(obj);
        if (collection == null)
        {
            collection = d();
            if (collection.add(obj1))
            {
                b = b + 1;
                a.put(obj, collection);
                return true;
            } else
            {
                throw new AssertionError("New Collection violated the Collection spec");
            }
        }
        if (collection.add(obj1))
        {
            b = b + 1;
            return true;
        } else
        {
            return false;
        }
    }

    public Collection b(Object obj)
    {
        Collection collection1 = (Collection)a.get(obj);
        Collection collection = collection1;
        if (collection1 == null)
        {
            collection = d();
        }
        return a(obj, collection);
    }

    abstract Collection c();

    public boolean c(Object obj)
    {
        return a.containsKey(obj);
    }

    Collection d()
    {
        return c();
    }

    Map e()
    {
        return a;
    }

    public int f()
    {
        return b;
    }

    public void g()
    {
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); ((Collection)iterator.next()).clear()) { }
        a.clear();
        b = 0;
    }

    Set h()
    {
        if (a instanceof SortedMap)
        {
            return new jqy(this, (SortedMap)a);
        } else
        {
            return new jqu(this, a);
        }
    }

    Map i()
    {
        if (a instanceof SortedMap)
        {
            return new jqx(this, (SortedMap)a);
        } else
        {
            return new jqr(this, a);
        }
    }
}
