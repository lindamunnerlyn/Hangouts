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

abstract class jjt extends jkj
    implements Serializable
{

    private static final long serialVersionUID = 0x21f766b1f568c81dL;
    private transient Map a;
    private transient int b;

    protected jjt(Map map)
    {
        n.a(map.isEmpty());
        a = map;
    }

    static int a(jjt jjt1, int i)
    {
        i = jjt1.b + i;
        jjt1.b = i;
        return i;
    }

    static int a(jjt jjt1, Object obj)
    {
        obj = (Collection)jpc.c(jjt1.a, obj);
        int i = 0;
        if (obj != null)
        {
            i = ((Collection) (obj)).size();
            ((Collection) (obj)).clear();
            jjt1.b = jjt1.b - i;
        }
        return i;
    }

    static Iterator a(Collection collection)
    {
        if (collection instanceof List)
        {
            return ((List)collection).listIterator();
        } else
        {
            return collection.iterator();
        }
    }

    private List a(Object obj, List list, jkc jkc1)
    {
        if (list instanceof RandomAccess)
        {
            return new jjz(this, obj, list, jkc1);
        } else
        {
            return new jke(this, obj, list, jkc1);
        }
    }

    static List a(jjt jjt1, Object obj, List list, jkc jkc1)
    {
        return jjt1.a(obj, list, jkc1);
    }

    static Map a(jjt jjt1)
    {
        return jjt1.a;
    }

    static int b(jjt jjt1)
    {
        int i = jjt1.b;
        jjt1.b = i - 1;
        return i;
    }

    static int b(jjt jjt1, int i)
    {
        i = jjt1.b - i;
        jjt1.b = i;
        return i;
    }

    static int c(jjt jjt1)
    {
        int i = jjt1.b;
        jjt1.b = i + 1;
        return i;
    }

    abstract Collection a();

    public Collection a(Object obj)
    {
        Collection collection1 = (Collection)a.get(obj);
        Collection collection = collection1;
        if (collection1 == null)
        {
            collection = b();
        }
        return a(obj, collection);
    }

    Collection a(Object obj, Collection collection)
    {
        if (collection instanceof SortedSet)
        {
            return new jkh(this, obj, (SortedSet)collection, null);
        }
        if (collection instanceof Set)
        {
            return new jkg(this, obj, (Set)collection);
        }
        if (collection instanceof List)
        {
            return a(obj, (List)collection, null);
        } else
        {
            return new jkc(this, obj, collection, null);
        }
    }

    public boolean a(Object obj, Object obj1)
    {
        Collection collection = (Collection)a.get(obj);
        if (collection == null)
        {
            collection = b();
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

    Collection b()
    {
        return a();
    }

    public int c()
    {
        return b;
    }

    public void d()
    {
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); ((Collection)iterator.next()).clear()) { }
        a.clear();
        b = 0;
    }

    Set e()
    {
        if (a instanceof SortedMap)
        {
            return new jkb(this, (SortedMap)a);
        } else
        {
            return new jjx(this, a);
        }
    }

    Map f()
    {
        if (a instanceof SortedMap)
        {
            return new jka(this, (SortedMap)a);
        } else
        {
            return new jju(this, a);
        }
    }
}
