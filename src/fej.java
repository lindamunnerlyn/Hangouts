// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class fej
    implements Set
{

    final feg a;

    fej(feg feg1)
    {
        a = feg1;
        super();
    }

    public boolean add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public void clear()
    {
        a.c();
    }

    public boolean contains(Object obj)
    {
        return a.a(obj) >= 0;
    }

    public boolean containsAll(Collection collection)
    {
        Map map = a.b();
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (!map.containsKey(collection.next()))
            {
                return false;
            }
        }

        return true;
    }

    public boolean equals(Object obj)
    {
        return feg.a(this, obj);
    }

    public int hashCode()
    {
        int i = a.a() - 1;
        int j = 0;
        while (i >= 0) 
        {
            Object obj = a.a(i, 0);
            int k;
            if (obj == null)
            {
                k = 0;
            } else
            {
                k = obj.hashCode();
            }
            j += k;
            i--;
        }
        return j;
    }

    public boolean isEmpty()
    {
        return a.a() == 0;
    }

    public Iterator iterator()
    {
        return new feh(a, 0);
    }

    public boolean remove(Object obj)
    {
        int i = a.a(obj);
        if (i >= 0)
        {
            a.a(i);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean removeAll(Collection collection)
    {
        Map map = a.b();
        int i = map.size();
        for (collection = collection.iterator(); collection.hasNext(); map.remove(collection.next())) { }
        return i != map.size();
    }

    public boolean retainAll(Collection collection)
    {
        Map map = a.b();
        int i = map.size();
        Iterator iterator1 = map.keySet().iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            if (!collection.contains(iterator1.next()))
            {
                iterator1.remove();
            }
        } while (true);
        return i != map.size();
    }

    public int size()
    {
        return a.a();
    }

    public Object[] toArray()
    {
        return a.b(0);
    }

    public Object[] toArray(Object aobj[])
    {
        return a.a(aobj, 0);
    }
}
